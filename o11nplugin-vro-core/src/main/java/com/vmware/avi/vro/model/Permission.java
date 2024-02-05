package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SubResource;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The Permission is a POJO class extends AviRestResource that used for creating
 * Permission.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Permission")
@VsoFinder(name = Constants.FINDER_VRO_PERMISSION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Permission extends AviRestResource {
    @JsonProperty("resource")
    @JsonInclude(Include.NON_NULL)
    private String resource;

    @JsonProperty("subresource")
    @JsonInclude(Include.NON_NULL)
    private SubResource subresource;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - PERMISSION_CONTROLLER, PERMISSION_INTERNAL, PERMISSION_VIRTUALSERVICE, PERMISSION_POOL, PERMISSION_HEALTHMONITOR,
   * PERMISSION_NETWORKPROFILE, PERMISSION_APPLICATIONPROFILE, PERMISSION_HTTPPOLICYSET, PERMISSION_IPADDRGROUP, PERMISSION_STRINGGROUP,
   * PERMISSION_SSLPROFILE, PERMISSION_SSLKEYANDCERTIFICATE, PERMISSION_NETWORKSECURITYPOLICY, PERMISSION_APPLICATIONPERSISTENCEPROFILE,
   * PERMISSION_ANALYTICSPROFILE, PERMISSION_VSDATASCRIPTSET, PERMISSION_TENANT, PERMISSION_PKIPROFILE, PERMISSION_AUTHPROFILE, PERMISSION_CLOUD...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resource
   */
  @VsoMethod
  public String getResource() {
    return resource;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - PERMISSION_CONTROLLER, PERMISSION_INTERNAL, PERMISSION_VIRTUALSERVICE, PERMISSION_POOL, PERMISSION_HEALTHMONITOR,
   * PERMISSION_NETWORKPROFILE, PERMISSION_APPLICATIONPROFILE, PERMISSION_HTTPPOLICYSET, PERMISSION_IPADDRGROUP, PERMISSION_STRINGGROUP,
   * PERMISSION_SSLPROFILE, PERMISSION_SSLKEYANDCERTIFICATE, PERMISSION_NETWORKSECURITYPOLICY, PERMISSION_APPLICATIONPERSISTENCEPROFILE,
   * PERMISSION_ANALYTICSPROFILE, PERMISSION_VSDATASCRIPTSET, PERMISSION_TENANT, PERMISSION_PKIPROFILE, PERMISSION_AUTHPROFILE, PERMISSION_CLOUD...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resource set the resource.
   */
  @VsoMethod
  public void setResource(String  resource) {
    this.resource = resource;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Limits the scope of write access on the parent resource to modification of only the specified subresources.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subresource
   */
  @VsoMethod
  public SubResource getSubresource() {
    return subresource;
  }

  /**
   * This is the setter method to the attribute.
   * Limits the scope of write access on the parent resource to modification of only the specified subresources.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subresource set the subresource.
   */
  @VsoMethod
  public void setSubresource(SubResource subresource) {
    this.subresource = subresource;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Permission objPermission = (Permission) o;
  return   Objects.equals(this.type, objPermission.type)&&
  Objects.equals(this.resource, objPermission.resource)&&
  Objects.equals(this.subresource, objPermission.subresource);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Permission {\n");
      sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

