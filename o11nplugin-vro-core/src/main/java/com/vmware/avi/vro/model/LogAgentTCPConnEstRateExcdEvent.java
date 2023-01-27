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
 * The LogAgentTCPConnEstRateExcdEvent is a POJO class extends AviRestResource that used for creating
 * LogAgentTCPConnEstRateExcdEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LogAgentTCPConnEstRateExcdEvent")
@VsoFinder(name = Constants.FINDER_VRO_LOGAGENTTCPCONNESTRATEEXCDEVENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LogAgentTCPConnEstRateExcdEvent extends AviRestResource {
    @JsonProperty("error_code")
    @JsonInclude(Include.NON_NULL)
    private String errorCode = null;

    @JsonProperty("error_reason")
    @JsonInclude(Include.NON_NULL)
    private String errorReason = null;

    @JsonProperty("host")
    @JsonInclude(Include.NON_NULL)
    private String host = null;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private String port = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorCode
   */
  @VsoMethod
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorCode set the errorCode.
   */
  @VsoMethod
  public void setErrorCode(String  errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorReason
   */
  @VsoMethod
  public String getErrorReason() {
    return errorReason;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorReason set the errorReason.
   */
  @VsoMethod
  public void setErrorReason(String  errorReason) {
    this.errorReason = errorReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return host
   */
  @VsoMethod
  public String getHost() {
    return host;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param host set the host.
   */
  @VsoMethod
  public void setHost(String  host) {
    this.host = host;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public String getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(String  port) {
    this.port = port;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LogAgentTCPConnEstRateExcdEvent objLogAgentTCPConnEstRateExcdEvent = (LogAgentTCPConnEstRateExcdEvent) o;
  return   Objects.equals(this.host, objLogAgentTCPConnEstRateExcdEvent.host)&&
  Objects.equals(this.port, objLogAgentTCPConnEstRateExcdEvent.port)&&
  Objects.equals(this.errorCode, objLogAgentTCPConnEstRateExcdEvent.errorCode)&&
  Objects.equals(this.errorReason, objLogAgentTCPConnEstRateExcdEvent.errorReason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LogAgentTCPConnEstRateExcdEvent {\n");
      sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

