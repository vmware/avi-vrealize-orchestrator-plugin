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
 * The VinfraCntlrHostUnreachableList is a POJO class extends AviRestResource that used for creating
 * VinfraCntlrHostUnreachableList.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VinfraCntlrHostUnreachableList")
@VsoFinder(name = Constants.FINDER_VRO_VINFRACNTLRHOSTUNREACHABLELIST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VinfraCntlrHostUnreachableList extends AviRestResource {
    @JsonProperty("host_name")
    @JsonInclude(Include.NON_NULL)
    private List<String> hostName = null;

    @JsonProperty("vcenter")
    @JsonInclude(Include.NON_NULL)
    private String vcenter = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostName
   */
  @VsoMethod
  public List<String> getHostName() {
    return hostName;
  }

  /**
   * This is the setter method. this will set the hostName
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostName
   */
  @VsoMethod
  public void setHostName(List<String>  hostName) {
    this.hostName = hostName;
  }

  /**
   * This is the setter method this will set the hostName
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostName
   */
  @VsoMethod
  public VinfraCntlrHostUnreachableList addHostNameItem(String hostNameItem) {
    if (this.hostName == null) {
      this.hostName = new ArrayList<String>();
    }
    this.hostName.add(hostNameItem);
    return this;
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



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VinfraCntlrHostUnreachableList objVinfraCntlrHostUnreachableList = (VinfraCntlrHostUnreachableList) o;
  return   Objects.equals(this.vcenter, objVinfraCntlrHostUnreachableList.vcenter)&&
  Objects.equals(this.hostName, objVinfraCntlrHostUnreachableList.hostName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VinfraCntlrHostUnreachableList {\n");
      sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    vcenter: ").append(toIndentedString(vcenter)).append("\n");
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

