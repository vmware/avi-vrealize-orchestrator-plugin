package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HttpCacheConfig;
import com.vmware.avi.vro.model.CompressionProfile;
import com.vmware.avi.vro.model.HTTP2ApplicationProfile;
import com.vmware.avi.vro.model.HTTPSessionConfig;
import com.vmware.avi.vro.model.SSLClientCertificateAction;
import com.vmware.avi.vro.model.TrueClientIPConfig;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HTTPApplicationProfile is a POJO class extends AviRestResource that used for creating
 * HTTPApplicationProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPApplicationProfile")
@VsoFinder(name = Constants.FINDER_VRO_HTTPAPPLICATIONPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPApplicationProfile extends AviRestResource {
    @JsonProperty("allow_dots_in_header_name")
    @JsonInclude(Include.NON_NULL)
    private Boolean allowDotsInHeaderName = false;

    @JsonProperty("cache_config")
    @JsonInclude(Include.NON_NULL)
    private HttpCacheConfig cacheConfig = null;

    @JsonProperty("client_body_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer clientBodyTimeout = 30000;

    @JsonProperty("client_header_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer clientHeaderTimeout = 10000;

    @JsonProperty("client_max_body_size")
    @JsonInclude(Include.NON_NULL)
    private Integer clientMaxBodySize = 0;

    @JsonProperty("client_max_header_size")
    @JsonInclude(Include.NON_NULL)
    private Integer clientMaxHeaderSize = 12;

    @JsonProperty("client_max_request_size")
    @JsonInclude(Include.NON_NULL)
    private Integer clientMaxRequestSize = 48;

    @JsonProperty("collect_client_tls_fingerprint")
    @JsonInclude(Include.NON_NULL)
    private Boolean collectClientTlsFingerprint = false;

    @JsonProperty("compression_profile")
    @JsonInclude(Include.NON_NULL)
    private CompressionProfile compressionProfile = null;

    @JsonProperty("connection_multiplexing_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean connectionMultiplexingEnabled = true;

    @JsonProperty("detect_ntlm_app")
    @JsonInclude(Include.NON_NULL)
    private Boolean detectNtlmApp = true;

    @JsonProperty("disable_keepalive_posts_msie6")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableKeepalivePostsMsie6 = true;

    @JsonProperty("disable_sni_hostname_check")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableSniHostnameCheck = false;

    @JsonProperty("enable_chunk_merge")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableChunkMerge = true;

    @JsonProperty("enable_fire_and_forget")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableFireAndForget = false;

    @JsonProperty("enable_request_body_buffering")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableRequestBodyBuffering = false;

    @JsonProperty("enable_request_body_metrics")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableRequestBodyMetrics = false;

    @JsonProperty("fwd_close_hdr_for_bound_connections")
    @JsonInclude(Include.NON_NULL)
    private Boolean fwdCloseHdrForBoundConnections = true;

    @JsonProperty("hsts_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean hstsEnabled = false;

    @JsonProperty("hsts_max_age")
    @JsonInclude(Include.NON_NULL)
    private Integer hstsMaxAge = 365;

    @JsonProperty("hsts_subdomains_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean hstsSubdomainsEnabled;

    @JsonProperty("http2_profile")
    @JsonInclude(Include.NON_NULL)
    private HTTP2ApplicationProfile http2Profile = null;

    @JsonProperty("http_to_https")
    @JsonInclude(Include.NON_NULL)
    private Boolean httpToHttps = false;

    @JsonProperty("http_upstream_buffer_size")
    @JsonInclude(Include.NON_NULL)
    private Integer httpUpstreamBufferSize = 0;

    @JsonProperty("httponly_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean httponlyEnabled = false;

    @JsonProperty("keepalive_header")
    @JsonInclude(Include.NON_NULL)
    private Boolean keepaliveHeader = false;

    @JsonProperty("keepalive_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer keepaliveTimeout = 30000;

    @JsonProperty("max_bad_rps_cip")
    @JsonInclude(Include.NON_NULL)
    private Integer maxBadRpsCip = 0;

    @JsonProperty("max_bad_rps_cip_uri")
    @JsonInclude(Include.NON_NULL)
    private Integer maxBadRpsCipUri = 0;

    @JsonProperty("max_bad_rps_uri")
    @JsonInclude(Include.NON_NULL)
    private Integer maxBadRpsUri = 0;

    @JsonProperty("max_header_count")
    @JsonInclude(Include.NON_NULL)
    private Integer maxHeaderCount;

    @JsonProperty("max_keepalive_requests")
    @JsonInclude(Include.NON_NULL)
    private Integer maxKeepaliveRequests = 100;

    @JsonProperty("max_response_headers_size")
    @JsonInclude(Include.NON_NULL)
    private Integer maxResponseHeadersSize = 48;

    @JsonProperty("max_rps_cip")
    @JsonInclude(Include.NON_NULL)
    private Integer maxRpsCip = 0;

    @JsonProperty("max_rps_cip_uri")
    @JsonInclude(Include.NON_NULL)
    private Integer maxRpsCipUri = 0;

    @JsonProperty("max_rps_unknown_cip")
    @JsonInclude(Include.NON_NULL)
    private Integer maxRpsUnknownCip = 0;

    @JsonProperty("max_rps_unknown_uri")
    @JsonInclude(Include.NON_NULL)
    private Integer maxRpsUnknownUri = 0;

    @JsonProperty("max_rps_uri")
    @JsonInclude(Include.NON_NULL)
    private Integer maxRpsUri = 0;

    @JsonProperty("pass_through_x_accel_headers")
    @JsonInclude(Include.NON_NULL)
    private Boolean passThroughXAccelHeaders = false;

    @JsonProperty("pki_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String pkiProfileRef = null;

    @JsonProperty("post_accept_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer postAcceptTimeout = 30000;

    @JsonProperty("reset_conn_http_on_ssl_port")
    @JsonInclude(Include.NON_NULL)
    private Boolean resetConnHttpOnSslPort = false;

    @JsonProperty("respond_with_100_continue")
    @JsonInclude(Include.NON_NULL)
    private Boolean respondWith100Continue = true;

    @JsonProperty("secure_cookie_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean secureCookieEnabled = false;

    @JsonProperty("server_side_redirect_to_https")
    @JsonInclude(Include.NON_NULL)
    private Boolean serverSideRedirectToHttps = false;

    @JsonProperty("session_config")
    @JsonInclude(Include.NON_NULL)
    private HTTPSessionConfig sessionConfig = null;

    @JsonProperty("ssl_client_certificate_action")
    @JsonInclude(Include.NON_NULL)
    private SSLClientCertificateAction sslClientCertificateAction = null;

    @JsonProperty("ssl_client_certificate_mode")
    @JsonInclude(Include.NON_NULL)
    private String sslClientCertificateMode = "SSL_CLIENT_CERTIFICATE_NONE";

    @JsonProperty("true_client_ip")
    @JsonInclude(Include.NON_NULL)
    private TrueClientIPConfig trueClientIp = null;

    @JsonProperty("use_app_keepalive_timeout")
    @JsonInclude(Include.NON_NULL)
    private Boolean useAppKeepaliveTimeout = false;

    @JsonProperty("use_true_client_ip")
    @JsonInclude(Include.NON_NULL)
    private Boolean useTrueClientIp = false;

    @JsonProperty("websockets_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean websocketsEnabled = true;

    @JsonProperty("x_forwarded_proto_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean xForwardedProtoEnabled = false;

    @JsonProperty("xff_alternate_name")
    @JsonInclude(Include.NON_NULL)
    private String xffAlternateName = "X-Forwarded-For";

    @JsonProperty("xff_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean xffEnabled = true;

    @JsonProperty("xff_update")
    @JsonInclude(Include.NON_NULL)
    private String xffUpdate = "REPLACE_XFF_HEADERS";



  /**
   * This is the getter method this will return the attribute value.
   * Allow use of dot (.) in http header names, for instance header.app.special  pickappversionx.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return allowDotsInHeaderName
   */
  @VsoMethod
  public Boolean getAllowDotsInHeaderName() {
    return allowDotsInHeaderName;
  }

  /**
   * This is the setter method to the attribute.
   * Allow use of dot (.) in http header names, for instance header.app.special  pickappversionx.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param allowDotsInHeaderName set the allowDotsInHeaderName.
   */
  @VsoMethod
  public void setAllowDotsInHeaderName(Boolean  allowDotsInHeaderName) {
    this.allowDotsInHeaderName = allowDotsInHeaderName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http caching config to use with this http profile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cacheConfig
   */
  @VsoMethod
  public HttpCacheConfig getCacheConfig() {
    return cacheConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Http caching config to use with this http profile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cacheConfig set the cacheConfig.
   */
  @VsoMethod
  public void setCacheConfig(HttpCacheConfig cacheConfig) {
    this.cacheConfig = cacheConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The maximum length of time allowed between consecutive read operations for a client request body.
   * The value '0' specifies no timeout.
   * This setting generally impacts the length of time allowed for a client to send a post.
   * Allowed values are 0-100000000.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 30000), basic edition with any value, enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30000.
   * @return clientBodyTimeout
   */
  @VsoMethod
  public Integer getClientBodyTimeout() {
    return clientBodyTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum length of time allowed between consecutive read operations for a client request body.
   * The value '0' specifies no timeout.
   * This setting generally impacts the length of time allowed for a client to send a post.
   * Allowed values are 0-100000000.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 30000), basic edition with any value, enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30000.
   * @param clientBodyTimeout set the clientBodyTimeout.
   */
  @VsoMethod
  public void setClientBodyTimeout(Integer  clientBodyTimeout) {
    this.clientBodyTimeout = clientBodyTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The maximum length of time allowed for a client to transmit an entire request header.
   * This helps mitigate various forms of slowloris attacks.
   * Allowed values are 10-100000000.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 10000), basic edition(allowed values- 10000), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @return clientHeaderTimeout
   */
  @VsoMethod
  public Integer getClientHeaderTimeout() {
    return clientHeaderTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum length of time allowed for a client to transmit an entire request header.
   * This helps mitigate various forms of slowloris attacks.
   * Allowed values are 10-100000000.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 10000), basic edition(allowed values- 10000), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @param clientHeaderTimeout set the clientHeaderTimeout.
   */
  @VsoMethod
  public void setClientHeaderTimeout(Integer  clientHeaderTimeout) {
    this.clientHeaderTimeout = clientHeaderTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum size for the client request body.
   * This limits the size of the client data that can be uploaded/posted as part of a single http request.
   * Default 0 => unlimited.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return clientMaxBodySize
   */
  @VsoMethod
  public Integer getClientMaxBodySize() {
    return clientMaxBodySize;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum size for the client request body.
   * This limits the size of the client data that can be uploaded/posted as part of a single http request.
   * Default 0 => unlimited.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param clientMaxBodySize set the clientMaxBodySize.
   */
  @VsoMethod
  public void setClientMaxBodySize(Integer  clientMaxBodySize) {
    this.clientMaxBodySize = clientMaxBodySize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum size in kbytes of a single http header in the client request.
   * Allowed values are 1-64.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 12), basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 12.
   * @return clientMaxHeaderSize
   */
  @VsoMethod
  public Integer getClientMaxHeaderSize() {
    return clientMaxHeaderSize;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum size in kbytes of a single http header in the client request.
   * Allowed values are 1-64.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 12), basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 12.
   * @param clientMaxHeaderSize set the clientMaxHeaderSize.
   */
  @VsoMethod
  public void setClientMaxHeaderSize(Integer  clientMaxHeaderSize) {
    this.clientMaxHeaderSize = clientMaxHeaderSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum size in kbytes of all the client http request headers.this value can be overriden by client_max_header_size if that is larger.
   * Allowed values are 1-256.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 48.
   * @return clientMaxRequestSize
   */
  @VsoMethod
  public Integer getClientMaxRequestSize() {
    return clientMaxRequestSize;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum size in kbytes of all the client http request headers.this value can be overriden by client_max_header_size if that is larger.
   * Allowed values are 1-256.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 48.
   * @param clientMaxRequestSize set the clientMaxRequestSize.
   */
  @VsoMethod
  public void setClientMaxRequestSize(Integer  clientMaxRequestSize) {
    this.clientMaxRequestSize = clientMaxRequestSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If enabled, the client's tls fingerprint will be collected and included in the application log.
   * For virtual services with bot detection enabled, tls fingerprints are always computed if 'use_tls_fingerprint' is enabled in the bot detection
   * policy's user-agent detection component.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return collectClientTlsFingerprint
   */
  @VsoMethod
  public Boolean getCollectClientTlsFingerprint() {
    return collectClientTlsFingerprint;
  }

  /**
   * This is the setter method to the attribute.
   * If enabled, the client's tls fingerprint will be collected and included in the application log.
   * For virtual services with bot detection enabled, tls fingerprints are always computed if 'use_tls_fingerprint' is enabled in the bot detection
   * policy's user-agent detection component.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param collectClientTlsFingerprint set the collectClientTlsFingerprint.
   */
  @VsoMethod
  public void setCollectClientTlsFingerprint(Boolean  collectClientTlsFingerprint) {
    this.collectClientTlsFingerprint = collectClientTlsFingerprint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http compression settings to use with this http profile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return compressionProfile
   */
  @VsoMethod
  public CompressionProfile getCompressionProfile() {
    return compressionProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Http compression settings to use with this http profile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param compressionProfile set the compressionProfile.
   */
  @VsoMethod
  public void setCompressionProfile(CompressionProfile compressionProfile) {
    this.compressionProfile = compressionProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allows http requests, not just tcp connections, to be load balanced across servers.
   * Proxied tcp connections to servers may be reused by multiple clients to improve performance.
   * Not compatible with preserve client ip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return connectionMultiplexingEnabled
   */
  @VsoMethod
  public Boolean getConnectionMultiplexingEnabled() {
    return connectionMultiplexingEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Allows http requests, not just tcp connections, to be load balanced across servers.
   * Proxied tcp connections to servers may be reused by multiple clients to improve performance.
   * Not compatible with preserve client ip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param connectionMultiplexingEnabled set the connectionMultiplexingEnabled.
   */
  @VsoMethod
  public void setConnectionMultiplexingEnabled(Boolean  connectionMultiplexingEnabled) {
    this.connectionMultiplexingEnabled = connectionMultiplexingEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Detect ntlm apps based on the http response from the server.
   * Once detected, connection multiplexing will be disabled for that connection.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return detectNtlmApp
   */
  @VsoMethod
  public Boolean getDetectNtlmApp() {
    return detectNtlmApp;
  }

  /**
   * This is the setter method to the attribute.
   * Detect ntlm apps based on the http response from the server.
   * Once detected, connection multiplexing will be disabled for that connection.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param detectNtlmApp set the detectNtlmApp.
   */
  @VsoMethod
  public void setDetectNtlmApp(Boolean  detectNtlmApp) {
    this.detectNtlmApp = detectNtlmApp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disable keep-alive client side connections for older browsers based off ms internet explorer 6.0 (msie6).
   * For some applications, this might break ntlm authentication for older clients based off msie6.
   * For such applications, set this option to false to allow keep-alive connections.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return disableKeepalivePostsMsie6
   */
  @VsoMethod
  public Boolean getDisableKeepalivePostsMsie6() {
    return disableKeepalivePostsMsie6;
  }

  /**
   * This is the setter method to the attribute.
   * Disable keep-alive client side connections for older browsers based off ms internet explorer 6.0 (msie6).
   * For some applications, this might break ntlm authentication for older clients based off msie6.
   * For such applications, set this option to false to allow keep-alive connections.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param disableKeepalivePostsMsie6 set the disableKeepalivePostsMsie6.
   */
  @VsoMethod
  public void setDisableKeepalivePostsMsie6(Boolean  disableKeepalivePostsMsie6) {
    this.disableKeepalivePostsMsie6 = disableKeepalivePostsMsie6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disable strict check between tls servername and http host name.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disableSniHostnameCheck
   */
  @VsoMethod
  public Boolean getDisableSniHostnameCheck() {
    return disableSniHostnameCheck;
  }

  /**
   * This is the setter method to the attribute.
   * Disable strict check between tls servername and http host name.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disableSniHostnameCheck set the disableSniHostnameCheck.
   */
  @VsoMethod
  public void setDisableSniHostnameCheck(Boolean  disableSniHostnameCheck) {
    this.disableSniHostnameCheck = disableSniHostnameCheck;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable chunk body merge for chunked transfer encoding response.
   * Field introduced in 18.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enableChunkMerge
   */
  @VsoMethod
  public Boolean getEnableChunkMerge() {
    return enableChunkMerge;
  }

  /**
   * This is the setter method to the attribute.
   * Enable chunk body merge for chunked transfer encoding response.
   * Field introduced in 18.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enableChunkMerge set the enableChunkMerge.
   */
  @VsoMethod
  public void setEnableChunkMerge(Boolean  enableChunkMerge) {
    this.enableChunkMerge = enableChunkMerge;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable support for fire and forget feature.
   * If enabled, request from client is forwarded to server even if client prematurely closes the connection.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableFireAndForget
   */
  @VsoMethod
  public Boolean getEnableFireAndForget() {
    return enableFireAndForget;
  }

  /**
   * This is the setter method to the attribute.
   * Enable support for fire and forget feature.
   * If enabled, request from client is forwarded to server even if client prematurely closes the connection.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableFireAndForget set the enableFireAndForget.
   */
  @VsoMethod
  public void setEnableFireAndForget(Boolean  enableFireAndForget) {
    this.enableFireAndForget = enableFireAndForget;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable request body buffering for post requests.
   * If enabled, max buffer size is set to lower of 32m or the value (non-zero) configured in client_max_body_size.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableRequestBodyBuffering
   */
  @VsoMethod
  public Boolean getEnableRequestBodyBuffering() {
    return enableRequestBodyBuffering;
  }

  /**
   * This is the setter method to the attribute.
   * Enable request body buffering for post requests.
   * If enabled, max buffer size is set to lower of 32m or the value (non-zero) configured in client_max_body_size.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableRequestBodyBuffering set the enableRequestBodyBuffering.
   */
  @VsoMethod
  public void setEnableRequestBodyBuffering(Boolean  enableRequestBodyBuffering) {
    this.enableRequestBodyBuffering = enableRequestBodyBuffering;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable http request body metrics.
   * If enabled, requests from clients are parsed and relevant statistics about them are gathered.
   * Currently, it processes http post requests with content-type application/x-www-form-urlencoded or multipart/form-data, and adds the number of
   * detected parameters to the l7_client.http_params_count.
   * This is an experimental feature and it may have performance impact.
   * Use it when detailed information about the number of http post parameters is needed, e.g.
   * For waf sizing.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableRequestBodyMetrics
   */
  @VsoMethod
  public Boolean getEnableRequestBodyMetrics() {
    return enableRequestBodyMetrics;
  }

  /**
   * This is the setter method to the attribute.
   * Enable http request body metrics.
   * If enabled, requests from clients are parsed and relevant statistics about them are gathered.
   * Currently, it processes http post requests with content-type application/x-www-form-urlencoded or multipart/form-data, and adds the number of
   * detected parameters to the l7_client.http_params_count.
   * This is an experimental feature and it may have performance impact.
   * Use it when detailed information about the number of http post parameters is needed, e.g.
   * For waf sizing.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableRequestBodyMetrics set the enableRequestBodyMetrics.
   */
  @VsoMethod
  public void setEnableRequestBodyMetrics(Boolean  enableRequestBodyMetrics) {
    this.enableRequestBodyMetrics = enableRequestBodyMetrics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Forward the connection  close header coming from backend server to the client if connection-switching is enabled, i.e.
   * Front-end and backend connections are bound together.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return fwdCloseHdrForBoundConnections
   */
  @VsoMethod
  public Boolean getFwdCloseHdrForBoundConnections() {
    return fwdCloseHdrForBoundConnections;
  }

  /**
   * This is the setter method to the attribute.
   * Forward the connection  close header coming from backend server to the client if connection-switching is enabled, i.e.
   * Front-end and backend connections are bound together.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param fwdCloseHdrForBoundConnections set the fwdCloseHdrForBoundConnections.
   */
  @VsoMethod
  public void setFwdCloseHdrForBoundConnections(Boolean  fwdCloseHdrForBoundConnections) {
    this.fwdCloseHdrForBoundConnections = fwdCloseHdrForBoundConnections;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Inserts http strict-transport-security header in the https response.
   * Hsts can help mitigate man-in-the-middle attacks by telling browsers that support hsts that they should only access this site via https.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return hstsEnabled
   */
  @VsoMethod
  public Boolean getHstsEnabled() {
    return hstsEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Inserts http strict-transport-security header in the https response.
   * Hsts can help mitigate man-in-the-middle attacks by telling browsers that support hsts that they should only access this site via https.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param hstsEnabled set the hstsEnabled.
   */
  @VsoMethod
  public void setHstsEnabled(Boolean  hstsEnabled) {
    this.hstsEnabled = hstsEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of days for which the client should regard this virtual service as a known hsts host.
   * Allowed values are 0-10000.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 365), basic edition(allowed values- 365), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 365.
   * @return hstsMaxAge
   */
  @VsoMethod
  public Integer getHstsMaxAge() {
    return hstsMaxAge;
  }

  /**
   * This is the setter method to the attribute.
   * Number of days for which the client should regard this virtual service as a known hsts host.
   * Allowed values are 0-10000.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 365), basic edition(allowed values- 365), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 365.
   * @param hstsMaxAge set the hstsMaxAge.
   */
  @VsoMethod
  public void setHstsMaxAge(Integer  hstsMaxAge) {
    this.hstsMaxAge = hstsMaxAge;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Insert the 'includesubdomains' directive in the http strict-transport-security header.
   * Adding the includesubdomains directive signals the user-agent that the hsts policy applies to this hsts host as well as any subdomains of the
   * host's domain name.
   * Field introduced in 17.2.13, 18.1.4, 18.2.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @return hstsSubdomainsEnabled
   */
  @VsoMethod
  public Boolean getHstsSubdomainsEnabled() {
    return hstsSubdomainsEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Insert the 'includesubdomains' directive in the http strict-transport-security header.
   * Adding the includesubdomains directive signals the user-agent that the hsts policy applies to this hsts host as well as any subdomains of the
   * host's domain name.
   * Field introduced in 17.2.13, 18.1.4, 18.2.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @param hstsSubdomainsEnabled set the hstsSubdomainsEnabled.
   */
  @VsoMethod
  public void setHstsSubdomainsEnabled(Boolean  hstsSubdomainsEnabled) {
    this.hstsSubdomainsEnabled = hstsSubdomainsEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the http/2 specific application profile parameters.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return http2Profile
   */
  @VsoMethod
  public HTTP2ApplicationProfile getHttp2Profile() {
    return http2Profile;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the http/2 specific application profile parameters.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param http2Profile set the http2Profile.
   */
  @VsoMethod
  public void setHttp2Profile(HTTP2ApplicationProfile http2Profile) {
    this.http2Profile = http2Profile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Client requests received via http will be redirected to https.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return httpToHttps
   */
  @VsoMethod
  public Boolean getHttpToHttps() {
    return httpToHttps;
  }

  /**
   * This is the setter method to the attribute.
   * Client requests received via http will be redirected to https.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param httpToHttps set the httpToHttps.
   */
  @VsoMethod
  public void setHttpToHttps(Boolean  httpToHttps) {
    this.httpToHttps = httpToHttps;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Size of http buffer in kb.
   * Allowed values are 1-256.
   * Special values are 0- auto compute the size of buffer.
   * Field introduced in 20.1.1.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return httpUpstreamBufferSize
   */
  @VsoMethod
  public Integer getHttpUpstreamBufferSize() {
    return httpUpstreamBufferSize;
  }

  /**
   * This is the setter method to the attribute.
   * Size of http buffer in kb.
   * Allowed values are 1-256.
   * Special values are 0- auto compute the size of buffer.
   * Field introduced in 20.1.1.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param httpUpstreamBufferSize set the httpUpstreamBufferSize.
   */
  @VsoMethod
  public void setHttpUpstreamBufferSize(Integer  httpUpstreamBufferSize) {
    this.httpUpstreamBufferSize = httpUpstreamBufferSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mark http cookies as httponly.
   * This helps mitigate cross site scripting attacks as browsers will not allow these cookies to be read by third parties, such as javascript.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return httponlyEnabled
   */
  @VsoMethod
  public Boolean getHttponlyEnabled() {
    return httponlyEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Mark http cookies as httponly.
   * This helps mitigate cross site scripting attacks as browsers will not allow these cookies to be read by third parties, such as javascript.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param httponlyEnabled set the httponlyEnabled.
   */
  @VsoMethod
  public void setHttponlyEnabled(Boolean  httponlyEnabled) {
    this.httponlyEnabled = httponlyEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Send http 'keep-alive' header to the client.
   * By default, the timeout specified in the 'keep-alive timeout' field will be used unless the 'use app keepalive timeout' flag is set, in which
   * case the timeout sent by the application will be honored.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return keepaliveHeader
   */
  @VsoMethod
  public Boolean getKeepaliveHeader() {
    return keepaliveHeader;
  }

  /**
   * This is the setter method to the attribute.
   * Send http 'keep-alive' header to the client.
   * By default, the timeout specified in the 'keep-alive timeout' field will be used unless the 'use app keepalive timeout' flag is set, in which
   * case the timeout sent by the application will be honored.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param keepaliveHeader set the keepaliveHeader.
   */
  @VsoMethod
  public void setKeepaliveHeader(Boolean  keepaliveHeader) {
    this.keepaliveHeader = keepaliveHeader;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The max idle time allowed between http requests over a keep-alive connection.
   * Allowed values are 10-100000000.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 30000), basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30000.
   * @return keepaliveTimeout
   */
  @VsoMethod
  public Integer getKeepaliveTimeout() {
    return keepaliveTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * The max idle time allowed between http requests over a keep-alive connection.
   * Allowed values are 10-100000000.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 30000), basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30000.
   * @param keepaliveTimeout set the keepaliveTimeout.
   */
  @VsoMethod
  public void setKeepaliveTimeout(Integer  keepaliveTimeout) {
    this.keepaliveTimeout = keepaliveTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum bad requests per second per client ip.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxBadRpsCip
   */
  @VsoMethod
  public Integer getMaxBadRpsCip() {
    return maxBadRpsCip;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum bad requests per second per client ip.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxBadRpsCip set the maxBadRpsCip.
   */
  @VsoMethod
  public void setMaxBadRpsCip(Integer  maxBadRpsCip) {
    this.maxBadRpsCip = maxBadRpsCip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum bad requests per second per client ip and uri.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxBadRpsCipUri
   */
  @VsoMethod
  public Integer getMaxBadRpsCipUri() {
    return maxBadRpsCipUri;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum bad requests per second per client ip and uri.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxBadRpsCipUri set the maxBadRpsCipUri.
   */
  @VsoMethod
  public void setMaxBadRpsCipUri(Integer  maxBadRpsCipUri) {
    this.maxBadRpsCipUri = maxBadRpsCipUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum bad requests per second per uri.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxBadRpsUri
   */
  @VsoMethod
  public Integer getMaxBadRpsUri() {
    return maxBadRpsUri;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum bad requests per second per uri.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxBadRpsUri set the maxBadRpsUri.
   */
  @VsoMethod
  public void setMaxBadRpsUri(Integer  maxBadRpsUri) {
    this.maxBadRpsUri = maxBadRpsUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of headers allowed in http request and response.
   * Allowed values are 0-4096.
   * Special values are 0- unlimited headers in request and response.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
   * services edition.
   * Special default for essentials edition is 0, basic edition is 0, enterprise is 256.
   * @return maxHeaderCount
   */
  @VsoMethod
  public Integer getMaxHeaderCount() {
    return maxHeaderCount;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of headers allowed in http request and response.
   * Allowed values are 0-4096.
   * Special values are 0- unlimited headers in request and response.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
   * services edition.
   * Special default for essentials edition is 0, basic edition is 0, enterprise is 256.
   * @param maxHeaderCount set the maxHeaderCount.
   */
  @VsoMethod
  public void setMaxHeaderCount(Integer  maxHeaderCount) {
    this.maxHeaderCount = maxHeaderCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The max number of http requests that can be sent over a keep-alive connection.
   * '0' means unlimited.
   * Allowed values are 0-1000000.
   * Special values are 0- unlimited requests on a connection.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 100), basic edition(allowed values- 100), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return maxKeepaliveRequests
   */
  @VsoMethod
  public Integer getMaxKeepaliveRequests() {
    return maxKeepaliveRequests;
  }

  /**
   * This is the setter method to the attribute.
   * The max number of http requests that can be sent over a keep-alive connection.
   * '0' means unlimited.
   * Allowed values are 0-1000000.
   * Special values are 0- unlimited requests on a connection.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 100), basic edition(allowed values- 100), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param maxKeepaliveRequests set the maxKeepaliveRequests.
   */
  @VsoMethod
  public void setMaxKeepaliveRequests(Integer  maxKeepaliveRequests) {
    this.maxKeepaliveRequests = maxKeepaliveRequests;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum size in kbytes of all the http response headers.
   * Allowed values are 1-256.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 48), basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 48.
   * @return maxResponseHeadersSize
   */
  @VsoMethod
  public Integer getMaxResponseHeadersSize() {
    return maxResponseHeadersSize;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum size in kbytes of all the http response headers.
   * Allowed values are 1-256.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 48), basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 48.
   * @param maxResponseHeadersSize set the maxResponseHeadersSize.
   */
  @VsoMethod
  public void setMaxResponseHeadersSize(Integer  maxResponseHeadersSize) {
    this.maxResponseHeadersSize = maxResponseHeadersSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum requests per second per client ip.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxRpsCip
   */
  @VsoMethod
  public Integer getMaxRpsCip() {
    return maxRpsCip;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum requests per second per client ip.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxRpsCip set the maxRpsCip.
   */
  @VsoMethod
  public void setMaxRpsCip(Integer  maxRpsCip) {
    this.maxRpsCip = maxRpsCip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum requests per second per client ip and uri.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxRpsCipUri
   */
  @VsoMethod
  public Integer getMaxRpsCipUri() {
    return maxRpsCipUri;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum requests per second per client ip and uri.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxRpsCipUri set the maxRpsCipUri.
   */
  @VsoMethod
  public void setMaxRpsCipUri(Integer  maxRpsCipUri) {
    this.maxRpsCipUri = maxRpsCipUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum unknown client ips per second.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxRpsUnknownCip
   */
  @VsoMethod
  public Integer getMaxRpsUnknownCip() {
    return maxRpsUnknownCip;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum unknown client ips per second.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxRpsUnknownCip set the maxRpsUnknownCip.
   */
  @VsoMethod
  public void setMaxRpsUnknownCip(Integer  maxRpsUnknownCip) {
    this.maxRpsUnknownCip = maxRpsUnknownCip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum unknown uris per second.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxRpsUnknownUri
   */
  @VsoMethod
  public Integer getMaxRpsUnknownUri() {
    return maxRpsUnknownUri;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum unknown uris per second.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxRpsUnknownUri set the maxRpsUnknownUri.
   */
  @VsoMethod
  public void setMaxRpsUnknownUri(Integer  maxRpsUnknownUri) {
    this.maxRpsUnknownUri = maxRpsUnknownUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum requests per second per uri.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxRpsUri
   */
  @VsoMethod
  public Integer getMaxRpsUri() {
    return maxRpsUri;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum requests per second per uri.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxRpsUri set the maxRpsUri.
   */
  @VsoMethod
  public void setMaxRpsUri(Integer  maxRpsUri) {
    this.maxRpsUri = maxRpsUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pass through x-accel headers.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return passThroughXAccelHeaders
   */
  @VsoMethod
  public Boolean getPassThroughXAccelHeaders() {
    return passThroughXAccelHeaders;
  }

  /**
   * This is the setter method to the attribute.
   * Pass through x-accel headers.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param passThroughXAccelHeaders set the passThroughXAccelHeaders.
   */
  @VsoMethod
  public void setPassThroughXAccelHeaders(Boolean  passThroughXAccelHeaders) {
    this.passThroughXAccelHeaders = passThroughXAccelHeaders;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select the pki profile to be associated with the virtual service.
   * This profile defines the certificate authority and revocation list.
   * It is a reference to an object of type pkiprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pkiProfileRef
   */
  @VsoMethod
  public String getPkiProfileRef() {
    return pkiProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Select the pki profile to be associated with the virtual service.
   * This profile defines the certificate authority and revocation list.
   * It is a reference to an object of type pkiprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pkiProfileRef set the pkiProfileRef.
   */
  @VsoMethod
  public void setPkiProfileRef(String  pkiProfileRef) {
    this.pkiProfileRef = pkiProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The max allowed length of time between a client establishing a tcp connection and avi receives the first byte of the client's http request.
   * Allowed values are 10-100000000.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 30000), basic edition(allowed values- 30000), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30000.
   * @return postAcceptTimeout
   */
  @VsoMethod
  public Integer getPostAcceptTimeout() {
    return postAcceptTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * The max allowed length of time between a client establishing a tcp connection and avi receives the first byte of the client's http request.
   * Allowed values are 10-100000000.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 30000), basic edition(allowed values- 30000), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30000.
   * @param postAcceptTimeout set the postAcceptTimeout.
   */
  @VsoMethod
  public void setPostAcceptTimeout(Integer  postAcceptTimeout) {
    this.postAcceptTimeout = postAcceptTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If enabled, an http request on an ssl port will result in connection close instead of a 400 response.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return resetConnHttpOnSslPort
   */
  @VsoMethod
  public Boolean getResetConnHttpOnSslPort() {
    return resetConnHttpOnSslPort;
  }

  /**
   * This is the setter method to the attribute.
   * If enabled, an http request on an ssl port will result in connection close instead of a 400 response.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param resetConnHttpOnSslPort set the resetConnHttpOnSslPort.
   */
  @VsoMethod
  public void setResetConnHttpOnSslPort(Boolean  resetConnHttpOnSslPort) {
    this.resetConnHttpOnSslPort = resetConnHttpOnSslPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Avi will respond with 100-continue response if expect  100-continue header received from client.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return respondWith100Continue
   */
  @VsoMethod
  public Boolean getRespondWith100Continue() {
    return respondWith100Continue;
  }

  /**
   * This is the setter method to the attribute.
   * Avi will respond with 100-continue response if expect  100-continue header received from client.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param respondWith100Continue set the respondWith100Continue.
   */
  @VsoMethod
  public void setRespondWith100Continue(Boolean  respondWith100Continue) {
    this.respondWith100Continue = respondWith100Continue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mark server cookies with the 'secure' attribute.
   * Client browsers will not send a cookie marked as secure over an unencrypted connection.
   * If avi is terminating ssl from clients and passing it as http to the server, the server may return cookies without the secure flag set.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return secureCookieEnabled
   */
  @VsoMethod
  public Boolean getSecureCookieEnabled() {
    return secureCookieEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Mark server cookies with the 'secure' attribute.
   * Client browsers will not send a cookie marked as secure over an unencrypted connection.
   * If avi is terminating ssl from clients and passing it as http to the server, the server may return cookies without the secure flag set.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param secureCookieEnabled set the secureCookieEnabled.
   */
  @VsoMethod
  public void setSecureCookieEnabled(Boolean  secureCookieEnabled) {
    this.secureCookieEnabled = secureCookieEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When terminating client ssl sessions at avi, servers may incorrectly send redirect to clients as http.
   * This option will rewrite the server's redirect responses for this virtual service from http to https.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return serverSideRedirectToHttps
   */
  @VsoMethod
  public Boolean getServerSideRedirectToHttps() {
    return serverSideRedirectToHttps;
  }

  /**
   * This is the setter method to the attribute.
   * When terminating client ssl sessions at avi, servers may incorrectly send redirect to clients as http.
   * This option will rewrite the server's redirect responses for this virtual service from http to https.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param serverSideRedirectToHttps set the serverSideRedirectToHttps.
   */
  @VsoMethod
  public void setServerSideRedirectToHttps(Boolean  serverSideRedirectToHttps) {
    this.serverSideRedirectToHttps = serverSideRedirectToHttps;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http session configuration.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sessionConfig
   */
  @VsoMethod
  public HTTPSessionConfig getSessionConfig() {
    return sessionConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Http session configuration.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sessionConfig set the sessionConfig.
   */
  @VsoMethod
  public void setSessionConfig(HTTPSessionConfig sessionConfig) {
    this.sessionConfig = sessionConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set of match/action rules that govern what happens when the client certificate request is enabled.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslClientCertificateAction
   */
  @VsoMethod
  public SSLClientCertificateAction getSslClientCertificateAction() {
    return sslClientCertificateAction;
  }

  /**
   * This is the setter method to the attribute.
   * Set of match/action rules that govern what happens when the client certificate request is enabled.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sslClientCertificateAction set the sslClientCertificateAction.
   */
  @VsoMethod
  public void setSslClientCertificateAction(SSLClientCertificateAction sslClientCertificateAction) {
    this.sslClientCertificateAction = sslClientCertificateAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies whether the client side verification is set to none, request or require.
   * Enum options - SSL_CLIENT_CERTIFICATE_NONE, SSL_CLIENT_CERTIFICATE_REQUEST, SSL_CLIENT_CERTIFICATE_REQUIRE.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- ssl_client_certificate_none,ssl_client_certificate_require),
   * basic edition(allowed values- ssl_client_certificate_none,ssl_client_certificate_require), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_CLIENT_CERTIFICATE_NONE".
   * @return sslClientCertificateMode
   */
  @VsoMethod
  public String getSslClientCertificateMode() {
    return sslClientCertificateMode;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies whether the client side verification is set to none, request or require.
   * Enum options - SSL_CLIENT_CERTIFICATE_NONE, SSL_CLIENT_CERTIFICATE_REQUEST, SSL_CLIENT_CERTIFICATE_REQUIRE.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- ssl_client_certificate_none,ssl_client_certificate_require),
   * basic edition(allowed values- ssl_client_certificate_none,ssl_client_certificate_require), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_CLIENT_CERTIFICATE_NONE".
   * @param sslClientCertificateMode set the sslClientCertificateMode.
   */
  @VsoMethod
  public void setSslClientCertificateMode(String  sslClientCertificateMode) {
    this.sslClientCertificateMode = sslClientCertificateMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Detect client ip from user specified header at the configured index in the specified direction.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return trueClientIp
   */
  @VsoMethod
  public TrueClientIPConfig getTrueClientIp() {
    return trueClientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Detect client ip from user specified header at the configured index in the specified direction.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param trueClientIp set the trueClientIp.
   */
  @VsoMethod
  public void setTrueClientIp(TrueClientIPConfig trueClientIp) {
    this.trueClientIp = trueClientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use 'keep-alive' header timeout sent by application instead of sending the http keep-alive timeout.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useAppKeepaliveTimeout
   */
  @VsoMethod
  public Boolean getUseAppKeepaliveTimeout() {
    return useAppKeepaliveTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Use 'keep-alive' header timeout sent by application instead of sending the http keep-alive timeout.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useAppKeepaliveTimeout set the useAppKeepaliveTimeout.
   */
  @VsoMethod
  public void setUseAppKeepaliveTimeout(Boolean  useAppKeepaliveTimeout) {
    this.useAppKeepaliveTimeout = useAppKeepaliveTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Detect client ip from user specified header.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useTrueClientIp
   */
  @VsoMethod
  public Boolean getUseTrueClientIp() {
    return useTrueClientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Detect client ip from user specified header.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useTrueClientIp set the useTrueClientIp.
   */
  @VsoMethod
  public void setUseTrueClientIp(Boolean  useTrueClientIp) {
    this.useTrueClientIp = useTrueClientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable websockets proxy for traffic from clients to the virtual service.
   * Connections to this vs start in http mode.
   * If the client requests an upgrade to websockets, and the server responds back with success, then the connection is upgraded to websockets mode.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return websocketsEnabled
   */
  @VsoMethod
  public Boolean getWebsocketsEnabled() {
    return websocketsEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable websockets proxy for traffic from clients to the virtual service.
   * Connections to this vs start in http mode.
   * If the client requests an upgrade to websockets, and the server responds back with success, then the connection is upgraded to websockets mode.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param websocketsEnabled set the websocketsEnabled.
   */
  @VsoMethod
  public void setWebsocketsEnabled(Boolean  websocketsEnabled) {
    this.websocketsEnabled = websocketsEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Insert an x-forwarded-proto header in the request sent to the server.
   * When the client connects via ssl, avi terminates the ssl, and then forwards the requests to the servers via http, so the servers can determine
   * the original protocol via this header.
   * In this example, the value will be 'https'.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return xForwardedProtoEnabled
   */
  @VsoMethod
  public Boolean getXForwardedProtoEnabled() {
    return xForwardedProtoEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Insert an x-forwarded-proto header in the request sent to the server.
   * When the client connects via ssl, avi terminates the ssl, and then forwards the requests to the servers via http, so the servers can determine
   * the original protocol via this header.
   * In this example, the value will be 'https'.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param xForwardedProtoEnabled set the xForwardedProtoEnabled.
   */
  @VsoMethod
  public void setXForwardedProtoEnabled(Boolean  xForwardedProtoEnabled) {
    this.xForwardedProtoEnabled = xForwardedProtoEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Provide a custom name for the x-forwarded-for header sent to the servers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "X-Forwarded-For".
   * @return xffAlternateName
   */
  @VsoMethod
  public String getXffAlternateName() {
    return xffAlternateName;
  }

  /**
   * This is the setter method to the attribute.
   * Provide a custom name for the x-forwarded-for header sent to the servers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "X-Forwarded-For".
   * @param xffAlternateName set the xffAlternateName.
   */
  @VsoMethod
  public void setXffAlternateName(String  xffAlternateName) {
    this.xffAlternateName = xffAlternateName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The client's original ip address is inserted into an http request header sent to the server.
   * Servers may use this address for logging or other purposes, rather than avi's source nat address used in the avi to server ip connection.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return xffEnabled
   */
  @VsoMethod
  public Boolean getXffEnabled() {
    return xffEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * The client's original ip address is inserted into an http request header sent to the server.
   * Servers may use this address for logging or other purposes, rather than avi's source nat address used in the avi to server ip connection.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param xffEnabled set the xffEnabled.
   */
  @VsoMethod
  public void setXffEnabled(Boolean  xffEnabled) {
    this.xffEnabled = xffEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure how incoming x-forwarded-for headers from the client are handled.
   * Enum options - REPLACE_XFF_HEADERS, APPEND_TO_THE_XFF_HEADER, ADD_NEW_XFF_HEADER.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "REPLACE_XFF_HEADERS".
   * @return xffUpdate
   */
  @VsoMethod
  public String getXffUpdate() {
    return xffUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * Configure how incoming x-forwarded-for headers from the client are handled.
   * Enum options - REPLACE_XFF_HEADERS, APPEND_TO_THE_XFF_HEADER, ADD_NEW_XFF_HEADER.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "REPLACE_XFF_HEADERS".
   * @param xffUpdate set the xffUpdate.
   */
  @VsoMethod
  public void setXffUpdate(String  xffUpdate) {
    this.xffUpdate = xffUpdate;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPApplicationProfile objHTTPApplicationProfile = (HTTPApplicationProfile) o;
  return   Objects.equals(this.connectionMultiplexingEnabled, objHTTPApplicationProfile.connectionMultiplexingEnabled)&&
  Objects.equals(this.xffEnabled, objHTTPApplicationProfile.xffEnabled)&&
  Objects.equals(this.xffAlternateName, objHTTPApplicationProfile.xffAlternateName)&&
  Objects.equals(this.xffUpdate, objHTTPApplicationProfile.xffUpdate)&&
  Objects.equals(this.hstsEnabled, objHTTPApplicationProfile.hstsEnabled)&&
  Objects.equals(this.hstsMaxAge, objHTTPApplicationProfile.hstsMaxAge)&&
  Objects.equals(this.hstsSubdomainsEnabled, objHTTPApplicationProfile.hstsSubdomainsEnabled)&&
  Objects.equals(this.secureCookieEnabled, objHTTPApplicationProfile.secureCookieEnabled)&&
  Objects.equals(this.httponlyEnabled, objHTTPApplicationProfile.httponlyEnabled)&&
  Objects.equals(this.httpToHttps, objHTTPApplicationProfile.httpToHttps)&&
  Objects.equals(this.serverSideRedirectToHttps, objHTTPApplicationProfile.serverSideRedirectToHttps)&&
  Objects.equals(this.xForwardedProtoEnabled, objHTTPApplicationProfile.xForwardedProtoEnabled)&&
  Objects.equals(this.compressionProfile, objHTTPApplicationProfile.compressionProfile)&&
  Objects.equals(this.postAcceptTimeout, objHTTPApplicationProfile.postAcceptTimeout)&&
  Objects.equals(this.clientHeaderTimeout, objHTTPApplicationProfile.clientHeaderTimeout)&&
  Objects.equals(this.clientBodyTimeout, objHTTPApplicationProfile.clientBodyTimeout)&&
  Objects.equals(this.keepaliveTimeout, objHTTPApplicationProfile.keepaliveTimeout)&&
  Objects.equals(this.clientMaxHeaderSize, objHTTPApplicationProfile.clientMaxHeaderSize)&&
  Objects.equals(this.clientMaxRequestSize, objHTTPApplicationProfile.clientMaxRequestSize)&&
  Objects.equals(this.clientMaxBodySize, objHTTPApplicationProfile.clientMaxBodySize)&&
  Objects.equals(this.cacheConfig, objHTTPApplicationProfile.cacheConfig)&&
  Objects.equals(this.maxRpsUnknownUri, objHTTPApplicationProfile.maxRpsUnknownUri)&&
  Objects.equals(this.maxRpsCip, objHTTPApplicationProfile.maxRpsCip)&&
  Objects.equals(this.maxRpsUri, objHTTPApplicationProfile.maxRpsUri)&&
  Objects.equals(this.maxRpsCipUri, objHTTPApplicationProfile.maxRpsCipUri)&&
  Objects.equals(this.sslClientCertificateAction, objHTTPApplicationProfile.sslClientCertificateAction)&&
  Objects.equals(this.sslClientCertificateMode, objHTTPApplicationProfile.sslClientCertificateMode)&&
  Objects.equals(this.pkiProfileRef, objHTTPApplicationProfile.pkiProfileRef)&&
  Objects.equals(this.websocketsEnabled, objHTTPApplicationProfile.websocketsEnabled)&&
  Objects.equals(this.maxRpsUnknownCip, objHTTPApplicationProfile.maxRpsUnknownCip)&&
  Objects.equals(this.maxBadRpsCip, objHTTPApplicationProfile.maxBadRpsCip)&&
  Objects.equals(this.maxBadRpsUri, objHTTPApplicationProfile.maxBadRpsUri)&&
  Objects.equals(this.maxBadRpsCipUri, objHTTPApplicationProfile.maxBadRpsCipUri)&&
  Objects.equals(this.keepaliveHeader, objHTTPApplicationProfile.keepaliveHeader)&&
  Objects.equals(this.useAppKeepaliveTimeout, objHTTPApplicationProfile.useAppKeepaliveTimeout)&&
  Objects.equals(this.allowDotsInHeaderName, objHTTPApplicationProfile.allowDotsInHeaderName)&&
  Objects.equals(this.disableKeepalivePostsMsie6, objHTTPApplicationProfile.disableKeepalivePostsMsie6)&&
  Objects.equals(this.enableRequestBodyBuffering, objHTTPApplicationProfile.enableRequestBodyBuffering)&&
  Objects.equals(this.enableFireAndForget, objHTTPApplicationProfile.enableFireAndForget)&&
  Objects.equals(this.maxResponseHeadersSize, objHTTPApplicationProfile.maxResponseHeadersSize)&&
  Objects.equals(this.respondWith100Continue, objHTTPApplicationProfile.respondWith100Continue)&&
  Objects.equals(this.enableRequestBodyMetrics, objHTTPApplicationProfile.enableRequestBodyMetrics)&&
  Objects.equals(this.fwdCloseHdrForBoundConnections, objHTTPApplicationProfile.fwdCloseHdrForBoundConnections)&&
  Objects.equals(this.maxKeepaliveRequests, objHTTPApplicationProfile.maxKeepaliveRequests)&&
  Objects.equals(this.disableSniHostnameCheck, objHTTPApplicationProfile.disableSniHostnameCheck)&&
  Objects.equals(this.resetConnHttpOnSslPort, objHTTPApplicationProfile.resetConnHttpOnSslPort)&&
  Objects.equals(this.httpUpstreamBufferSize, objHTTPApplicationProfile.httpUpstreamBufferSize)&&
  Objects.equals(this.enableChunkMerge, objHTTPApplicationProfile.enableChunkMerge)&&
  Objects.equals(this.http2Profile, objHTTPApplicationProfile.http2Profile)&&
  Objects.equals(this.detectNtlmApp, objHTTPApplicationProfile.detectNtlmApp)&&
  Objects.equals(this.useTrueClientIp, objHTTPApplicationProfile.useTrueClientIp)&&
  Objects.equals(this.trueClientIp, objHTTPApplicationProfile.trueClientIp)&&
  Objects.equals(this.passThroughXAccelHeaders, objHTTPApplicationProfile.passThroughXAccelHeaders)&&
  Objects.equals(this.collectClientTlsFingerprint, objHTTPApplicationProfile.collectClientTlsFingerprint)&&
  Objects.equals(this.maxHeaderCount, objHTTPApplicationProfile.maxHeaderCount)&&
  Objects.equals(this.sessionConfig, objHTTPApplicationProfile.sessionConfig);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPApplicationProfile {\n");
      sb.append("    allowDotsInHeaderName: ").append(toIndentedString(allowDotsInHeaderName)).append("\n");
        sb.append("    cacheConfig: ").append(toIndentedString(cacheConfig)).append("\n");
        sb.append("    clientBodyTimeout: ").append(toIndentedString(clientBodyTimeout)).append("\n");
        sb.append("    clientHeaderTimeout: ").append(toIndentedString(clientHeaderTimeout)).append("\n");
        sb.append("    clientMaxBodySize: ").append(toIndentedString(clientMaxBodySize)).append("\n");
        sb.append("    clientMaxHeaderSize: ").append(toIndentedString(clientMaxHeaderSize)).append("\n");
        sb.append("    clientMaxRequestSize: ").append(toIndentedString(clientMaxRequestSize)).append("\n");
        sb.append("    collectClientTlsFingerprint: ").append(toIndentedString(collectClientTlsFingerprint)).append("\n");
        sb.append("    compressionProfile: ").append(toIndentedString(compressionProfile)).append("\n");
        sb.append("    connectionMultiplexingEnabled: ").append(toIndentedString(connectionMultiplexingEnabled)).append("\n");
        sb.append("    detectNtlmApp: ").append(toIndentedString(detectNtlmApp)).append("\n");
        sb.append("    disableKeepalivePostsMsie6: ").append(toIndentedString(disableKeepalivePostsMsie6)).append("\n");
        sb.append("    disableSniHostnameCheck: ").append(toIndentedString(disableSniHostnameCheck)).append("\n");
        sb.append("    enableChunkMerge: ").append(toIndentedString(enableChunkMerge)).append("\n");
        sb.append("    enableFireAndForget: ").append(toIndentedString(enableFireAndForget)).append("\n");
        sb.append("    enableRequestBodyBuffering: ").append(toIndentedString(enableRequestBodyBuffering)).append("\n");
        sb.append("    enableRequestBodyMetrics: ").append(toIndentedString(enableRequestBodyMetrics)).append("\n");
        sb.append("    fwdCloseHdrForBoundConnections: ").append(toIndentedString(fwdCloseHdrForBoundConnections)).append("\n");
        sb.append("    hstsEnabled: ").append(toIndentedString(hstsEnabled)).append("\n");
        sb.append("    hstsMaxAge: ").append(toIndentedString(hstsMaxAge)).append("\n");
        sb.append("    hstsSubdomainsEnabled: ").append(toIndentedString(hstsSubdomainsEnabled)).append("\n");
        sb.append("    http2Profile: ").append(toIndentedString(http2Profile)).append("\n");
        sb.append("    httpToHttps: ").append(toIndentedString(httpToHttps)).append("\n");
        sb.append("    httpUpstreamBufferSize: ").append(toIndentedString(httpUpstreamBufferSize)).append("\n");
        sb.append("    httponlyEnabled: ").append(toIndentedString(httponlyEnabled)).append("\n");
        sb.append("    keepaliveHeader: ").append(toIndentedString(keepaliveHeader)).append("\n");
        sb.append("    keepaliveTimeout: ").append(toIndentedString(keepaliveTimeout)).append("\n");
        sb.append("    maxBadRpsCip: ").append(toIndentedString(maxBadRpsCip)).append("\n");
        sb.append("    maxBadRpsCipUri: ").append(toIndentedString(maxBadRpsCipUri)).append("\n");
        sb.append("    maxBadRpsUri: ").append(toIndentedString(maxBadRpsUri)).append("\n");
        sb.append("    maxHeaderCount: ").append(toIndentedString(maxHeaderCount)).append("\n");
        sb.append("    maxKeepaliveRequests: ").append(toIndentedString(maxKeepaliveRequests)).append("\n");
        sb.append("    maxResponseHeadersSize: ").append(toIndentedString(maxResponseHeadersSize)).append("\n");
        sb.append("    maxRpsCip: ").append(toIndentedString(maxRpsCip)).append("\n");
        sb.append("    maxRpsCipUri: ").append(toIndentedString(maxRpsCipUri)).append("\n");
        sb.append("    maxRpsUnknownCip: ").append(toIndentedString(maxRpsUnknownCip)).append("\n");
        sb.append("    maxRpsUnknownUri: ").append(toIndentedString(maxRpsUnknownUri)).append("\n");
        sb.append("    maxRpsUri: ").append(toIndentedString(maxRpsUri)).append("\n");
        sb.append("    passThroughXAccelHeaders: ").append(toIndentedString(passThroughXAccelHeaders)).append("\n");
        sb.append("    pkiProfileRef: ").append(toIndentedString(pkiProfileRef)).append("\n");
        sb.append("    postAcceptTimeout: ").append(toIndentedString(postAcceptTimeout)).append("\n");
        sb.append("    resetConnHttpOnSslPort: ").append(toIndentedString(resetConnHttpOnSslPort)).append("\n");
        sb.append("    respondWith100Continue: ").append(toIndentedString(respondWith100Continue)).append("\n");
        sb.append("    secureCookieEnabled: ").append(toIndentedString(secureCookieEnabled)).append("\n");
        sb.append("    serverSideRedirectToHttps: ").append(toIndentedString(serverSideRedirectToHttps)).append("\n");
        sb.append("    sessionConfig: ").append(toIndentedString(sessionConfig)).append("\n");
        sb.append("    sslClientCertificateAction: ").append(toIndentedString(sslClientCertificateAction)).append("\n");
        sb.append("    sslClientCertificateMode: ").append(toIndentedString(sslClientCertificateMode)).append("\n");
        sb.append("    trueClientIp: ").append(toIndentedString(trueClientIp)).append("\n");
        sb.append("    useAppKeepaliveTimeout: ").append(toIndentedString(useAppKeepaliveTimeout)).append("\n");
        sb.append("    useTrueClientIp: ").append(toIndentedString(useTrueClientIp)).append("\n");
        sb.append("    websocketsEnabled: ").append(toIndentedString(websocketsEnabled)).append("\n");
        sb.append("    xForwardedProtoEnabled: ").append(toIndentedString(xForwardedProtoEnabled)).append("\n");
        sb.append("    xffAlternateName: ").append(toIndentedString(xffAlternateName)).append("\n");
        sb.append("    xffEnabled: ").append(toIndentedString(xffEnabled)).append("\n");
        sb.append("    xffUpdate: ").append(toIndentedString(xffUpdate)).append("\n");
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

