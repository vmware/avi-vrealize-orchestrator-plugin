package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ObjectAccessPolicyRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * ObjectAccessPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ObjectAccessPolicy")
@VsoFinder(name = Constants.FINDER_VRO_OBJECTACCESSPOLICY, idAccessor = "getObjectID()")
@Service
public class ObjectAccessPolicy extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rules")
  @Valid
  private List<ObjectAccessPolicyRule> rules = new ArrayList<ObjectAccessPolicyRule>();

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Name of the Object Access Policy. Field introduced in 18.2.7, 20.1.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the Object Access Policy. Field introduced in 18.2.7, 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public ObjectAccessPolicy addRulesItem(ObjectAccessPolicyRule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }
  
  /**
   * Rules which grant access to specific objects. Field introduced in 18.2.7, 20.1.1.
   * @return rules
  **/
  @ApiModelProperty(required = true, value = "Rules which grant access to specific objects. Field introduced in 18.2.7, 20.1.1.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public List<ObjectAccessPolicyRule> getRules() {
    return rules;
  }
    
  @VsoMethod
  public void setRules(List<ObjectAccessPolicyRule> rules) {
    this.rules = rules;
  }

  
  /**
   * Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 18.2.7, 20.1.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = "Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 18.2.7, 20.1.1.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Uuid of the Object Access Policy. Field introduced in 18.2.7, 20.1.1.
   * @return uuid
  **/
  @ApiModelProperty(value = "Uuid of the Object Access Policy. Field introduced in 18.2.7, 20.1.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ObjectAccessPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectAccessPolicy objectAccessPolicy = (ObjectAccessPolicy) o;
    return Objects.equals(this.lastModified, objectAccessPolicy.lastModified) &&
        Objects.equals(this.name, objectAccessPolicy.name) &&
        Objects.equals(this.rules, objectAccessPolicy.rules) &&
        Objects.equals(this.tenantRef, objectAccessPolicy.tenantRef) &&
        Objects.equals(this.url, objectAccessPolicy.url) &&
        Objects.equals(this.uuid, objectAccessPolicy.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, name, rules, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectAccessPolicy {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

