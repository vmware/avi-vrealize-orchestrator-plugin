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
 * The SSLClientCertificateAction is a POJO class extends AviRestResource that used for creating
 * SSLClientCertificateAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLClientCertificateAction")
@VsoFinder(name = Constants.FINDER_VRO_SSLCLIENTCERTIFICATEACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLClientCertificateAction extends AviRestResource {
    @JsonProperty("close_connection")
    @JsonInclude(Include.NON_NULL)
    private Boolean closeConnection = false;

    @JsonProperty("headers")
    @JsonInclude(Include.NON_NULL)
    private List<SSLClientRequestHeader> headers;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return closeConnection
   */
  @VsoMethod
  public Boolean getCloseConnection() {
    return closeConnection;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param closeConnection set the closeConnection.
   */
  @VsoMethod
  public void setCloseConnection(Boolean  closeConnection) {
    this.closeConnection = closeConnection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return headers
   */
  @VsoMethod
  public List<SSLClientRequestHeader> getHeaders() {
    return headers;
  }

  /**
   * This is the setter method. this will set the headers
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return headers
   */
  @VsoMethod
  public void setHeaders(List<SSLClientRequestHeader>  headers) {
    this.headers = headers;
  }

  /**
   * This is the setter method this will set the headers
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return headers
   */
  @VsoMethod
  public SSLClientCertificateAction addHeadersItem(SSLClientRequestHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<SSLClientRequestHeader>();
    }
    this.headers.add(headersItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSLClientCertificateAction objSSLClientCertificateAction = (SSLClientCertificateAction) o;
  return   Objects.equals(this.headers, objSSLClientCertificateAction.headers)&&
  Objects.equals(this.closeConnection, objSSLClientCertificateAction.closeConnection);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSLClientCertificateAction {\n");
      sb.append("    closeConnection: ").append(toIndentedString(closeConnection)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

