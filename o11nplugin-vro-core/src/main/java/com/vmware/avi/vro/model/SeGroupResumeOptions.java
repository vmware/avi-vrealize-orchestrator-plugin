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
 * The SeGroupResumeOptions is a POJO class extends AviRestResource that used for creating
 * SeGroupResumeOptions.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeGroupResumeOptions")
@VsoFinder(name = Constants.FINDER_VRO_SEGROUPRESUMEOPTIONS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeGroupResumeOptions extends AviRestResource {
    @JsonProperty("action_on_error")
    @JsonInclude(Include.NON_NULL)
    private String actionOnError = "SUSPEND_UPGRADE_OPS_ON_ERROR";

    @JsonProperty("disruptive")
    @JsonInclude(Include.NON_NULL)
    private Boolean disruptive = false;

    @JsonProperty("skip_suspended")
    @JsonInclude(Include.NON_NULL)
    private Boolean skipSuspended = false;



  /**
   * This is the getter method this will return the attribute value.
   * The error recovery action configured for a se group.
   * Enum options - ROLLBACK_UPGRADE_OPS_ON_ERROR, SUSPEND_UPGRADE_OPS_ON_ERROR, CONTINUE_UPGRADE_OPS_ON_ERROR.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SUSPEND_UPGRADE_OPS_ON_ERROR".
   * @return actionOnError
   */
  @VsoMethod
  public String getActionOnError() {
    return actionOnError;
  }

  /**
   * This is the setter method to the attribute.
   * The error recovery action configured for a se group.
   * Enum options - ROLLBACK_UPGRADE_OPS_ON_ERROR, SUSPEND_UPGRADE_OPS_ON_ERROR, CONTINUE_UPGRADE_OPS_ON_ERROR.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SUSPEND_UPGRADE_OPS_ON_ERROR".
   * @param actionOnError set the actionOnError.
   */
  @VsoMethod
  public void setActionOnError(String  actionOnError) {
    this.actionOnError = actionOnError;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allow disruptive mechanism.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disruptive
   */
  @VsoMethod
  public Boolean getDisruptive() {
    return disruptive;
  }

  /**
   * This is the setter method to the attribute.
   * Allow disruptive mechanism.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disruptive set the disruptive.
   */
  @VsoMethod
  public void setDisruptive(Boolean  disruptive) {
    this.disruptive = disruptive;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Skip upgrade on suspended se(s).
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return skipSuspended
   */
  @VsoMethod
  public Boolean getSkipSuspended() {
    return skipSuspended;
  }

  /**
   * This is the setter method to the attribute.
   * Skip upgrade on suspended se(s).
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param skipSuspended set the skipSuspended.
   */
  @VsoMethod
  public void setSkipSuspended(Boolean  skipSuspended) {
    this.skipSuspended = skipSuspended;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeGroupResumeOptions objSeGroupResumeOptions = (SeGroupResumeOptions) o;
  return   Objects.equals(this.actionOnError, objSeGroupResumeOptions.actionOnError)&&
  Objects.equals(this.skipSuspended, objSeGroupResumeOptions.skipSuspended)&&
  Objects.equals(this.disruptive, objSeGroupResumeOptions.disruptive);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeGroupResumeOptions {\n");
      sb.append("    actionOnError: ").append(toIndentedString(actionOnError)).append("\n");
        sb.append("    disruptive: ").append(toIndentedString(disruptive)).append("\n");
        sb.append("    skipSuspended: ").append(toIndentedString(skipSuspended)).append("\n");
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

