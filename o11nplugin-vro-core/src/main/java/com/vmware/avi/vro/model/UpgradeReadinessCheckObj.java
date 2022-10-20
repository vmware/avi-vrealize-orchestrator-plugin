package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The UpgradeReadinessCheckObj is a POJO class extends AviRestResource that used for creating
 * UpgradeReadinessCheckObj.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UpgradeReadinessCheckObj")
@VsoFinder(name = Constants.FINDER_VRO_UPGRADEREADINESSCHECKOBJ)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UpgradeReadinessCheckObj extends AviRestResource {
    @JsonProperty("checks")
    @JsonInclude(Include.NON_NULL)
    private List<MustChecksInfo> checks = null;

    @JsonProperty("checks_completed")
    @JsonInclude(Include.NON_NULL)
    private Integer checksCompleted = null;

    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration = null;

    @JsonProperty("end_time")
    @JsonInclude(Include.NON_NULL)
    private String endTime = null;

    @JsonProperty("image_ref")
    @JsonInclude(Include.NON_NULL)
    private String imageRef = null;

    @JsonProperty("patch_image_ref")
    @JsonInclude(Include.NON_NULL)
    private String patchImageRef = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("start_time")
    @JsonInclude(Include.NON_NULL)
    private String startTime = null;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private String state = null;

    @JsonProperty("total_checks")
    @JsonInclude(Include.NON_NULL)
    private Integer totalChecks = null;

    @JsonProperty("upgrade_ops")
    @JsonInclude(Include.NON_NULL)
    private String upgradeOps = null;



  /**
   * This is the getter method this will return the attribute value.
   * List of upgrade readiness check exceptions.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return checks
   */
  @VsoMethod
  public List<MustChecksInfo> getChecks() {
    return checks;
  }

  /**
   * This is the setter method. this will set the checks
   * List of upgrade readiness check exceptions.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return checks
   */
  @VsoMethod
  public void setChecks(List<MustChecksInfo>  checks) {
    this.checks = checks;
  }

  /**
   * This is the setter method this will set the checks
   * List of upgrade readiness check exceptions.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return checks
   */
  @VsoMethod
  public UpgradeReadinessCheckObj addChecksItem(MustChecksInfo checksItem) {
    if (this.checks == null) {
      this.checks = new ArrayList<MustChecksInfo>();
    }
    this.checks.add(checksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * No.
   * Of checks completed.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return checksCompleted
   */
  @VsoMethod
  public Integer getChecksCompleted() {
    return checksCompleted;
  }

  /**
   * This is the setter method to the attribute.
   * No.
   * Of checks completed.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param checksCompleted set the checksCompleted.
   */
  @VsoMethod
  public void setChecksCompleted(Integer  checksCompleted) {
    this.checksCompleted = checksCompleted;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time taken to complete upgrade readiness checks in seconds.
   * Field introduced in 22.1.3.
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
   * Time taken to complete upgrade readiness checks in seconds.
   * Field introduced in 22.1.3.
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
   * Time at which execution of upgrade readiness checks was completed.
   * Field introduced in 22.1.3.
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
   * Time at which execution of upgrade readiness checks was completed.
   * Field introduced in 22.1.3.
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
   * Image uuid for identifying the next base image.
   * It is a reference to an object of type image.
   * Field introduced in 22.1.3.
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
   * Image uuid for identifying the next base image.
   * It is a reference to an object of type image.
   * Field introduced in 22.1.3.
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
   * Image uuid for identifying the next patch.
   * It is a reference to an object of type image.
   * Field introduced in 22.1.3.
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
   * Image uuid for identifying the next patch.
   * It is a reference to an object of type image.
   * Field introduced in 22.1.3.
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
   * Descriptive reason for the upgrade readiness check state.
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
   * Descriptive reason for the upgrade readiness check state.
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
   * Time at which execution of upgrade readiness checks was started.
   * Field introduced in 22.1.3.
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
   * Time at which execution of upgrade readiness checks was started.
   * Field introduced in 22.1.3.
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
   * The upgrade readiness check operations current fsm-state.
   * Enum options - UPGRADE_FSM_INIT, UPGRADE_FSM_STARTED, UPGRADE_FSM_WAITING, UPGRADE_FSM_IN_PROGRESS, UPGRADE_FSM_ENQUEUED, UPGRADE_FSM_ERROR,
   * UPGRADE_FSM_SUSPENDED, UPGRADE_FSM_ENQUEUE_FAILED, UPGRADE_FSM_PAUSED, UPGRADE_FSM_COMPLETED, UPGRADE_FSM_ABORT_IN_PROGRESS, UPGRADE_FSM_ABORTED,
   * UPGRADE_FSM_SE_UPGRADE_IN_PROGRESS, UPGRADE_FSM_CONTROLLER_COMPLETED, UPGRADE_FSM_DUMMY_3, UPGRADE_FSM_DUMMY_4, UPGRADE_FSM_DUMMY_5,
   * UPGRADE_PRE_CHECK_STARTED, UPGRADE_PRE_CHECK_IN_PROGRESS, UPGRADE_PRE_CHECK_SUCCESS...
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * The upgrade readiness check operations current fsm-state.
   * Enum options - UPGRADE_FSM_INIT, UPGRADE_FSM_STARTED, UPGRADE_FSM_WAITING, UPGRADE_FSM_IN_PROGRESS, UPGRADE_FSM_ENQUEUED, UPGRADE_FSM_ERROR,
   * UPGRADE_FSM_SUSPENDED, UPGRADE_FSM_ENQUEUE_FAILED, UPGRADE_FSM_PAUSED, UPGRADE_FSM_COMPLETED, UPGRADE_FSM_ABORT_IN_PROGRESS, UPGRADE_FSM_ABORTED,
   * UPGRADE_FSM_SE_UPGRADE_IN_PROGRESS, UPGRADE_FSM_CONTROLLER_COMPLETED, UPGRADE_FSM_DUMMY_3, UPGRADE_FSM_DUMMY_4, UPGRADE_FSM_DUMMY_5,
   * UPGRADE_PRE_CHECK_STARTED, UPGRADE_PRE_CHECK_IN_PROGRESS, UPGRADE_PRE_CHECK_SUCCESS...
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(String  state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total no.
   * Of checks.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalChecks
   */
  @VsoMethod
  public Integer getTotalChecks() {
    return totalChecks;
  }

  /**
   * This is the setter method to the attribute.
   * Total no.
   * Of checks.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalChecks set the totalChecks.
   */
  @VsoMethod
  public void setTotalChecks(Integer  totalChecks) {
    this.totalChecks = totalChecks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade operations along with type requested such as upgradesystem upgradecontroller etc.
   * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME, EVAL_UPGRADE, EVAL_PATCH, EVAL_ROLLBACK, EVAL_ROLLBACKPATCH,
   * EVAL_SEGROUP_RESUME.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeOps
   */
  @VsoMethod
  public String getUpgradeOps() {
    return upgradeOps;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade operations along with type requested such as upgradesystem upgradecontroller etc.
   * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME, EVAL_UPGRADE, EVAL_PATCH, EVAL_ROLLBACK, EVAL_ROLLBACKPATCH,
   * EVAL_SEGROUP_RESUME.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param upgradeOps set the upgradeOps.
   */
  @VsoMethod
  public void setUpgradeOps(String  upgradeOps) {
    this.upgradeOps = upgradeOps;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UpgradeReadinessCheckObj objUpgradeReadinessCheckObj = (UpgradeReadinessCheckObj) o;
  return   Objects.equals(this.state, objUpgradeReadinessCheckObj.state)&&
  Objects.equals(this.checks, objUpgradeReadinessCheckObj.checks)&&
  Objects.equals(this.startTime, objUpgradeReadinessCheckObj.startTime)&&
  Objects.equals(this.endTime, objUpgradeReadinessCheckObj.endTime)&&
  Objects.equals(this.duration, objUpgradeReadinessCheckObj.duration)&&
  Objects.equals(this.upgradeOps, objUpgradeReadinessCheckObj.upgradeOps)&&
  Objects.equals(this.reason, objUpgradeReadinessCheckObj.reason)&&
  Objects.equals(this.imageRef, objUpgradeReadinessCheckObj.imageRef)&&
  Objects.equals(this.patchImageRef, objUpgradeReadinessCheckObj.patchImageRef)&&
  Objects.equals(this.totalChecks, objUpgradeReadinessCheckObj.totalChecks)&&
  Objects.equals(this.checksCompleted, objUpgradeReadinessCheckObj.checksCompleted);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UpgradeReadinessCheckObj {\n");
      sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
        sb.append("    checksCompleted: ").append(toIndentedString(checksCompleted)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    patchImageRef: ").append(toIndentedString(patchImageRef)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    totalChecks: ").append(toIndentedString(totalChecks)).append("\n");
        sb.append("    upgradeOps: ").append(toIndentedString(upgradeOps)).append("\n");
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

