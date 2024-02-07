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
 * The SipMessage is a POJO class extends AviRestResource that used for creating
 * SipMessage.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SipMessage")
@VsoFinder(name = Constants.FINDER_VRO_SIPMESSAGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SipMessage extends AviRestResource {
    @JsonProperty("content")
    @JsonInclude(Include.NON_NULL)
    private String content;

    @JsonProperty("from_client")
    @JsonInclude(Include.NON_NULL)
    private Boolean fromClient;

    @JsonProperty("method")
    @JsonInclude(Include.NON_NULL)
    private String method;

    @JsonProperty("rcv_timestamp")
    @JsonInclude(Include.NON_NULL)
    private Integer rcvTimestamp;

    @JsonProperty("rx_bytes")
    @JsonInclude(Include.NON_NULL)
    private Integer rxBytes;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status;

    @JsonProperty("status_code")
    @JsonInclude(Include.NON_NULL)
    private Integer statusCode;

    @JsonProperty("tx_bytes")
    @JsonInclude(Include.NON_NULL)
    private Integer txBytes;



  /**
   * This is the getter method this will return the attribute value.
   * Contents up to first 128 bytes of a sip message for which could not be parsed.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return content
   */
  @VsoMethod
  public String getContent() {
    return content;
  }

  /**
   * This is the setter method to the attribute.
   * Contents up to first 128 bytes of a sip message for which could not be parsed.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param content set the content.
   */
  @VsoMethod
  public void setContent(String  content) {
    this.content = content;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Indicates if sip message is received from a client.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fromClient
   */
  @VsoMethod
  public Boolean getFromClient() {
    return fromClient;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates if sip message is received from a client.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fromClient set the fromClient.
   */
  @VsoMethod
  public void setFromClient(Boolean  fromClient) {
    this.fromClient = fromClient;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sip request method string.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return method
   */
  @VsoMethod
  public String getMethod() {
    return method;
  }

  /**
   * This is the setter method to the attribute.
   * Sip request method string.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param method set the method.
   */
  @VsoMethod
  public void setMethod(String  method) {
    this.method = method;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sip message receive time stamp.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rcvTimestamp
   */
  @VsoMethod
  public Integer getRcvTimestamp() {
    return rcvTimestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Sip message receive time stamp.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rcvTimestamp set the rcvTimestamp.
   */
  @VsoMethod
  public void setRcvTimestamp(Integer  rcvTimestamp) {
    this.rcvTimestamp = rcvTimestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sip message size before modifications.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rxBytes
   */
  @VsoMethod
  public Integer getRxBytes() {
    return rxBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Sip message size before modifications.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rxBytes set the rxBytes.
   */
  @VsoMethod
  public void setRxBytes(Integer  rxBytes) {
    this.rxBytes = rxBytes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sip response status string.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Sip response status string.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sip response status code, 2xx response means success.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return statusCode
   */
  @VsoMethod
  public Integer getStatusCode() {
    return statusCode;
  }

  /**
   * This is the setter method to the attribute.
   * Sip response status code, 2xx response means success.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param statusCode set the statusCode.
   */
  @VsoMethod
  public void setStatusCode(Integer  statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sip message size post modifications.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return txBytes
   */
  @VsoMethod
  public Integer getTxBytes() {
    return txBytes;
  }

  /**
   * This is the setter method to the attribute.
   * Sip message size post modifications.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param txBytes set the txBytes.
   */
  @VsoMethod
  public void setTxBytes(Integer  txBytes) {
    this.txBytes = txBytes;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SipMessage objSipMessage = (SipMessage) o;
  return   Objects.equals(this.method, objSipMessage.method)&&
  Objects.equals(this.status, objSipMessage.status)&&
  Objects.equals(this.statusCode, objSipMessage.statusCode)&&
  Objects.equals(this.content, objSipMessage.content)&&
  Objects.equals(this.rxBytes, objSipMessage.rxBytes)&&
  Objects.equals(this.txBytes, objSipMessage.txBytes)&&
  Objects.equals(this.rcvTimestamp, objSipMessage.rcvTimestamp)&&
  Objects.equals(this.fromClient, objSipMessage.fromClient);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SipMessage {\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    fromClient: ").append(toIndentedString(fromClient)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    rcvTimestamp: ").append(toIndentedString(rcvTimestamp)).append("\n");
        sb.append("    rxBytes: ").append(toIndentedString(rxBytes)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    txBytes: ").append(toIndentedString(txBytes)).append("\n");
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

