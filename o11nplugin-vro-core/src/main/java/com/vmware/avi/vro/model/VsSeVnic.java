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
 * The VsSeVnic is a POJO class extends AviRestResource that used for creating
 * VsSeVnic.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsSeVnic")
@VsoFinder(name = Constants.FINDER_VRO_VSSEVNIC)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsSeVnic extends AviRestResource {
    @JsonProperty("lif")
    @JsonInclude(Include.NON_NULL)
    private String lif;

    @JsonProperty("mac")
    @JsonInclude(Include.NON_NULL)
    private String mac;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lif
   */
  @VsoMethod
  public String getLif() {
    return lif;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lif set the lif.
   */
  @VsoMethod
  public void setLif(String  lif) {
    this.lif = lif;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mac
   */
  @VsoMethod
  public String getMac() {
    return mac;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mac set the mac.
   */
  @VsoMethod
  public void setMac(String  mac) {
    this.mac = mac;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VNIC_TYPE_FE, VNIC_TYPE_BE.
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
   * Enum options - VNIC_TYPE_FE, VNIC_TYPE_BE.
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
  VsSeVnic objVsSeVnic = (VsSeVnic) o;
  return   Objects.equals(this.mac, objVsSeVnic.mac)&&
  Objects.equals(this.type, objVsSeVnic.type)&&
  Objects.equals(this.lif, objVsSeVnic.lif);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VsSeVnic {\n");
      sb.append("    lif: ").append(toIndentedString(lif)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
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

