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
 * The HealthScoreDetails is a POJO class extends AviRestResource that used for creating
 * HealthScoreDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthScoreDetails")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHSCOREDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthScoreDetails extends AviRestResource {
    @JsonProperty("anomaly_penalty")
    @JsonInclude(Include.NON_NULL)
    private Integer anomalyPenalty = 0;

    @JsonProperty("anomaly_reason")
    @JsonInclude(Include.NON_NULL)
    private String anomalyReason;

    @JsonProperty("performance_reason")
    @JsonInclude(Include.NON_NULL)
    private String performanceReason;

    @JsonProperty("performance_score")
    @JsonInclude(Include.NON_NULL)
    private Integer performanceScore = 100;

    @JsonProperty("previous_value")
    @JsonInclude(Include.NON_NULL)
    private Float previousValue;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;

    @JsonProperty("resources_penalty")
    @JsonInclude(Include.NON_NULL)
    private Integer resourcesPenalty = 0;

    @JsonProperty("resources_reason")
    @JsonInclude(Include.NON_NULL)
    private String resourcesReason;

    @JsonProperty("security_penalty")
    @JsonInclude(Include.NON_NULL)
    private Integer securityPenalty = 0;

    @JsonProperty("security_reason")
    @JsonInclude(Include.NON_NULL)
    private String securityReason;

    @JsonProperty("step")
    @JsonInclude(Include.NON_NULL)
    private Integer step;

    @JsonProperty("sub_resource_prefix")
    @JsonInclude(Include.NON_NULL)
    private String subResourcePrefix;

    @JsonProperty("timestamp")
    @JsonInclude(Include.NON_NULL)
    private String timestamp;

    @JsonProperty("value")
    @JsonInclude(Include.NON_NULL)
    private Float value;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return anomalyPenalty
   */
  @VsoMethod
  public Integer getAnomalyPenalty() {
    return anomalyPenalty;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param anomalyPenalty set the anomalyPenalty.
   */
  @VsoMethod
  public void setAnomalyPenalty(Integer  anomalyPenalty) {
    this.anomalyPenalty = anomalyPenalty;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for anomaly penalty.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return anomalyReason
   */
  @VsoMethod
  public String getAnomalyReason() {
    return anomalyReason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for anomaly penalty.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param anomalyReason set the anomalyReason.
   */
  @VsoMethod
  public void setAnomalyReason(String  anomalyReason) {
    this.anomalyReason = anomalyReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for performance score.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return performanceReason
   */
  @VsoMethod
  public String getPerformanceReason() {
    return performanceReason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for performance score.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param performanceReason set the performanceReason.
   */
  @VsoMethod
  public void setPerformanceReason(String  performanceReason) {
    this.performanceReason = performanceReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return performanceScore
   */
  @VsoMethod
  public Integer getPerformanceScore() {
    return performanceScore;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param performanceScore set the performanceScore.
   */
  @VsoMethod
  public void setPerformanceScore(Integer  performanceScore) {
    this.performanceScore = performanceScore;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previousValue
   */
  @VsoMethod
  public Float getPreviousValue() {
    return previousValue;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param previousValue set the previousValue.
   */
  @VsoMethod
  public void setPreviousValue(Float  previousValue) {
    this.previousValue = previousValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for the health score change.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for the health score change.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return resourcesPenalty
   */
  @VsoMethod
  public Integer getResourcesPenalty() {
    return resourcesPenalty;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param resourcesPenalty set the resourcesPenalty.
   */
  @VsoMethod
  public void setResourcesPenalty(Integer  resourcesPenalty) {
    this.resourcesPenalty = resourcesPenalty;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for resources penalty.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resourcesReason
   */
  @VsoMethod
  public String getResourcesReason() {
    return resourcesReason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for resources penalty.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resourcesReason set the resourcesReason.
   */
  @VsoMethod
  public void setResourcesReason(String  resourcesReason) {
    this.resourcesReason = resourcesReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return securityPenalty
   */
  @VsoMethod
  public Integer getSecurityPenalty() {
    return securityPenalty;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param securityPenalty set the securityPenalty.
   */
  @VsoMethod
  public void setSecurityPenalty(Integer  securityPenalty) {
    this.securityPenalty = securityPenalty;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for security threat level.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return securityReason
   */
  @VsoMethod
  public String getSecurityReason() {
    return securityReason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for security threat level.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param securityReason set the securityReason.
   */
  @VsoMethod
  public void setSecurityReason(String  securityReason) {
    this.securityReason = securityReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The step interval in seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return step
   */
  @VsoMethod
  public Integer getStep() {
    return step;
  }

  /**
   * This is the setter method to the attribute.
   * The step interval in seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param step set the step.
   */
  @VsoMethod
  public void setStep(Integer  step) {
    this.step = step;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Resource prefix containing entity information.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subResourcePrefix
   */
  @VsoMethod
  public String getSubResourcePrefix() {
    return subResourcePrefix;
  }

  /**
   * This is the setter method to the attribute.
   * Resource prefix containing entity information.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subResourcePrefix set the subResourcePrefix.
   */
  @VsoMethod
  public void setSubResourcePrefix(String  subResourcePrefix) {
    this.subResourcePrefix = subResourcePrefix;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timestamp
   */
  @VsoMethod
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timestamp set the timestamp.
   */
  @VsoMethod
  public void setTimestamp(String  timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return value
   */
  @VsoMethod
  public Float getValue() {
    return value;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param value set the value.
   */
  @VsoMethod
  public void setValue(Float  value) {
    this.value = value;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HealthScoreDetails objHealthScoreDetails = (HealthScoreDetails) o;
  return   Objects.equals(this.value, objHealthScoreDetails.value)&&
  Objects.equals(this.previousValue, objHealthScoreDetails.previousValue)&&
  Objects.equals(this.timestamp, objHealthScoreDetails.timestamp)&&
  Objects.equals(this.reason, objHealthScoreDetails.reason)&&
  Objects.equals(this.anomalyPenalty, objHealthScoreDetails.anomalyPenalty)&&
  Objects.equals(this.anomalyReason, objHealthScoreDetails.anomalyReason)&&
  Objects.equals(this.resourcesPenalty, objHealthScoreDetails.resourcesPenalty)&&
  Objects.equals(this.resourcesReason, objHealthScoreDetails.resourcesReason)&&
  Objects.equals(this.performanceScore, objHealthScoreDetails.performanceScore)&&
  Objects.equals(this.performanceReason, objHealthScoreDetails.performanceReason)&&
  Objects.equals(this.securityPenalty, objHealthScoreDetails.securityPenalty)&&
  Objects.equals(this.securityReason, objHealthScoreDetails.securityReason)&&
  Objects.equals(this.subResourcePrefix, objHealthScoreDetails.subResourcePrefix)&&
  Objects.equals(this.step, objHealthScoreDetails.step);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HealthScoreDetails {\n");
      sb.append("    anomalyPenalty: ").append(toIndentedString(anomalyPenalty)).append("\n");
        sb.append("    anomalyReason: ").append(toIndentedString(anomalyReason)).append("\n");
        sb.append("    performanceReason: ").append(toIndentedString(performanceReason)).append("\n");
        sb.append("    performanceScore: ").append(toIndentedString(performanceScore)).append("\n");
        sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    resourcesPenalty: ").append(toIndentedString(resourcesPenalty)).append("\n");
        sb.append("    resourcesReason: ").append(toIndentedString(resourcesReason)).append("\n");
        sb.append("    securityPenalty: ").append(toIndentedString(securityPenalty)).append("\n");
        sb.append("    securityReason: ").append(toIndentedString(securityReason)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    subResourcePrefix: ").append(toIndentedString(subResourcePrefix)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

