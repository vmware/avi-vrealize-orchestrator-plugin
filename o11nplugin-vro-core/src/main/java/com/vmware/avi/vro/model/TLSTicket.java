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
 * The TLSTicket is a POJO class extends AviRestResource that used for creating
 * TLSTicket.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TLSTicket")
@VsoFinder(name = Constants.FINDER_VRO_TLSTICKET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TLSTicket extends AviRestResource {
    @JsonProperty("aes_key")
    @JsonInclude(Include.NON_NULL)
    private String aesKey;

    @JsonProperty("hmac_key")
    @JsonInclude(Include.NON_NULL)
    private String hmacKey;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return aesKey
   */
  @VsoMethod
  public String getAesKey() {
    return aesKey;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param aesKey set the aesKey.
   */
  @VsoMethod
  public void setAesKey(String  aesKey) {
    this.aesKey = aesKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hmacKey
   */
  @VsoMethod
  public String getHmacKey() {
    return hmacKey;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hmacKey set the hmacKey.
   */
  @VsoMethod
  public void setHmacKey(String  hmacKey) {
    this.hmacKey = hmacKey;
  }

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



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TLSTicket objTLSTicket = (TLSTicket) o;
  return   Objects.equals(this.name, objTLSTicket.name)&&
  Objects.equals(this.aesKey, objTLSTicket.aesKey)&&
  Objects.equals(this.hmacKey, objTLSTicket.hmacKey);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TLSTicket {\n");
      sb.append("    aesKey: ").append(toIndentedString(aesKey)).append("\n");
        sb.append("    hmacKey: ").append(toIndentedString(hmacKey)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

