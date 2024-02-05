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
 * The VinfraVcenterBadCredentials is a POJO class extends AviRestResource that used for creating
 * VinfraVcenterBadCredentials.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VinfraVcenterBadCredentials")
@VsoFinder(name = Constants.FINDER_VRO_VINFRAVCENTERBADCREDENTIALS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VinfraVcenterBadCredentials extends AviRestResource {
    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("previous_count")
    @JsonInclude(Include.NON_NULL)
    private Integer previousCount;

    @JsonProperty("user")
    @JsonInclude(Include.NON_NULL)
    private String user;

    @JsonProperty("vcenter")
    @JsonInclude(Include.NON_NULL)
    private String vcenter;

    @JsonProperty("vcenter_name")
    @JsonInclude(Include.NON_NULL)
    private String vcenterName;

    @JsonProperty("vcenter_object")
    @JsonInclude(Include.NON_NULL)
    private String vcenterObject;



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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previousCount
   */
  @VsoMethod
  public Integer getPreviousCount() {
    return previousCount;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param previousCount set the previousCount.
   */
  @VsoMethod
  public void setPreviousCount(Integer  previousCount) {
    this.previousCount = previousCount;
  }

  /**
   * This is the getter method this will return the attribute value.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenter
   */
  @VsoMethod
  public String getVcenter() {
    return vcenter;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenter set the vcenter.
   */
  @VsoMethod
  public void setVcenter(String  vcenter) {
    this.vcenter = vcenter;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterName
   */
  @VsoMethod
  public String getVcenterName() {
    return vcenterName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterName set the vcenterName.
   */
  @VsoMethod
  public void setVcenterName(String  vcenterName) {
    this.vcenterName = vcenterName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterObject
   */
  @VsoMethod
  public String getVcenterObject() {
    return vcenterObject;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterObject set the vcenterObject.
   */
  @VsoMethod
  public void setVcenterObject(String  vcenterObject) {
    this.vcenterObject = vcenterObject;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VinfraVcenterBadCredentials objVinfraVcenterBadCredentials = (VinfraVcenterBadCredentials) o;
  return   Objects.equals(this.vcenter, objVinfraVcenterBadCredentials.vcenter)&&
  Objects.equals(this.name, objVinfraVcenterBadCredentials.name)&&
  Objects.equals(this.vcenterName, objVinfraVcenterBadCredentials.vcenterName)&&
  Objects.equals(this.user, objVinfraVcenterBadCredentials.user)&&
  Objects.equals(this.vcenterObject, objVinfraVcenterBadCredentials.vcenterObject)&&
  Objects.equals(this.previousCount, objVinfraVcenterBadCredentials.previousCount);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VinfraVcenterBadCredentials {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    previousCount: ").append(toIndentedString(previousCount)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    vcenter: ").append(toIndentedString(vcenter)).append("\n");
        sb.append("    vcenterName: ").append(toIndentedString(vcenterName)).append("\n");
        sb.append("    vcenterObject: ").append(toIndentedString(vcenterObject)).append("\n");
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

