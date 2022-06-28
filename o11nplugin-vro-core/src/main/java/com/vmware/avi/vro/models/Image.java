package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.PackageDetails;
import com.vmware.avi.vro.model.ImageUploadOpsStatus;
import com.vmware.avi.vro.model.SupportedMigrations;
import com.vmware.avi.vro.model.PackageDetails;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The Image is a POJO class extends AviRestResource that used for creating
 * Image.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Image")
@VsoFinder(name = Constants.FINDER_VRO_IMAGE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Image extends AviRestResource {
    @JsonProperty("cloud_info_values")
    @JsonInclude(Include.NON_NULL)
    private List<ImageCloudData> cloudInfoValues = null;

    @JsonProperty("controller_info")
    @JsonInclude(Include.NON_NULL)
    private PackageDetails controllerInfo = null;

    @JsonProperty("controller_patch_name")
    @JsonInclude(Include.NON_NULL)
    private String controllerPatchName = null;

    @JsonProperty("controller_patch_ref")
    @JsonInclude(Include.NON_NULL)
    private String controllerPatchRef = null;

    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration = null;

    @JsonProperty("end_time")
    @JsonInclude(Include.NON_NULL)
    private String endTime = null;

    @JsonProperty("events")
    @JsonInclude(Include.NON_NULL)
    private List<ImageEventMap> events = null;

    @JsonProperty("img_state")
    @JsonInclude(Include.NON_NULL)
    private ImageUploadOpsStatus imgState = null;

    @JsonProperty("migrations")
    @JsonInclude(Include.NON_NULL)
    private SupportedMigrations migrations = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("progress")
    @JsonInclude(Include.NON_NULL)
    private Integer progress = 0;

    @JsonProperty("se_info")
    @JsonInclude(Include.NON_NULL)
    private PackageDetails seInfo = null;

    @JsonProperty("se_patch_name")
    @JsonInclude(Include.NON_NULL)
    private String sePatchName = null;

    @JsonProperty("se_patch_ref")
    @JsonInclude(Include.NON_NULL)
    private String sePatchRef = null;

    @JsonProperty("start_time")
    @JsonInclude(Include.NON_NULL)
    private String startTime = null;

    @JsonProperty("tasks_completed")
    @JsonInclude(Include.NON_NULL)
    private Integer tasksCompleted = 0;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("total_tasks")
    @JsonInclude(Include.NON_NULL)
    private Integer totalTasks = 0;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;

    @JsonProperty("uber_bundle")
    @JsonInclude(Include.NON_NULL)
    private Boolean uberBundle = false;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * This field describes the cloud info specific to the base image.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudInfoValues
   */
  @VsoMethod
  public List<ImageCloudData> getCloudInfoValues() {
    return cloudInfoValues;
  }

  /**
   * This is the setter method. this will set the cloudInfoValues
   * This field describes the cloud info specific to the base image.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudInfoValues
   */
  @VsoMethod
  public void setCloudInfoValues(List<ImageCloudData>  cloudInfoValues) {
    this.cloudInfoValues = cloudInfoValues;
  }

  /**
   * This is the setter method this will set the cloudInfoValues
   * This field describes the cloud info specific to the base image.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudInfoValues
   */
  @VsoMethod
  public Image addCloudInfoValuesItem(ImageCloudData cloudInfoValuesItem) {
    if (this.cloudInfoValues == null) {
      this.cloudInfoValues = new ArrayList<ImageCloudData>();
    }
    this.cloudInfoValues.add(cloudInfoValuesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Controller package details.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerInfo
   */
  @VsoMethod
  public PackageDetails getControllerInfo() {
    return controllerInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Controller package details.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerInfo set the controllerInfo.
   */
  @VsoMethod
  public void setControllerInfo(PackageDetails controllerInfo) {
    this.controllerInfo = controllerInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mandatory controller patch name that is applied along with this base image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerPatchName
   */
  @VsoMethod
  public String getControllerPatchName() {
    return controllerPatchName;
  }

  /**
   * This is the setter method to the attribute.
   * Mandatory controller patch name that is applied along with this base image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerPatchName set the controllerPatchName.
   */
  @VsoMethod
  public void setControllerPatchName(String  controllerPatchName) {
    this.controllerPatchName = controllerPatchName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It references the controller-patch associated with the uber image.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerPatchRef
   */
  @VsoMethod
  public String getControllerPatchRef() {
    return controllerPatchRef;
  }

  /**
   * This is the setter method to the attribute.
   * It references the controller-patch associated with the uber image.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerPatchRef set the controllerPatchRef.
   */
  @VsoMethod
  public void setControllerPatchRef(String  controllerPatchRef) {
    this.controllerPatchRef = controllerPatchRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time taken to upload the image in seconds.
   * Field introduced in 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Time taken to upload the image in seconds.
   * Field introduced in 21.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image upload end time.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * Image upload end time.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image events for image upload operation.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public List<ImageEventMap> getEvents() {
    return events;
  }

  /**
   * This is the setter method. this will set the events
   * Image events for image upload operation.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public void setEvents(List<ImageEventMap>  events) {
    this.events = events;
  }

  /**
   * This is the setter method this will set the events
   * Image events for image upload operation.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public Image addEventsItem(ImageEventMap eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<ImageEventMap>();
    }
    this.events.add(eventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Status of the image.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return imgState
   */
  @VsoMethod
  public ImageUploadOpsStatus getImgState() {
    return imgState;
  }

  /**
   * This is the setter method to the attribute.
   * Status of the image.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param imgState set the imgState.
   */
  @VsoMethod
  public void setImgState(ImageUploadOpsStatus imgState) {
    this.imgState = imgState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field describes the api migration related information.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return migrations
   */
  @VsoMethod
  public SupportedMigrations getMigrations() {
    return migrations;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the api migration related information.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param migrations set the migrations.
   */
  @VsoMethod
  public void setMigrations(SupportedMigrations migrations) {
    this.migrations = migrations;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the image.
   * Field introduced in 18.2.6.
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
   * Name of the image.
   * Field introduced in 18.2.6.
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
   * Image upload progress which holds value between 0-100.
   * Allowed values are 0-100.
   * Field introduced in 21.1.3.
   * Unit is percent.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return progress
   */
  @VsoMethod
  public Integer getProgress() {
    return progress;
  }

  /**
   * This is the setter method to the attribute.
   * Image upload progress which holds value between 0-100.
   * Allowed values are 0-100.
   * Field introduced in 21.1.3.
   * Unit is percent.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param progress set the progress.
   */
  @VsoMethod
  public void setProgress(Integer  progress) {
    this.progress = progress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Se package details.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seInfo
   */
  @VsoMethod
  public PackageDetails getSeInfo() {
    return seInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Se package details.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seInfo set the seInfo.
   */
  @VsoMethod
  public void setSeInfo(PackageDetails seInfo) {
    this.seInfo = seInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mandatory serviceengine patch name that is applied along with this base image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sePatchName
   */
  @VsoMethod
  public String getSePatchName() {
    return sePatchName;
  }

  /**
   * This is the setter method to the attribute.
   * Mandatory serviceengine patch name that is applied along with this base image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sePatchName set the sePatchName.
   */
  @VsoMethod
  public void setSePatchName(String  sePatchName) {
    this.sePatchName = sePatchName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It references the service engine patch associated with the uber image.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sePatchRef
   */
  @VsoMethod
  public String getSePatchRef() {
    return sePatchRef;
  }

  /**
   * This is the setter method to the attribute.
   * It references the service engine patch associated with the uber image.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sePatchRef set the sePatchRef.
   */
  @VsoMethod
  public void setSePatchRef(String  sePatchRef) {
    this.sePatchRef = sePatchRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image upload start time.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Image upload start time.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Completed set of tasks for image upload.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return tasksCompleted
   */
  @VsoMethod
  public Integer getTasksCompleted() {
    return tasksCompleted;
  }

  /**
   * This is the setter method to the attribute.
   * Completed set of tasks for image upload.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param tasksCompleted set the tasksCompleted.
   */
  @VsoMethod
  public void setTasksCompleted(Integer  tasksCompleted) {
    this.tasksCompleted = tasksCompleted;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.6.
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
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.6.
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
   * Total number of tasks for image upload.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return totalTasks
   */
  @VsoMethod
  public Integer getTotalTasks() {
    return totalTasks;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of tasks for image upload.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param totalTasks set the totalTasks.
   */
  @VsoMethod
  public void setTotalTasks(Integer  totalTasks) {
    this.totalTasks = totalTasks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of the image patch/system.
   * Enum options - IMAGE_TYPE_PATCH, IMAGE_TYPE_SYSTEM, IMAGE_TYPE_MUST_CHECK.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the image patch/system.
   * Enum options - IMAGE_TYPE_PATCH, IMAGE_TYPE_SYSTEM, IMAGE_TYPE_MUST_CHECK.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status to check if the image is an uber bundle.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return uberBundle
   */
  @VsoMethod
  public Boolean getUberBundle() {
    return uberBundle;
  }

  /**
   * This is the setter method to the attribute.
   * Status to check if the image is an uber bundle.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param uberBundle set the uberBundle.
   */
  @VsoMethod
  public void setUberBundle(Boolean  uberBundle) {
    this.uberBundle = uberBundle;
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
   * Uuid of the image.
   * Field introduced in 18.2.6.
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
   * Uuid of the image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
  Image objImage = (Image) o;
  return   Objects.equals(this.uuid, objImage.uuid)&&
  Objects.equals(this.name, objImage.name)&&
  Objects.equals(this.controllerInfo, objImage.controllerInfo)&&
  Objects.equals(this.seInfo, objImage.seInfo)&&
  Objects.equals(this.migrations, objImage.migrations)&&
  Objects.equals(this.type, objImage.type)&&
  Objects.equals(this.uberBundle, objImage.uberBundle)&&
  Objects.equals(this.controllerPatchRef, objImage.controllerPatchRef)&&
  Objects.equals(this.sePatchRef, objImage.sePatchRef)&&
  Objects.equals(this.cloudInfoValues, objImage.cloudInfoValues)&&
  Objects.equals(this.controllerPatchName, objImage.controllerPatchName)&&
  Objects.equals(this.sePatchName, objImage.sePatchName)&&
  Objects.equals(this.imgState, objImage.imgState)&&
  Objects.equals(this.events, objImage.events)&&
  Objects.equals(this.tasksCompleted, objImage.tasksCompleted)&&
  Objects.equals(this.totalTasks, objImage.totalTasks)&&
  Objects.equals(this.progress, objImage.progress)&&
  Objects.equals(this.startTime, objImage.startTime)&&
  Objects.equals(this.endTime, objImage.endTime)&&
  Objects.equals(this.duration, objImage.duration)&&
  Objects.equals(this.tenantRef, objImage.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Image {\n");
      sb.append("    cloudInfoValues: ").append(toIndentedString(cloudInfoValues)).append("\n");
        sb.append("    controllerInfo: ").append(toIndentedString(controllerInfo)).append("\n");
        sb.append("    controllerPatchName: ").append(toIndentedString(controllerPatchName)).append("\n");
        sb.append("    controllerPatchRef: ").append(toIndentedString(controllerPatchRef)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    imgState: ").append(toIndentedString(imgState)).append("\n");
        sb.append("    migrations: ").append(toIndentedString(migrations)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    seInfo: ").append(toIndentedString(seInfo)).append("\n");
        sb.append("    sePatchName: ").append(toIndentedString(sePatchName)).append("\n");
        sb.append("    sePatchRef: ").append(toIndentedString(sePatchRef)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uberBundle: ").append(toIndentedString(uberBundle)).append("\n");
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

