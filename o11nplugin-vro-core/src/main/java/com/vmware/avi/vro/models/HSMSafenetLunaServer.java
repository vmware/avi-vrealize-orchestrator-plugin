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
 * The HSMSafenetLunaServer is a POJO class extends AviRestResource that used for creating
 * HSMSafenetLunaServer.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HSMSafenetLunaServer")
@VsoFinder(name = Constants.FINDER_VRO_HSMSAFENETLUNASERVER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HSMSafenetLunaServer extends AviRestResource {
    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index = null;

    @JsonProperty("partition_passwd")
    @JsonInclude(Include.NON_NULL)
    private String partitionPasswd = null;

    @JsonProperty("partition_serial_number")
    @JsonInclude(Include.NON_NULL)
    private String partitionSerialNumber = null;

    @JsonProperty("remote_ip")
    @JsonInclude(Include.NON_NULL)
    private String remoteIp = null;

    @JsonProperty("server_cert")
    @JsonInclude(Include.NON_NULL)
    private String serverCert = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 16.5.2,17.2.3.
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
   * Field introduced in 16.5.2,17.2.3.
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
   * Password of the partition assigned to this client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return partitionPasswd
   */
  @VsoMethod
  public String getPartitionPasswd() {
    return partitionPasswd;
  }

  /**
   * This is the setter method to the attribute.
   * Password of the partition assigned to this client.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param partitionPasswd set the partitionPasswd.
   */
  @VsoMethod
  public void setPartitionPasswd(String  partitionPasswd) {
    this.partitionPasswd = partitionPasswd;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serial number of the partition assigned to this client.
   * Field introduced in 16.5.2,17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return partitionSerialNumber
   */
  @VsoMethod
  public String getPartitionSerialNumber() {
    return partitionSerialNumber;
  }

  /**
   * This is the setter method to the attribute.
   * Serial number of the partition assigned to this client.
   * Field introduced in 16.5.2,17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param partitionSerialNumber set the partitionSerialNumber.
   */
  @VsoMethod
  public void setPartitionSerialNumber(String  partitionSerialNumber) {
    this.partitionSerialNumber = partitionSerialNumber;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address of the thales luna hsm device.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteIp
   */
  @VsoMethod
  public String getRemoteIp() {
    return remoteIp;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of the thales luna hsm device.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param remoteIp set the remoteIp.
   */
  @VsoMethod
  public void setRemoteIp(String  remoteIp) {
    this.remoteIp = remoteIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ca certificate of the server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverCert
   */
  @VsoMethod
  public String getServerCert() {
    return serverCert;
  }

  /**
   * This is the setter method to the attribute.
   * Ca certificate of the server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverCert set the serverCert.
   */
  @VsoMethod
  public void setServerCert(String  serverCert) {
    this.serverCert = serverCert;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HSMSafenetLunaServer objHSMSafenetLunaServer = (HSMSafenetLunaServer) o;
  return   Objects.equals(this.remoteIp, objHSMSafenetLunaServer.remoteIp)&&
  Objects.equals(this.serverCert, objHSMSafenetLunaServer.serverCert)&&
  Objects.equals(this.partitionPasswd, objHSMSafenetLunaServer.partitionPasswd)&&
  Objects.equals(this.partitionSerialNumber, objHSMSafenetLunaServer.partitionSerialNumber)&&
  Objects.equals(this.index, objHSMSafenetLunaServer.index);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HSMSafenetLunaServer {\n");
      sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    partitionPasswd: ").append(toIndentedString(partitionPasswd)).append("\n");
        sb.append("    partitionSerialNumber: ").append(toIndentedString(partitionSerialNumber)).append("\n");
        sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
        sb.append("    serverCert: ").append(toIndentedString(serverCert)).append("\n");
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

