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
 * The RestoreParams is a POJO class extends AviRestResource that used for creating
 * RestoreParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RestoreParams")
@VsoFinder(name = Constants.FINDER_VRO_RESTOREPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RestoreParams extends AviRestResource {
    @JsonProperty("file")
    @JsonInclude(Include.NON_NULL)
    private String file = null;

    @JsonProperty("passphrase")
    @JsonInclude(Include.NON_NULL)
    private String passphrase = null;

    @JsonProperty("skip_warnings")
    @JsonInclude(Include.NON_NULL)
    private Boolean skipWarnings = false;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "JSON";



  /**
   * This is the getter method this will return the attribute value.
   * Requested config file path.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return file
   */
  @VsoMethod
  public String getFile() {
    return file;
  }

  /**
   * This is the setter method to the attribute.
   * Requested config file path.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param file set the file.
   */
  @VsoMethod
  public void setFile(String  file) {
    this.file = file;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The passphrase with which the configuration was exported.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return passphrase
   */
  @VsoMethod
  public String getPassphrase() {
    return passphrase;
  }

  /**
   * This is the setter method to the attribute.
   * The passphrase with which the configuration was exported.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param passphrase set the passphrase.
   */
  @VsoMethod
  public void setPassphrase(String  passphrase) {
    this.passphrase = passphrase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag allows you to bypass the warning prechecks.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return skipWarnings
   */
  @VsoMethod
  public Boolean getSkipWarnings() {
    return skipWarnings;
  }

  /**
   * This is the setter method to the attribute.
   * This flag allows you to bypass the warning prechecks.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param skipWarnings set the skipWarnings.
   */
  @VsoMethod
  public void setSkipWarnings(Boolean  skipWarnings) {
    this.skipWarnings = skipWarnings;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of the file.
   * Enum options - JSON, BUNDLE.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "JSON".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the file.
   * Enum options - JSON, BUNDLE.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "JSON".
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
  RestoreParams objRestoreParams = (RestoreParams) o;
  return   Objects.equals(this.file, objRestoreParams.file)&&
  Objects.equals(this.type, objRestoreParams.type)&&
  Objects.equals(this.skipWarnings, objRestoreParams.skipWarnings)&&
  Objects.equals(this.passphrase, objRestoreParams.passphrase);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RestoreParams {\n");
      sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
        sb.append("    skipWarnings: ").append(toIndentedString(skipWarnings)).append("\n");
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

