package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ServerId is a POJO class extends AviRestResource that used for creating
 * ServerId.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServerId")
@VsoFinder(name = Constants.FINDER_VRO_SERVERID)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServerId extends AviRestResource {
    @JsonProperty("external_uuid")
    @JsonInclude(Include.NON_NULL)
    private String externalUuid;

    @JsonProperty("ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ip;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port;



  /**
   * This is the getter method this will return the attribute value.
   * This is the external cloud uuid of the pool server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return externalUuid
   */
  @VsoMethod
  public String getExternalUuid() {
    return externalUuid;
  }

  /**
   * This is the setter method to the attribute.
   * This is the external cloud uuid of the pool server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param externalUuid set the externalUuid.
   */
  @VsoMethod
  public void setExternalUuid(String  externalUuid) {
    this.externalUuid = externalUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ServerId objServerId = (ServerId) o;
  return   Objects.equals(this.ip, objServerId.ip)&&
  Objects.equals(this.port, objServerId.port)&&
  Objects.equals(this.externalUuid, objServerId.externalUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServerId {\n");
      sb.append("    externalUuid: ").append(toIndentedString(externalUuid)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

