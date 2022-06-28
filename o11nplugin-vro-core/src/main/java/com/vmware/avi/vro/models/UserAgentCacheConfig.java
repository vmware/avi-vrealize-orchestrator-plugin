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
 * The UserAgentCacheConfig is a POJO class extends AviRestResource that used for creating
 * UserAgentCacheConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UserAgentCacheConfig")
@VsoFinder(name = Constants.FINDER_VRO_USERAGENTCACHECONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UserAgentCacheConfig extends AviRestResource {
    @JsonProperty("batch_size")
    @JsonInclude(Include.NON_NULL)
    private Integer batchSize = 100;

    @JsonProperty("controller_cache_size")
    @JsonInclude(Include.NON_NULL)
    private Integer controllerCacheSize = 300000;

    @JsonProperty("max_age")
    @JsonInclude(Include.NON_NULL)
    private Integer maxAge = 86400;

    @JsonProperty("max_last_hit_time")
    @JsonInclude(Include.NON_NULL)
    private Integer maxLastHitTime = 86400;

    @JsonProperty("max_upstream_queries")
    @JsonInclude(Include.NON_NULL)
    private Integer maxUpstreamQueries = 5;

    @JsonProperty("max_wait_time")
    @JsonInclude(Include.NON_NULL)
    private Integer maxWaitTime = 60;

    @JsonProperty("num_entries_upstream_update")
    @JsonInclude(Include.NON_NULL)
    private Integer numEntriesUpstreamUpdate = 100;

    @JsonProperty("percent_reserved_for_bad_bots")
    @JsonInclude(Include.NON_NULL)
    private Integer percentReservedForBadBots = 20;

    @JsonProperty("percent_reserved_for_browsers")
    @JsonInclude(Include.NON_NULL)
    private Integer percentReservedForBrowsers = 50;

    @JsonProperty("percent_reserved_for_good_bots")
    @JsonInclude(Include.NON_NULL)
    private Integer percentReservedForGoodBots = 20;

    @JsonProperty("percent_reserved_for_outstanding")
    @JsonInclude(Include.NON_NULL)
    private Integer percentReservedForOutstanding = 10;

    @JsonProperty("se_cache_size")
    @JsonInclude(Include.NON_NULL)
    private Integer seCacheSize = 20000;

    @JsonProperty("upstream_update_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer upstreamUpdateInterval = 3600;



  /**
   * This is the getter method this will return the attribute value.
   * How many unknown user-agents to batch up before querying controller - unless max_wait_time is reached first.
   * Allowed values are 1-500.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return batchSize
   */
  @VsoMethod
  public Integer getBatchSize() {
    return batchSize;
  }

  /**
   * This is the setter method to the attribute.
   * How many unknown user-agents to batch up before querying controller - unless max_wait_time is reached first.
   * Allowed values are 1-500.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param batchSize set the batchSize.
   */
  @VsoMethod
  public void setBatchSize(Integer  batchSize) {
    this.batchSize = batchSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The number of user-agent entries to cache on the controller.
   * Allowed values are 500-10000000.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300000.
   * @return controllerCacheSize
   */
  @VsoMethod
  public Integer getControllerCacheSize() {
    return controllerCacheSize;
  }

  /**
   * This is the setter method to the attribute.
   * The number of user-agent entries to cache on the controller.
   * Allowed values are 500-10000000.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300000.
   * @param controllerCacheSize set the controllerCacheSize.
   */
  @VsoMethod
  public void setControllerCacheSize(Integer  controllerCacheSize) {
    this.controllerCacheSize = controllerCacheSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time interval in seconds after which an existing entry is refreshed from upstream if it has been accessed during max_last_hit_time.
   * Allowed values are 60-604800.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 86400.
   * @return maxAge
   */
  @VsoMethod
  public Integer getMaxAge() {
    return maxAge;
  }

  /**
   * This is the setter method to the attribute.
   * Time interval in seconds after which an existing entry is refreshed from upstream if it has been accessed during max_last_hit_time.
   * Allowed values are 60-604800.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 86400.
   * @param maxAge set the maxAge.
   */
  @VsoMethod
  public void setMaxAge(Integer  maxAge) {
    this.maxAge = maxAge;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time interval in seconds backwards from now during which an existing entry must have been hit for refresh from upstream.
   * Entries that have last been accessed further in the past than max_last_hit time are not included in upstream refresh requests even if they are
   * older than 'max_age'.
   * Allowed values are 60-604800.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 86400.
   * @return maxLastHitTime
   */
  @VsoMethod
  public Integer getMaxLastHitTime() {
    return maxLastHitTime;
  }

  /**
   * This is the setter method to the attribute.
   * Time interval in seconds backwards from now during which an existing entry must have been hit for refresh from upstream.
   * Entries that have last been accessed further in the past than max_last_hit time are not included in upstream refresh requests even if they are
   * older than 'max_age'.
   * Allowed values are 60-604800.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 86400.
   * @param maxLastHitTime set the maxLastHitTime.
   */
  @VsoMethod
  public void setMaxLastHitTime(Integer  maxLastHitTime) {
    this.maxLastHitTime = maxLastHitTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * How often at most to query controller for a given user-agent.
   * Allowed values are 2-100.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return maxUpstreamQueries
   */
  @VsoMethod
  public Integer getMaxUpstreamQueries() {
    return maxUpstreamQueries;
  }

  /**
   * This is the setter method to the attribute.
   * How often at most to query controller for a given user-agent.
   * Allowed values are 2-100.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param maxUpstreamQueries set the maxUpstreamQueries.
   */
  @VsoMethod
  public void setMaxUpstreamQueries(Integer  maxUpstreamQueries) {
    this.maxUpstreamQueries = maxUpstreamQueries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The time interval in seconds after which to make a request to the controller, even if the 'batch_size' hasn't been reached yet.
   * Allowed values are 20-100000.
   * Field introduced in 21.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return maxWaitTime
   */
  @VsoMethod
  public Integer getMaxWaitTime() {
    return maxWaitTime;
  }

  /**
   * This is the setter method to the attribute.
   * The time interval in seconds after which to make a request to the controller, even if the 'batch_size' hasn't been reached yet.
   * Allowed values are 20-100000.
   * Field introduced in 21.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param maxWaitTime set the maxWaitTime.
   */
  @VsoMethod
  public void setMaxWaitTime(Integer  maxWaitTime) {
    this.maxWaitTime = maxWaitTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * How many botuacacheresult elements to include in an upstream update message.
   * Allowed values are 1-10000.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return numEntriesUpstreamUpdate
   */
  @VsoMethod
  public Integer getNumEntriesUpstreamUpdate() {
    return numEntriesUpstreamUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * How many botuacacheresult elements to include in an upstream update message.
   * Allowed values are 1-10000.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param numEntriesUpstreamUpdate set the numEntriesUpstreamUpdate.
   */
  @VsoMethod
  public void setNumEntriesUpstreamUpdate(Integer  numEntriesUpstreamUpdate) {
    this.numEntriesUpstreamUpdate = numEntriesUpstreamUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * How much space to reserve in percent for known bad bots.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return percentReservedForBadBots
   */
  @VsoMethod
  public Integer getPercentReservedForBadBots() {
    return percentReservedForBadBots;
  }

  /**
   * This is the setter method to the attribute.
   * How much space to reserve in percent for known bad bots.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param percentReservedForBadBots set the percentReservedForBadBots.
   */
  @VsoMethod
  public void setPercentReservedForBadBots(Integer  percentReservedForBadBots) {
    this.percentReservedForBadBots = percentReservedForBadBots;
  }

  /**
   * This is the getter method this will return the attribute value.
   * How much space to reserve in percent for browsers.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @return percentReservedForBrowsers
   */
  @VsoMethod
  public Integer getPercentReservedForBrowsers() {
    return percentReservedForBrowsers;
  }

  /**
   * This is the setter method to the attribute.
   * How much space to reserve in percent for browsers.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @param percentReservedForBrowsers set the percentReservedForBrowsers.
   */
  @VsoMethod
  public void setPercentReservedForBrowsers(Integer  percentReservedForBrowsers) {
    this.percentReservedForBrowsers = percentReservedForBrowsers;
  }

  /**
   * This is the getter method this will return the attribute value.
   * How much space to reserve in percent for known good bots.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return percentReservedForGoodBots
   */
  @VsoMethod
  public Integer getPercentReservedForGoodBots() {
    return percentReservedForGoodBots;
  }

  /**
   * This is the setter method to the attribute.
   * How much space to reserve in percent for known good bots.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param percentReservedForGoodBots set the percentReservedForGoodBots.
   */
  @VsoMethod
  public void setPercentReservedForGoodBots(Integer  percentReservedForGoodBots) {
    this.percentReservedForGoodBots = percentReservedForGoodBots;
  }

  /**
   * This is the getter method this will return the attribute value.
   * How much space to reserve in percent for outstanding upstream requests.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return percentReservedForOutstanding
   */
  @VsoMethod
  public Integer getPercentReservedForOutstanding() {
    return percentReservedForOutstanding;
  }

  /**
   * This is the setter method to the attribute.
   * How much space to reserve in percent for outstanding upstream requests.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param percentReservedForOutstanding set the percentReservedForOutstanding.
   */
  @VsoMethod
  public void setPercentReservedForOutstanding(Integer  percentReservedForOutstanding) {
    this.percentReservedForOutstanding = percentReservedForOutstanding;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The number of user-agent entries to cache on each service engine.
   * Allowed values are 500-10000000.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20000.
   * @return seCacheSize
   */
  @VsoMethod
  public Integer getSeCacheSize() {
    return seCacheSize;
  }

  /**
   * This is the setter method to the attribute.
   * The number of user-agent entries to cache on each service engine.
   * Allowed values are 500-10000000.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20000.
   * @param seCacheSize set the seCacheSize.
   */
  @VsoMethod
  public void setSeCacheSize(Integer  seCacheSize) {
    this.seCacheSize = seCacheSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * How often in seconds to send updates about user-agent cache entries to the next upstream cache.
   * Field introduced in 21.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
   * @return upstreamUpdateInterval
   */
  @VsoMethod
  public Integer getUpstreamUpdateInterval() {
    return upstreamUpdateInterval;
  }

  /**
   * This is the setter method to the attribute.
   * How often in seconds to send updates about user-agent cache entries to the next upstream cache.
   * Field introduced in 21.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
   * @param upstreamUpdateInterval set the upstreamUpdateInterval.
   */
  @VsoMethod
  public void setUpstreamUpdateInterval(Integer  upstreamUpdateInterval) {
    this.upstreamUpdateInterval = upstreamUpdateInterval;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UserAgentCacheConfig objUserAgentCacheConfig = (UserAgentCacheConfig) o;
  return   Objects.equals(this.seCacheSize, objUserAgentCacheConfig.seCacheSize)&&
  Objects.equals(this.controllerCacheSize, objUserAgentCacheConfig.controllerCacheSize)&&
  Objects.equals(this.percentReservedForOutstanding, objUserAgentCacheConfig.percentReservedForOutstanding)&&
  Objects.equals(this.percentReservedForBrowsers, objUserAgentCacheConfig.percentReservedForBrowsers)&&
  Objects.equals(this.percentReservedForGoodBots, objUserAgentCacheConfig.percentReservedForGoodBots)&&
  Objects.equals(this.percentReservedForBadBots, objUserAgentCacheConfig.percentReservedForBadBots)&&
  Objects.equals(this.batchSize, objUserAgentCacheConfig.batchSize)&&
  Objects.equals(this.maxWaitTime, objUserAgentCacheConfig.maxWaitTime)&&
  Objects.equals(this.upstreamUpdateInterval, objUserAgentCacheConfig.upstreamUpdateInterval)&&
  Objects.equals(this.numEntriesUpstreamUpdate, objUserAgentCacheConfig.numEntriesUpstreamUpdate)&&
  Objects.equals(this.maxUpstreamQueries, objUserAgentCacheConfig.maxUpstreamQueries)&&
  Objects.equals(this.maxAge, objUserAgentCacheConfig.maxAge)&&
  Objects.equals(this.maxLastHitTime, objUserAgentCacheConfig.maxLastHitTime);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UserAgentCacheConfig {\n");
      sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
        sb.append("    controllerCacheSize: ").append(toIndentedString(controllerCacheSize)).append("\n");
        sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
        sb.append("    maxLastHitTime: ").append(toIndentedString(maxLastHitTime)).append("\n");
        sb.append("    maxUpstreamQueries: ").append(toIndentedString(maxUpstreamQueries)).append("\n");
        sb.append("    maxWaitTime: ").append(toIndentedString(maxWaitTime)).append("\n");
        sb.append("    numEntriesUpstreamUpdate: ").append(toIndentedString(numEntriesUpstreamUpdate)).append("\n");
        sb.append("    percentReservedForBadBots: ").append(toIndentedString(percentReservedForBadBots)).append("\n");
        sb.append("    percentReservedForBrowsers: ").append(toIndentedString(percentReservedForBrowsers)).append("\n");
        sb.append("    percentReservedForGoodBots: ").append(toIndentedString(percentReservedForGoodBots)).append("\n");
        sb.append("    percentReservedForOutstanding: ").append(toIndentedString(percentReservedForOutstanding)).append("\n");
        sb.append("    seCacheSize: ").append(toIndentedString(seCacheSize)).append("\n");
        sb.append("    upstreamUpdateInterval: ").append(toIndentedString(upstreamUpdateInterval)).append("\n");
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

