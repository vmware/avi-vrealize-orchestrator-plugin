package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SaasLicensingStatus is a POJO class extends AviRestResource that used for creating
 * SaasLicensingStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SaasLicensingStatus")
@VsoFinder(name = Constants.FINDER_VRO_SAASLICENSINGSTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SaasLicensingStatus extends AviRestResource {
    @JsonProperty("connected")
    @JsonInclude(Include.NON_NULL)
    private Boolean connected;

    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled;

    @JsonProperty("expired")
    @JsonInclude(Include.NON_NULL)
    private Boolean expired;

    @JsonProperty("message")
    @JsonInclude(Include.NON_NULL)
    private String message;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonIgnore
    private String publicKey;

    @JsonProperty("reserve_service_units")
    @JsonInclude(Include.NON_NULL)
    private Float reserveServiceUnits;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private String state;



  /**
   * This is the getter method this will return the attribute value.
   * Portal connectivity status.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connected
   */
  @VsoMethod
  public Boolean getConnected() {
    return connected;
  }

  /**
   * This is the setter method to the attribute.
   * Portal connectivity status.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param connected set the connected.
   */
  @VsoMethod
  public void setConnected(Boolean  connected) {
    this.connected = connected;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status of saas licensing subscription.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Status of saas licensing subscription.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saas license expiry status.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return expired
   */
  @VsoMethod
  public Boolean getExpired() {
    return expired;
  }

  /**
   * This is the setter method to the attribute.
   * Saas license expiry status.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param expired set the expired.
   */
  @VsoMethod
  public void setExpired(Boolean  expired) {
    this.expired = expired;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Message.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return message
   */
  @VsoMethod
  public String getMessage() {
    return message;
  }

  /**
   * This is the setter method to the attribute.
   * Message.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param message set the message.
   */
  @VsoMethod
  public void setMessage(String  message) {
    this.message = message;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name.
   * Field introduced in 21.1.3.
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
   * Name.
   * Field introduced in 21.1.3.
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
   * Public key.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return publicKey
   */
  @VsoMethod
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * This is the setter method to the attribute.
   * Public key.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param publicKey set the publicKey.
   */
  @VsoMethod
  public void setPublicKey(String  publicKey) {
    this.publicKey = publicKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service units reserved on controller.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reserveServiceUnits
   */
  @VsoMethod
  public Float getReserveServiceUnits() {
    return reserveServiceUnits;
  }

  /**
   * This is the setter method to the attribute.
   * Service units reserved on controller.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reserveServiceUnits set the reserveServiceUnits.
   */
  @VsoMethod
  public void setReserveServiceUnits(Float  reserveServiceUnits) {
    this.reserveServiceUnits = reserveServiceUnits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saas license request status.
   * Enum options - SUBSCRIPTION_NONE, SUBSCRIPTION_SUCCESS, SUBSCRIPTION_FAILED, SUBSCRIPTION_IN_PROGRESS.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Saas license request status.
   * Enum options - SUBSCRIPTION_NONE, SUBSCRIPTION_SUCCESS, SUBSCRIPTION_FAILED, SUBSCRIPTION_IN_PROGRESS.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(String  state) {
    this.state = state;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SaasLicensingStatus objSaasLicensingStatus = (SaasLicensingStatus) o;
  return   Objects.equals(this.name, objSaasLicensingStatus.name)&&
  Objects.equals(this.enabled, objSaasLicensingStatus.enabled)&&
  Objects.equals(this.reserveServiceUnits, objSaasLicensingStatus.reserveServiceUnits)&&
  Objects.equals(this.connected, objSaasLicensingStatus.connected)&&
  Objects.equals(this.message, objSaasLicensingStatus.message)&&
  Objects.equals(this.publicKey, objSaasLicensingStatus.publicKey)&&
  Objects.equals(this.expired, objSaasLicensingStatus.expired)&&
  Objects.equals(this.state, objSaasLicensingStatus.state);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SaasLicensingStatus {\n");
      sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    reserveServiceUnits: ").append(toIndentedString(reserveServiceUnits)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

