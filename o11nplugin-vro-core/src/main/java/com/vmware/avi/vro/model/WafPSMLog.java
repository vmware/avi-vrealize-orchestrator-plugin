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
 * The WafPSMLog is a POJO class extends AviRestResource that used for creating
 * WafPSMLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafPSMLog")
@VsoFinder(name = Constants.FINDER_VRO_WAFPSMLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafPSMLog extends AviRestResource {
    @JsonProperty("actions")
    @JsonInclude(Include.NON_NULL)
    private List<String> actions;

    @JsonProperty("group_name")
    @JsonInclude(Include.NON_NULL)
    private String groupName;

    @JsonProperty("group_uuid")
    @JsonInclude(Include.NON_NULL)
    private String groupUuid;

    @JsonProperty("location")
    @JsonInclude(Include.NON_NULL)
    private String location;

    @JsonProperty("matches")
    @JsonInclude(Include.NON_NULL)
    private List<WafRuleMatchData> matches;

    @JsonProperty("rule_id")
    @JsonInclude(Include.NON_NULL)
    private String ruleId;

    @JsonProperty("rule_name")
    @JsonInclude(Include.NON_NULL)
    private String ruleName;



  /**
   * This is the getter method this will return the attribute value.
   * Actions generated by this rule.
   * Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public List<String> getActions() {
    return actions;
  }

  /**
   * This is the setter method. this will set the actions
   * Actions generated by this rule.
   * Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public void setActions(List<String>  actions) {
    this.actions = actions;
  }

  /**
   * This is the setter method this will set the actions
   * Actions generated by this rule.
   * Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public WafPSMLog addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the psm group.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groupName
   */
  @VsoMethod
  public String getGroupName() {
    return groupName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the psm group.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param groupName set the groupName.
   */
  @VsoMethod
  public void setGroupName(String  groupName) {
    this.groupName = groupName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the psm group.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groupUuid
   */
  @VsoMethod
  public String getGroupUuid() {
    return groupUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the psm group.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param groupUuid set the groupUuid.
   */
  @VsoMethod
  public void setGroupUuid(String  groupUuid) {
    this.groupUuid = groupUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the psm location.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return location
   */
  @VsoMethod
  public String getLocation() {
    return location;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the psm location.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param location set the location.
   */
  @VsoMethod
  public void setLocation(String  location) {
    this.location = location;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Transaction data that matched the rule.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matches
   */
  @VsoMethod
  public List<WafRuleMatchData> getMatches() {
    return matches;
  }

  /**
   * This is the setter method. this will set the matches
   * Transaction data that matched the rule.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matches
   */
  @VsoMethod
  public void setMatches(List<WafRuleMatchData>  matches) {
    this.matches = matches;
  }

  /**
   * This is the setter method this will set the matches
   * Transaction data that matched the rule.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matches
   */
  @VsoMethod
  public WafPSMLog addMatchesItem(WafRuleMatchData matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<WafRuleMatchData>();
    }
    this.matches.add(matchesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Rule id of the matching rule.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleId
   */
  @VsoMethod
  public String getRuleId() {
    return ruleId;
  }

  /**
   * This is the setter method to the attribute.
   * Rule id of the matching rule.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ruleId set the ruleId.
   */
  @VsoMethod
  public void setRuleId(String  ruleId) {
    this.ruleId = ruleId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the matching rule.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleName
   */
  @VsoMethod
  public String getRuleName() {
    return ruleName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the matching rule.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ruleName set the ruleName.
   */
  @VsoMethod
  public void setRuleName(String  ruleName) {
    this.ruleName = ruleName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafPSMLog objWafPSMLog = (WafPSMLog) o;
  return   Objects.equals(this.groupUuid, objWafPSMLog.groupUuid)&&
  Objects.equals(this.groupName, objWafPSMLog.groupName)&&
  Objects.equals(this.location, objWafPSMLog.location)&&
  Objects.equals(this.ruleId, objWafPSMLog.ruleId)&&
  Objects.equals(this.ruleName, objWafPSMLog.ruleName)&&
  Objects.equals(this.matches, objWafPSMLog.matches)&&
  Objects.equals(this.actions, objWafPSMLog.actions);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafPSMLog {\n");
      sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupUuid: ").append(toIndentedString(groupUuid)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
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

