package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The IPReputationServiceStatus is a POJO class extends AviRestResource that used for creating
 * IPReputationServiceStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IPReputationServiceStatus")
@VsoFinder(name = Constants.FINDER_VRO_IPREPUTATIONSERVICESTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IPReputationServiceStatus extends AviRestResource {
    @JsonProperty("error")
    @JsonInclude(Include.NON_NULL)
    private String error = null;

    @JsonProperty("last_successful_update_check")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp lastSuccessfulUpdateCheck = null;



  /**
   * This is the getter method this will return the attribute value.
   * If the last attempted update failed, this is a more detailed error message.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return error
   */
  @VsoMethod
  public String getError() {
    return error;
  }

  /**
   * This is the setter method to the attribute.
   * If the last attempted update failed, this is a more detailed error message.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param error set the error.
   */
  @VsoMethod
  public void setError(String  error) {
    this.error = error;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The time when the ip reputation service last successfull attemped to update this object.
   * This is the case when either this file references in this object got updated or when the ip reputation service knows positively that there are no
   * newer versions for these files.
   * It will be not update, if an error occurs during an update attempt.
   * In this case, the errror will be set.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastSuccessfulUpdateCheck
   */
  @VsoMethod
  public TimeStamp getLastSuccessfulUpdateCheck() {
    return lastSuccessfulUpdateCheck;
  }

  /**
   * This is the setter method to the attribute.
   * The time when the ip reputation service last successfull attemped to update this object.
   * This is the case when either this file references in this object got updated or when the ip reputation service knows positively that there are no
   * newer versions for these files.
   * It will be not update, if an error occurs during an update attempt.
   * In this case, the errror will be set.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastSuccessfulUpdateCheck set the lastSuccessfulUpdateCheck.
   */
  @VsoMethod
  public void setLastSuccessfulUpdateCheck(TimeStamp lastSuccessfulUpdateCheck) {
    this.lastSuccessfulUpdateCheck = lastSuccessfulUpdateCheck;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IPReputationServiceStatus objIPReputationServiceStatus = (IPReputationServiceStatus) o;
  return   Objects.equals(this.error, objIPReputationServiceStatus.error)&&
  Objects.equals(this.lastSuccessfulUpdateCheck, objIPReputationServiceStatus.lastSuccessfulUpdateCheck);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IPReputationServiceStatus {\n");
      sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    lastSuccessfulUpdateCheck: ").append(toIndentedString(lastSuccessfulUpdateCheck)).append("\n");
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

