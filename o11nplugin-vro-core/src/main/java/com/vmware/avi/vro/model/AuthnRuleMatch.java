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
 * The AuthnRuleMatch is a POJO class extends AviRestResource that used for creating
 * AuthnRuleMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AuthnRuleMatch")
@VsoFinder(name = Constants.FINDER_VRO_AUTHNRULEMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AuthnRuleMatch extends AviRestResource {
    @JsonProperty("rule_action")
    @JsonInclude(Include.NON_NULL)
    private String ruleAction;

    @JsonProperty("rule_name")
    @JsonInclude(Include.NON_NULL)
    private String ruleName;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the executed authentication rule action.
   * Enum options - SKIP_AUTHENTICATION, USE_DEFAULT_AUTHENTICATION.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleAction
   */
  @VsoMethod
  public String getRuleAction() {
    return ruleAction;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the executed authentication rule action.
   * Enum options - SKIP_AUTHENTICATION, USE_DEFAULT_AUTHENTICATION.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ruleAction set the ruleAction.
   */
  @VsoMethod
  public void setRuleAction(String  ruleAction) {
    this.ruleAction = ruleAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the matched authentication rule.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleName
   */
  @VsoMethod
  public String getRuleName() {
    return ruleName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the matched authentication rule.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
  AuthnRuleMatch objAuthnRuleMatch = (AuthnRuleMatch) o;
  return   Objects.equals(this.ruleName, objAuthnRuleMatch.ruleName)&&
  Objects.equals(this.ruleAction, objAuthnRuleMatch.ruleAction);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AuthnRuleMatch {\n");
      sb.append("    ruleAction: ").append(toIndentedString(ruleAction)).append("\n");
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

