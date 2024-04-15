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
 * The BotConfigClientBehavior is a POJO class extends AviRestResource that used for creating
 * BotConfigClientBehavior.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotConfigClientBehavior")
@VsoFinder(name = Constants.FINDER_VRO_BOTCONFIGCLIENTBEHAVIOR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotConfigClientBehavior extends AviRestResource {
    @JsonProperty("bad_request_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer badRequestPercent = 20;

    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = false;

    @JsonProperty("minimum_requests")
    @JsonInclude(Include.NON_NULL)
    private Integer minimumRequests = 3;

    @JsonProperty("minimum_requests_with_referer")
    @JsonInclude(Include.NON_NULL)
    private Integer minimumRequestsWithReferer = 1;



  /**
   * This is the getter method this will return the attribute value.
   * Minimum percentage of bad requests for the client behavior component to identify as a bot.
   * Allowed values are 1-100.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return badRequestPercent
   */
  @VsoMethod
  public Integer getBadRequestPercent() {
    return badRequestPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum percentage of bad requests for the client behavior component to identify as a bot.
   * Allowed values are 1-100.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param badRequestPercent set the badRequestPercent.
   */
  @VsoMethod
  public void setBadRequestPercent(Integer  badRequestPercent) {
    this.badRequestPercent = badRequestPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Whether client behavior based bot detection is enabled.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Whether client behavior based bot detection is enabled.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum requests for the client behavior component to make a decision.
   * Allowed values are 2-1000.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return minimumRequests
   */
  @VsoMethod
  public Integer getMinimumRequests() {
    return minimumRequests;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum requests for the client behavior component to make a decision.
   * Allowed values are 2-1000.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param minimumRequests set the minimumRequests.
   */
  @VsoMethod
  public void setMinimumRequests(Integer  minimumRequests) {
    this.minimumRequests = minimumRequests;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum requests with a referer header for the client behavior component to not identify as a bot.
   * Setting this to zero means the component never identifies a client as bot based on missing referer headers.
   * Allowed values are 0-100.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return minimumRequestsWithReferer
   */
  @VsoMethod
  public Integer getMinimumRequestsWithReferer() {
    return minimumRequestsWithReferer;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum requests with a referer header for the client behavior component to not identify as a bot.
   * Setting this to zero means the component never identifies a client as bot based on missing referer headers.
   * Allowed values are 0-100.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param minimumRequestsWithReferer set the minimumRequestsWithReferer.
   */
  @VsoMethod
  public void setMinimumRequestsWithReferer(Integer  minimumRequestsWithReferer) {
    this.minimumRequestsWithReferer = minimumRequestsWithReferer;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BotConfigClientBehavior objBotConfigClientBehavior = (BotConfigClientBehavior) o;
  return   Objects.equals(this.enabled, objBotConfigClientBehavior.enabled)&&
  Objects.equals(this.minimumRequests, objBotConfigClientBehavior.minimumRequests)&&
  Objects.equals(this.minimumRequestsWithReferer, objBotConfigClientBehavior.minimumRequestsWithReferer)&&
  Objects.equals(this.badRequestPercent, objBotConfigClientBehavior.badRequestPercent);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotConfigClientBehavior {\n");
      sb.append("    badRequestPercent: ").append(toIndentedString(badRequestPercent)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    minimumRequests: ").append(toIndentedString(minimumRequests)).append("\n");
        sb.append("    minimumRequestsWithReferer: ").append(toIndentedString(minimumRequestsWithReferer)).append("\n");
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

