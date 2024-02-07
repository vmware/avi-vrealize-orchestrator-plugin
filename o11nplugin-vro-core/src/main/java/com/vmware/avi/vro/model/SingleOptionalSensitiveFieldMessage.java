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
 * The SingleOptionalSensitiveFieldMessage is a POJO class extends AviRestResource that used for creating
 * SingleOptionalSensitiveFieldMessage.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SingleOptionalSensitiveFieldMessage")
@VsoFinder(name = Constants.FINDER_VRO_SINGLEOPTIONALSENSITIVEFIELDMESSAGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SingleOptionalSensitiveFieldMessage extends AviRestResource {
    @JsonProperty("optional_sensitive_string")
    @JsonInclude(Include.NON_NULL)
    private String optionalSensitiveString;



  /**
   * This is the getter method this will return the attribute value.
   * Optional string field for nested f_mandatory test cases-level3.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return optionalSensitiveString
   */
  @VsoMethod
  public String getOptionalSensitiveString() {
    return optionalSensitiveString;
  }

  /**
   * This is the setter method to the attribute.
   * Optional string field for nested f_mandatory test cases-level3.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param optionalSensitiveString set the optionalSensitiveString.
   */
  @VsoMethod
  public void setOptionalSensitiveString(String  optionalSensitiveString) {
    this.optionalSensitiveString = optionalSensitiveString;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SingleOptionalSensitiveFieldMessage objSingleOptionalSensitiveFieldMessage = (SingleOptionalSensitiveFieldMessage) o;
  return   Objects.equals(this.optionalSensitiveString, objSingleOptionalSensitiveFieldMessage.optionalSensitiveString);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SingleOptionalSensitiveFieldMessage {\n");
      sb.append("    optionalSensitiveString: ").append(toIndentedString(optionalSensitiveString)).append("\n");
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

