package com.vmware.avi.vro;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vmware.avi.sdk.AviApi;
import com.vmware.avi.sdk.AviApiException;
import com.vmware.avi.sdk.AviCredentials;
import com.vmware.avi.sdk.AviRestUtils;
import com.vmware.avi.vro.model.AviRestResource;
import com.vmware.o11n.plugin.sdk.annotation.VsoConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import ch.dunes.vso.sdk.IServiceRegistry;
import ch.dunes.vso.sdk.ssl.ISslService;
import javax.net.ssl.SSLContext;

/***
 * This class acts as a service in Plugin. It performs the actions from the
 * workflow and perform rollback if needed.
 * 
 * @author tushar
 *
 */
@VsoObject(create = false, name = "AviVroClient")
@VsoFinder(name = Constants.FINDER_VRO_CLIENT, idAccessor = "getObjectID()")
@Service
public class AviVroClient {
	private static final Logger logger = LoggerFactory.getLogger(AviVroClient.class);

	public String getObjectID() {
		return cred.getController() + "-" + cred.getTenant();
	}

	@Autowired
	private IServiceRegistry serviceRegistry;

	@VsoConstructor
	public AviVroClient() {
	}

	private AviCredentials cred = null;
	private Map<String, Queue<AviObjectMetadata>> workflowDataMap = new HashMap<>();
	private Queue<AviObjectMetadata> workflowDataQueue = new LinkedList<>();
	private AviApi AVI_API = null;
	private ObjectMapper mapper = new ObjectMapper();
	private RestTemplate restTemplate = null;

	public enum OPERATION {

		ADD, UPDATE, DELETE;
	}

	public AviCredentials getCred() {
		return cred;
	}

	public void setCred(AviCredentials cred) {
		this.cred = cred;
	}

	/**
	 * This method will instantiate the AviApi if the current instance is null
	 * 
	 * @return instance of AviApi
	 */
	public AviApi getSession() {
		if (AVI_API == null) {
			synchronized (AviApi.class) {
				if (AVI_API == null) {
					AVI_API = new AviApi(cred);
				}
			}
		}
		return AVI_API;
	}

	public ISslService getSslService() {
		return (ISslService) serviceRegistry.getService(IServiceRegistry.SSL_SERVICE);
	}

	public RestTemplate getRestTemplate() {
		if (restTemplate == null) {
			SSLContext context = null;
			try {
				context = getSslService().newSslContext("TLS");
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			synchronized (AviRestUtils.class) {
				if (restTemplate == null) {
					cred.setSslContext(context);
					restTemplate = AviRestUtils.getRestTemplate(cred);
				}
			}
		}
		return restTemplate;
	}

	/***
	 * his method add the data into the queue with add operation and if the data is
	 * already exist it add operation ad update
	 * 
	 * @param objectData contains the actual data which is used of creating object
	 *                   on the controller
	 * @param workflowId id of the Workflow Run
	 * @param tenant Tenant of the controller
	 * @throws JsonProcessingException
	 * @throws AviApiException
	 */
	@VsoMethod
	public void addObject(AviRestResource objectData, String workflowId, String tenant)
			throws JsonProcessingException, AviApiException {
		if (null != objectData) {
			logger.debug("Executing addObject: ", workflowId);
			String objectType = objectData.getClass().getSimpleName();
			mapper.setSerializationInclusion(Include.NON_NULL);
			String jsonStr = mapper.writeValueAsString(objectData);
			JSONObject jsonObj = new JSONObject(jsonStr);
			AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj, OPERATION.ADD.toString(), tenant);
			aviObjectMetadata.setTenant(tenant);
			logger.info("inside adding Object : " + workflowDataMap);
			logger.info("Adding " + objectType + " into queue :" + workflowDataQueue);
			if (workflowDataMap.containsKey(workflowId)) {
				workflowDataQueue = workflowDataMap.get(workflowId);

			} else {
				workflowDataQueue = new LinkedList<>();
			}
			workflowDataQueue.add(aviObjectMetadata);
			workflowDataMap.put(workflowId, workflowDataQueue);
			logger.info("After adding " + objectType + " workflowDataMap is : " + workflowDataMap);
		} else {
			logger.info("Object data is empty");
			throw new AviApiException("Object data is empty");
		}
	}

	/***
	 * This method add the data into the queue with add operation and if the data is
	 * already exist it add operation ad update
	 * 
	 * @param objectTypeis the type of object.
	 * @param objectData   contains the actual data which is used of creating object
	 *                     on the controller
	 * @throws AviApiException
	 */
	@VsoMethod
	public void add(String objectType, String objectData) throws AviApiException {
		this.add(objectType, objectData, null);
	}

	/**
	 * This method add the data into the queue with add operation and if the data is
	 * already exist it add operation ad update
	 * 
	 * @param objectType is the type of object.a
	 * @param objectData contains the actual data which is used of creating object
	 * @param tenant     name of Tenant. on the controller
	 * @throws AviApiException
	 */
	@VsoMethod
	public void add(String objectType, String objectData, String workflowId) throws AviApiException {
		this.add(objectType, objectData, workflowId, null);
	}

	/**
	 * This method add the data into the queue with add operation and if the data is
	 * already exist it add operation ad update
	 * 
	 * @param objectType is the type of object.a
	 * @param objectData contains the actual data which is used of creating object
	 * @param tenant     name of Tenant. on the controller
	 * @param workflowId id of the Workflow Run
	 * @throws AviApiException
	 */
	@VsoMethod
	public void add(String objectType, String objectData, String workflowId, String tenant) throws AviApiException {
		if (((null != objectType) && (!objectType.isEmpty())) && ((null != objectData) && (!objectData.isEmpty()))) {
			JSONObject jsonObj = new JSONObject(objectData);
			AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj, OPERATION.ADD.toString(),
					tenant);
			logger.info("inside adding Object : " + workflowDataMap);
			logger.info("Adding " + objectType + " into queue :" + workflowDataQueue);
			if (workflowDataMap.containsKey(workflowId)) {
				workflowDataQueue = workflowDataMap.get(workflowId);

			} else {
				workflowDataQueue = new LinkedList<>();
			}
			workflowDataQueue.add(aviObjectMetadata);
			workflowDataMap.put(workflowId, workflowDataQueue);
			logger.info("Adding " + objectType + " into queue :" + workflowDataQueue);
		} else {
			logger.debug("Object type or object data is empty");
			throw new AviApiException("Object type or object data is empty");
		}
	}

	/**
	 * this method add the data into the queue with delete operation.
	 * 
	 * @param objectType is the type of object.
	 * @param objectData contains the actual data which is used of creating object
	 *                   on the controller
	 * @throws AviApiException
	 */
	@VsoMethod
	public void delete(String objectType, String objectData) throws AviApiException {
		this.delete(objectType, objectData, null);
	}

	/**
	 * this method add the data into the queue with delete operation.
	 * 
	 * @param objectType is the type of object.
	 * @param objectData contains the actual data which is used of creating object
	 *                   on the controller
	 * @param workflowId Id of Workflow Run
	 * @throws AviApiException
	 */
	@VsoMethod
	public void delete(String objectType, String objectData, String workflowId) throws AviApiException {
		if (((null != objectType) && (!objectType.isEmpty())) && ((null != objectData) && (!objectData.isEmpty()))) {
			logger.debug("ObjectType is empty");
			JSONObject jsonObj = new JSONObject(objectData);
			if ((jsonObj.has("uuid")) || (jsonObj.has("name"))) {
				AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj,
						OPERATION.DELETE.toString());
				logger.info("inside deleting Object : " + workflowDataMap);
				logger.info("Adding " + objectType + " into queue :" + workflowDataQueue + " for deletion");
				if (workflowDataMap.containsKey(workflowId)) {
					workflowDataQueue = workflowDataMap.get(workflowId);

				} else {
					workflowDataQueue = new LinkedList<>();
				}
				workflowDataQueue.add(aviObjectMetadata);
				workflowDataMap.put(workflowId, workflowDataQueue);
				logger.info("After adding " + objectType + " workflowDataMap is : " + workflowDataMap);

			} else {
				logger.debug("Name or UUID is missing");
				throw new AviApiException("Please provide name or uuid of the " + objectType);
			}
		} else {
			logger.debug("Object type or object data is empty");
			throw new AviApiException("Object type or object data is empty");
		}
	}

	/**
	 * This method add the data into the queue with delete operation.
	 * 
	 * @param objectData contains the actual data which is used of creating object
	 *                   on the controller
	 * @param tenant  Name of the tenant
	 * @throws JsonProcessingException
	 * @throws AviApiException
	 */
	@VsoMethod
	public void deleteObject(AviRestResource objectData, String tenant) throws JsonProcessingException, AviApiException {
		this.deleteObject(objectData, tenant, null);
	}

	/***
	 * this method add the data into the queue with delete operation
	 * 
	 * @param objectData contains the actual data which is used of creating object
	 *                   on the controller
	 * @param tenant     name of Tenant.
	 * @param workflowId id of the workflow Run
	 * @throws JsonProcessingException
	 * @throws AviApiException
	 */
	@VsoMethod
	public void deleteObject(AviRestResource objectData, String tenant, String workflowId)
			throws JsonProcessingException, AviApiException {
		if (objectData != null) {
			String objectType = objectData.getClass().getSimpleName();
			mapper.setSerializationInclusion(Include.NON_NULL);
			String jsonStr = mapper.writeValueAsString(objectData);
			JSONObject jsonObj = new JSONObject(jsonStr);
			if ((jsonObj != null) && ((jsonObj.has("uuid")) || (jsonObj.has("name")))) {
				String uuid = jsonObj.getString("uuid").toString();
				AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObj,
						OPERATION.DELETE.toString(), tenant);
				logger.info("Adding " + objectType + " with uuid " + uuid + "into queue :" + workflowDataQueue
						+ " for deletion");
				if (workflowDataMap.containsKey(workflowId)) {
					workflowDataQueue = workflowDataMap.get(workflowId);

				} else {
					workflowDataQueue = new LinkedList<>();
				}
				workflowDataQueue.add(aviObjectMetadata);
				workflowDataMap.put(workflowId, workflowDataQueue);

				logger.info("After adding " + objectType + " workflowDataMap is : " + workflowDataMap);
			} else {
				logger.debug("Name or UUID is missing");
				throw new AviApiException("Please provide name or uuid of the " + objectType);
			}
		} else {
			logger.debug("Object data is empty");
			throw new AviApiException("Object data is empty");
		}
	}

	/***
	 * This method add the data into the queue with delete operation
	 * 
	 * @param objectType type of the Object.
	 * @param name       name of the object.
	 * @param tenant     name of Tenant.
	 * @param workflowId id of the workflow Run
	 * @throws Exception
	 */
	@VsoMethod
	public void deleteObjectByName(String objectType, String name, String tenant, String workflowId) throws Exception {
		if ((null != objectType) && (!objectType.isEmpty())) {
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			JSONObject jsonObject = this.getObjectDataByName(objectType, name, userHeader);
			String uuid = jsonObject.getString("uuid").toString();
			AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObject,
					OPERATION.DELETE.toString(), tenant);
			logger.info("Adding " + objectType + " with uuid " + uuid + "into queue :" + workflowDataQueue
					+ " for deletion");
			if (workflowDataMap.containsKey(workflowId)) {
				workflowDataQueue = workflowDataMap.get(workflowId);

			} else {
				workflowDataQueue = new LinkedList<>();
			}
			workflowDataQueue.add(aviObjectMetadata);
			workflowDataMap.put(workflowId, workflowDataQueue);
			logger.info("After adding " + objectType + " workflowDataMap is : " + workflowDataMap);
		} else {
			logger.debug("ObjectType is empty");
			throw new AviApiException("Please provide object type");
		}
	}

	/***
	 * This method add the data into the queue with delete operation
	 * 
	 * @param objectType type of the Object.
	 * @param uuid       uuid of the object.
	 * @param tenant     name of Tenant on the controller
	 * @throws Exception
	 */
	@VsoMethod
	public void deleteObjectByUUID(String objectType, String uuid, String tenant) throws Exception {
		this.deleteObjectByUUID(objectType, uuid, tenant, null);
	}

	/***
	 * This method add the data into the queue with delete operation
	 * 
	 * @param objectType type of the Object.
	 * @param uuid       uuid of the object.
	 * @param workflowId id of the workflow Run
	 * @param tenant     name of Tenant. on the controller
	 * @throws Exception
	 */
	@VsoMethod
	public void deleteObjectByUUID(String objectType, String uuid, String tenant, String workflowId) throws Exception {
		if ((null != objectType) && (!objectType.isEmpty())) {
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			JSONObject jsonObject = this.getObjectDataByUUID(objectType, uuid, userHeader);
			AviObjectMetadata aviObjectMetadata = new AviObjectMetadata(objectType, jsonObject,
					OPERATION.DELETE.toString(), tenant);
			logger.info("Adding " + objectType + " with uuid " + uuid + "into queue :" + workflowDataQueue
					+ " for deletion");
			if (workflowDataMap.containsKey(workflowId)) {
				workflowDataQueue = workflowDataMap.get(workflowId);

			} else {
				workflowDataQueue = new LinkedList<>();
			}
			workflowDataQueue.add(aviObjectMetadata);
			workflowDataMap.put(workflowId, workflowDataQueue);
			logger.info("After adding " + objectType + " workflowDataMap is : " + workflowDataMap);
		} else {
			logger.debug("ObjectType is empty");
			throw new AviApiException("Please provide object type");
		}
	}

	/**
	 * 
	 * This method upload the file into the controller.
	 * 
	 * @param uri           is the URL for file upload e.g fileservice or image
	 * @param filePath      is the file path which needs to be uploaded from local
	 * @throws Exception
	 */
	@VsoMethod
	public void fileUpload(String uri, String filePath) throws Exception {
		logger.debug("Executing fileUpload.");
		logger.debug("uri : " + uri);
		logger.debug("File Path : " + filePath);
		AviApi session = getSession();
		if (uri != null && filePath != null) {
			session.fileUpload(uri, filePath);
		}
	}	

	/***
	 * 
	 * This method download the file from the controller.
	 * 
	 * @param path          is the the path from which file gets download.
	 * @param localFilePath is a path where file needs to be download.
	 * @param params        A map which can contains the additional values.
	 * @return String name of the downloaded file.
	 * @throws AviApiException
	 * @throws IOException
	 */
	@VsoMethod
	public String fileDownload(String path, String localFilePath, Map<String, String> params)
			throws AviApiException, IOException {
		logger.debug("Executing fileDownload...");
		logger.debug("PATH : " + path);
		logger.debug("Local file Path : " + localFilePath);
		logger.debug("PARAM : " + params);
		AviApi session = getSession();
		if (path != null && localFilePath != null) {
			session.fileDownload(path, localFilePath, params);
		}
		return localFilePath;
	}

	/****
	 * This method will handle all HTTP methods. if its POST it will call the POST,
	 * if its PUT it will call the PUT...and so on
	 * 
	 * @param AviRunTimeInfo AviRunTimeInfo object which contains url, http_method ,
	 *                       request body, request response and status code
	 * @return AviRunTimeInfo
	 * @throws Exception
	 */
	@VsoMethod
	public AviRunTimeInfo callAviAPI(AviRunTimeInfo aviObject) throws Exception {
		RestTemplate restTemplate = getRestTemplate();
		if (aviObject != null) {
			String url = aviObject.getUrl();
			String httpMethod = aviObject.getHttpMethod();
			ResponseEntity<String> aviResponseEntity = null;

			HttpEntity<String> requestEntity = null;
			if (aviObject.getRequestBody() != null) {
				requestEntity = new HttpEntity<String>(aviObject.getRequestBody(), null);
			}
			logger.info("Executing callAviAPI...");
			switch (httpMethod) {
			case "GET":
				logger.debug("Executing GET Method");
				aviResponseEntity = restTemplate.getForEntity(url, String.class, null, null);
				this.updateHttpResponse(aviObject, aviResponseEntity);
				logger.info("GET Response : " + aviResponseEntity);
				break;
			case "POST":
				logger.debug("Executing POST Method");
				aviResponseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class, null,
						null);
				this.updateHttpResponse(aviObject, aviResponseEntity);
				logger.info("POST Response : " + aviResponseEntity);
				break;
			case "PUT":
				logger.debug("Executing PUT Method");
				aviResponseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class, null, null);
				this.updateHttpResponse(aviObject, aviResponseEntity);
				logger.info("PUT Response : " + aviResponseEntity);
				break;
			case "DELETE":
				logger.debug("Executing DELETE Method");
				aviResponseEntity = restTemplate.exchange(url, HttpMethod.DELETE, null, String.class, null, null);
				this.updateHttpResponse(aviObject, aviResponseEntity);
				logger.info("DELETE Response : " + aviResponseEntity);
				break;
			default:
				logger.debug("Please pass the correct http Method..");
				break;
			}
		}
		return aviObject;
	}

	private void updateHttpResponse(AviRunTimeInfo runtimeInfoDto,
			ResponseEntity<String> albRuntimeInfoResponseEntity) {
		if (albRuntimeInfoResponseEntity != null) {
			if (albRuntimeInfoResponseEntity.getBody() != null) {
				runtimeInfoDto.setResponseBody(new JSONObject(albRuntimeInfoResponseEntity.getBody()));
			}
			runtimeInfoDto.setHttpStatuseCode(albRuntimeInfoResponseEntity.getStatusCode().toString());
		}
	}

	/****
	 * This method will handle all HTTP methods. if its POST it will call the POST,
	 * if its PUT it will call the PUT...and so on
	 * 
	 * @param path   Request path
	 * @param method type of the method.
	 * @param data   contains the actual data which is used for the operation.
	 * @return
	 */
	@VsoMethod
	public Boolean callAction(String path, String httpMethod, String data) {
		AviApi session = getSession();
		Boolean response = false;
		if ((null != path) && (!path.isEmpty())) {
			try {
				JSONObject jsonObj = null;
				switch (httpMethod) {
				case "POST":
					jsonObj = new JSONObject(data);
					session.post(path, jsonObj);
					response = true;
					break;
				case "PUT":
					jsonObj = new JSONObject(data);
					session.put(path, jsonObj);
					response = true;
					break;
				case "DELETE":
					session.delete(path, data);
					response = true;
					break;
				default:
					logger.debug("Please pass the correct http Method..");
					break;
				}
			} catch (AviApiException e) {
				response = false;
				logger.error("Exception occured : " + e.getMessage(), e);
			}
		} else {
			logger.debug("Please provide path");
		}
		return response;
	}

	/**
	 * This method fetch data from the Queue and perform the actions based on its
	 * operation.
	 * 
	 * @return ArrayList of AviRestResource.
	 * @throws Exception
	 */
	@VsoMethod
	public ArrayList<AviRestResource> executeWorkflow() throws Exception {
		return this.executeWorkflow(null);
	}

	/**
	 * This method fetch data from the Queue and perform the actions based on its
	 * operation.
	 * 
	 * @param workflowId Id of Workflow Run
	 * 
	 * @return ArrayList of AviRestResource.
	 * @throws Exception
	 */
	@VsoMethod
	public ArrayList<AviRestResource> executeWorkflow(String workflowId) throws Exception {
		int count = 0;
		logger.debug("Executing workflow : ", workflowId);
		// ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		ArrayList<AviRestResource> jsonResponse = new ArrayList<AviRestResource>();
		try {
			AviApi session = getSession();
			if (workflowDataMap.containsKey(workflowId)) {
				logger.info("workflowDataMap :" + workflowDataMap);
				workflowDataQueue = workflowDataMap.get(workflowId);
			}
			logger.info("Inside executeWorkflow :" + workflowDataQueue);
			for (AviObjectMetadata aviObjectMetadata : workflowDataQueue) {
				JSONObject response = null;
				String objectType = aviObjectMetadata.getObjectType().toLowerCase();
				AviRestResource object = this.getAviRestResourceObject(objectType);
				String operation = aviObjectMetadata.getOperation();
				JSONObject resource = null;
				String tenant = aviObjectMetadata.getTenant();
				logger.debug("Creating " + objectType + "on " + tenant);
				HashMap<String, String> userHeader = this.getTenantHeader(tenant);

				if (aviObjectMetadata.getNewObject().has("uuid")) {
					resource = getObjectDataByUUID(objectType, aviObjectMetadata.getNewObject().get("uuid").toString(),
							userHeader);
				} else if (aviObjectMetadata.getNewObject().has("name")) {
					String nameOfObject = aviObjectMetadata.getNewObject().get("name").toString();
					resource = getObjectDataByName(objectType, nameOfObject, userHeader);
				} else {

				}
				if (operation.equals(OPERATION.ADD.toString())) {
					if (null == resource) {
						logger.debug("Creating " + objectType);
						response = session.post(objectType, aviObjectMetadata.getNewObject(), userHeader);
						object = mapper.readValue(response.toString(), object.getClass());
						logger.info(objectType + " created and response is " + response);
					} else {
						logger.debug("Updating  " + objectType);
						aviObjectMetadata.setOperation(OPERATION.UPDATE.toString());
						JSONObject copyOfObject = new JSONObject(resource.toString());
						aviObjectMetadata.setExistingObject(copyOfObject);
						JSONObject mergedObject = this.mergeJsonObjects(resource, aviObjectMetadata.getNewObject());
						response = session.put(objectType, mergedObject, userHeader);
						object = mapper.readValue(response.toString(), object.getClass());
						logger.info(objectType + " updated and response is " + response);

					}

				} else if (operation.equals(OPERATION.DELETE.toString())) {
					logger.debug("Deleting " + aviObjectMetadata.getObjectType().toLowerCase());
					if (null != resource) {
						this.deleteObject(resource, aviObjectMetadata, "executeWorkflow", count);
					}
				}

				jsonResponse.add(object);
				count++;
			}
		} catch (AviApiException e) {
			this.rollback(count - 1, workflowDataQueue, e);
		} finally {
			clearQueue();
		}

		return jsonResponse;
	}

	/***
	 * this method generate the user header
	 * 
	 * @param tenant name of tenant.
	 * @return TenantHeader
	 */
	public HashMap<String, String> getTenantHeader(String tenant) {
		HashMap<String, String> userHeader = null;
		if (tenant != null) {
			userHeader = new HashMap<String, String>();
			userHeader.put(Constants.FINDER_VRO_X_AVI_TENANT, tenant);
		}
		return userHeader;
	}

	/***
	 * This method returns AviRestResource
	 * 
	 * @param objectType name of the object.
	 * @return AviRestResource
	 */

	public AviRestResource getAviRestResourceObject(String objectType) {
		String className = null;
		AviRestResource object = null;
		if (VroPluginFactory.modelMap.containsKey(objectType.toUpperCase())) {
			className = VroPluginFactory.modelMap.get(objectType.toUpperCase());
		}
		try {
			@SuppressWarnings("unchecked")
			Class<AviRestResource> obj = (Class<AviRestResource>) Class
					.forName("com.vmware.avi.vro.model." + className);
			object = obj.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			logger.debug("Exception : " + e.getMessage());

		}

		return object;
	}

	/**
	 * 
	 * method for clearing the queue
	 */
	private void clearQueue() {
		logger.debug("Clearing workflowDataQueue");
		if (!this.workflowDataQueue.isEmpty()) {
			this.workflowDataQueue.clear();
		}
	}

	/***
	 * Method for getting object data.
	 * 
	 * @param objectType is the type of object.
	 * @param params     is a map containing the key and values.
	 * @param tenant     name of the Tenant
	 * @return the JSONArray of the response.
	 * @throws Exception
	 */
	@VsoMethod
	public JSONArray get(String objectType, Map<String, String> params, String tenant) throws Exception {
		AviApi session = getSession();
		if ((null != objectType) && (!objectType.isEmpty())) {
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			JSONObject data = session.get(objectType, params, userHeader);
			logger.info("Existing data of " + objectType + " : " + data);
			return (JSONArray) data.get("results");
		} else {
			logger.debug("ObjectType is empty");
			throw new AviApiException("Please provide objectType");
		}
	}

	/***
	 * Method for getting object data.
	 * 
	 * @param objectType is the type of object.
	 * @param objectName name of the object.
	 * @param userHeader user header with additional properties.
	 * @return JSONObject
	 * @throws Exception
	 */

	@VsoMethod
	public JSONObject getObjectDataByName(String objectType, String objectName, HashMap<String, String> userHeader)
			throws Exception {
		AviApi session = getSession();
		JSONObject data = null;
		JSONObject result = null;
		String path = null;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("include_name", "true");
		if ((null != objectName) && (!objectName.isEmpty())) {
			path = objectType + "?name=" + objectName;
			data = session.get(path, map, userHeader);
		} else {
			logger.debug("Incorrect " + objectType + " name ");
			throw new AviApiException("Please provide name of the " + objectType);
		}

		logger.info("Existing data of " + objectType + " : " + data);
		if ((data.has("count")) && (Integer.parseInt(data.get("count").toString()) > 0)) {
			JSONArray objectArray = (JSONArray) data.get("results");
			result = (JSONObject) objectArray.get(0);
		}  
		if(!(data.has("count"))) {
			logger.info("Returning Data from getObjectDataByName");
			logger.info("Existing data of " + objectType + " : " + data);
			if (data != null) {
				result = (JSONObject) data;
			}
		}

		return result;
	}

	/***
	 * Method for getting object data.
	 * 
	 * @param objectType is the type of object.
	 * @param uuid       uuid of the object.
	 * @param userHeader user header with additional properties.
	 * @return JSONObject
	 * @throws Exception
	 */
	@VsoMethod
	public JSONObject getObjectDataByUUID(String objectType, String uuid, HashMap<String, String> userHeader)
			throws Exception {
		AviApi session = getSession();
		String path = null;
		JSONObject data = null;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("include_name", "true");
		if ((null != uuid) && (!uuid.isEmpty())) {
			path = objectType + "/" + uuid;
			data = session.get(path, map, userHeader);
		} else {
			logger.debug("Incorrect " + objectType + " uuid ");
			throw new AviApiException("Please provide uuid of the " + objectType);
		}
		logger.info("Existing data of " + objectType + " : " + data);
		return data;
	}

	/***
	 * Method for getting object data.
	 * 
	 * @param objectType is the type of object.
	 * @param params     is a map containing the key and values.
	 * @return List of AviRestResource
	 * @throws Exception
	 */

	@VsoMethod
	public List<AviRestResource> getObject(String objectType, Map<String, String> params) throws Exception {
		return this.getObject(objectType, params, null);
	}

	/**
	 * Method for getting object data based on its name.
	 * 
	 * @param objectType is the type of object.
	 * @param objectName name of the object.
	 * @return AviRestResource
	 * 
	 * @throws Exception
	 */

	@VsoMethod
	public AviRestResource getObjectByName(String objectType, String objectName) throws Exception {
		return this.getObjectByName(objectType, objectName, null);

	}

	/***
	 * Method for getting object data.
	 * 
	 * @param objectType is the type of object.
	 * @param params     is a map containing the key and values.
	 * @param tenant     name of the Tenant
	 * @return List of AviRestResource
	 * @throws Exception
	 */
	@VsoMethod
	public List<AviRestResource> getObject(String objectType, Map<String, String> params, String tenant)
			throws Exception {
		JSONArray array = this.get(objectType, params, tenant);
		List<AviRestResource> objectList = new ArrayList<AviRestResource>();
		// ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		for (int counter = 0; counter < array.length(); counter++) {
			AviRestResource object = this.getAviRestResourceObject(objectType);
			JSONObject result = array.getJSONObject(counter);
			object = mapper.readValue(result.toString(), object.getClass());
			objectList.add(object);
		}
		logger.info("ObjectList : " + objectList);
		return objectList;
	}

	/**
	 * Method for getting object data based on its name.
	 * 
	 * @param objectType is the type of object.
	 * @param objectName name of the object.
	 * @param tenant     name of the tenant
	 * @return AviRestResource.
	 * @throws Exception
	 */

	@VsoMethod
	public AviRestResource getObjectByName(String objectType, String objectName, String tenant) throws Exception {
		if ((null != objectType) && ("" != objectType)) {
			AviRestResource object = this.getAviRestResourceObject(objectType);
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			JSONObject jsonObject = this.getObjectDataByName(objectType, objectName, userHeader);
			object = mapper.readValue(jsonObject.toString(), object.getClass());
			return object;
		} else {
			logger.debug("ObjectType is empty");
			throw new AviApiException("Please provide object type");
		}

	}

	/**
	 * Method for getting object data based on its uuid.
	 * 
	 * @param objectType is the type of object.
	 * @param uuid       uuid of the object.
	 * @param tenant     name of the tenant
	 * @return the AviRestResource .
	 * 
	 * @throws Exception
	 */

	@VsoMethod
	public AviRestResource getObjectByUUID(String objectType, String uuid, String tenant) throws Exception {
		if ((null != objectType) && ("" != objectType)) {
			AviRestResource object = this.getAviRestResourceObject(objectType);
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			JSONObject jsonObject = this.getObjectDataByUUID(objectType, uuid, userHeader);
			object = mapper.readValue(jsonObject.toString(), object.getClass());
			return object;
		} else {
			logger.debug("ObjectType is empty");
			throw new AviApiException("Please provide object type");
		}
	}

	/***
	 * This method is perform roll back task i.e. if something wents wrong during
	 * the workflow execution all the previous actions will be rool back.
	 * 
	 * @param count    indicating how many objects needs to rollback.
	 * @param metadata contains the AviObjectMetadata which used for the rollback.
	 * @throws Exception
	 */
	@VsoMethod
	public void rollback(int count, Queue<AviObjectMetadata> metadata, Exception exception) throws Exception {
		AviApi session = getSession();
		String rollBackMsg = null;
		JSONObject response = null;
		logger.debug("Doing rollback :");
		try {
			LinkedList<AviObjectMetadata> metadataList = (LinkedList<AviObjectMetadata>) metadata;
			logger.info("Rollback Object List:" + metadataList);
			for (int counter = count; counter >= 0; counter--) {
				AviObjectMetadata currentObjectData = metadataList.get(counter);
				JSONObject existingObjectData = currentObjectData.getExistingObject();
				String operationType = currentObjectData.getOperation();
				String tenant = currentObjectData.getTenant();
				HashMap<String, String> userHeader = this.getTenantHeader(tenant);
				if (OPERATION.ADD.toString().equals(operationType)) {
					String loggerMsg = " Deleting " + currentObjectData.getObjectType().toLowerCase() + " :: ";
					logger.info(loggerMsg);
					rollBackMsg = rollBackMsg + loggerMsg;
					JSONObject resource = getObjectDataByName(currentObjectData.getObjectType().toLowerCase(),
							currentObjectData.getNewObject().get("name").toString(), userHeader);
					this.deleteObject(resource, currentObjectData, "rollback", 0);
				} else if (OPERATION.UPDATE.toString().equals(operationType)) {
					String loggerMsg = " Restoring " + currentObjectData.getObjectType().toLowerCase() + " :: ";
					logger.info(loggerMsg);
					rollBackMsg = rollBackMsg + loggerMsg;

					if (!existingObjectData.isEmpty()) {
						JSONObject resource = getObjectDataByName(currentObjectData.getObjectType().toLowerCase(),
								currentObjectData.getNewObject().get("name").toString(), userHeader);
						if (resource == null) {
							response = session.post(currentObjectData.getObjectType().toLowerCase(),
									currentObjectData.getExistingObject(), userHeader);
							logger.info(currentObjectData.getObjectType().toLowerCase() + " : "
									+ "created & response is:- " + response);
						} else {
							JSONObject mergedObject = this.mergeJsonObjects(resource,
									currentObjectData.getExistingObject());

							response = session.put(currentObjectData.getObjectType().toLowerCase(), mergedObject,
									userHeader);
							logger.info(currentObjectData.getObjectType().toLowerCase() + "updated  :" + response);
						}

					}
				} else {
					if (null != existingObjectData) {
						String loggerMsg = " Creating " + currentObjectData.getObjectType().toLowerCase() + " :: ";
						logger.info(loggerMsg);
						rollBackMsg = rollBackMsg + loggerMsg;
						JSONObject updatedObject = transformRef(existingObjectData);
						response = session.post(currentObjectData.getObjectType().toLowerCase(), updatedObject,
								userHeader);
						logger.info(currentObjectData.getObjectType() + " : " + "created & response is:- " + response);
					}
				}
			}
			throw new Exception("\n" + exception.getMessage() + ":: Inside Rollback ::" + rollBackMsg + "\n");
		} catch (AviApiException e) {
			logger.error(e.getMessage());
			e.initCause(exception);
			throw new Exception(e.getMessage() + "::" + rollBackMsg);

		} catch (Exception e) {
			logger.error(e.getMessage());
			e.initCause(exception);
			throw new Exception(e.getMessage() + "::" + rollBackMsg);
		}

	}

	/***
	 * This method merge the two JSON Objects.
	 * 
	 * @param json1 JSON object.
	 * @param json2 JSON object.
	 * @return the merged JSON object.
	 */
	private JSONObject mergeJsonObjects(JSONObject object1, JSONObject object2) {
		Iterator<String> keys = object1.keys();
		Object obj1, obj2 = null;
		while (keys.hasNext()) {
			String next = keys.next();
			if (object1.isNull(next))
				continue;
			obj1 = object1.get(next);
			if (!object2.has(next))
				object2.putOpt(next, obj1);
			obj2 = object2.get(next);
			if (obj1 instanceof JSONObject && obj2 instanceof JSONObject) {
				mergeJsonObjects((JSONObject) obj1, (JSONObject) obj2);
			}
		}
		object2.remove("_last_modified");
		return object2;
	}

	/***
	 * 
	 * This method makes the REST delete call..
	 * 
	 * @param resource          is a response containing uuid needed for delete
	 *                          operation.
	 * @param aviObjectMetadata contains the AviObjectMetadata which used for the
	 *                          rollback.
	 * @param action            define from where the deleteObect method
	 *                          called(executeWorkflow or rollback).
	 * @param count             indicating how many objects needs to rollback.
	 * @return
	 * @throws Exception
	 */
	private JSONObject deleteObject(JSONObject resource, AviObjectMetadata aviObjectMetadata, String action, int count)
			throws Exception {

		AviApi session = getSession();
		JSONObject response = null;
		JSONObject copyOfObject = null;
		if (null != resource) {
			String tenant = aviObjectMetadata.getTenant();
			HashMap<String, String> userHeader = this.getTenantHeader(tenant);
			copyOfObject = new JSONObject(resource, JSONObject.getNames(resource));
			if ("executeWorkflow".equals(action)) {
				aviObjectMetadata.setExistingObject(copyOfObject);
			}
			String resourceUUID = resource.get("uuid").toString();
			if ((!("").equals(resourceUUID)) || (null != resourceUUID)) {
				response = session.delete(aviObjectMetadata.getObjectType().toLowerCase(), resourceUUID, userHeader);
				logger.info(aviObjectMetadata.getObjectType().toLowerCase() + " deleted and response is " + response);
			}
		} else {

			if ("executeWorkflow".equals(action)) {
				this.rollback(count - 1, workflowDataQueue,
						new AviApiException(
								"Object with name " + aviObjectMetadata.getNewObject().get("name").toString()
										+ " is not found on controller " + cred.getController()));
			}
		}
		return copyOfObject;
	}

	/***
	 * This method will check keys of the json object if it found object reference
	 * or references it will replace the uuid with the name in condition.
	 * 
	 * @param jsonObject is the object which needs to be modified (references).
	 * @return JSONObject with updated references.
	 */
	private JSONObject transformRef(JSONObject jsonObject) {
		if (!jsonObject.isEmpty()) {
			Set<String> keys = jsonObject.keySet();
			for (String key : keys) {
				Object value = jsonObject.get(key);
				if (key.endsWith("_ref")) {
					String valueOfKey = value.toString();
					String updatedRef = createReference(valueOfKey);
					jsonObject.put(key, updatedRef);
				} else if (key.endsWith("_refs")) {
					JSONArray stringArray = (JSONArray) value;
					ArrayList<String> updatedList = new ArrayList<String>();
					for (Object s : stringArray) {
						String updatedValue = createReference(s.toString());
						updatedList.add(updatedValue);
					}
					jsonObject.put(key, updatedList);

				} else {

				}
			}
		}
		return jsonObject;
	}

	/***
	 * this method modified the string and appending name condition.
	 * 
	 * @param str
	 * @return the String which replace uuid with name in condition.
	 */
	private String createReference(String str) {
		if ((null != str) && ("" != str)) {
			return str.substring(0, str.lastIndexOf("/")) + "/?name=" + str.substring(str.indexOf("#") + 1);
		}
		return null;
	}
}
