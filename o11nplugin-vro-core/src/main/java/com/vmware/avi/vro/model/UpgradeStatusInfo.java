package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.UpgradeOpsParam;
import com.vmware.avi.vro.model.UpgradeOpsParam;
import com.vmware.avi.vro.model.SeGroupStatus;
import com.vmware.avi.vro.model.UpgradeOpsState;
import com.vmware.avi.vro.model.UpgradeReadinessCheckObj;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The UpgradeStatusInfo is a POJO class extends AviRestResource that used for creating
 * UpgradeStatusInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UpgradeStatusInfo")
@VsoFinder(name = Constants.FINDER_VRO_UPGRADESTATUSINFO, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UpgradeStatusInfo extends AviRestResource {
    @JsonProperty("after_reboot_rollback_fnc")
    @JsonInclude(Include.NON_NULL)
    private String afterRebootRollbackFnc;

    @JsonProperty("after_reboot_task_name")
    @JsonInclude(Include.NON_NULL)
    private String afterRebootTaskName;

    @JsonProperty("clean")
    @JsonInclude(Include.NON_NULL)
    private Boolean clean;

    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration;

    @JsonProperty("enable_patch_rollback")
    @JsonInclude(Include.NON_NULL)
    private Boolean enablePatchRollback = false;

    @JsonProperty("enable_rollback")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableRollback = false;

    @JsonProperty("end_time")
    @JsonInclude(Include.NON_NULL)
    private String endTime;

    @JsonProperty("enqueue_time")
    @JsonInclude(Include.NON_NULL)
    private String enqueueTime;

    @JsonProperty("fips_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean fipsMode;

    @JsonProperty("history")
    @JsonInclude(Include.NON_NULL)
    private List<OpsHistory> history;

    @JsonProperty("image_path")
    @JsonInclude(Include.NON_NULL)
    private String imagePath;

    @JsonProperty("image_ref")
    @JsonInclude(Include.NON_NULL)
    private String imageRef;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("node_type")
    @JsonInclude(Include.NON_NULL)
    private String nodeType;

    @JsonProperty("obj_cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String objCloudRef;

    @JsonProperty("params")
    @JsonInclude(Include.NON_NULL)
    private UpgradeOpsParam params;

    @JsonProperty("patch_image_path")
    @JsonInclude(Include.NON_NULL)
    private String patchImagePath;

    @JsonProperty("patch_image_ref")
    @JsonInclude(Include.NON_NULL)
    private String patchImageRef;

    @JsonProperty("patch_list")
    @JsonInclude(Include.NON_NULL)
    private List<PatchData> patchList;

    @JsonProperty("patch_reboot")
    @JsonInclude(Include.NON_NULL)
    private Boolean patchReboot;

    @JsonProperty("patch_version")
    @JsonInclude(Include.NON_NULL)
    private String patchVersion;

    @JsonProperty("prev_image_path")
    @JsonInclude(Include.NON_NULL)
    private String prevImagePath;

    @JsonProperty("prev_patch_image_path")
    @JsonInclude(Include.NON_NULL)
    private String prevPatchImagePath;

    @JsonProperty("prev_remote_image_ref")
    @JsonInclude(Include.NON_NULL)
    private String prevRemoteImageRef;

    @JsonProperty("previous_image_ref")
    @JsonInclude(Include.NON_NULL)
    private String previousImageRef;

    @JsonProperty("previous_patch_image_ref")
    @JsonInclude(Include.NON_NULL)
    private String previousPatchImageRef;

    @JsonProperty("previous_patch_list")
    @JsonInclude(Include.NON_NULL)
    private List<PatchData> previousPatchList;

    @JsonProperty("previous_patch_version")
    @JsonInclude(Include.NON_NULL)
    private String previousPatchVersion;

    @JsonProperty("previous_version")
    @JsonInclude(Include.NON_NULL)
    private String previousVersion;

    @JsonProperty("progress")
    @JsonInclude(Include.NON_NULL)
    private Integer progress = 0;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;

    @JsonProperty("remote_image_ref")
    @JsonInclude(Include.NON_NULL)
    private String remoteImageRef;

    @JsonProperty("se_patch_image_path")
    @JsonInclude(Include.NON_NULL)
    private String sePatchImagePath;

    @JsonProperty("se_patch_image_ref")
    @JsonInclude(Include.NON_NULL)
    private String sePatchImageRef;

    @JsonProperty("se_upgrade_events")
    @JsonInclude(Include.NON_NULL)
    private List<SeUpgradeEvents> seUpgradeEvents;

    @JsonProperty("seg_params")
    @JsonInclude(Include.NON_NULL)
    private UpgradeOpsParam segParams;

    @JsonProperty("seg_status")
    @JsonInclude(Include.NON_NULL)
    private SeGroupStatus segStatus;

    @JsonProperty("start_time")
    @JsonInclude(Include.NON_NULL)
    private String startTime;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private UpgradeOpsState state;

    @JsonProperty("statediff_ref")
    @JsonInclude(Include.NON_NULL)
    private String statediffRef;

    @JsonProperty("system")
    @JsonInclude(Include.NON_NULL)
    private Boolean system;

    @JsonProperty("system_report_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> systemReportRefs;

    @JsonProperty("tasks_completed")
    @JsonInclude(Include.NON_NULL)
    private Integer tasksCompleted;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("total_tasks")
    @JsonInclude(Include.NON_NULL)
    private Integer totalTasks;

    @JsonProperty("upgrade_events")
    @JsonInclude(Include.NON_NULL)
    private List<EventMap> upgradeEvents;

    @JsonProperty("upgrade_ops")
    @JsonInclude(Include.NON_NULL)
    private String upgradeOps;

    @JsonProperty("upgrade_readiness")
    @JsonInclude(Include.NON_NULL)
    private UpgradeReadinessCheckObj upgradeReadiness;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version;



  /**
   * This is the getter method this will return the attribute value.
   * Backward compatible abort function name.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return afterRebootRollbackFnc
   */
  @VsoMethod
  public String getAfterRebootRollbackFnc() {
    return afterRebootRollbackFnc;
  }

  /**
   * This is the setter method to the attribute.
   * Backward compatible abort function name.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param afterRebootRollbackFnc set the afterRebootRollbackFnc.
   */
  @VsoMethod
  public void setAfterRebootRollbackFnc(String  afterRebootRollbackFnc) {
    this.afterRebootRollbackFnc = afterRebootRollbackFnc;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Backward compatible task dict name.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return afterRebootTaskName
   */
  @VsoMethod
  public String getAfterRebootTaskName() {
    return afterRebootTaskName;
  }

  /**
   * This is the setter method to the attribute.
   * Backward compatible task dict name.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param afterRebootTaskName set the afterRebootTaskName.
   */
  @VsoMethod
  public void setAfterRebootTaskName(String  afterRebootTaskName) {
    this.afterRebootTaskName = afterRebootTaskName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag for clean installation.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clean
   */
  @VsoMethod
  public Boolean getClean() {
    return clean;
  }

  /**
   * This is the setter method to the attribute.
   * Flag for clean installation.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clean set the clean.
   */
  @VsoMethod
  public void setClean(Boolean  clean) {
    this.clean = clean;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Duration of upgrade operation in seconds.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Duration of upgrade operation in seconds.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Check if the patch rollback is possible on this node.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enablePatchRollback
   */
  @VsoMethod
  public Boolean getEnablePatchRollback() {
    return enablePatchRollback;
  }

  /**
   * This is the setter method to the attribute.
   * Check if the patch rollback is possible on this node.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enablePatchRollback set the enablePatchRollback.
   */
  @VsoMethod
  public void setEnablePatchRollback(Boolean  enablePatchRollback) {
    this.enablePatchRollback = enablePatchRollback;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Check if the rollback is possible on this node.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableRollback
   */
  @VsoMethod
  public Boolean getEnableRollback() {
    return enableRollback;
  }

  /**
   * This is the setter method to the attribute.
   * Check if the rollback is possible on this node.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableRollback set the enableRollback.
   */
  @VsoMethod
  public void setEnableRollback(Boolean  enableRollback) {
    this.enableRollback = enableRollback;
  }

  /**
   * This is the getter method this will return the attribute value.
   * End time of upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * End time of upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enqueue time of upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enqueueTime
   */
  @VsoMethod
  public String getEnqueueTime() {
    return enqueueTime;
  }

  /**
   * This is the setter method to the attribute.
   * Enqueue time of upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enqueueTime set the enqueueTime.
   */
  @VsoMethod
  public void setEnqueueTime(String  enqueueTime) {
    this.enqueueTime = enqueueTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fips mode for the entire system.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fipsMode
   */
  @VsoMethod
  public Boolean getFipsMode() {
    return fipsMode;
  }

  /**
   * This is the setter method to the attribute.
   * Fips mode for the entire system.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fipsMode set the fipsMode.
   */
  @VsoMethod
  public void setFipsMode(Boolean  fipsMode) {
    this.fipsMode = fipsMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Record of past operations on this node.
   * Field introduced in 20.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return history
   */
  @VsoMethod
  public List<OpsHistory> getHistory() {
    return history;
  }

  /**
   * This is the setter method. this will set the history
   * Record of past operations on this node.
   * Field introduced in 20.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return history
   */
  @VsoMethod
  public void setHistory(List<OpsHistory>  history) {
    this.history = history;
  }

  /**
   * This is the setter method this will set the history
   * Record of past operations on this node.
   * Field introduced in 20.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return history
   */
  @VsoMethod
  public UpgradeStatusInfo addHistoryItem(OpsHistory historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<OpsHistory>();
    }
    this.history.add(historyItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Image path of current base image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return imagePath
   */
  @VsoMethod
  public String getImagePath() {
    return imagePath;
  }

  /**
   * This is the setter method to the attribute.
   * Image path of current base image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param imagePath set the imagePath.
   */
  @VsoMethod
  public void setImagePath(String  imagePath) {
    this.imagePath = imagePath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying the current base image.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param imageRef set the imageRef.
   */
  @VsoMethod
  public void setImageRef(String  imageRef) {
    this.imageRef = imageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the system such as cluster name, se group name and se name.
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
   * Name of the system such as cluster name, se group name and se name.
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
   * Type of the system such as controller_cluster, se_group or se.
   * Enum options - NODE_CONTROLLER_CLUSTER, NODE_SE_GROUP, NODE_SE_TYPE.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeType
   */
  @VsoMethod
  public String getNodeType() {
    return nodeType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the system such as controller_cluster, se_group or se.
   * Enum options - NODE_CONTROLLER_CLUSTER, NODE_SE_GROUP, NODE_SE_TYPE.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nodeType set the nodeType.
   */
  @VsoMethod
  public void setNodeType(String  nodeType) {
    this.nodeType = nodeType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud that this object belongs to.
   * It is a reference to an object of type cloud.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objCloudRef set the objCloudRef.
   */
  @VsoMethod
  public void setObjCloudRef(String  objCloudRef) {
    this.objCloudRef = objCloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Parameters associated with the upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return params
   */
  @VsoMethod
  public UpgradeOpsParam getParams() {
    return params;
  }

  /**
   * This is the setter method to the attribute.
   * Parameters associated with the upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param params set the params.
   */
  @VsoMethod
  public void setParams(UpgradeOpsParam params) {
    this.params = params;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image path of current patch image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchImagePath
   */
  @VsoMethod
  public String getPatchImagePath() {
    return patchImagePath;
  }

  /**
   * This is the setter method to the attribute.
   * Image path of current patch image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param patchImagePath set the patchImagePath.
   */
  @VsoMethod
  public void setPatchImagePath(String  patchImagePath) {
    this.patchImagePath = patchImagePath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying the current patch.example  base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1
   * value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchImageRef
   */
  @VsoMethod
  public String getPatchImageRef() {
    return patchImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying the current patch.example  base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1
   * value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param patchImageRef set the patchImageRef.
   */
  @VsoMethod
  public void setPatchImageRef(String  patchImageRef) {
    this.patchImageRef = patchImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of patches applied to this node.
   * Example  base-image is 18.2.6 and a patch 6p1 is applied, then a patch 6p5 applied.
   * This field will indicate the [{'6p1', '6p1_image_uuid'}, {'6p5', '6p5_image_uuid'}] value.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchList
   */
  @VsoMethod
  public List<PatchData> getPatchList() {
    return patchList;
  }

  /**
   * This is the setter method. this will set the patchList
   * List of patches applied to this node.
   * Example  base-image is 18.2.6 and a patch 6p1 is applied, then a patch 6p5 applied.
   * This field will indicate the [{'6p1', '6p1_image_uuid'}, {'6p5', '6p5_image_uuid'}] value.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchList
   */
  @VsoMethod
  public void setPatchList(List<PatchData>  patchList) {
    this.patchList = patchList;
  }

  /**
   * This is the setter method this will set the patchList
   * List of patches applied to this node.
   * Example  base-image is 18.2.6 and a patch 6p1 is applied, then a patch 6p5 applied.
   * This field will indicate the [{'6p1', '6p1_image_uuid'}, {'6p5', '6p5_image_uuid'}] value.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchList
   */
  @VsoMethod
  public UpgradeStatusInfo addPatchListItem(PatchData patchListItem) {
    if (this.patchList == null) {
      this.patchList = new ArrayList<PatchData>();
    }
    this.patchList.add(patchListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Flag for patch op with reboot.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchReboot
   */
  @VsoMethod
  public Boolean getPatchReboot() {
    return patchReboot;
  }

  /**
   * This is the setter method to the attribute.
   * Flag for patch op with reboot.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param patchReboot set the patchReboot.
   */
  @VsoMethod
  public void setPatchReboot(Boolean  patchReboot) {
    this.patchReboot = patchReboot;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current patch version applied to this node.
   * Example  base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1 value.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchVersion
   */
  @VsoMethod
  public String getPatchVersion() {
    return patchVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Current patch version applied to this node.
   * Example  base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1 value.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param patchVersion set the patchVersion.
   */
  @VsoMethod
  public void setPatchVersion(String  patchVersion) {
    this.patchVersion = patchVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image path of previous base image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prevImagePath
   */
  @VsoMethod
  public String getPrevImagePath() {
    return prevImagePath;
  }

  /**
   * This is the setter method to the attribute.
   * Image path of previous base image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prevImagePath set the prevImagePath.
   */
  @VsoMethod
  public void setPrevImagePath(String  prevImagePath) {
    this.prevImagePath = prevImagePath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image path of previous patch image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prevPatchImagePath
   */
  @VsoMethod
  public String getPrevPatchImagePath() {
    return prevPatchImagePath;
  }

  /**
   * This is the setter method to the attribute.
   * Image path of previous patch image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prevPatchImagePath set the prevPatchImagePath.
   */
  @VsoMethod
  public void setPrevPatchImagePath(String  prevPatchImagePath) {
    this.prevPatchImagePath = prevPatchImagePath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Remote image reference of previous base image.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prevRemoteImageRef
   */
  @VsoMethod
  public String getPrevRemoteImageRef() {
    return prevRemoteImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Remote image reference of previous base image.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prevRemoteImageRef set the prevRemoteImageRef.
   */
  @VsoMethod
  public void setPrevRemoteImageRef(String  prevRemoteImageRef) {
    this.prevRemoteImageRef = prevRemoteImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying previous base image.example  base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate
   * the 18.2.5 value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previousImageRef
   */
  @VsoMethod
  public String getPreviousImageRef() {
    return previousImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying previous base image.example  base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate
   * the 18.2.5 value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param previousImageRef set the previousImageRef.
   */
  @VsoMethod
  public void setPreviousImageRef(String  previousImageRef) {
    this.previousImageRef = previousImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying previous patch.example  base-image was 18.2.6 with a patch 6p1.
   * Upgrade was initiated to 18.2.8 with patch 8p1.
   * The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previousPatchImageRef
   */
  @VsoMethod
  public String getPreviousPatchImageRef() {
    return previousPatchImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying previous patch.example  base-image was 18.2.6 with a patch 6p1.
   * Upgrade was initiated to 18.2.8 with patch 8p1.
   * The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param previousPatchImageRef set the previousPatchImageRef.
   */
  @VsoMethod
  public void setPreviousPatchImageRef(String  previousPatchImageRef) {
    this.previousPatchImageRef = previousPatchImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of patches applied to this node on previous major version.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previousPatchList
   */
  @VsoMethod
  public List<PatchData> getPreviousPatchList() {
    return previousPatchList;
  }

  /**
   * This is the setter method. this will set the previousPatchList
   * List of patches applied to this node on previous major version.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previousPatchList
   */
  @VsoMethod
  public void setPreviousPatchList(List<PatchData>  previousPatchList) {
    this.previousPatchList = previousPatchList;
  }

  /**
   * This is the setter method this will set the previousPatchList
   * List of patches applied to this node on previous major version.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previousPatchList
   */
  @VsoMethod
  public UpgradeStatusInfo addPreviousPatchListItem(PatchData previousPatchListItem) {
    if (this.previousPatchList == null) {
      this.previousPatchList = new ArrayList<PatchData>();
    }
    this.previousPatchList.add(previousPatchListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Previous patch version applied to this node.example  base-image was 18.2.6 with a patch 6p1.
   * Upgrade was initiated to 18.2.8 with patch 8p1.
   * The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previousPatchVersion
   */
  @VsoMethod
  public String getPreviousPatchVersion() {
    return previousPatchVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Previous patch version applied to this node.example  base-image was 18.2.6 with a patch 6p1.
   * Upgrade was initiated to 18.2.8 with patch 8p1.
   * The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param previousPatchVersion set the previousPatchVersion.
   */
  @VsoMethod
  public void setPreviousPatchVersion(String  previousPatchVersion) {
    this.previousPatchVersion = previousPatchVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Previous version prior to upgrade.example  base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate the 18.2.5
   * value.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previousVersion
   */
  @VsoMethod
  public String getPreviousVersion() {
    return previousVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Previous version prior to upgrade.example  base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate the 18.2.5
   * value.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param previousVersion set the previousVersion.
   */
  @VsoMethod
  public void setPreviousVersion(String  previousVersion) {
    this.previousVersion = previousVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade operations progress which holds value between 0-100.
   * Allowed values are 0-100.
   * Field introduced in 18.2.8, 20.1.1.
   * Unit is percent.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return progress
   */
  @VsoMethod
  public Integer getProgress() {
    return progress;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade operations progress which holds value between 0-100.
   * Allowed values are 0-100.
   * Field introduced in 18.2.8, 20.1.1.
   * Unit is percent.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param progress set the progress.
   */
  @VsoMethod
  public void setProgress(Integer  progress) {
    this.progress = progress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Descriptive reason for the upgrade state.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Descriptive reason for the upgrade state.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Remote image reference of current base image.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteImageRef
   */
  @VsoMethod
  public String getRemoteImageRef() {
    return remoteImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Remote image reference of current base image.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param remoteImageRef set the remoteImageRef.
   */
  @VsoMethod
  public void setRemoteImageRef(String  remoteImageRef) {
    this.remoteImageRef = remoteImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image path of se patch image.(required in case of reimage and upgrade + patch).
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sePatchImagePath
   */
  @VsoMethod
  public String getSePatchImagePath() {
    return sePatchImagePath;
  }

  /**
   * This is the setter method to the attribute.
   * Image path of se patch image.(required in case of reimage and upgrade + patch).
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sePatchImagePath set the sePatchImagePath.
   */
  @VsoMethod
  public void setSePatchImagePath(String  sePatchImagePath) {
    this.sePatchImagePath = sePatchImagePath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying the current se patch required in case of system upgrade(re-image) with se patch.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sePatchImageRef
   */
  @VsoMethod
  public String getSePatchImageRef() {
    return sePatchImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying the current se patch required in case of system upgrade(re-image) with se patch.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sePatchImageRef set the sePatchImageRef.
   */
  @VsoMethod
  public void setSePatchImageRef(String  sePatchImageRef) {
    this.sePatchImageRef = sePatchImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceenginegroup upgrade errors.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUpgradeEvents
   */
  @VsoMethod
  public List<SeUpgradeEvents> getSeUpgradeEvents() {
    return seUpgradeEvents;
  }

  /**
   * This is the setter method. this will set the seUpgradeEvents
   * Serviceenginegroup upgrade errors.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUpgradeEvents
   */
  @VsoMethod
  public void setSeUpgradeEvents(List<SeUpgradeEvents>  seUpgradeEvents) {
    this.seUpgradeEvents = seUpgradeEvents;
  }

  /**
   * This is the setter method this will set the seUpgradeEvents
   * Serviceenginegroup upgrade errors.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUpgradeEvents
   */
  @VsoMethod
  public UpgradeStatusInfo addSeUpgradeEventsItem(SeUpgradeEvents seUpgradeEventsItem) {
    if (this.seUpgradeEvents == null) {
      this.seUpgradeEvents = new ArrayList<SeUpgradeEvents>();
    }
    this.seUpgradeEvents.add(seUpgradeEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Se_patch may be different from the controller_patch.
   * It has to be saved in the journal for subsequent consumption.
   * The segroup params will be saved in the controller entry as seg_params.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segParams
   */
  @VsoMethod
  public UpgradeOpsParam getSegParams() {
    return segParams;
  }

  /**
   * This is the setter method to the attribute.
   * Se_patch may be different from the controller_patch.
   * It has to be saved in the journal for subsequent consumption.
   * The segroup params will be saved in the controller entry as seg_params.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segParams set the segParams.
   */
  @VsoMethod
  public void setSegParams(UpgradeOpsParam segParams) {
    this.segParams = segParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Detailed segroup status.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segStatus
   */
  @VsoMethod
  public SeGroupStatus getSegStatus() {
    return segStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Detailed segroup status.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segStatus set the segStatus.
   */
  @VsoMethod
  public void setSegStatus(SeGroupStatus segStatus) {
    this.segStatus = segStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Start time of upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Start time of upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current status of the upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public UpgradeOpsState getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Current status of the upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(UpgradeOpsState state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Record of pre/post snapshot captured for current upgrade operation.
   * It is a reference to an object of type statediffoperation.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return statediffRef
   */
  @VsoMethod
  public String getStatediffRef() {
    return statediffRef;
  }

  /**
   * This is the setter method to the attribute.
   * Record of pre/post snapshot captured for current upgrade operation.
   * It is a reference to an object of type statediffoperation.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param statediffRef set the statediffRef.
   */
  @VsoMethod
  public void setStatediffRef(String  statediffRef) {
    this.statediffRef = statediffRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag is set only in the cluster if the upgrade is initiated as a system-upgrade.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return system
   */
  @VsoMethod
  public Boolean getSystem() {
    return system;
  }

  /**
   * This is the setter method to the attribute.
   * Flag is set only in the cluster if the upgrade is initiated as a system-upgrade.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param system set the system.
   */
  @VsoMethod
  public void setSystem(Boolean  system) {
    this.system = system;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tracks the list of reports created for node.
   * It is a reference to an object of type systemreport.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return systemReportRefs
   */
  @VsoMethod
  public List<String> getSystemReportRefs() {
    return systemReportRefs;
  }

  /**
   * This is the setter method. this will set the systemReportRefs
   * Tracks the list of reports created for node.
   * It is a reference to an object of type systemreport.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return systemReportRefs
   */
  @VsoMethod
  public void setSystemReportRefs(List<String>  systemReportRefs) {
    this.systemReportRefs = systemReportRefs;
  }

  /**
   * This is the setter method this will set the systemReportRefs
   * Tracks the list of reports created for node.
   * It is a reference to an object of type systemreport.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return systemReportRefs
   */
  @VsoMethod
  public UpgradeStatusInfo addSystemReportRefsItem(String systemReportRefsItem) {
    if (this.systemReportRefs == null) {
      this.systemReportRefs = new ArrayList<String>();
    }
    this.systemReportRefs.add(systemReportRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Completed set of tasks in the upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tasksCompleted
   */
  @VsoMethod
  public Integer getTasksCompleted() {
    return tasksCompleted;
  }

  /**
   * This is the setter method to the attribute.
   * Completed set of tasks in the upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Total number of tasks in the upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalTasks
   */
  @VsoMethod
  public Integer getTotalTasks() {
    return totalTasks;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of tasks in the upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalTasks set the totalTasks.
   */
  @VsoMethod
  public void setTotalTasks(Integer  totalTasks) {
    this.totalTasks = totalTasks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Events performed for upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeEvents
   */
  @VsoMethod
  public List<EventMap> getUpgradeEvents() {
    return upgradeEvents;
  }

  /**
   * This is the setter method. this will set the upgradeEvents
   * Events performed for upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeEvents
   */
  @VsoMethod
  public void setUpgradeEvents(List<EventMap>  upgradeEvents) {
    this.upgradeEvents = upgradeEvents;
  }

  /**
   * This is the setter method this will set the upgradeEvents
   * Events performed for upgrade operation.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeEvents
   */
  @VsoMethod
  public UpgradeStatusInfo addUpgradeEventsItem(EventMap upgradeEventsItem) {
    if (this.upgradeEvents == null) {
      this.upgradeEvents = new ArrayList<EventMap>();
    }
    this.upgradeEvents.add(upgradeEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Upgrade operations requested.
   * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME, EVAL_UPGRADE, EVAL_PATCH, EVAL_ROLLBACK, EVAL_ROLLBACKPATCH,
   * EVAL_SEGROUP_RESUME, EVAL_RESTORE, RESTORE.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeOps
   */
  @VsoMethod
  public String getUpgradeOps() {
    return upgradeOps;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade operations requested.
   * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME, EVAL_UPGRADE, EVAL_PATCH, EVAL_ROLLBACK, EVAL_ROLLBACKPATCH,
   * EVAL_SEGROUP_RESUME, EVAL_RESTORE, RESTORE.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param upgradeOps set the upgradeOps.
   */
  @VsoMethod
  public void setUpgradeOps(String  upgradeOps) {
    this.upgradeOps = upgradeOps;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade readiness check execution detail.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeReadiness
   */
  @VsoMethod
  public UpgradeReadinessCheckObj getUpgradeReadiness() {
    return upgradeReadiness;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade readiness check execution detail.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param upgradeReadiness set the upgradeReadiness.
   */
  @VsoMethod
  public void setUpgradeReadiness(UpgradeReadinessCheckObj upgradeReadiness) {
    this.upgradeReadiness = upgradeReadiness;
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
   * Uuid identifier for the system such as cluster, se group and se.
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
   * Uuid identifier for the system such as cluster, se group and se.
   * Field introduced in 18.2.6.
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
   * Current base image applied to this node.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Current base image applied to this node.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
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
  UpgradeStatusInfo objUpgradeStatusInfo = (UpgradeStatusInfo) o;
  return   Objects.equals(this.uuid, objUpgradeStatusInfo.uuid)&&
  Objects.equals(this.name, objUpgradeStatusInfo.name)&&
  Objects.equals(this.nodeType, objUpgradeStatusInfo.nodeType)&&
  Objects.equals(this.upgradeOps, objUpgradeStatusInfo.upgradeOps)&&
  Objects.equals(this.version, objUpgradeStatusInfo.version)&&
  Objects.equals(this.imageRef, objUpgradeStatusInfo.imageRef)&&
  Objects.equals(this.patchVersion, objUpgradeStatusInfo.patchVersion)&&
  Objects.equals(this.patchImageRef, objUpgradeStatusInfo.patchImageRef)&&
  Objects.equals(this.previousVersion, objUpgradeStatusInfo.previousVersion)&&
  Objects.equals(this.previousImageRef, objUpgradeStatusInfo.previousImageRef)&&
  Objects.equals(this.previousPatchVersion, objUpgradeStatusInfo.previousPatchVersion)&&
  Objects.equals(this.previousPatchImageRef, objUpgradeStatusInfo.previousPatchImageRef)&&
  Objects.equals(this.state, objUpgradeStatusInfo.state)&&
  Objects.equals(this.params, objUpgradeStatusInfo.params)&&
  Objects.equals(this.upgradeEvents, objUpgradeStatusInfo.upgradeEvents)&&
  Objects.equals(this.segStatus, objUpgradeStatusInfo.segStatus)&&
  Objects.equals(this.startTime, objUpgradeStatusInfo.startTime)&&
  Objects.equals(this.endTime, objUpgradeStatusInfo.endTime)&&
  Objects.equals(this.duration, objUpgradeStatusInfo.duration)&&
  Objects.equals(this.enqueueTime, objUpgradeStatusInfo.enqueueTime)&&
  Objects.equals(this.enableRollback, objUpgradeStatusInfo.enableRollback)&&
  Objects.equals(this.enablePatchRollback, objUpgradeStatusInfo.enablePatchRollback)&&
  Objects.equals(this.totalTasks, objUpgradeStatusInfo.totalTasks)&&
  Objects.equals(this.tasksCompleted, objUpgradeStatusInfo.tasksCompleted)&&
  Objects.equals(this.system, objUpgradeStatusInfo.system)&&
  Objects.equals(this.progress, objUpgradeStatusInfo.progress)&&
  Objects.equals(this.patchList, objUpgradeStatusInfo.patchList)&&
  Objects.equals(this.previousPatchList, objUpgradeStatusInfo.previousPatchList)&&
  Objects.equals(this.clean, objUpgradeStatusInfo.clean)&&
  Objects.equals(this.sePatchImageRef, objUpgradeStatusInfo.sePatchImageRef)&&
  Objects.equals(this.imagePath, objUpgradeStatusInfo.imagePath)&&
  Objects.equals(this.patchImagePath, objUpgradeStatusInfo.patchImagePath)&&
  Objects.equals(this.sePatchImagePath, objUpgradeStatusInfo.sePatchImagePath)&&
  Objects.equals(this.prevImagePath, objUpgradeStatusInfo.prevImagePath)&&
  Objects.equals(this.prevPatchImagePath, objUpgradeStatusInfo.prevPatchImagePath)&&
  Objects.equals(this.segParams, objUpgradeStatusInfo.segParams)&&
  Objects.equals(this.patchReboot, objUpgradeStatusInfo.patchReboot)&&
  Objects.equals(this.afterRebootTaskName, objUpgradeStatusInfo.afterRebootTaskName)&&
  Objects.equals(this.afterRebootRollbackFnc, objUpgradeStatusInfo.afterRebootRollbackFnc)&&
  Objects.equals(this.upgradeReadiness, objUpgradeStatusInfo.upgradeReadiness)&&
  Objects.equals(this.systemReportRefs, objUpgradeStatusInfo.systemReportRefs)&&
  Objects.equals(this.remoteImageRef, objUpgradeStatusInfo.remoteImageRef)&&
  Objects.equals(this.prevRemoteImageRef, objUpgradeStatusInfo.prevRemoteImageRef)&&
  Objects.equals(this.tenantRef, objUpgradeStatusInfo.tenantRef)&&
  Objects.equals(this.objCloudRef, objUpgradeStatusInfo.objCloudRef)&&
  Objects.equals(this.seUpgradeEvents, objUpgradeStatusInfo.seUpgradeEvents)&&
  Objects.equals(this.history, objUpgradeStatusInfo.history)&&
  Objects.equals(this.fipsMode, objUpgradeStatusInfo.fipsMode)&&
  Objects.equals(this.statediffRef, objUpgradeStatusInfo.statediffRef)&&
  Objects.equals(this.reason, objUpgradeStatusInfo.reason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UpgradeStatusInfo {\n");
      sb.append("    afterRebootRollbackFnc: ").append(toIndentedString(afterRebootRollbackFnc)).append("\n");
        sb.append("    afterRebootTaskName: ").append(toIndentedString(afterRebootTaskName)).append("\n");
        sb.append("    clean: ").append(toIndentedString(clean)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    enablePatchRollback: ").append(toIndentedString(enablePatchRollback)).append("\n");
        sb.append("    enableRollback: ").append(toIndentedString(enableRollback)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    enqueueTime: ").append(toIndentedString(enqueueTime)).append("\n");
        sb.append("    fipsMode: ").append(toIndentedString(fipsMode)).append("\n");
        sb.append("    history: ").append(toIndentedString(history)).append("\n");
        sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    objCloudRef: ").append(toIndentedString(objCloudRef)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    patchImagePath: ").append(toIndentedString(patchImagePath)).append("\n");
        sb.append("    patchImageRef: ").append(toIndentedString(patchImageRef)).append("\n");
        sb.append("    patchList: ").append(toIndentedString(patchList)).append("\n");
        sb.append("    patchReboot: ").append(toIndentedString(patchReboot)).append("\n");
        sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
        sb.append("    prevImagePath: ").append(toIndentedString(prevImagePath)).append("\n");
        sb.append("    prevPatchImagePath: ").append(toIndentedString(prevPatchImagePath)).append("\n");
        sb.append("    prevRemoteImageRef: ").append(toIndentedString(prevRemoteImageRef)).append("\n");
        sb.append("    previousImageRef: ").append(toIndentedString(previousImageRef)).append("\n");
        sb.append("    previousPatchImageRef: ").append(toIndentedString(previousPatchImageRef)).append("\n");
        sb.append("    previousPatchList: ").append(toIndentedString(previousPatchList)).append("\n");
        sb.append("    previousPatchVersion: ").append(toIndentedString(previousPatchVersion)).append("\n");
        sb.append("    previousVersion: ").append(toIndentedString(previousVersion)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    remoteImageRef: ").append(toIndentedString(remoteImageRef)).append("\n");
        sb.append("    sePatchImagePath: ").append(toIndentedString(sePatchImagePath)).append("\n");
        sb.append("    sePatchImageRef: ").append(toIndentedString(sePatchImageRef)).append("\n");
        sb.append("    seUpgradeEvents: ").append(toIndentedString(seUpgradeEvents)).append("\n");
        sb.append("    segParams: ").append(toIndentedString(segParams)).append("\n");
        sb.append("    segStatus: ").append(toIndentedString(segStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    statediffRef: ").append(toIndentedString(statediffRef)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    systemReportRefs: ").append(toIndentedString(systemReportRefs)).append("\n");
        sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
        sb.append("    upgradeEvents: ").append(toIndentedString(upgradeEvents)).append("\n");
        sb.append("    upgradeOps: ").append(toIndentedString(upgradeOps)).append("\n");
        sb.append("    upgradeReadiness: ").append(toIndentedString(upgradeReadiness)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

