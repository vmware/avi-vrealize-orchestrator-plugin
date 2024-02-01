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
 * The RollbackControllerParams is a POJO class extends AviRestResource that used for creating
 * RollbackControllerParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RollbackControllerParams")
@VsoFinder(name = Constants.FINDER_VRO_ROLLBACKCONTROLLERPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RollbackControllerParams extends AviRestResource {
    @JsonProperty("prechecks_only")
    @JsonInclude(Include.NON_NULL)
    private Boolean prechecksOnly = false;

    @JsonProperty("skip_warnings")
    @JsonInclude(Include.NON_NULL)
    private Boolean skipWarnings = false;



  /**
   * This is the getter method this will return the attribute value.
   * This flag is set to run the pre-checks without the subsequent upgrade operations.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return prechecksOnly
   */
  @VsoMethod
  public Boolean getPrechecksOnly() {
    return prechecksOnly;
  }

  /**
   * This is the setter method to the attribute.
   * This flag is set to run the pre-checks without the subsequent upgrade operations.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param prechecksOnly set the prechecksOnly.
   */
  @VsoMethod
  public void setPrechecksOnly(Boolean  prechecksOnly) {
    this.prechecksOnly = prechecksOnly;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This is flag when set as true skips few optional must checks.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return skipWarnings
   */
  @VsoMethod
  public Boolean getSkipWarnings() {
    return skipWarnings;
  }

  /**
   * This is the setter method to the attribute.
   * This is flag when set as true skips few optional must checks.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param skipWarnings set the skipWarnings.
   */
  @VsoMethod
  public void setSkipWarnings(Boolean  skipWarnings) {
    this.skipWarnings = skipWarnings;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RollbackControllerParams objRollbackControllerParams = (RollbackControllerParams) o;
  return   Objects.equals(this.skipWarnings, objRollbackControllerParams.skipWarnings)&&
  Objects.equals(this.prechecksOnly, objRollbackControllerParams.prechecksOnly);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RollbackControllerParams {\n");
      sb.append("    prechecksOnly: ").append(toIndentedString(prechecksOnly)).append("\n");
        sb.append("    skipWarnings: ").append(toIndentedString(skipWarnings)).append("\n");
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

