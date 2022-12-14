package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The PersistenceFilter is a POJO class extends AviRestResource that used for creating
 * PersistenceFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PersistenceFilter")
@VsoFinder(name = Constants.FINDER_VRO_PERSISTENCEFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PersistenceFilter extends AviRestResource {
    @JsonProperty("persistence_cookie")
    @JsonInclude(Include.NON_NULL)
    private String persistenceCookie = null;

    @JsonProperty("persistence_end_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr persistenceEndIp = null;

    @JsonProperty("persistence_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr persistenceIp = null;

    @JsonProperty("persistence_mask")
    @JsonInclude(Include.NON_NULL)
    private Integer persistenceMask = null;

    @JsonProperty("server_end_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr serverEndIp = null;

    @JsonProperty("server_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr serverIp = null;

    @JsonProperty("server_mask")
    @JsonInclude(Include.NON_NULL)
    private Integer serverMask = null;

    @JsonProperty("server_port")
    @JsonInclude(Include.NON_NULL)
    private Integer serverPort = null;



  /**
   * This is the getter method this will return the attribute value.
   * Persistence cookie.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return persistenceCookie
   */
  @VsoMethod
  public String getPersistenceCookie() {
    return persistenceCookie;
  }

  /**
   * This is the setter method to the attribute.
   * Persistence cookie.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param persistenceCookie set the persistenceCookie.
   */
  @VsoMethod
  public void setPersistenceCookie(String  persistenceCookie) {
    this.persistenceCookie = persistenceCookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return persistenceEndIp
   */
  @VsoMethod
  public IpAddr getPersistenceEndIp() {
    return persistenceEndIp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param persistenceEndIp set the persistenceEndIp.
   */
  @VsoMethod
  public void setPersistenceEndIp(IpAddr persistenceEndIp) {
    this.persistenceEndIp = persistenceEndIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return persistenceIp
   */
  @VsoMethod
  public IpAddr getPersistenceIp() {
    return persistenceIp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param persistenceIp set the persistenceIp.
   */
  @VsoMethod
  public void setPersistenceIp(IpAddr persistenceIp) {
    this.persistenceIp = persistenceIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return persistenceMask
   */
  @VsoMethod
  public Integer getPersistenceMask() {
    return persistenceMask;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param persistenceMask set the persistenceMask.
   */
  @VsoMethod
  public void setPersistenceMask(Integer  persistenceMask) {
    this.persistenceMask = persistenceMask;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverEndIp
   */
  @VsoMethod
  public IpAddr getServerEndIp() {
    return serverEndIp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverEndIp set the serverEndIp.
   */
  @VsoMethod
  public void setServerEndIp(IpAddr serverEndIp) {
    this.serverEndIp = serverEndIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverIp
   */
  @VsoMethod
  public IpAddr getServerIp() {
    return serverIp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverIp set the serverIp.
   */
  @VsoMethod
  public void setServerIp(IpAddr serverIp) {
    this.serverIp = serverIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverMask
   */
  @VsoMethod
  public Integer getServerMask() {
    return serverMask;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverMask set the serverMask.
   */
  @VsoMethod
  public void setServerMask(Integer  serverMask) {
    this.serverMask = serverMask;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverPort
   */
  @VsoMethod
  public Integer getServerPort() {
    return serverPort;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverPort set the serverPort.
   */
  @VsoMethod
  public void setServerPort(Integer  serverPort) {
    this.serverPort = serverPort;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PersistenceFilter objPersistenceFilter = (PersistenceFilter) o;
  return   Objects.equals(this.persistenceIp, objPersistenceFilter.persistenceIp)&&
  Objects.equals(this.persistenceMask, objPersistenceFilter.persistenceMask)&&
  Objects.equals(this.persistenceEndIp, objPersistenceFilter.persistenceEndIp)&&
  Objects.equals(this.serverIp, objPersistenceFilter.serverIp)&&
  Objects.equals(this.serverMask, objPersistenceFilter.serverMask)&&
  Objects.equals(this.serverEndIp, objPersistenceFilter.serverEndIp)&&
  Objects.equals(this.serverPort, objPersistenceFilter.serverPort)&&
  Objects.equals(this.persistenceCookie, objPersistenceFilter.persistenceCookie);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PersistenceFilter {\n");
      sb.append("    persistenceCookie: ").append(toIndentedString(persistenceCookie)).append("\n");
        sb.append("    persistenceEndIp: ").append(toIndentedString(persistenceEndIp)).append("\n");
        sb.append("    persistenceIp: ").append(toIndentedString(persistenceIp)).append("\n");
        sb.append("    persistenceMask: ").append(toIndentedString(persistenceMask)).append("\n");
        sb.append("    serverEndIp: ").append(toIndentedString(serverEndIp)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    serverMask: ").append(toIndentedString(serverMask)).append("\n");
        sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
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

