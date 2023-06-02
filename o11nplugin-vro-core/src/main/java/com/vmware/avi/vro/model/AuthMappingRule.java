package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AuthMatchAttribute;
import com.vmware.avi.vro.model.AuthMatchGroupMembership;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AuthMappingRule is a POJO class extends AviRestResource that used for creating
 * AuthMappingRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AuthMappingRule")
@VsoFinder(name = Constants.FINDER_VRO_AUTHMAPPINGRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AuthMappingRule extends AviRestResource {
    @JsonProperty("assign_policy")
    @JsonInclude(Include.NON_NULL)
    private String assignPolicy = null;

    @JsonProperty("assign_role")
    @JsonInclude(Include.NON_NULL)
    private String assignRole = null;

    @JsonProperty("assign_tenant")
    @JsonInclude(Include.NON_NULL)
    private String assignTenant = null;

    @JsonProperty("assign_userprofile")
    @JsonInclude(Include.NON_NULL)
    private String assignUserprofile = null;

    @JsonProperty("attribute_match")
    @JsonInclude(Include.NON_NULL)
    private AuthMatchAttribute attributeMatch = null;

    @JsonProperty("default_tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String defaultTenantRef = null;

    @JsonProperty("group_match")
    @JsonInclude(Include.NON_NULL)
    private AuthMatchGroupMembership groupMatch = null;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index = null;

    @JsonProperty("is_superuser")
    @JsonInclude(Include.NON_NULL)
    private Boolean isSuperuser = null;

    @JsonProperty("policy_attribute_name")
    @JsonInclude(Include.NON_NULL)
    private String policyAttributeName = null;

    @JsonProperty("role_attribute_name")
    @JsonInclude(Include.NON_NULL)
    private String roleAttributeName = null;

    @JsonProperty("role_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> roleRefs = null;

    @JsonProperty("tenant_attribute_name")
    @JsonInclude(Include.NON_NULL)
    private String tenantAttributeName = null;

    @JsonProperty("tenant_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> tenantRefs = null;

    @JsonProperty("userprofile_attribute_name")
    @JsonInclude(Include.NON_NULL)
    private String userprofileAttributeName = null;

    @JsonProperty("userprofile_ref")
    @JsonInclude(Include.NON_NULL)
    private String userprofileRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Assignment rule for the object access policy.
   * Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX,
   * ASSIGN_MATCHING_ATTRIBUTE_REGEX, ASSIGN_CONFIG_CONTAINS_ATTRIBUTE_VALUE.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return assignPolicy
   */
  @VsoMethod
  public String getAssignPolicy() {
    return assignPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Assignment rule for the object access policy.
   * Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX,
   * ASSIGN_MATCHING_ATTRIBUTE_REGEX, ASSIGN_CONFIG_CONTAINS_ATTRIBUTE_VALUE.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param assignPolicy set the assignPolicy.
   */
  @VsoMethod
  public void setAssignPolicy(String  assignPolicy) {
    this.assignPolicy = assignPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX,
   * ASSIGN_MATCHING_ATTRIBUTE_REGEX, ASSIGN_CONFIG_CONTAINS_ATTRIBUTE_VALUE.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return assignRole
   */
  @VsoMethod
  public String getAssignRole() {
    return assignRole;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX,
   * ASSIGN_MATCHING_ATTRIBUTE_REGEX, ASSIGN_CONFIG_CONTAINS_ATTRIBUTE_VALUE.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param assignRole set the assignRole.
   */
  @VsoMethod
  public void setAssignRole(String  assignRole) {
    this.assignRole = assignRole;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX,
   * ASSIGN_MATCHING_ATTRIBUTE_REGEX, ASSIGN_CONFIG_CONTAINS_ATTRIBUTE_VALUE.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return assignTenant
   */
  @VsoMethod
  public String getAssignTenant() {
    return assignTenant;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX,
   * ASSIGN_MATCHING_ATTRIBUTE_REGEX, ASSIGN_CONFIG_CONTAINS_ATTRIBUTE_VALUE.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param assignTenant set the assignTenant.
   */
  @VsoMethod
  public void setAssignTenant(String  assignTenant) {
    this.assignTenant = assignTenant;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Assignment rule for the user account profile.
   * Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX,
   * ASSIGN_MATCHING_ATTRIBUTE_REGEX, ASSIGN_CONFIG_CONTAINS_ATTRIBUTE_VALUE.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return assignUserprofile
   */
  @VsoMethod
  public String getAssignUserprofile() {
    return assignUserprofile;
  }

  /**
   * This is the setter method to the attribute.
   * Assignment rule for the user account profile.
   * Enum options - ASSIGN_ALL, ASSIGN_FROM_SELECT_LIST, ASSIGN_MATCHING_GROUP_NAME, ASSIGN_MATCHING_ATTRIBUTE_VALUE, ASSIGN_MATCHING_GROUP_REGEX,
   * ASSIGN_MATCHING_ATTRIBUTE_REGEX, ASSIGN_CONFIG_CONTAINS_ATTRIBUTE_VALUE.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param assignUserprofile set the assignUserprofile.
   */
  @VsoMethod
  public void setAssignUserprofile(String  assignUserprofile) {
    this.assignUserprofile = assignUserprofile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attributeMatch
   */
  @VsoMethod
  public AuthMatchAttribute getAttributeMatch() {
    return attributeMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param attributeMatch set the attributeMatch.
   */
  @VsoMethod
  public void setAttributeMatch(AuthMatchAttribute attributeMatch) {
    this.attributeMatch = attributeMatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default tenant ref to assign to user.
   * It is a reference to an object of type tenant.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return defaultTenantRef
   */
  @VsoMethod
  public String getDefaultTenantRef() {
    return defaultTenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Default tenant ref to assign to user.
   * It is a reference to an object of type tenant.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param defaultTenantRef set the defaultTenantRef.
   */
  @VsoMethod
  public void setDefaultTenantRef(String  defaultTenantRef) {
    this.defaultTenantRef = defaultTenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groupMatch
   */
  @VsoMethod
  public AuthMatchGroupMembership getGroupMatch() {
    return groupMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param groupMatch set the groupMatch.
   */
  @VsoMethod
  public void setGroupMatch(AuthMatchGroupMembership groupMatch) {
    this.groupMatch = groupMatch;
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return isSuperuser
   */
  @VsoMethod
  public Boolean getIsSuperuser() {
    return isSuperuser;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param isSuperuser set the isSuperuser.
   */
  @VsoMethod
  public void setIsSuperuser(Boolean  isSuperuser) {
    this.isSuperuser = isSuperuser;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Attribute name for object access policy assignment.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return policyAttributeName
   */
  @VsoMethod
  public String getPolicyAttributeName() {
    return policyAttributeName;
  }

  /**
   * This is the setter method to the attribute.
   * Attribute name for object access policy assignment.
   * Field introduced in 18.2.7, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param policyAttributeName set the policyAttributeName.
   */
  @VsoMethod
  public void setPolicyAttributeName(String  policyAttributeName) {
    this.policyAttributeName = policyAttributeName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return roleAttributeName
   */
  @VsoMethod
  public String getRoleAttributeName() {
    return roleAttributeName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param roleAttributeName set the roleAttributeName.
   */
  @VsoMethod
  public void setRoleAttributeName(String  roleAttributeName) {
    this.roleAttributeName = roleAttributeName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type role.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return roleRefs
   */
  @VsoMethod
  public List<String> getRoleRefs() {
    return roleRefs;
  }

  /**
   * This is the setter method. this will set the roleRefs
   * It is a reference to an object of type role.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return roleRefs
   */
  @VsoMethod
  public void setRoleRefs(List<String>  roleRefs) {
    this.roleRefs = roleRefs;
  }

  /**
   * This is the setter method this will set the roleRefs
   * It is a reference to an object of type role.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return roleRefs
   */
  @VsoMethod
  public AuthMappingRule addRoleRefsItem(String roleRefsItem) {
    if (this.roleRefs == null) {
      this.roleRefs = new ArrayList<String>();
    }
    this.roleRefs.add(roleRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantAttributeName
   */
  @VsoMethod
  public String getTenantAttributeName() {
    return tenantAttributeName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantAttributeName set the tenantAttributeName.
   */
  @VsoMethod
  public void setTenantAttributeName(String  tenantAttributeName) {
    this.tenantAttributeName = tenantAttributeName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRefs
   */
  @VsoMethod
  public List<String> getTenantRefs() {
    return tenantRefs;
  }

  /**
   * This is the setter method. this will set the tenantRefs
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRefs
   */
  @VsoMethod
  public void setTenantRefs(List<String>  tenantRefs) {
    this.tenantRefs = tenantRefs;
  }

  /**
   * This is the setter method this will set the tenantRefs
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRefs
   */
  @VsoMethod
  public AuthMappingRule addTenantRefsItem(String tenantRefsItem) {
    if (this.tenantRefs == null) {
      this.tenantRefs = new ArrayList<String>();
    }
    this.tenantRefs.add(tenantRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Attribute name for user account profile assignment.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userprofileAttributeName
   */
  @VsoMethod
  public String getUserprofileAttributeName() {
    return userprofileAttributeName;
  }

  /**
   * This is the setter method to the attribute.
   * Attribute name for user account profile assignment.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param userprofileAttributeName set the userprofileAttributeName.
   */
  @VsoMethod
  public void setUserprofileAttributeName(String  userprofileAttributeName) {
    this.userprofileAttributeName = userprofileAttributeName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User account profile to assign to user on successful match.
   * It is a reference to an object of type useraccountprofile.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userprofileRef
   */
  @VsoMethod
  public String getUserprofileRef() {
    return userprofileRef;
  }

  /**
   * This is the setter method to the attribute.
   * User account profile to assign to user on successful match.
   * It is a reference to an object of type useraccountprofile.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param userprofileRef set the userprofileRef.
   */
  @VsoMethod
  public void setUserprofileRef(String  userprofileRef) {
    this.userprofileRef = userprofileRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AuthMappingRule objAuthMappingRule = (AuthMappingRule) o;
  return   Objects.equals(this.index, objAuthMappingRule.index)&&
  Objects.equals(this.groupMatch, objAuthMappingRule.groupMatch)&&
  Objects.equals(this.attributeMatch, objAuthMappingRule.attributeMatch)&&
  Objects.equals(this.assignTenant, objAuthMappingRule.assignTenant)&&
  Objects.equals(this.tenantAttributeName, objAuthMappingRule.tenantAttributeName)&&
  Objects.equals(this.tenantRefs, objAuthMappingRule.tenantRefs)&&
  Objects.equals(this.assignRole, objAuthMappingRule.assignRole)&&
  Objects.equals(this.roleAttributeName, objAuthMappingRule.roleAttributeName)&&
  Objects.equals(this.roleRefs, objAuthMappingRule.roleRefs)&&
  Objects.equals(this.isSuperuser, objAuthMappingRule.isSuperuser)&&
  Objects.equals(this.assignPolicy, objAuthMappingRule.assignPolicy)&&
  Objects.equals(this.policyAttributeName, objAuthMappingRule.policyAttributeName)&&
  Objects.equals(this.assignUserprofile, objAuthMappingRule.assignUserprofile)&&
  Objects.equals(this.userprofileAttributeName, objAuthMappingRule.userprofileAttributeName)&&
  Objects.equals(this.userprofileRef, objAuthMappingRule.userprofileRef)&&
  Objects.equals(this.defaultTenantRef, objAuthMappingRule.defaultTenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AuthMappingRule {\n");
      sb.append("    assignPolicy: ").append(toIndentedString(assignPolicy)).append("\n");
        sb.append("    assignRole: ").append(toIndentedString(assignRole)).append("\n");
        sb.append("    assignTenant: ").append(toIndentedString(assignTenant)).append("\n");
        sb.append("    assignUserprofile: ").append(toIndentedString(assignUserprofile)).append("\n");
        sb.append("    attributeMatch: ").append(toIndentedString(attributeMatch)).append("\n");
        sb.append("    defaultTenantRef: ").append(toIndentedString(defaultTenantRef)).append("\n");
        sb.append("    groupMatch: ").append(toIndentedString(groupMatch)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    isSuperuser: ").append(toIndentedString(isSuperuser)).append("\n");
        sb.append("    policyAttributeName: ").append(toIndentedString(policyAttributeName)).append("\n");
        sb.append("    roleAttributeName: ").append(toIndentedString(roleAttributeName)).append("\n");
        sb.append("    roleRefs: ").append(toIndentedString(roleRefs)).append("\n");
        sb.append("    tenantAttributeName: ").append(toIndentedString(tenantAttributeName)).append("\n");
        sb.append("    tenantRefs: ").append(toIndentedString(tenantRefs)).append("\n");
        sb.append("    userprofileAttributeName: ").append(toIndentedString(userprofileAttributeName)).append("\n");
        sb.append("    userprofileRef: ").append(toIndentedString(userprofileRef)).append("\n");
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

