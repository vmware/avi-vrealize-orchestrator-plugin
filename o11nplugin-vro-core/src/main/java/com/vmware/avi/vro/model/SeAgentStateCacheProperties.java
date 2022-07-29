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
 * The SeAgentStateCacheProperties is a POJO class extends AviRestResource that used for creating
 * SeAgentStateCacheProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeAgentStateCacheProperties")
@VsoFinder(name = Constants.FINDER_VRO_SEAGENTSTATECACHEPROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeAgentStateCacheProperties extends AviRestResource {
    @JsonProperty("sc_batch_buffer_flush_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer scBatchBufferFlushLimit = 300;

    @JsonProperty("sc_cfg_q_batch_dequeue_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer scCfgQBatchDequeueLimit = 100;

    @JsonProperty("sc_cfg_q_max_size")
    @JsonInclude(Include.NON_NULL)
    private Integer scCfgQMaxSize = 4096;

    @JsonProperty("sc_dns_q_batch_dequeue_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer scDnsQBatchDequeueLimit = 100;

    @JsonProperty("sc_dns_q_max_size")
    @JsonInclude(Include.NON_NULL)
    private Integer scDnsQMaxSize = 4096;

    @JsonProperty("sc_shard_cleanup_max_time")
    @JsonInclude(Include.NON_NULL)
    private Integer scShardCleanupMaxTime = 900;

    @JsonProperty("sc_state_ring_batch_dequeue_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer scStateRingBatchDequeueLimit = 300;

    @JsonProperty("sc_states_flush_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer scStatesFlushInterval = 100;

    @JsonProperty("sc_stream_check_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer scStreamCheckInterval = 5000;

    @JsonProperty("sc_thread_q_batch_dequeue_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer scThreadQBatchDequeueLimit = 100;

    @JsonProperty("sc_thread_q_max_size")
    @JsonInclude(Include.NON_NULL)
    private Integer scThreadQMaxSize = 4096;

    @JsonProperty("sc_thread_sleep_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer scThreadSleepInterval = 10;



  /**
   * This is the getter method this will return the attribute value.
   * Max elements to flush in one shot from the internal buffer by the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return scBatchBufferFlushLimit
   */
  @VsoMethod
  public Integer getScBatchBufferFlushLimit() {
    return scBatchBufferFlushLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Max elements to flush in one shot from the internal buffer by the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param scBatchBufferFlushLimit set the scBatchBufferFlushLimit.
   */
  @VsoMethod
  public void setScBatchBufferFlushLimit(Integer  scBatchBufferFlushLimit) {
    this.scBatchBufferFlushLimit = scBatchBufferFlushLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max elements to dequeue in one shot from the q by the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return scCfgQBatchDequeueLimit
   */
  @VsoMethod
  public Integer getScCfgQBatchDequeueLimit() {
    return scCfgQBatchDequeueLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Max elements to dequeue in one shot from the q by the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param scCfgQBatchDequeueLimit set the scCfgQBatchDequeueLimit.
   */
  @VsoMethod
  public void setScCfgQBatchDequeueLimit(Integer  scCfgQBatchDequeueLimit) {
    this.scCfgQBatchDequeueLimit = scCfgQBatchDequeueLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max elements in the config queue between seagent main and the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @return scCfgQMaxSize
   */
  @VsoMethod
  public Integer getScCfgQMaxSize() {
    return scCfgQMaxSize;
  }

  /**
   * This is the setter method to the attribute.
   * Max elements in the config queue between seagent main and the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @param scCfgQMaxSize set the scCfgQMaxSize.
   */
  @VsoMethod
  public void setScCfgQMaxSize(Integer  scCfgQMaxSize) {
    this.scCfgQMaxSize = scCfgQMaxSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max elements to dequeue in one shot from the q by the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return scDnsQBatchDequeueLimit
   */
  @VsoMethod
  public Integer getScDnsQBatchDequeueLimit() {
    return scDnsQBatchDequeueLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Max elements to dequeue in one shot from the q by the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param scDnsQBatchDequeueLimit set the scDnsQBatchDequeueLimit.
   */
  @VsoMethod
  public void setScDnsQBatchDequeueLimit(Integer  scDnsQBatchDequeueLimit) {
    this.scDnsQBatchDequeueLimit = scDnsQBatchDequeueLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max elements in the dns queue between seagent main and the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @return scDnsQMaxSize
   */
  @VsoMethod
  public Integer getScDnsQMaxSize() {
    return scDnsQMaxSize;
  }

  /**
   * This is the setter method to the attribute.
   * Max elements in the dns queue between seagent main and the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @param scDnsQMaxSize set the scDnsQMaxSize.
   */
  @VsoMethod
  public void setScDnsQMaxSize(Integer  scDnsQMaxSize) {
    this.scDnsQMaxSize = scDnsQMaxSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max time to wait by the statecache thread before cleaning up connection to the controller shard.
   * Allowed values are 1-1000000.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 900.
   * @return scShardCleanupMaxTime
   */
  @VsoMethod
  public Integer getScShardCleanupMaxTime() {
    return scShardCleanupMaxTime;
  }

  /**
   * This is the setter method to the attribute.
   * Max time to wait by the statecache thread before cleaning up connection to the controller shard.
   * Allowed values are 1-1000000.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 900.
   * @param scShardCleanupMaxTime set the scShardCleanupMaxTime.
   */
  @VsoMethod
  public void setScShardCleanupMaxTime(Integer  scShardCleanupMaxTime) {
    this.scShardCleanupMaxTime = scShardCleanupMaxTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max elements to dequeue in one shot from the state_ring by the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return scStateRingBatchDequeueLimit
   */
  @VsoMethod
  public Integer getScStateRingBatchDequeueLimit() {
    return scStateRingBatchDequeueLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Max elements to dequeue in one shot from the state_ring by the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param scStateRingBatchDequeueLimit set the scStateRingBatchDequeueLimit.
   */
  @VsoMethod
  public void setScStateRingBatchDequeueLimit(Integer  scStateRingBatchDequeueLimit) {
    this.scStateRingBatchDequeueLimit = scStateRingBatchDequeueLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Interval for update of operational states to controller.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return scStatesFlushInterval
   */
  @VsoMethod
  public Integer getScStatesFlushInterval() {
    return scStatesFlushInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Interval for update of operational states to controller.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param scStatesFlushInterval set the scStatesFlushInterval.
   */
  @VsoMethod
  public void setScStatesFlushInterval(Integer  scStatesFlushInterval) {
    this.scStatesFlushInterval = scStatesFlushInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Interval for checking health of grpc streams to statecache_mgr.
   * Allowed values are 1-90000.
   * Field introduced in 18.2.5.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5000.
   * @return scStreamCheckInterval
   */
  @VsoMethod
  public Integer getScStreamCheckInterval() {
    return scStreamCheckInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Interval for checking health of grpc streams to statecache_mgr.
   * Allowed values are 1-90000.
   * Field introduced in 18.2.5.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5000.
   * @param scStreamCheckInterval set the scStreamCheckInterval.
   */
  @VsoMethod
  public void setScStreamCheckInterval(Integer  scStreamCheckInterval) {
    this.scStreamCheckInterval = scStreamCheckInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max elements to dequeue in one shot from the q by the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return scThreadQBatchDequeueLimit
   */
  @VsoMethod
  public Integer getScThreadQBatchDequeueLimit() {
    return scThreadQBatchDequeueLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Max elements to dequeue in one shot from the q by the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param scThreadQBatchDequeueLimit set the scThreadQBatchDequeueLimit.
   */
  @VsoMethod
  public void setScThreadQBatchDequeueLimit(Integer  scThreadQBatchDequeueLimit) {
    this.scThreadQBatchDequeueLimit = scThreadQBatchDequeueLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max elements in the q between seagent main and the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @return scThreadQMaxSize
   */
  @VsoMethod
  public Integer getScThreadQMaxSize() {
    return scThreadQMaxSize;
  }

  /**
   * This is the setter method to the attribute.
   * Max elements in the q between seagent main and the statecache thread.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @param scThreadQMaxSize set the scThreadQMaxSize.
   */
  @VsoMethod
  public void setScThreadQMaxSize(Integer  scThreadQMaxSize) {
    this.scThreadQMaxSize = scThreadQMaxSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Interval for grpc thread to sleep between doing work.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return scThreadSleepInterval
   */
  @VsoMethod
  public Integer getScThreadSleepInterval() {
    return scThreadSleepInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Interval for grpc thread to sleep between doing work.
   * Allowed values are 1-10000.
   * Field introduced in 18.2.5.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param scThreadSleepInterval set the scThreadSleepInterval.
   */
  @VsoMethod
  public void setScThreadSleepInterval(Integer  scThreadSleepInterval) {
    this.scThreadSleepInterval = scThreadSleepInterval;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeAgentStateCacheProperties objSeAgentStateCacheProperties = (SeAgentStateCacheProperties) o;
  return   Objects.equals(this.scStatesFlushInterval, objSeAgentStateCacheProperties.scStatesFlushInterval)&&
  Objects.equals(this.scStreamCheckInterval, objSeAgentStateCacheProperties.scStreamCheckInterval)&&
  Objects.equals(this.scThreadSleepInterval, objSeAgentStateCacheProperties.scThreadSleepInterval)&&
  Objects.equals(this.scThreadQMaxSize, objSeAgentStateCacheProperties.scThreadQMaxSize)&&
  Objects.equals(this.scThreadQBatchDequeueLimit, objSeAgentStateCacheProperties.scThreadQBatchDequeueLimit)&&
  Objects.equals(this.scStateRingBatchDequeueLimit, objSeAgentStateCacheProperties.scStateRingBatchDequeueLimit)&&
  Objects.equals(this.scShardCleanupMaxTime, objSeAgentStateCacheProperties.scShardCleanupMaxTime)&&
  Objects.equals(this.scBatchBufferFlushLimit, objSeAgentStateCacheProperties.scBatchBufferFlushLimit)&&
  Objects.equals(this.scDnsQMaxSize, objSeAgentStateCacheProperties.scDnsQMaxSize)&&
  Objects.equals(this.scDnsQBatchDequeueLimit, objSeAgentStateCacheProperties.scDnsQBatchDequeueLimit)&&
  Objects.equals(this.scCfgQMaxSize, objSeAgentStateCacheProperties.scCfgQMaxSize)&&
  Objects.equals(this.scCfgQBatchDequeueLimit, objSeAgentStateCacheProperties.scCfgQBatchDequeueLimit);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeAgentStateCacheProperties {\n");
      sb.append("    scBatchBufferFlushLimit: ").append(toIndentedString(scBatchBufferFlushLimit)).append("\n");
        sb.append("    scCfgQBatchDequeueLimit: ").append(toIndentedString(scCfgQBatchDequeueLimit)).append("\n");
        sb.append("    scCfgQMaxSize: ").append(toIndentedString(scCfgQMaxSize)).append("\n");
        sb.append("    scDnsQBatchDequeueLimit: ").append(toIndentedString(scDnsQBatchDequeueLimit)).append("\n");
        sb.append("    scDnsQMaxSize: ").append(toIndentedString(scDnsQMaxSize)).append("\n");
        sb.append("    scShardCleanupMaxTime: ").append(toIndentedString(scShardCleanupMaxTime)).append("\n");
        sb.append("    scStateRingBatchDequeueLimit: ").append(toIndentedString(scStateRingBatchDequeueLimit)).append("\n");
        sb.append("    scStatesFlushInterval: ").append(toIndentedString(scStatesFlushInterval)).append("\n");
        sb.append("    scStreamCheckInterval: ").append(toIndentedString(scStreamCheckInterval)).append("\n");
        sb.append("    scThreadQBatchDequeueLimit: ").append(toIndentedString(scThreadQBatchDequeueLimit)).append("\n");
        sb.append("    scThreadQMaxSize: ").append(toIndentedString(scThreadQMaxSize)).append("\n");
        sb.append("    scThreadSleepInterval: ").append(toIndentedString(scThreadSleepInterval)).append("\n");
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

