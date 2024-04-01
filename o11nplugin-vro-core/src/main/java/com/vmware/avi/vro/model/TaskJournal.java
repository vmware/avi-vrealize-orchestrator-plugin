package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.JournalInfo;
import com.vmware.avi.vro.model.JournalSummary;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The TaskJournal is a POJO class extends AviRestResource that used for creating
 * TaskJournal.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TaskJournal")
@VsoFinder(name = Constants.FINDER_VRO_TASKJOURNAL, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TaskJournal extends AviRestResource {
    @JsonProperty("errors")
    @JsonInclude(Include.NON_NULL)
    private List<JournalError> errors;

    @JsonProperty("image_ref")
    @JsonInclude(Include.NON_NULL)
    private String imageRef;

    @JsonProperty("info")
    @JsonInclude(Include.NON_NULL)
    private JournalInfo info;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("obj_cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String objCloudRef;

    @JsonProperty("operation")
    @JsonInclude(Include.NON_NULL)
    private String operation;

    @JsonProperty("patch_image_ref")
    @JsonInclude(Include.NON_NULL)
    private String patchImageRef;

    @JsonProperty("summary")
    @JsonInclude(Include.NON_NULL)
    private JournalSummary summary;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * List of errors in the process.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errors
   */
  @VsoMethod
  public List<JournalError> getErrors() {
    return errors;
  }

  /**
   * This is the setter method. this will set the errors
   * List of errors in the process.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errors
   */
  @VsoMethod
  public void setErrors(List<JournalError>  errors) {
    this.errors = errors;
  }

  /**
   * This is the setter method this will set the errors
   * List of errors in the process.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errors
   */
  @VsoMethod
  public TaskJournal addErrorsItem(JournalError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<JournalError>();
    }
    this.errors.add(errorsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying the current base image.
   * It is a reference to an object of type image.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return imageRef
   */
  @VsoMethod
  public String getImageRef() {
    return imageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying the current base image.
   * It is a reference to an object of type image.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param imageRef set the imageRef.
   */
  @VsoMethod
  public void setImageRef(String  imageRef) {
    this.imageRef = imageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Detailed information of journal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return info
   */
  @VsoMethod
  public JournalInfo getInfo() {
    return info;
  }

  /**
   * This is the setter method to the attribute.
   * Detailed information of journal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param info set the info.
   */
  @VsoMethod
  public void setInfo(JournalInfo info) {
    this.info = info;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name for the task journal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name for the task journal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud that this object belongs to.
   * It is a reference to an object of type cloud.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objCloudRef
   */
  @VsoMethod
  public String getObjCloudRef() {
    return objCloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud that this object belongs to.
   * It is a reference to an object of type cloud.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objCloudRef set the objCloudRef.
   */
  @VsoMethod
  public void setObjCloudRef(String  objCloudRef) {
    this.objCloudRef = objCloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Operation for which the task journal created.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return operation
   */
  @VsoMethod
  public String getOperation() {
    return operation;
  }

  /**
   * This is the setter method to the attribute.
   * Operation for which the task journal created.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param operation set the operation.
   */
  @VsoMethod
  public void setOperation(String  operation) {
    this.operation = operation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying the current patch.
   * It is a reference to an object of type image.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchImageRef
   */
  @VsoMethod
  public String getPatchImageRef() {
    return patchImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying the current patch.
   * It is a reference to an object of type image.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param patchImageRef set the patchImageRef.
   */
  @VsoMethod
  public void setPatchImageRef(String  patchImageRef) {
    this.patchImageRef = patchImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Summary of journal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return summary
   */
  @VsoMethod
  public JournalSummary getSummary() {
    return summary;
  }

  /**
   * This is the setter method to the attribute.
   * Summary of journal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param summary set the summary.
   */
  @VsoMethod
  public void setSummary(JournalSummary summary) {
    this.summary = summary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid associated with the object.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant uuid associated with the object.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
   * Uuid identifier for the task journal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid identifier for the task journal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
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
  TaskJournal objTaskJournal = (TaskJournal) o;
  return   Objects.equals(this.uuid, objTaskJournal.uuid)&&
  Objects.equals(this.name, objTaskJournal.name)&&
  Objects.equals(this.summary, objTaskJournal.summary)&&
  Objects.equals(this.errors, objTaskJournal.errors)&&
  Objects.equals(this.info, objTaskJournal.info)&&
  Objects.equals(this.imageRef, objTaskJournal.imageRef)&&
  Objects.equals(this.patchImageRef, objTaskJournal.patchImageRef)&&
  Objects.equals(this.operation, objTaskJournal.operation)&&
  Objects.equals(this.objCloudRef, objTaskJournal.objCloudRef)&&
  Objects.equals(this.tenantRef, objTaskJournal.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TaskJournal {\n");
      sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objCloudRef: ").append(toIndentedString(objCloudRef)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    patchImageRef: ").append(toIndentedString(patchImageRef)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

