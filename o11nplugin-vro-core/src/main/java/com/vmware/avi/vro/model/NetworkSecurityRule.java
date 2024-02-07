package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.NetworkSecurityMatchTarget;
import com.vmware.avi.vro.model.NetworkSecurityPolicyActionRLParam;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The NetworkSecurityRule is a POJO class extends AviRestResource that used for creating
 * NetworkSecurityRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NetworkSecurityRule")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKSECURITYRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NetworkSecurityRule extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private String action;

    @JsonProperty("age")
    @JsonInclude(Include.NON_NULL)
    private Integer age = 0;

    @JsonProperty("created_by")
    @JsonInclude(Include.NON_NULL)
    private String createdBy;

    @JsonProperty("enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean enable;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index;

    @JsonProperty("log")
    @JsonInclude(Include.NON_NULL)
    private Boolean log = false;

    @JsonProperty("match")
    @JsonInclude(Include.NON_NULL)
    private NetworkSecurityMatchTarget match;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("rl_param")
    @JsonInclude(Include.NON_NULL)
    private NetworkSecurityPolicyActionRLParam rlParam;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - NETWORK_SECURITY_POLICY_ACTION_TYPE_ALLOW, NETWORK_SECURITY_POLICY_ACTION_TYPE_DENY,
   * NETWORK_SECURITY_POLICY_ACTION_TYPE_RATE_LIMIT.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- network_security_policy_action_type_deny), basic edition(allowed
   * values- network_security_policy_action_type_deny), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - NETWORK_SECURITY_POLICY_ACTION_TYPE_ALLOW, NETWORK_SECURITY_POLICY_ACTION_TYPE_DENY,
   * NETWORK_SECURITY_POLICY_ACTION_TYPE_RATE_LIMIT.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- network_security_policy_action_type_deny), basic edition(allowed
   * values- network_security_policy_action_type_deny), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time in minutes after which rule will be deleted.
   * Allowed values are 1-4294967295.
   * Special values are 0- blocked for ever.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return age
   */
  @VsoMethod
  public Integer getAge() {
    return age;
  }

  /**
   * This is the setter method to the attribute.
   * Time in minutes after which rule will be deleted.
   * Allowed values are 1-4294967295.
   * Special values are 0- blocked for ever.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param age set the age.
   */
  @VsoMethod
  public void setAge(Integer  age) {
    this.age = age;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Creator name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return createdBy
   */
  @VsoMethod
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * This is the setter method to the attribute.
   * Creator name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param createdBy set the createdBy.
   */
  @VsoMethod
  public void setCreatedBy(String  createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return log
   */
  @VsoMethod
  public Boolean getLog() {
    return log;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param log set the log.
   */
  @VsoMethod
  public void setLog(Boolean  log) {
    this.log = log;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return match
   */
  @VsoMethod
  public NetworkSecurityMatchTarget getMatch() {
    return match;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param match set the match.
   */
  @VsoMethod
  public void setMatch(NetworkSecurityMatchTarget match) {
    this.match = match;
  }

  /**
   * This is the getter method this will return the attribute value.
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
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rlParam
   */
  @VsoMethod
  public NetworkSecurityPolicyActionRLParam getRlParam() {
    return rlParam;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rlParam set the rlParam.
   */
  @VsoMethod
  public void setRlParam(NetworkSecurityPolicyActionRLParam rlParam) {
    this.rlParam = rlParam;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NetworkSecurityRule objNetworkSecurityRule = (NetworkSecurityRule) o;
  return   Objects.equals(this.name, objNetworkSecurityRule.name)&&
  Objects.equals(this.index, objNetworkSecurityRule.index)&&
  Objects.equals(this.enable, objNetworkSecurityRule.enable)&&
  Objects.equals(this.match, objNetworkSecurityRule.match)&&
  Objects.equals(this.action, objNetworkSecurityRule.action)&&
  Objects.equals(this.log, objNetworkSecurityRule.log)&&
  Objects.equals(this.rlParam, objNetworkSecurityRule.rlParam)&&
  Objects.equals(this.age, objNetworkSecurityRule.age)&&
  Objects.equals(this.createdBy, objNetworkSecurityRule.createdBy);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NetworkSecurityRule {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rlParam: ").append(toIndentedString(rlParam)).append("\n");
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

