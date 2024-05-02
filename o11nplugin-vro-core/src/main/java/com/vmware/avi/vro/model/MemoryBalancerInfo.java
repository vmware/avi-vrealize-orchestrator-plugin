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
 * The MemoryBalancerInfo is a POJO class extends AviRestResource that used for creating
 * MemoryBalancerInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MemoryBalancerInfo")
@VsoFinder(name = Constants.FINDER_VRO_MEMORYBALANCERINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MemoryBalancerInfo extends AviRestResource {
    @JsonProperty("child")
    @JsonInclude(Include.NON_NULL)
    private List<ChildProcessInfo> child;

    @JsonProperty("controller_memory")
    @JsonInclude(Include.NON_NULL)
    private Integer controllerMemory;

    @JsonProperty("controller_memory_usage_percent")
    @JsonInclude(Include.NON_NULL)
    private Float controllerMemoryUsagePercent;

    @JsonProperty("debug_message")
    @JsonInclude(Include.NON_NULL)
    private String debugMessage = "exceeded memory limits";

    @JsonProperty("limit")
    @JsonInclude(Include.NON_NULL)
    private Integer limit;

    @JsonProperty("memory_used")
    @JsonInclude(Include.NON_NULL)
    private Integer memoryUsed;

    @JsonProperty("pid")
    @JsonInclude(Include.NON_NULL)
    private Integer pid;

    @JsonProperty("process")
    @JsonInclude(Include.NON_NULL)
    private String process;

    @JsonProperty("process_mode")
    @JsonInclude(Include.NON_NULL)
    private String processMode;

    @JsonProperty("process_trend")
    @JsonInclude(Include.NON_NULL)
    private String processTrend;

    @JsonProperty("task_queue_length")
    @JsonInclude(Include.NON_NULL)
    private Integer taskQueueLength;

    @JsonProperty("threshold_percent")
    @JsonInclude(Include.NON_NULL)
    private Float thresholdPercent;



  /**
   * This is the getter method this will return the attribute value.
   * Child process information.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return child
   */
  @VsoMethod
  public List<ChildProcessInfo> getChild() {
    return child;
  }

  /**
   * This is the setter method. this will set the child
   * Child process information.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return child
   */
  @VsoMethod
  public void setChild(List<ChildProcessInfo>  child) {
    this.child = child;
  }

  /**
   * This is the setter method this will set the child
   * Child process information.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return child
   */
  @VsoMethod
  public MemoryBalancerInfo addChildItem(ChildProcessInfo childItem) {
    if (this.child == null) {
      this.child = new ArrayList<ChildProcessInfo>();
    }
    this.child.add(childItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Current controller memory (in gb) usage.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerMemory
   */
  @VsoMethod
  public Integer getControllerMemory() {
    return controllerMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Current controller memory (in gb) usage.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerMemory set the controllerMemory.
   */
  @VsoMethod
  public void setControllerMemory(Integer  controllerMemory) {
    this.controllerMemory = controllerMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percent usage of total controller memory.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerMemoryUsagePercent
   */
  @VsoMethod
  public Float getControllerMemoryUsagePercent() {
    return controllerMemoryUsagePercent;
  }

  /**
   * This is the setter method to the attribute.
   * Percent usage of total controller memory.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerMemoryUsagePercent set the controllerMemoryUsagePercent.
   */
  @VsoMethod
  public void setControllerMemoryUsagePercent(Float  controllerMemoryUsagePercent) {
    this.controllerMemoryUsagePercent = controllerMemoryUsagePercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Holder for debug message.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "exceeded memory limits".
   * @return debugMessage
   */
  @VsoMethod
  public String getDebugMessage() {
    return debugMessage;
  }

  /**
   * This is the setter method to the attribute.
   * Holder for debug message.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "exceeded memory limits".
   * @param debugMessage set the debugMessage.
   */
  @VsoMethod
  public void setDebugMessage(String  debugMessage) {
    this.debugMessage = debugMessage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Limit on the memory (in kb) for the process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return limit
   */
  @VsoMethod
  public Integer getLimit() {
    return limit;
  }

  /**
   * This is the setter method to the attribute.
   * Limit on the memory (in kb) for the process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param limit set the limit.
   */
  @VsoMethod
  public void setLimit(Integer  limit) {
    this.limit = limit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Amount of memory (in kb) used by the process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return memoryUsed
   */
  @VsoMethod
  public Integer getMemoryUsed() {
    return memoryUsed;
  }

  /**
   * This is the setter method to the attribute.
   * Amount of memory (in kb) used by the process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param memoryUsed set the memoryUsed.
   */
  @VsoMethod
  public void setMemoryUsed(Integer  memoryUsed) {
    this.memoryUsed = memoryUsed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pid of the process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pid
   */
  @VsoMethod
  public Integer getPid() {
    return pid;
  }

  /**
   * This is the setter method to the attribute.
   * Pid of the process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pid set the pid.
   */
  @VsoMethod
  public void setPid(Integer  pid) {
    this.pid = pid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return process
   */
  @VsoMethod
  public String getProcess() {
    return process;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the process.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param process set the process.
   */
  @VsoMethod
  public void setProcess(String  process) {
    this.process = process;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current mode of the process.
   * Enum options - REGULAR, DEBUG, DEGRADED, STOP.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return processMode
   */
  @VsoMethod
  public String getProcessMode() {
    return processMode;
  }

  /**
   * This is the setter method to the attribute.
   * Current mode of the process.
   * Enum options - REGULAR, DEBUG, DEGRADED, STOP.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param processMode set the processMode.
   */
  @VsoMethod
  public void setProcessMode(String  processMode) {
    this.processMode = processMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current usage trend of the process.
   * Enum options - UPWARD, DOWNWARD, NEUTRAL.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return processTrend
   */
  @VsoMethod
  public String getProcessTrend() {
    return processTrend;
  }

  /**
   * This is the setter method to the attribute.
   * Current usage trend of the process.
   * Enum options - UPWARD, DOWNWARD, NEUTRAL.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param processTrend set the processTrend.
   */
  @VsoMethod
  public void setProcessTrend(String  processTrend) {
    this.processTrend = processTrend;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Size of the task queue usage.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return taskQueueLength
   */
  @VsoMethod
  public Integer getTaskQueueLength() {
    return taskQueueLength;
  }

  /**
   * This is the setter method to the attribute.
   * Size of the task queue usage.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param taskQueueLength set the taskQueueLength.
   */
  @VsoMethod
  public void setTaskQueueLength(Integer  taskQueueLength) {
    this.taskQueueLength = taskQueueLength;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percent usage of the process limit.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return thresholdPercent
   */
  @VsoMethod
  public Float getThresholdPercent() {
    return thresholdPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Percent usage of the process limit.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param thresholdPercent set the thresholdPercent.
   */
  @VsoMethod
  public void setThresholdPercent(Float  thresholdPercent) {
    this.thresholdPercent = thresholdPercent;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MemoryBalancerInfo objMemoryBalancerInfo = (MemoryBalancerInfo) o;
  return   Objects.equals(this.process, objMemoryBalancerInfo.process)&&
  Objects.equals(this.pid, objMemoryBalancerInfo.pid)&&
  Objects.equals(this.memoryUsed, objMemoryBalancerInfo.memoryUsed)&&
  Objects.equals(this.limit, objMemoryBalancerInfo.limit)&&
  Objects.equals(this.child, objMemoryBalancerInfo.child)&&
  Objects.equals(this.controllerMemory, objMemoryBalancerInfo.controllerMemory)&&
  Objects.equals(this.processMode, objMemoryBalancerInfo.processMode)&&
  Objects.equals(this.processTrend, objMemoryBalancerInfo.processTrend)&&
  Objects.equals(this.thresholdPercent, objMemoryBalancerInfo.thresholdPercent)&&
  Objects.equals(this.debugMessage, objMemoryBalancerInfo.debugMessage)&&
  Objects.equals(this.controllerMemoryUsagePercent, objMemoryBalancerInfo.controllerMemoryUsagePercent)&&
  Objects.equals(this.taskQueueLength, objMemoryBalancerInfo.taskQueueLength);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MemoryBalancerInfo {\n");
      sb.append("    child: ").append(toIndentedString(child)).append("\n");
        sb.append("    controllerMemory: ").append(toIndentedString(controllerMemory)).append("\n");
        sb.append("    controllerMemoryUsagePercent: ").append(toIndentedString(controllerMemoryUsagePercent)).append("\n");
        sb.append("    debugMessage: ").append(toIndentedString(debugMessage)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    memoryUsed: ").append(toIndentedString(memoryUsed)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    processMode: ").append(toIndentedString(processMode)).append("\n");
        sb.append("    processTrend: ").append(toIndentedString(processTrend)).append("\n");
        sb.append("    taskQueueLength: ").append(toIndentedString(taskQueueLength)).append("\n");
        sb.append("    thresholdPercent: ").append(toIndentedString(thresholdPercent)).append("\n");
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

