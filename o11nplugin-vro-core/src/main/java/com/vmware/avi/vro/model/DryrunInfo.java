package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.UpgradeParams;
import com.vmware.avi.vro.model.UpgradeOpsState;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DryrunInfo is a POJO class extends AviRestResource that used for creating
 * DryrunInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DryrunInfo")
@VsoFinder(name = Constants.FINDER_VRO_DRYRUNINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DryrunInfo extends AviRestResource {
    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration;

    @JsonProperty("end_time")
    @JsonInclude(Include.NON_NULL)
    private String endTime;

    @JsonProperty("operation")
    @JsonInclude(Include.NON_NULL)
    private String operation;

    @JsonProperty("params")
    @JsonInclude(Include.NON_NULL)
    private UpgradeParams params;

    @JsonProperty("progress")
    @JsonInclude(Include.NON_NULL)
    private Integer progress = 0;

    @JsonProperty("start_time")
    @JsonInclude(Include.NON_NULL)
    private String startTime;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private UpgradeOpsState state;

    @JsonProperty("tasks_completed")
    @JsonInclude(Include.NON_NULL)
    private Integer tasksCompleted;

    @JsonProperty("total_tasks")
    @JsonInclude(Include.NON_NULL)
    private Integer totalTasks;

    @JsonProperty("upgrade_events")
    @JsonInclude(Include.NON_NULL)
    private List<EventMap> upgradeEvents;

    @JsonProperty("worker")
    @JsonInclude(Include.NON_NULL)
    private String worker;



  /**
   * This is the getter method this will return the attribute value.
   * Duration of dry-run operation in seconds.
   * Field introduced in 31.1.1.
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
   * Duration of dry-run operation in seconds.
   * Field introduced in 31.1.1.
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
   * End time of dry-run operation.
   * Field introduced in 31.1.1.
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
   * End time of dry-run operation.
   * Field introduced in 31.1.1.
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
   * Dryrun operations requested.
   * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME, EVAL_UPGRADE, EVAL_PATCH, EVAL_ROLLBACK, EVAL_ROLLBACKPATCH,
   * EVAL_SEGROUP_RESUME, EVAL_RESTORE, RESTORE, UPGRADE_DRYRUN.
   * Field introduced in 31.1.1.
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
   * Dryrun operations requested.
   * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME, EVAL_UPGRADE, EVAL_PATCH, EVAL_ROLLBACK, EVAL_ROLLBACKPATCH,
   * EVAL_SEGROUP_RESUME, EVAL_RESTORE, RESTORE, UPGRADE_DRYRUN.
   * Field introduced in 31.1.1.
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
   * Parameters for performing the dry-run operation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return params
   */
  @VsoMethod
  public UpgradeParams getParams() {
    return params;
  }

  /**
   * This is the setter method to the attribute.
   * Parameters for performing the dry-run operation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param params set the params.
   */
  @VsoMethod
  public void setParams(UpgradeParams params) {
    this.params = params;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dry-run operations progress which holds value between 0-100.
   * Allowed values are 0-100.
   * Field introduced in 31.1.1.
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
   * Dry-run operations progress which holds value between 0-100.
   * Allowed values are 0-100.
   * Field introduced in 31.1.1.
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
   * Start time of dry-run operation.
   * Field introduced in 31.1.1.
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
   * Start time of dry-run operation.
   * Field introduced in 31.1.1.
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
   * Current status of the dry-run operation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public UpgradeOpsState getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Current status of the dry-run operation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(UpgradeOpsState state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Completed set of tasks in the upgrade operation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tasksCompleted set the tasksCompleted.
   */
  @VsoMethod
  public void setTasksCompleted(Integer  tasksCompleted) {
    this.tasksCompleted = tasksCompleted;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of tasks in the upgrade operation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalTasks set the totalTasks.
   */
  @VsoMethod
  public void setTotalTasks(Integer  totalTasks) {
    this.totalTasks = totalTasks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Controller events for dry-run operation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeEvents
   */
  @VsoMethod
  public List<EventMap> getUpgradeEvents() {
    return upgradeEvents;
  }

  /**
   * This is the setter method. this will set the upgradeEvents
   * Controller events for dry-run operation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeEvents
   */
  @VsoMethod
  public void setUpgradeEvents(List<EventMap>  upgradeEvents) {
    this.upgradeEvents = upgradeEvents;
  }

  /**
   * This is the setter method this will set the upgradeEvents
   * Controller events for dry-run operation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return upgradeEvents
   */
  @VsoMethod
  public DryrunInfo addUpgradeEventsItem(EventMap upgradeEventsItem) {
    if (this.upgradeEvents == null) {
      this.upgradeEvents = new ArrayList<EventMap>();
    }
    this.upgradeEvents.add(upgradeEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Node on which the dry-run is performed.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return worker
   */
  @VsoMethod
  public String getWorker() {
    return worker;
  }

  /**
   * This is the setter method to the attribute.
   * Node on which the dry-run is performed.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param worker set the worker.
   */
  @VsoMethod
  public void setWorker(String  worker) {
    this.worker = worker;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DryrunInfo objDryrunInfo = (DryrunInfo) o;
  return   Objects.equals(this.state, objDryrunInfo.state)&&
  Objects.equals(this.operation, objDryrunInfo.operation)&&
  Objects.equals(this.params, objDryrunInfo.params)&&
  Objects.equals(this.worker, objDryrunInfo.worker)&&
  Objects.equals(this.startTime, objDryrunInfo.startTime)&&
  Objects.equals(this.endTime, objDryrunInfo.endTime)&&
  Objects.equals(this.duration, objDryrunInfo.duration)&&
  Objects.equals(this.totalTasks, objDryrunInfo.totalTasks)&&
  Objects.equals(this.tasksCompleted, objDryrunInfo.tasksCompleted)&&
  Objects.equals(this.progress, objDryrunInfo.progress)&&
  Objects.equals(this.upgradeEvents, objDryrunInfo.upgradeEvents);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DryrunInfo {\n");
      sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
        sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
        sb.append("    upgradeEvents: ").append(toIndentedString(upgradeEvents)).append("\n");
        sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
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

