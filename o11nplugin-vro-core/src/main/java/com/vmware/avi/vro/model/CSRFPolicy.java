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
 * The CSRFPolicy is a POJO class extends AviRestResource that used for creating
 * CSRFPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CSRFPolicy")
@VsoFinder(name = Constants.FINDER_VRO_CSRFPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CSRFPolicy extends AviRestResource {
    @JsonProperty("cookie_name")
    @JsonInclude(Include.NON_NULL)
    private String cookieName = "X-CSRF-TOKEN";

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("rules")
    @JsonInclude(Include.NON_NULL)
    private List<CSRFRule> rules;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("token_validity_time_min")
    @JsonInclude(Include.NON_NULL)
    private Integer tokenValidityTimeMin = 360;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the cookie to be used for csrf token.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "X-CSRF-TOKEN".
   * @return cookieName
   */
  @VsoMethod
  public String getCookieName() {
    return cookieName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the cookie to be used for csrf token.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "X-CSRF-TOKEN".
   * @param cookieName set the cookieName.
   */
  @VsoMethod
  public void setCookieName(String  cookieName) {
    this.cookieName = cookieName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Human-readable description of this csrf protection policy.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Human-readable description of this csrf protection policy.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of this csrf protection policy.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The name of this csrf protection policy.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rules to control which requests undergo csrf protection.if the client's request doesn't match with any rules matchtarget, bypass_csrf action is
   * applied.
   * Field introduced in 30.2.1.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public List<CSRFRule> getRules() {
    return rules;
  }

  /**
   * This is the setter method. this will set the rules
   * Rules to control which requests undergo csrf protection.if the client's request doesn't match with any rules matchtarget, bypass_csrf action is
   * applied.
   * Field introduced in 30.2.1.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public void setRules(List<CSRFRule>  rules) {
    this.rules = rules;
  }

  /**
   * This is the setter method this will set the rules
   * Rules to control which requests undergo csrf protection.if the client's request doesn't match with any rules matchtarget, bypass_csrf action is
   * applied.
   * Field introduced in 30.2.1.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rules
   */
  @VsoMethod
  public CSRFPolicy addRulesItem(CSRFRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<CSRFRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The unique identifier of the tenant to which this policy belongs.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * The unique identifier of the tenant to which this policy belongs.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Csrf token is rotated when this time expires.
   * Tokens will be acceptable for twice the token_validity_time time.
   * Allowed values are 10-1440.
   * Special values are 0- unlimited.
   * Field introduced in 30.2.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 360.
   * @return tokenValidityTimeMin
   */
  @VsoMethod
  public Integer getTokenValidityTimeMin() {
    return tokenValidityTimeMin;
  }

  /**
   * This is the setter method to the attribute.
   * Csrf token is rotated when this time expires.
   * Tokens will be acceptable for twice the token_validity_time time.
   * Allowed values are 10-1440.
   * Special values are 0- unlimited.
   * Field introduced in 30.2.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 360.
   * @param tokenValidityTimeMin set the tokenValidityTimeMin.
   */
  @VsoMethod
  public void setTokenValidityTimeMin(Integer  tokenValidityTimeMin) {
    this.tokenValidityTimeMin = tokenValidityTimeMin;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A unique identifier to this csrf protection policy.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * A unique identifier to this csrf protection policy.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CSRFPolicy objCSRFPolicy = (CSRFPolicy) o;
  return   Objects.equals(this.uuid, objCSRFPolicy.uuid)&&
  Objects.equals(this.tenantRef, objCSRFPolicy.tenantRef)&&
  Objects.equals(this.name, objCSRFPolicy.name)&&
  Objects.equals(this.description, objCSRFPolicy.description)&&
  Objects.equals(this.tokenValidityTimeMin, objCSRFPolicy.tokenValidityTimeMin)&&
  Objects.equals(this.rules, objCSRFPolicy.rules)&&
  Objects.equals(this.cookieName, objCSRFPolicy.cookieName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CSRFPolicy {\n");
      sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    tokenValidityTimeMin: ").append(toIndentedString(tokenValidityTimeMin)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

