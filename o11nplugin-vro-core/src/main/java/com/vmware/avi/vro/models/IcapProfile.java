package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IcapNsxDefenderConfig;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The IcapProfile is a POJO class extends AviRestResource that used for creating
 * IcapProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IcapProfile")
@VsoFinder(name = Constants.FINDER_VRO_ICAPPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IcapProfile extends AviRestResource {
    @JsonProperty("allow_204")
    @JsonInclude(Include.NON_NULL)
    private Boolean allow204 = true;

    @JsonProperty("buffer_size")
    @JsonInclude(Include.NON_NULL)
    private Integer bufferSize = 51200;

    @JsonProperty("buffer_size_exceed_action")
    @JsonInclude(Include.NON_NULL)
    private String bufferSizeExceedAction = "ICAP_FAIL_OPEN";

    @JsonProperty("cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String cloudRef = null;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("enable_preview")
    @JsonInclude(Include.NON_NULL)
    private Boolean enablePreview = true;

    @JsonProperty("fail_action")
    @JsonInclude(Include.NON_NULL)
    private String failAction = "ICAP_FAIL_OPEN";

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("nsx_defender_config")
    @JsonInclude(Include.NON_NULL)
    private IcapNsxDefenderConfig nsxDefenderConfig = null;

    @JsonProperty("pool_group_ref")
    @JsonInclude(Include.NON_NULL)
    private String poolGroupRef = null;

    @JsonProperty("preview_size")
    @JsonInclude(Include.NON_NULL)
    private Integer previewSize = 5000;

    @JsonProperty("response_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer responseTimeout = 60000;

    @JsonProperty("service_uri")
    @JsonInclude(Include.NON_NULL)
    private String serviceUri = null;

    @JsonProperty("slow_response_warning_threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer slowResponseWarningThreshold = 10000;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("vendor")
    @JsonInclude(Include.NON_NULL)
    private String vendor = "ICAP_VENDOR_OPSWAT";



  /**
   * This is the getter method this will return the attribute value.
   * Allow icap server to send 204 response as described in rfc 3507 section 4.5.
   * Service engine will buffer the complete request if alllow_204 is enabled.
   * If disabled, preview_size request body will be buffered if enable_preview is set to true, and rest of the request body will be streamed to the
   * icap server.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return allow204
   */
  @VsoMethod
  public Boolean getAllow204() {
    return allow204;
  }

  /**
   * This is the setter method to the attribute.
   * Allow icap server to send 204 response as described in rfc 3507 section 4.5.
   * Service engine will buffer the complete request if alllow_204 is enabled.
   * If disabled, preview_size request body will be buffered if enable_preview is set to true, and rest of the request body will be streamed to the
   * icap server.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param allow204 set the allow204.
   */
  @VsoMethod
  public void setAllow204(Boolean  allow204) {
    this.allow204 = allow204;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The maximum buffer size for the http request body.
   * If the request body exceeds this size, the request will not be checked by the icap server.
   * In this case, the configured action will be executed and a significant log entry will be generated.
   * Allowed values are 1-51200.
   * Field introduced in 20.1.1.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 51200.
   * @return bufferSize
   */
  @VsoMethod
  public Integer getBufferSize() {
    return bufferSize;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum buffer size for the http request body.
   * If the request body exceeds this size, the request will not be checked by the icap server.
   * In this case, the configured action will be executed and a significant log entry will be generated.
   * Allowed values are 1-51200.
   * Field introduced in 20.1.1.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 51200.
   * @param bufferSize set the bufferSize.
   */
  @VsoMethod
  public void setBufferSize(Integer  bufferSize) {
    this.bufferSize = bufferSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Decide what should happen if the request body size exceeds the configured buffer size.
   * If this is set to fail open, the request will not be checked by the icap server.
   * If this is set to fail closed, the request will be rejected with 413 status code.
   * Enum options - ICAP_FAIL_OPEN, ICAP_FAIL_CLOSED.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ICAP_FAIL_OPEN".
   * @return bufferSizeExceedAction
   */
  @VsoMethod
  public String getBufferSizeExceedAction() {
    return bufferSizeExceedAction;
  }

  /**
   * This is the setter method to the attribute.
   * Decide what should happen if the request body size exceeds the configured buffer size.
   * If this is set to fail open, the request will not be checked by the icap server.
   * If this is set to fail closed, the request will be rejected with 413 status code.
   * Enum options - ICAP_FAIL_OPEN, ICAP_FAIL_CLOSED.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ICAP_FAIL_OPEN".
   * @param bufferSizeExceedAction set the bufferSizeExceedAction.
   */
  @VsoMethod
  public void setBufferSizeExceedAction(String  bufferSizeExceedAction) {
    this.bufferSizeExceedAction = bufferSizeExceedAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The cloud where this object belongs to.
   * This must match the cloud referenced in the pool group below.
   * It is a reference to an object of type cloud.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * The cloud where this object belongs to.
   * This must match the cloud referenced in the pool group below.
   * It is a reference to an object of type cloud.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A description for this icap profile.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * A description for this icap profile.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use the icap preview feature as described in rfc 3507 section 4.5.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enablePreview
   */
  @VsoMethod
  public Boolean getEnablePreview() {
    return enablePreview;
  }

  /**
   * This is the setter method to the attribute.
   * Use the icap preview feature as described in rfc 3507 section 4.5.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enablePreview set the enablePreview.
   */
  @VsoMethod
  public void setEnablePreview(Boolean  enablePreview) {
    this.enablePreview = enablePreview;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Decide what should happen if there is a problem with the icap server like communication timeout, protocol error, pool error, etc.
   * If this is set to fail open, the request will continue, but will create a significant log entry.
   * If this is set to fail closed, the request will be rejected with a 500 status code.
   * Enum options - ICAP_FAIL_OPEN, ICAP_FAIL_CLOSED.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ICAP_FAIL_OPEN".
   * @return failAction
   */
  @VsoMethod
  public String getFailAction() {
    return failAction;
  }

  /**
   * This is the setter method to the attribute.
   * Decide what should happen if there is a problem with the icap server like communication timeout, protocol error, pool error, etc.
   * If this is set to fail open, the request will continue, but will create a significant log entry.
   * If this is set to fail closed, the request will be rejected with a 500 status code.
   * Enum options - ICAP_FAIL_OPEN, ICAP_FAIL_CLOSED.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ICAP_FAIL_OPEN".
   * @param failAction set the failAction.
   */
  @VsoMethod
  public void setFailAction(String  failAction) {
    this.failAction = failAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the icap profile.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the icap profile.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nsxdefender specific icap configurations.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsxDefenderConfig
   */
  @VsoMethod
  public IcapNsxDefenderConfig getNsxDefenderConfig() {
    return nsxDefenderConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Nsxdefender specific icap configurations.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nsxDefenderConfig set the nsxDefenderConfig.
   */
  @VsoMethod
  public void setNsxDefenderConfig(IcapNsxDefenderConfig nsxDefenderConfig) {
    this.nsxDefenderConfig = nsxDefenderConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The pool group which is used to connect to icap servers.
   * It is a reference to an object of type poolgroup.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolGroupRef
   */
  @VsoMethod
  public String getPoolGroupRef() {
    return poolGroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * The pool group which is used to connect to icap servers.
   * It is a reference to an object of type poolgroup.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolGroupRef set the poolGroupRef.
   */
  @VsoMethod
  public void setPoolGroupRef(String  poolGroupRef) {
    this.poolGroupRef = poolGroupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The icap preview size as described in rfc 3507 section 4.5.
   * This should not exceed the size supported by the icap server.
   * If this is set to 0, only the http header will be sent to the icap server as a preview.
   * To disable preview completely, set the enable-preview option to false.if vendor is lastline, recommended preview size is 1000 bytes,minimum
   * preview size is 10 bytes.
   * Allowed values are 0-5000.
   * Field introduced in 20.1.1.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5000.
   * @return previewSize
   */
  @VsoMethod
  public Integer getPreviewSize() {
    return previewSize;
  }

  /**
   * This is the setter method to the attribute.
   * The icap preview size as described in rfc 3507 section 4.5.
   * This should not exceed the size supported by the icap server.
   * If this is set to 0, only the http header will be sent to the icap server as a preview.
   * To disable preview completely, set the enable-preview option to false.if vendor is lastline, recommended preview size is 1000 bytes,minimum
   * preview size is 10 bytes.
   * Allowed values are 0-5000.
   * Field introduced in 20.1.1.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5000.
   * @param previewSize set the previewSize.
   */
  @VsoMethod
  public void setPreviewSize(Integer  previewSize) {
    this.previewSize = previewSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum time, client's request will be paused for icap processing.
   * If this timeout is exceeded, the request to the icap server will be aborted and the configured fail action is executed.
   * Allowed values are 50-3600000.
   * Field introduced in 20.1.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60000.
   * @return responseTimeout
   */
  @VsoMethod
  public Integer getResponseTimeout() {
    return responseTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum time, client's request will be paused for icap processing.
   * If this timeout is exceeded, the request to the icap server will be aborted and the configured fail action is executed.
   * Allowed values are 50-3600000.
   * Field introduced in 20.1.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60000.
   * @param responseTimeout set the responseTimeout.
   */
  @VsoMethod
  public void setResponseTimeout(Integer  responseTimeout) {
    this.responseTimeout = responseTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The path and query component of the icap url.
   * Host name and port will be taken from the pool.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceUri
   */
  @VsoMethod
  public String getServiceUri() {
    return serviceUri;
  }

  /**
   * This is the setter method to the attribute.
   * The path and query component of the icap url.
   * Host name and port will be taken from the pool.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceUri set the serviceUri.
   */
  @VsoMethod
  public void setServiceUri(String  serviceUri) {
    this.serviceUri = serviceUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If the icap request takes longer than this value, this request will generate a significant log entry.
   * Allowed values are 50-3600000.
   * Field introduced in 20.1.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @return slowResponseWarningThreshold
   */
  @VsoMethod
  public Integer getSlowResponseWarningThreshold() {
    return slowResponseWarningThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * If the icap request takes longer than this value, this request will generate a significant log entry.
   * Allowed values are 50-3600000.
   * Field introduced in 20.1.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @param slowResponseWarningThreshold set the slowResponseWarningThreshold.
   */
  @VsoMethod
  public void setSlowResponseWarningThreshold(Integer  slowResponseWarningThreshold) {
    this.slowResponseWarningThreshold = slowResponseWarningThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant which this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant which this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the icap profile.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the icap profile.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The vendor of the icap server.
   * Enum options - ICAP_VENDOR_GENERIC, ICAP_VENDOR_OPSWAT, ICAP_VENDOR_LASTLINE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ICAP_VENDOR_OPSWAT".
   * @return vendor
   */
  @VsoMethod
  public String getVendor() {
    return vendor;
  }

  /**
   * This is the setter method to the attribute.
   * The vendor of the icap server.
   * Enum options - ICAP_VENDOR_GENERIC, ICAP_VENDOR_OPSWAT, ICAP_VENDOR_LASTLINE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ICAP_VENDOR_OPSWAT".
   * @param vendor set the vendor.
   */
  @VsoMethod
  public void setVendor(String  vendor) {
    this.vendor = vendor;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IcapProfile objIcapProfile = (IcapProfile) o;
  return   Objects.equals(this.uuid, objIcapProfile.uuid)&&
  Objects.equals(this.name, objIcapProfile.name)&&
  Objects.equals(this.tenantRef, objIcapProfile.tenantRef)&&
  Objects.equals(this.cloudRef, objIcapProfile.cloudRef)&&
  Objects.equals(this.description, objIcapProfile.description)&&
  Objects.equals(this.poolGroupRef, objIcapProfile.poolGroupRef)&&
  Objects.equals(this.vendor, objIcapProfile.vendor)&&
  Objects.equals(this.serviceUri, objIcapProfile.serviceUri)&&
  Objects.equals(this.bufferSize, objIcapProfile.bufferSize)&&
  Objects.equals(this.bufferSizeExceedAction, objIcapProfile.bufferSizeExceedAction)&&
  Objects.equals(this.enablePreview, objIcapProfile.enablePreview)&&
  Objects.equals(this.previewSize, objIcapProfile.previewSize)&&
  Objects.equals(this.responseTimeout, objIcapProfile.responseTimeout)&&
  Objects.equals(this.slowResponseWarningThreshold, objIcapProfile.slowResponseWarningThreshold)&&
  Objects.equals(this.failAction, objIcapProfile.failAction)&&
  Objects.equals(this.allow204, objIcapProfile.allow204)&&
  Objects.equals(this.nsxDefenderConfig, objIcapProfile.nsxDefenderConfig);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IcapProfile {\n");
      sb.append("    allow204: ").append(toIndentedString(allow204)).append("\n");
        sb.append("    bufferSize: ").append(toIndentedString(bufferSize)).append("\n");
        sb.append("    bufferSizeExceedAction: ").append(toIndentedString(bufferSizeExceedAction)).append("\n");
        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enablePreview: ").append(toIndentedString(enablePreview)).append("\n");
        sb.append("    failAction: ").append(toIndentedString(failAction)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nsxDefenderConfig: ").append(toIndentedString(nsxDefenderConfig)).append("\n");
        sb.append("    poolGroupRef: ").append(toIndentedString(poolGroupRef)).append("\n");
        sb.append("    previewSize: ").append(toIndentedString(previewSize)).append("\n");
        sb.append("    responseTimeout: ").append(toIndentedString(responseTimeout)).append("\n");
        sb.append("    serviceUri: ").append(toIndentedString(serviceUri)).append("\n");
        sb.append("    slowResponseWarningThreshold: ").append(toIndentedString(slowResponseWarningThreshold)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
      sb.append("}");
  return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(java.lang.Object o) {
  if (o == null) {
    return "null";
  }
  return o.toString().replace("\n", "\n    ");
}
}

