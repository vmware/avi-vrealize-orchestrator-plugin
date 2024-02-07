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
 * The AlertSyslogServer is a POJO class extends AviRestResource that used for creating
 * AlertSyslogServer.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AlertSyslogServer")
@VsoFinder(name = Constants.FINDER_VRO_ALERTSYSLOGSERVER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AlertSyslogServer extends AviRestResource {
    @JsonProperty("anon_auth")
    @JsonInclude(Include.NON_NULL)
    private Boolean anonAuth = false;

    @JsonProperty("format")
    @JsonInclude(Include.NON_NULL)
    private String format = "SYSLOG_LEGACY";

    @JsonProperty("pkiprofile_ref")
    @JsonInclude(Include.NON_NULL)
    private String pkiprofileRef;

    @JsonProperty("ssl_key_and_certificate_ref")
    @JsonInclude(Include.NON_NULL)
    private String sslKeyAndCertificateRef;

    @JsonProperty("strict_cert_verify")
    @JsonInclude(Include.NON_NULL)
    private Boolean strictCertVerify = false;

    @JsonProperty("syslog_server")
    @JsonInclude(Include.NON_NULL)
    private String syslogServer;

    @JsonProperty("syslog_server_port")
    @JsonInclude(Include.NON_NULL)
    private Integer syslogServerPort = 514;

    @JsonProperty("tls_enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean tlsEnable = false;

    @JsonProperty("udp")
    @JsonInclude(Include.NON_NULL)
    private Boolean udp = true;



  /**
   * This is the getter method this will return the attribute value.
   * Enable anonymous authentication of syslog serverwhich will disable server certificate authentication.
   * Field introduced in 17.2.17, 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return anonAuth
   */
  @VsoMethod
  public Boolean getAnonAuth() {
    return anonAuth;
  }

  /**
   * This is the setter method to the attribute.
   * Enable anonymous authentication of syslog serverwhich will disable server certificate authentication.
   * Field introduced in 17.2.17, 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param anonAuth set the anonAuth.
   */
  @VsoMethod
  public void setAnonAuth(Boolean  anonAuth) {
    this.anonAuth = anonAuth;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Syslog output format - legacy, rfc 5424, json.
   * Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON, SYSLOG_RFC5425_ENHANCED.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SYSLOG_LEGACY".
   * @return format
   */
  @VsoMethod
  public String getFormat() {
    return format;
  }

  /**
   * This is the setter method to the attribute.
   * Syslog output format - legacy, rfc 5424, json.
   * Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON, SYSLOG_RFC5425_ENHANCED.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SYSLOG_LEGACY".
   * @param format set the format.
   */
  @VsoMethod
  public void setFormat(String  format) {
    this.format = format;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select the pkiprofile containing a ca or list of ca chainswhich will validate the certificate of the syslog server.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 17.2.17, 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pkiprofileRef
   */
  @VsoMethod
  public String getPkiprofileRef() {
    return pkiprofileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Select the pkiprofile containing a ca or list of ca chainswhich will validate the certificate of the syslog server.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 17.2.17, 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pkiprofileRef set the pkiprofileRef.
   */
  @VsoMethod
  public void setPkiprofileRef(String  pkiprofileRef) {
    this.pkiprofileRef = pkiprofileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select a certificate and key which will be used to authenticate to the syslog server.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 17.2.17, 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslKeyAndCertificateRef
   */
  @VsoMethod
  public String getSslKeyAndCertificateRef() {
    return sslKeyAndCertificateRef;
  }

  /**
   * This is the setter method to the attribute.
   * Select a certificate and key which will be used to authenticate to the syslog server.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 17.2.17, 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sslKeyAndCertificateRef set the sslKeyAndCertificateRef.
   */
  @VsoMethod
  public void setSslKeyAndCertificateRef(String  sslKeyAndCertificateRef) {
    this.sslKeyAndCertificateRef = sslKeyAndCertificateRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Strict verificiation of certificate given by the server.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return strictCertVerify
   */
  @VsoMethod
  public Boolean getStrictCertVerify() {
    return strictCertVerify;
  }

  /**
   * This is the setter method to the attribute.
   * Strict verificiation of certificate given by the server.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param strictCertVerify set the strictCertVerify.
   */
  @VsoMethod
  public void setStrictCertVerify(Boolean  strictCertVerify) {
    this.strictCertVerify = strictCertVerify;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The destination syslog server ip(v4/v6) address or fqdn.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return syslogServer
   */
  @VsoMethod
  public String getSyslogServer() {
    return syslogServer;
  }

  /**
   * This is the setter method to the attribute.
   * The destination syslog server ip(v4/v6) address or fqdn.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param syslogServer set the syslogServer.
   */
  @VsoMethod
  public void setSyslogServer(String  syslogServer) {
    this.syslogServer = syslogServer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The destination syslog server's service port.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 514.
   * @return syslogServerPort
   */
  @VsoMethod
  public Integer getSyslogServerPort() {
    return syslogServerPort;
  }

  /**
   * This is the setter method to the attribute.
   * The destination syslog server's service port.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 514.
   * @param syslogServerPort set the syslogServerPort.
   */
  @VsoMethod
  public void setSyslogServerPort(Integer  syslogServerPort) {
    this.syslogServerPort = syslogServerPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable tls to the syslog server.
   * Field introduced in 17.2.16, 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return tlsEnable
   */
  @VsoMethod
  public Boolean getTlsEnable() {
    return tlsEnable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable tls to the syslog server.
   * Field introduced in 17.2.16, 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param tlsEnable set the tlsEnable.
   */
  @VsoMethod
  public void setTlsEnable(Boolean  tlsEnable) {
    this.tlsEnable = tlsEnable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Network protocol to establish syslog session.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return udp
   */
  @VsoMethod
  public Boolean getUdp() {
    return udp;
  }

  /**
   * This is the setter method to the attribute.
   * Network protocol to establish syslog session.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param udp set the udp.
   */
  @VsoMethod
  public void setUdp(Boolean  udp) {
    this.udp = udp;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AlertSyslogServer objAlertSyslogServer = (AlertSyslogServer) o;
  return   Objects.equals(this.syslogServer, objAlertSyslogServer.syslogServer)&&
  Objects.equals(this.syslogServerPort, objAlertSyslogServer.syslogServerPort)&&
  Objects.equals(this.udp, objAlertSyslogServer.udp)&&
  Objects.equals(this.format, objAlertSyslogServer.format)&&
  Objects.equals(this.tlsEnable, objAlertSyslogServer.tlsEnable)&&
  Objects.equals(this.sslKeyAndCertificateRef, objAlertSyslogServer.sslKeyAndCertificateRef)&&
  Objects.equals(this.pkiprofileRef, objAlertSyslogServer.pkiprofileRef)&&
  Objects.equals(this.anonAuth, objAlertSyslogServer.anonAuth)&&
  Objects.equals(this.strictCertVerify, objAlertSyslogServer.strictCertVerify);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AlertSyslogServer {\n");
      sb.append("    anonAuth: ").append(toIndentedString(anonAuth)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    pkiprofileRef: ").append(toIndentedString(pkiprofileRef)).append("\n");
        sb.append("    sslKeyAndCertificateRef: ").append(toIndentedString(sslKeyAndCertificateRef)).append("\n");
        sb.append("    strictCertVerify: ").append(toIndentedString(strictCertVerify)).append("\n");
        sb.append("    syslogServer: ").append(toIndentedString(syslogServer)).append("\n");
        sb.append("    syslogServerPort: ").append(toIndentedString(syslogServerPort)).append("\n");
        sb.append("    tlsEnable: ").append(toIndentedString(tlsEnable)).append("\n");
        sb.append("    udp: ").append(toIndentedString(udp)).append("\n");
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

