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
 * The ConfigUserAuthrzByRule is a POJO class extends AviRestResource that used for creating
 * ConfigUserAuthrzByRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConfigUserAuthrzByRule")
@VsoFinder(name = Constants.FINDER_VRO_CONFIGUSERAUTHRZBYRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConfigUserAuthrzByRule extends AviRestResource {
    @JsonProperty("policies")
    @JsonInclude(Include.NON_NULL)
    private String policies = null;

    @JsonProperty("roles")
    @JsonInclude(Include.NON_NULL)
    private String roles = null;

    @JsonProperty("rule")
    @JsonInclude(Include.NON_NULL)
    private String rule = null;

    @JsonProperty("tenants")
    @JsonInclude(Include.NON_NULL)
    private String tenants = null;

    @JsonProperty("user")
    @JsonInclude(Include.NON_NULL)
    private String user = null;

    @JsonProperty("userprofile")
    @JsonInclude(Include.NON_NULL)
    private String userprofile = null;



  /**
   * This is the getter method this will return the attribute value.
   * Comma separated list of policies assigned to the user.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return policies
   */
  @VsoMethod
  public String getPolicies() {
    return policies;
  }

  /**
   * This is the setter method to the attribute.
   * Comma separated list of policies assigned to the user.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param policies set the policies.
   */
  @VsoMethod
  public void setPolicies(String  policies) {
    this.policies = policies;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Assigned roles.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return roles
   */
  @VsoMethod
  public String getRoles() {
    return roles;
  }

  /**
   * This is the setter method to the attribute.
   * Assigned roles.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param roles set the roles.
   */
  @VsoMethod
  public void setRoles(String  roles) {
    this.roles = roles;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Matching rule string.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rule
   */
  @VsoMethod
  public String getRule() {
    return rule;
  }

  /**
   * This is the setter method to the attribute.
   * Matching rule string.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rule set the rule.
   */
  @VsoMethod
  public void setRule(String  rule) {
    this.rule = rule;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Assigned tenants.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenants
   */
  @VsoMethod
  public String getTenants() {
    return tenants;
  }

  /**
   * This is the setter method to the attribute.
   * Assigned tenants.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenants set the tenants.
   */
  @VsoMethod
  public void setTenants(String  tenants) {
    this.tenants = tenants;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request user.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return user
   */
  @VsoMethod
  public String getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * Request user.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param user set the user.
   */
  @VsoMethod
  public void setUser(String  user) {
    this.user = user;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Assigned user account profile name.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userprofile
   */
  @VsoMethod
  public String getUserprofile() {
    return userprofile;
  }

  /**
   * This is the setter method to the attribute.
   * Assigned user account profile name.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param userprofile set the userprofile.
   */
  @VsoMethod
  public void setUserprofile(String  userprofile) {
    this.userprofile = userprofile;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConfigUserAuthrzByRule objConfigUserAuthrzByRule = (ConfigUserAuthrzByRule) o;
  return   Objects.equals(this.user, objConfigUserAuthrzByRule.user)&&
  Objects.equals(this.rule, objConfigUserAuthrzByRule.rule)&&
  Objects.equals(this.roles, objConfigUserAuthrzByRule.roles)&&
  Objects.equals(this.tenants, objConfigUserAuthrzByRule.tenants)&&
  Objects.equals(this.policies, objConfigUserAuthrzByRule.policies)&&
  Objects.equals(this.userprofile, objConfigUserAuthrzByRule.userprofile);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConfigUserAuthrzByRule {\n");
      sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    userprofile: ").append(toIndentedString(userprofile)).append("\n");
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

