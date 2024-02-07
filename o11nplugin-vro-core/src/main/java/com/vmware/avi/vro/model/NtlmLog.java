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
 * The NtlmLog is a POJO class extends AviRestResource that used for creating
 * NtlmLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NtlmLog")
@VsoFinder(name = Constants.FINDER_VRO_NTLMLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NtlmLog extends AviRestResource {
    @JsonProperty("ntlm_detected")
    @JsonInclude(Include.NON_NULL)
    private Boolean ntlmDetected;

    @JsonProperty("ntlm_status")
    @JsonInclude(Include.NON_NULL)
    private String ntlmStatus;



  /**
   * This is the getter method this will return the attribute value.
   * Set to true, if request is detected to be ntlm.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ntlmDetected
   */
  @VsoMethod
  public Boolean getNtlmDetected() {
    return ntlmDetected;
  }

  /**
   * This is the setter method to the attribute.
   * Set to true, if request is detected to be ntlm.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ntlmDetected set the ntlmDetected.
   */
  @VsoMethod
  public void setNtlmDetected(Boolean  ntlmDetected) {
    this.ntlmDetected = ntlmDetected;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set the ntlm status.
   * Enum options - NTLM_AUTHENTICATION_SUCCESS, NTLM_UNAUTHORIZED, NTLM_NEGOTIATION, NTLM_AUTHENTICATION_FAILURE, NTLM_AUTHENTICATED_REQUESTS.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ntlmStatus
   */
  @VsoMethod
  public String getNtlmStatus() {
    return ntlmStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Set the ntlm status.
   * Enum options - NTLM_AUTHENTICATION_SUCCESS, NTLM_UNAUTHORIZED, NTLM_NEGOTIATION, NTLM_AUTHENTICATION_FAILURE, NTLM_AUTHENTICATED_REQUESTS.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ntlmStatus set the ntlmStatus.
   */
  @VsoMethod
  public void setNtlmStatus(String  ntlmStatus) {
    this.ntlmStatus = ntlmStatus;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NtlmLog objNtlmLog = (NtlmLog) o;
  return   Objects.equals(this.ntlmDetected, objNtlmLog.ntlmDetected)&&
  Objects.equals(this.ntlmStatus, objNtlmLog.ntlmStatus);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NtlmLog {\n");
      sb.append("    ntlmDetected: ").append(toIndentedString(ntlmDetected)).append("\n");
        sb.append("    ntlmStatus: ").append(toIndentedString(ntlmStatus)).append("\n");
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

