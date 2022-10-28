package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ControllerInterface is a POJO class extends AviRestResource that used for creating
 * ControllerInterface.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerInterface")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERINTERFACE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerInterface extends AviRestResource {
    @JsonProperty("gateway")
    @JsonInclude(Include.NON_NULL)
    private IpAddr gateway = null;

    @JsonProperty("gateway6")
    @JsonInclude(Include.NON_NULL)
    private IpAddr gateway6 = null;

    @JsonProperty("if_name")
    @JsonInclude(Include.NON_NULL)
    private String ifName = null;

    @JsonProperty("ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix ip = null;

    @JsonProperty("ip6")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix ip6 = null;

    @JsonProperty("labels")
    @JsonInclude(Include.NON_NULL)
    private List<String> labels = null;

    @JsonProperty("mac_address")
    @JsonInclude(Include.NON_NULL)
    private String macAddress = null;

    @JsonProperty("mode")
    @JsonInclude(Include.NON_NULL)
    private String mode = null;

    @JsonProperty("mode6")
    @JsonInclude(Include.NON_NULL)
    private String mode6 = null;

    @JsonProperty("public_ip_or_name")
    @JsonInclude(Include.NON_NULL)
    private IpAddr publicIpOrName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ipv4 default gateway of the interface.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gateway
   */
  @VsoMethod
  public IpAddr getGateway() {
    return gateway;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv4 default gateway of the interface.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gateway set the gateway.
   */
  @VsoMethod
  public void setGateway(IpAddr gateway) {
    this.gateway = gateway;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 default gateway of the interface.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gateway6
   */
  @VsoMethod
  public IpAddr getGateway6() {
    return gateway6;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 default gateway of the interface.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gateway6 set the gateway6.
   */
  @VsoMethod
  public void setGateway6(IpAddr gateway6) {
    this.gateway6 = gateway6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Interface name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ifName
   */
  @VsoMethod
  public String getIfName() {
    return ifName;
  }

  /**
   * This is the setter method to the attribute.
   * Interface name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ifName set the ifName.
   */
  @VsoMethod
  public void setIfName(String  ifName) {
    this.ifName = ifName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv4 address of the interface.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip
   */
  @VsoMethod
  public IpAddrPrefix getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv4 address of the interface.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddrPrefix ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 address of the interface.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip6
   */
  @VsoMethod
  public IpAddrPrefix getIp6() {
    return ip6;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 address of the interface.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip6 set the ip6.
   */
  @VsoMethod
  public void setIp6(IpAddrPrefix ip6) {
    this.ip6 = ip6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Interface label like mgmt, secure channel or hsm.
   * Enum options - MGMT, SE_SECURE_CHANNEL, HSM.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labels
   */
  @VsoMethod
  public List<String> getLabels() {
    return labels;
  }

  /**
   * This is the setter method. this will set the labels
   * Interface label like mgmt, secure channel or hsm.
   * Enum options - MGMT, SE_SECURE_CHANNEL, HSM.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labels
   */
  @VsoMethod
  public void setLabels(List<String>  labels) {
    this.labels = labels;
  }

  /**
   * This is the setter method this will set the labels
   * Interface label like mgmt, secure channel or hsm.
   * Enum options - MGMT, SE_SECURE_CHANNEL, HSM.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labels
   */
  @VsoMethod
  public ControllerInterface addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Mac address of interface.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return macAddress
   */
  @VsoMethod
  public String getMacAddress() {
    return macAddress;
  }

  /**
   * This is the setter method to the attribute.
   * Mac address of interface.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param macAddress set the macAddress.
   */
  @VsoMethod
  public void setMacAddress(String  macAddress) {
    this.macAddress = macAddress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv4 address mode dhcp/static.
   * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv4 address mode dhcp/static.
   * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 address mode dhcp/static.
   * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mode6
   */
  @VsoMethod
  public String getMode6() {
    return mode6;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 address mode dhcp/static.
   * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mode6 set the mode6.
   */
  @VsoMethod
  public void setMode6(String  mode6) {
    this.mode6 = mode6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Public ip of interface.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return publicIpOrName
   */
  @VsoMethod
  public IpAddr getPublicIpOrName() {
    return publicIpOrName;
  }

  /**
   * This is the setter method to the attribute.
   * Public ip of interface.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param publicIpOrName set the publicIpOrName.
   */
  @VsoMethod
  public void setPublicIpOrName(IpAddr publicIpOrName) {
    this.publicIpOrName = publicIpOrName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerInterface objControllerInterface = (ControllerInterface) o;
  return   Objects.equals(this.ifName, objControllerInterface.ifName)&&
  Objects.equals(this.macAddress, objControllerInterface.macAddress)&&
  Objects.equals(this.mode, objControllerInterface.mode)&&
  Objects.equals(this.ip, objControllerInterface.ip)&&
  Objects.equals(this.gateway, objControllerInterface.gateway)&&
  Objects.equals(this.labels, objControllerInterface.labels)&&
  Objects.equals(this.publicIpOrName, objControllerInterface.publicIpOrName)&&
  Objects.equals(this.mode6, objControllerInterface.mode6)&&
  Objects.equals(this.ip6, objControllerInterface.ip6)&&
  Objects.equals(this.gateway6, objControllerInterface.gateway6);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerInterface {\n");
      sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    gateway6: ").append(toIndentedString(gateway6)).append("\n");
        sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    ip6: ").append(toIndentedString(ip6)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    mode6: ").append(toIndentedString(mode6)).append("\n");
        sb.append("    publicIpOrName: ").append(toIndentedString(publicIpOrName)).append("\n");
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

