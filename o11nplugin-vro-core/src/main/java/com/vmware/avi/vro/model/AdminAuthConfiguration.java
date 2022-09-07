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
 * The AdminAuthConfiguration is a POJO class extends AviRestResource that used for creating
 * AdminAuthConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AdminAuthConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_ADMINAUTHCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AdminAuthConfiguration extends AviRestResource {
    @JsonProperty("allow_local_user_login")
    @JsonInclude(Include.NON_NULL)
    private Boolean allowLocalUserLogin = true;

    @JsonProperty("alternate_auth_configurations")
    @JsonInclude(Include.NON_NULL)
    private List<AlternateAuthConfiguration> alternateAuthConfigurations;

    @JsonProperty("auth_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String authProfileRef;

    @JsonProperty("mapping_rules")
    @JsonInclude(Include.NON_NULL)
    private List<AuthMappingRule> mappingRules;

    @JsonProperty("remote_auth_configurations")
    @JsonInclude(Include.NON_NULL)
    private List<RemoteAuthConfiguration> remoteAuthConfigurations = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allow any user created locally to login with local credentials.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return allowLocalUserLogin
   */
  @VsoMethod
  public Boolean getAllowLocalUserLogin() {
    return allowLocalUserLogin;
  }

  /**
   * This is the setter method to the attribute.
   * Allow any user created locally to login with local credentials.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param allowLocalUserLogin set the allowLocalUserLogin.
   */
  @VsoMethod
  public void setAllowLocalUserLogin(Boolean  allowLocalUserLogin) {
    this.allowLocalUserLogin = allowLocalUserLogin;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Secondary authentication mechanisms to be used.
   * Field deprecated in 22.1.1.
   * Field introduced in 20.1.6.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * @return alternateAuthConfigurations
   */
  @VsoMethod
  public List<AlternateAuthConfiguration> getAlternateAuthConfigurations() {
    return alternateAuthConfigurations;
  }

  /**
   * This is the setter method. this will set the alternateAuthConfigurations
   * Secondary authentication mechanisms to be used.
   * Field deprecated in 22.1.1.
   * Field introduced in 20.1.6.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * @return alternateAuthConfigurations
   */
  @VsoMethod
  public void setAlternateAuthConfigurations(List<AlternateAuthConfiguration>  alternateAuthConfigurations) {
    this.alternateAuthConfigurations = alternateAuthConfigurations;
  }

  /**
   * This is the setter method this will set the alternateAuthConfigurations
   * Secondary authentication mechanisms to be used.
   * Field deprecated in 22.1.1.
   * Field introduced in 20.1.6.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * @return alternateAuthConfigurations
   */
  @VsoMethod
  public AdminAuthConfiguration addAlternateAuthConfigurationsItem(AlternateAuthConfiguration alternateAuthConfigurationsItem) {
    if (this.alternateAuthConfigurations == null) {
      this.alternateAuthConfigurations = new ArrayList<AlternateAuthConfiguration>();
    }
    this.alternateAuthConfigurations.add(alternateAuthConfigurationsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type authprofile.
   * Field deprecated in 22.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return authProfileRef
   */
  @VsoMethod
  public String getAuthProfileRef() {
    return authProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type authprofile.
   * Field deprecated in 22.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param authProfileRef set the authProfileRef.
   */
  @VsoMethod
  public void setAuthProfileRef(String  authProfileRef) {
    this.authProfileRef = authProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rules list for tenant or role mapping.
   * Field deprecated in 22.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return mappingRules
   */
  @VsoMethod
  public List<AuthMappingRule> getMappingRules() {
    return mappingRules;
  }

  /**
   * This is the setter method. this will set the mappingRules
   * Rules list for tenant or role mapping.
   * Field deprecated in 22.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return mappingRules
   */
  @VsoMethod
  public void setMappingRules(List<AuthMappingRule>  mappingRules) {
    this.mappingRules = mappingRules;
  }

  /**
   * This is the setter method this will set the mappingRules
   * Rules list for tenant or role mapping.
   * Field deprecated in 22.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return mappingRules
   */
  @VsoMethod
  public AdminAuthConfiguration addMappingRulesItem(AuthMappingRule mappingRulesItem) {
    if (this.mappingRules == null) {
      this.mappingRules = new ArrayList<AuthMappingRule>();
    }
    this.mappingRules.add(mappingRulesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Remote auth configurations.
   * Field introduced in 22.1.1.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteAuthConfigurations
   */
  @VsoMethod
  public List<RemoteAuthConfiguration> getRemoteAuthConfigurations() {
    return remoteAuthConfigurations;
  }

  /**
   * This is the setter method. this will set the remoteAuthConfigurations
   * Remote auth configurations.
   * Field introduced in 22.1.1.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteAuthConfigurations
   */
  @VsoMethod
  public void setRemoteAuthConfigurations(List<RemoteAuthConfiguration>  remoteAuthConfigurations) {
    this.remoteAuthConfigurations = remoteAuthConfigurations;
  }

  /**
   * This is the setter method this will set the remoteAuthConfigurations
   * Remote auth configurations.
   * Field introduced in 22.1.1.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteAuthConfigurations
   */
  @VsoMethod
  public AdminAuthConfiguration addRemoteAuthConfigurationsItem(RemoteAuthConfiguration remoteAuthConfigurationsItem) {
    if (this.remoteAuthConfigurations == null) {
      this.remoteAuthConfigurations = new ArrayList<RemoteAuthConfiguration>();
    }
    this.remoteAuthConfigurations.add(remoteAuthConfigurationsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AdminAuthConfiguration objAdminAuthConfiguration = (AdminAuthConfiguration) o;
  return   Objects.equals(this.authProfileRef, objAdminAuthConfiguration.authProfileRef)&&
  Objects.equals(this.mappingRules, objAdminAuthConfiguration.mappingRules)&&
  Objects.equals(this.allowLocalUserLogin, objAdminAuthConfiguration.allowLocalUserLogin)&&
  Objects.equals(this.alternateAuthConfigurations, objAdminAuthConfiguration.alternateAuthConfigurations)&&
  Objects.equals(this.remoteAuthConfigurations, objAdminAuthConfiguration.remoteAuthConfigurations);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AdminAuthConfiguration {\n");
      sb.append("    allowLocalUserLogin: ").append(toIndentedString(allowLocalUserLogin)).append("\n");
        sb.append("    alternateAuthConfigurations: ").append(toIndentedString(alternateAuthConfigurations)).append("\n");
        sb.append("    authProfileRef: ").append(toIndentedString(authProfileRef)).append("\n");
        sb.append("    mappingRules: ").append(toIndentedString(mappingRules)).append("\n");
        sb.append("    remoteAuthConfigurations: ").append(toIndentedString(remoteAuthConfigurations)).append("\n");
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

