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
 * The SamlAuthzRuleMatch is a POJO class extends AviRestResource that used for creating
 * SamlAuthzRuleMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SamlAuthzRuleMatch")
@VsoFinder(name = Constants.FINDER_VRO_SAMLAUTHZRULEMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SamlAuthzRuleMatch extends AviRestResource {
    @JsonProperty("saml_authz_matched_rule_action")
    @JsonInclude(Include.NON_NULL)
    private String samlAuthzMatchedRuleAction;

    @JsonProperty("saml_authz_matched_rule_name")
    @JsonInclude(Include.NON_NULL)
    private String samlAuthzMatchedRuleName;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the executed saml authorization rule action.
   * Enum options - ALLOW_ACCESS, CLOSE_CONNECTION, HTTP_LOCAL_RESPONSE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlAuthzMatchedRuleAction
   */
  @VsoMethod
  public String getSamlAuthzMatchedRuleAction() {
    return samlAuthzMatchedRuleAction;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the executed saml authorization rule action.
   * Enum options - ALLOW_ACCESS, CLOSE_CONNECTION, HTTP_LOCAL_RESPONSE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param samlAuthzMatchedRuleAction set the samlAuthzMatchedRuleAction.
   */
  @VsoMethod
  public void setSamlAuthzMatchedRuleAction(String  samlAuthzMatchedRuleAction) {
    this.samlAuthzMatchedRuleAction = samlAuthzMatchedRuleAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the matched saml authorization rule.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlAuthzMatchedRuleName
   */
  @VsoMethod
  public String getSamlAuthzMatchedRuleName() {
    return samlAuthzMatchedRuleName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the matched saml authorization rule.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param samlAuthzMatchedRuleName set the samlAuthzMatchedRuleName.
   */
  @VsoMethod
  public void setSamlAuthzMatchedRuleName(String  samlAuthzMatchedRuleName) {
    this.samlAuthzMatchedRuleName = samlAuthzMatchedRuleName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SamlAuthzRuleMatch objSamlAuthzRuleMatch = (SamlAuthzRuleMatch) o;
  return   Objects.equals(this.samlAuthzMatchedRuleName, objSamlAuthzRuleMatch.samlAuthzMatchedRuleName)&&
  Objects.equals(this.samlAuthzMatchedRuleAction, objSamlAuthzRuleMatch.samlAuthzMatchedRuleAction);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SamlAuthzRuleMatch {\n");
      sb.append("    samlAuthzMatchedRuleAction: ").append(toIndentedString(samlAuthzMatchedRuleAction)).append("\n");
        sb.append("    samlAuthzMatchedRuleName: ").append(toIndentedString(samlAuthzMatchedRuleName)).append("\n");
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

