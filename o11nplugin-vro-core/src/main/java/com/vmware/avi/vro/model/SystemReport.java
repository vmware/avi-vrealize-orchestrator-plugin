package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DryrunInfo;
import com.vmware.avi.vro.model.ReportOpsState;
import com.vmware.avi.vro.model.ReportSummary;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SystemReport is a POJO class extends AviRestResource that used for creating
 * SystemReport.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SystemReport")
@VsoFinder(name = Constants.FINDER_VRO_SYSTEMREPORT, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SystemReport extends AviRestResource {
    @JsonProperty("archive_ref")
    @JsonInclude(Include.NON_NULL)
    private String archiveRef;

    @JsonProperty("controller_patch_image_ref")
    @JsonInclude(Include.NON_NULL)
    private String controllerPatchImageRef;

    @JsonProperty("downloadable")
    @JsonInclude(Include.NON_NULL)
    private Boolean downloadable = false;

    @JsonProperty("dryrun_info")
    @JsonInclude(Include.NON_NULL)
    private DryrunInfo dryrunInfo;

    @JsonProperty("events")
    @JsonInclude(Include.NON_NULL)
    private List<ReportEvent> events;

    @JsonProperty("image_ref")
    @JsonInclude(Include.NON_NULL)
    private String imageRef;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("readiness_reports")
    @JsonInclude(Include.NON_NULL)
    private List<ReportDetail> readinessReports;

    @JsonProperty("se_patch_image_ref")
    @JsonInclude(Include.NON_NULL)
    private String sePatchImageRef;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private ReportOpsState state;

    @JsonProperty("summary")
    @JsonInclude(Include.NON_NULL)
    private ReportSummary summary;

    @JsonProperty("tasks")
    @JsonInclude(Include.NON_NULL)
    private List<ReportTask> tasks;

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
   * Relative path to the report archive file on filesystem.the archive includes exported system configuration and current object as json.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return archiveRef
   */
  @VsoMethod
  public String getArchiveRef() {
    return archiveRef;
  }

  /**
   * This is the setter method to the attribute.
   * Relative path to the report archive file on filesystem.the archive includes exported system configuration and current object as json.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param archiveRef set the archiveRef.
   */
  @VsoMethod
  public void setArchiveRef(String  archiveRef) {
    this.archiveRef = archiveRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Controller patch image associated with the report.
   * It is a reference to an object of type image.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerPatchImageRef
   */
  @VsoMethod
  public String getControllerPatchImageRef() {
    return controllerPatchImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Controller patch image associated with the report.
   * It is a reference to an object of type image.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerPatchImageRef set the controllerPatchImageRef.
   */
  @VsoMethod
  public void setControllerPatchImageRef(String  controllerPatchImageRef) {
    this.controllerPatchImageRef = controllerPatchImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Indicates whether this report is downloadable as an archive.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return downloadable
   */
  @VsoMethod
  public Boolean getDownloadable() {
    return downloadable;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates whether this report is downloadable as an archive.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param downloadable set the downloadable.
   */
  @VsoMethod
  public void setDownloadable(Boolean  downloadable) {
    this.downloadable = downloadable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dry-run report.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dryrunInfo
   */
  @VsoMethod
  public DryrunInfo getDryrunInfo() {
    return dryrunInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Dry-run report.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dryrunInfo set the dryrunInfo.
   */
  @VsoMethod
  public void setDryrunInfo(DryrunInfo dryrunInfo) {
    this.dryrunInfo = dryrunInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of events associated with the report.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public List<ReportEvent> getEvents() {
    return events;
  }

  /**
   * This is the setter method. this will set the events
   * List of events associated with the report.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public void setEvents(List<ReportEvent>  events) {
    this.events = events;
  }

  /**
   * This is the setter method this will set the events
   * List of events associated with the report.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public SystemReport addEventsItem(ReportEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<ReportEvent>();
    }
    this.events.add(eventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * System image associated with the report.
   * It is a reference to an object of type image.
   * Field introduced in 22.1.6, 30.2.1.
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
   * System image associated with the report.
   * It is a reference to an object of type image.
   * Field introduced in 22.1.6, 30.2.1.
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
   * Name of the report derived from operation in a readable format.
   * Ex  upgrade_system_1a5c.
   * Field introduced in 22.1.6, 30.2.1.
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
   * Name of the report derived from operation in a readable format.
   * Ex  upgrade_system_1a5c.
   * Field introduced in 22.1.6, 30.2.1.
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
   * Readiness state of the system.
   * Ex  upgrade pre-check results.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return readinessReports
   */
  @VsoMethod
  public List<ReportDetail> getReadinessReports() {
    return readinessReports;
  }

  /**
   * This is the setter method. this will set the readinessReports
   * Readiness state of the system.
   * Ex  upgrade pre-check results.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return readinessReports
   */
  @VsoMethod
  public void setReadinessReports(List<ReportDetail>  readinessReports) {
    this.readinessReports = readinessReports;
  }

  /**
   * This is the setter method this will set the readinessReports
   * Readiness state of the system.
   * Ex  upgrade pre-check results.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return readinessReports
   */
  @VsoMethod
  public SystemReport addReadinessReportsItem(ReportDetail readinessReportsItem) {
    if (this.readinessReports == null) {
      this.readinessReports = new ArrayList<ReportDetail>();
    }
    this.readinessReports.add(readinessReportsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Se patch image associated with the report.
   * It is a reference to an object of type image.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sePatchImageRef
   */
  @VsoMethod
  public String getSePatchImageRef() {
    return sePatchImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Se patch image associated with the report.
   * It is a reference to an object of type image.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sePatchImageRef set the sePatchImageRef.
   */
  @VsoMethod
  public void setSePatchImageRef(String  sePatchImageRef) {
    this.sePatchImageRef = sePatchImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Report state combines all applicable states.
   * Ex  readiness_reports.system_readiness.state.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public ReportOpsState getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Report state combines all applicable states.
   * Ex  readiness_reports.system_readiness.state.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(ReportOpsState state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Summary of the report.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return summary
   */
  @VsoMethod
  public ReportSummary getSummary() {
    return summary;
  }

  /**
   * This is the setter method to the attribute.
   * Summary of the report.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param summary set the summary.
   */
  @VsoMethod
  public void setSummary(ReportSummary summary) {
    this.summary = summary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of tasks associated with the report.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasks
   */
  @VsoMethod
  public List<ReportTask> getTasks() {
    return tasks;
  }

  /**
   * This is the setter method. this will set the tasks
   * List of tasks associated with the report.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasks
   */
  @VsoMethod
  public void setTasks(List<ReportTask>  tasks) {
    this.tasks = tasks;
  }

  /**
   * This is the setter method this will set the tasks
   * List of tasks associated with the report.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasks
   */
  @VsoMethod
  public SystemReport addTasksItem(ReportTask tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<ReportTask>();
    }
    this.tasks.add(tasksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid associated with the object.
   * It is a reference to an object of type tenant.
   * Field introduced in 22.1.6, 30.2.1.
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
   * Field introduced in 22.1.6, 30.2.1.
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
   * Uuid identifier for the report.
   * Field introduced in 22.1.6, 30.2.1.
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
   * Uuid identifier for the report.
   * Field introduced in 22.1.6, 30.2.1.
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
  SystemReport objSystemReport = (SystemReport) o;
  return   Objects.equals(this.uuid, objSystemReport.uuid)&&
  Objects.equals(this.name, objSystemReport.name)&&
  Objects.equals(this.tenantRef, objSystemReport.tenantRef)&&
  Objects.equals(this.imageRef, objSystemReport.imageRef)&&
  Objects.equals(this.controllerPatchImageRef, objSystemReport.controllerPatchImageRef)&&
  Objects.equals(this.sePatchImageRef, objSystemReport.sePatchImageRef)&&
  Objects.equals(this.state, objSystemReport.state)&&
  Objects.equals(this.downloadable, objSystemReport.downloadable)&&
  Objects.equals(this.archiveRef, objSystemReport.archiveRef)&&
  Objects.equals(this.summary, objSystemReport.summary)&&
  Objects.equals(this.readinessReports, objSystemReport.readinessReports)&&
  Objects.equals(this.events, objSystemReport.events)&&
  Objects.equals(this.tasks, objSystemReport.tasks)&&
  Objects.equals(this.dryrunInfo, objSystemReport.dryrunInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SystemReport {\n");
      sb.append("    archiveRef: ").append(toIndentedString(archiveRef)).append("\n");
        sb.append("    controllerPatchImageRef: ").append(toIndentedString(controllerPatchImageRef)).append("\n");
        sb.append("    downloadable: ").append(toIndentedString(downloadable)).append("\n");
        sb.append("    dryrunInfo: ").append(toIndentedString(dryrunInfo)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    readinessReports: ").append(toIndentedString(readinessReports)).append("\n");
        sb.append("    sePatchImageRef: ").append(toIndentedString(sePatchImageRef)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

