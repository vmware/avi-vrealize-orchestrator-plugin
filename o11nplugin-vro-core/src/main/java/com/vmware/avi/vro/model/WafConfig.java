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
 * The WafConfig is a POJO class extends AviRestResource that used for creating
 * WafConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafConfig")
@VsoFinder(name = Constants.FINDER_VRO_WAFCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafConfig extends AviRestResource {
    @JsonProperty("allowed_http_versions")
    @JsonInclude(Include.NON_NULL)
    private List<String> allowedHttpVersions = null;

    @JsonProperty("allowed_methods")
    @JsonInclude(Include.NON_NULL)
    private List<String> allowedMethods = null;

    @JsonProperty("allowed_request_content_type_charsets")
    @JsonInclude(Include.NON_NULL)
    private List<String> allowedRequestContentTypeCharsets = null;

    @JsonProperty("argument_separator")
    @JsonInclude(Include.NON_NULL)
    private String argumentSeparator = "&";

    @JsonProperty("client_request_max_body_size")
    @JsonInclude(Include.NON_NULL)
    private Integer clientRequestMaxBodySize = 32;

    @JsonProperty("content_type_mappings")
    @JsonInclude(Include.NON_NULL)
    private List<WafContentTypeMapping> contentTypeMappings = null;

    @JsonProperty("cookie_format_version")
    @JsonInclude(Include.NON_NULL)
    private Integer cookieFormatVersion = 0;

    @JsonProperty("ignore_incomplete_request_body_error")
    @JsonInclude(Include.NON_NULL)
    private Boolean ignoreIncompleteRequestBodyError = true;

    @JsonProperty("max_execution_time")
    @JsonInclude(Include.NON_NULL)
    private Integer maxExecutionTime = 50;

    @JsonProperty("regex_match_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer regexMatchLimit = 30000;

    @JsonProperty("regex_recursion_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer regexRecursionLimit = 10000;

    @JsonProperty("request_body_default_action")
    @JsonInclude(Include.NON_NULL)
    private String requestBodyDefaultAction = "phase:2,deny,status:403,log,auditlog";

    @JsonProperty("request_hdr_default_action")
    @JsonInclude(Include.NON_NULL)
    private String requestHdrDefaultAction = "phase:1,deny,status:403,log,auditlog";

    @JsonProperty("response_body_default_action")
    @JsonInclude(Include.NON_NULL)
    private String responseBodyDefaultAction = "phase:4,deny,status:403,log,auditlog";

    @JsonProperty("response_hdr_default_action")
    @JsonInclude(Include.NON_NULL)
    private String responseHdrDefaultAction = "phase:3,deny,status:403,log,auditlog";

    @JsonProperty("restricted_extensions")
    @JsonInclude(Include.NON_NULL)
    private List<String> restrictedExtensions = null;

    @JsonProperty("restricted_headers")
    @JsonInclude(Include.NON_NULL)
    private List<String> restrictedHeaders = null;

    @JsonProperty("send_status_header")
    @JsonInclude(Include.NON_NULL)
    private Boolean sendStatusHeader = false;

    @JsonProperty("server_response_max_body_size")
    @JsonInclude(Include.NON_NULL)
    private Integer serverResponseMaxBodySize = 128;

    @JsonProperty("static_extensions")
    @JsonInclude(Include.NON_NULL)
    private List<String> staticExtensions = null;

    @JsonProperty("status_code_for_rejected_requests")
    @JsonInclude(Include.NON_NULL)
    private String statusCodeForRejectedRequests = "HTTP_RESPONSE_CODE_403";

    @JsonProperty("status_header_name")
    @JsonInclude(Include.NON_NULL)
    private String statusHeaderName = "X-WAF-Result";

    @JsonProperty("xml_xxe_protection")
    @JsonInclude(Include.NON_NULL)
    private Boolean xmlXxeProtection = true;



  /**
   * This is the getter method this will return the attribute value.
   * Waf allowed http versions.
   * Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO.
   * Field introduced in 17.2.1.
   * Maximum of 8 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedHttpVersions
   */
  @VsoMethod
  public List<String> getAllowedHttpVersions() {
    return allowedHttpVersions;
  }

  /**
   * This is the setter method. this will set the allowedHttpVersions
   * Waf allowed http versions.
   * Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO.
   * Field introduced in 17.2.1.
   * Maximum of 8 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedHttpVersions
   */
  @VsoMethod
  public void setAllowedHttpVersions(List<String>  allowedHttpVersions) {
    this.allowedHttpVersions = allowedHttpVersions;
  }

  /**
   * This is the setter method this will set the allowedHttpVersions
   * Waf allowed http versions.
   * Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO.
   * Field introduced in 17.2.1.
   * Maximum of 8 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedHttpVersions
   */
  @VsoMethod
  public WafConfig addAllowedHttpVersionsItem(String allowedHttpVersionsItem) {
    if (this.allowedHttpVersions == null) {
      this.allowedHttpVersions = new ArrayList<String>();
    }
    this.allowedHttpVersions.add(allowedHttpVersionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Waf allowed http methods.
   * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
   * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
   * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedMethods
   */
  @VsoMethod
  public List<String> getAllowedMethods() {
    return allowedMethods;
  }

  /**
   * This is the setter method. this will set the allowedMethods
   * Waf allowed http methods.
   * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
   * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
   * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedMethods
   */
  @VsoMethod
  public void setAllowedMethods(List<String>  allowedMethods) {
    this.allowedMethods = allowedMethods;
  }

  /**
   * This is the setter method this will set the allowedMethods
   * Waf allowed http methods.
   * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
   * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
   * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedMethods
   */
  @VsoMethod
  public WafConfig addAllowedMethodsItem(String allowedMethodsItem) {
    if (this.allowedMethods == null) {
      this.allowedMethods = new ArrayList<String>();
    }
    this.allowedMethods.add(allowedMethodsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed request content type character sets in waf.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedRequestContentTypeCharsets
   */
  @VsoMethod
  public List<String> getAllowedRequestContentTypeCharsets() {
    return allowedRequestContentTypeCharsets;
  }

  /**
   * This is the setter method. this will set the allowedRequestContentTypeCharsets
   * Allowed request content type character sets in waf.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedRequestContentTypeCharsets
   */
  @VsoMethod
  public void setAllowedRequestContentTypeCharsets(List<String>  allowedRequestContentTypeCharsets) {
    this.allowedRequestContentTypeCharsets = allowedRequestContentTypeCharsets;
  }

  /**
   * This is the setter method this will set the allowedRequestContentTypeCharsets
   * Allowed request content type character sets in waf.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedRequestContentTypeCharsets
   */
  @VsoMethod
  public WafConfig addAllowedRequestContentTypeCharsetsItem(String allowedRequestContentTypeCharsetsItem) {
    if (this.allowedRequestContentTypeCharsets == null) {
      this.allowedRequestContentTypeCharsets = new ArrayList<String>();
    }
    this.allowedRequestContentTypeCharsets.add(allowedRequestContentTypeCharsetsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Argument seperator.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "&".
   * @return argumentSeparator
   */
  @VsoMethod
  public String getArgumentSeparator() {
    return argumentSeparator;
  }

  /**
   * This is the setter method to the attribute.
   * Argument seperator.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "&".
   * @param argumentSeparator set the argumentSeparator.
   */
  @VsoMethod
  public void setArgumentSeparator(String  argumentSeparator) {
    this.argumentSeparator = argumentSeparator;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum size for the client request body scanned by waf.
   * Allowed values are 1-32768.
   * Field introduced in 18.1.5, 18.2.1.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 32.
   * @return clientRequestMaxBodySize
   */
  @VsoMethod
  public Integer getClientRequestMaxBodySize() {
    return clientRequestMaxBodySize;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum size for the client request body scanned by waf.
   * Allowed values are 1-32768.
   * Field introduced in 18.1.5, 18.2.1.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 32.
   * @param clientRequestMaxBodySize set the clientRequestMaxBodySize.
   */
  @VsoMethod
  public void setClientRequestMaxBodySize(Integer  clientRequestMaxBodySize) {
    this.clientRequestMaxBodySize = clientRequestMaxBodySize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf content-types and their request body parsers.
   * Use this field to configure which content-types should be handled by waf and which parser should be used.
   * All content-types here are treated as 'allowed'.
   * The order of entries matters.
   * If the request's content-type matches an entry, its request body parser will run and no other parser will be invoked.
   * Field introduced in 21.1.3.
   * Maximum of 256 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return contentTypeMappings
   */
  @VsoMethod
  public List<WafContentTypeMapping> getContentTypeMappings() {
    return contentTypeMappings;
  }

  /**
   * This is the setter method. this will set the contentTypeMappings
   * Waf content-types and their request body parsers.
   * Use this field to configure which content-types should be handled by waf and which parser should be used.
   * All content-types here are treated as 'allowed'.
   * The order of entries matters.
   * If the request's content-type matches an entry, its request body parser will run and no other parser will be invoked.
   * Field introduced in 21.1.3.
   * Maximum of 256 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return contentTypeMappings
   */
  @VsoMethod
  public void setContentTypeMappings(List<WafContentTypeMapping>  contentTypeMappings) {
    this.contentTypeMappings = contentTypeMappings;
  }

  /**
   * This is the setter method this will set the contentTypeMappings
   * Waf content-types and their request body parsers.
   * Use this field to configure which content-types should be handled by waf and which parser should be used.
   * All content-types here are treated as 'allowed'.
   * The order of entries matters.
   * If the request's content-type matches an entry, its request body parser will run and no other parser will be invoked.
   * Field introduced in 21.1.3.
   * Maximum of 256 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return contentTypeMappings
   */
  @VsoMethod
  public WafConfig addContentTypeMappingsItem(WafContentTypeMapping contentTypeMappingsItem) {
    if (this.contentTypeMappings == null) {
      this.contentTypeMappings = new ArrayList<WafContentTypeMapping>();
    }
    this.contentTypeMappings.add(contentTypeMappingsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * 0  for netscape cookies.
   * 1  for version 1 cookies.
   * Allowed values are 0-1.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return cookieFormatVersion
   */
  @VsoMethod
  public Integer getCookieFormatVersion() {
    return cookieFormatVersion;
  }

  /**
   * This is the setter method to the attribute.
   * 0  for netscape cookies.
   * 1  for version 1 cookies.
   * Allowed values are 0-1.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param cookieFormatVersion set the cookieFormatVersion.
   */
  @VsoMethod
  public void setCookieFormatVersion(Integer  cookieFormatVersion) {
    this.cookieFormatVersion = cookieFormatVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ignore request body parsing errors due to partial scanning.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return ignoreIncompleteRequestBodyError
   */
  @VsoMethod
  public Boolean getIgnoreIncompleteRequestBodyError() {
    return ignoreIncompleteRequestBodyError;
  }

  /**
   * This is the setter method to the attribute.
   * Ignore request body parsing errors due to partial scanning.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param ignoreIncompleteRequestBodyError set the ignoreIncompleteRequestBodyError.
   */
  @VsoMethod
  public void setIgnoreIncompleteRequestBodyError(Boolean  ignoreIncompleteRequestBodyError) {
    this.ignoreIncompleteRequestBodyError = ignoreIncompleteRequestBodyError;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The maximum period of time waf processing is allowed to take for a single request.
   * A value of 0 (zero) means no limit and should not be chosen in production deployments.
   * It is only used for exceptional situations where crashes of se_dp processes are acceptable.
   * The behavior of the system if this time is exceeded depends on two other configuration settings, the waf policy mode and the waf failure mode.
   * In waf policy mode 'detection', the request is allowed and flagged for both failure mode 'closed' and 'open'.
   * In enforcement node, 'closed' means the request is rejected, 'open' means the request is allowed and flagged.
   * Irrespective of these settings, no subsequent waf rules of this or other phases will be executed once the maximum execution time has been
   * exceeded.
   * Allowed values are 0-5000.
   * Field introduced in 17.2.12, 18.1.2.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @return maxExecutionTime
   */
  @VsoMethod
  public Integer getMaxExecutionTime() {
    return maxExecutionTime;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum period of time waf processing is allowed to take for a single request.
   * A value of 0 (zero) means no limit and should not be chosen in production deployments.
   * It is only used for exceptional situations where crashes of se_dp processes are acceptable.
   * The behavior of the system if this time is exceeded depends on two other configuration settings, the waf policy mode and the waf failure mode.
   * In waf policy mode 'detection', the request is allowed and flagged for both failure mode 'closed' and 'open'.
   * In enforcement node, 'closed' means the request is rejected, 'open' means the request is allowed and flagged.
   * Irrespective of these settings, no subsequent waf rules of this or other phases will be executed once the maximum execution time has been
   * exceeded.
   * Allowed values are 0-5000.
   * Field introduced in 17.2.12, 18.1.2.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @param maxExecutionTime set the maxExecutionTime.
   */
  @VsoMethod
  public void setMaxExecutionTime(Integer  maxExecutionTime) {
    this.maxExecutionTime = maxExecutionTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Limit cpu utilization for each regular expression match when processing rules.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30000.
   * @return regexMatchLimit
   */
  @VsoMethod
  public Integer getRegexMatchLimit() {
    return regexMatchLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Limit cpu utilization for each regular expression match when processing rules.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30000.
   * @param regexMatchLimit set the regexMatchLimit.
   */
  @VsoMethod
  public void setRegexMatchLimit(Integer  regexMatchLimit) {
    this.regexMatchLimit = regexMatchLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Limit depth of recursion for each regular expression match when processing rules.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @return regexRecursionLimit
   */
  @VsoMethod
  public Integer getRegexRecursionLimit() {
    return regexRecursionLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Limit depth of recursion for each regular expression match when processing rules.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @param regexRecursionLimit set the regexRecursionLimit.
   */
  @VsoMethod
  public void setRegexRecursionLimit(Integer  regexRecursionLimit) {
    this.regexRecursionLimit = regexRecursionLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf default action for request body phase.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "phase:2,deny,status:403,log,auditlog".
   * @return requestBodyDefaultAction
   */
  @VsoMethod
  public String getRequestBodyDefaultAction() {
    return requestBodyDefaultAction;
  }

  /**
   * This is the setter method to the attribute.
   * Waf default action for request body phase.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "phase:2,deny,status:403,log,auditlog".
   * @param requestBodyDefaultAction set the requestBodyDefaultAction.
   */
  @VsoMethod
  public void setRequestBodyDefaultAction(String  requestBodyDefaultAction) {
    this.requestBodyDefaultAction = requestBodyDefaultAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf default action for request header phase.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "phase:1,deny,status:403,log,auditlog".
   * @return requestHdrDefaultAction
   */
  @VsoMethod
  public String getRequestHdrDefaultAction() {
    return requestHdrDefaultAction;
  }

  /**
   * This is the setter method to the attribute.
   * Waf default action for request header phase.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "phase:1,deny,status:403,log,auditlog".
   * @param requestHdrDefaultAction set the requestHdrDefaultAction.
   */
  @VsoMethod
  public void setRequestHdrDefaultAction(String  requestHdrDefaultAction) {
    this.requestHdrDefaultAction = requestHdrDefaultAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf default action for response body phase.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "phase:4,deny,status:403,log,auditlog".
   * @return responseBodyDefaultAction
   */
  @VsoMethod
  public String getResponseBodyDefaultAction() {
    return responseBodyDefaultAction;
  }

  /**
   * This is the setter method to the attribute.
   * Waf default action for response body phase.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "phase:4,deny,status:403,log,auditlog".
   * @param responseBodyDefaultAction set the responseBodyDefaultAction.
   */
  @VsoMethod
  public void setResponseBodyDefaultAction(String  responseBodyDefaultAction) {
    this.responseBodyDefaultAction = responseBodyDefaultAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf default action for response header phase.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "phase:3,deny,status:403,log,auditlog".
   * @return responseHdrDefaultAction
   */
  @VsoMethod
  public String getResponseHdrDefaultAction() {
    return responseHdrDefaultAction;
  }

  /**
   * This is the setter method to the attribute.
   * Waf default action for response header phase.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "phase:3,deny,status:403,log,auditlog".
   * @param responseHdrDefaultAction set the responseHdrDefaultAction.
   */
  @VsoMethod
  public void setResponseHdrDefaultAction(String  responseHdrDefaultAction) {
    this.responseHdrDefaultAction = responseHdrDefaultAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf restricted file extensions.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedExtensions
   */
  @VsoMethod
  public List<String> getRestrictedExtensions() {
    return restrictedExtensions;
  }

  /**
   * This is the setter method. this will set the restrictedExtensions
   * Waf restricted file extensions.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedExtensions
   */
  @VsoMethod
  public void setRestrictedExtensions(List<String>  restrictedExtensions) {
    this.restrictedExtensions = restrictedExtensions;
  }

  /**
   * This is the setter method this will set the restrictedExtensions
   * Waf restricted file extensions.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedExtensions
   */
  @VsoMethod
  public WafConfig addRestrictedExtensionsItem(String restrictedExtensionsItem) {
    if (this.restrictedExtensions == null) {
      this.restrictedExtensions = new ArrayList<String>();
    }
    this.restrictedExtensions.add(restrictedExtensionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Waf restricted http headers.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedHeaders
   */
  @VsoMethod
  public List<String> getRestrictedHeaders() {
    return restrictedHeaders;
  }

  /**
   * This is the setter method. this will set the restrictedHeaders
   * Waf restricted http headers.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedHeaders
   */
  @VsoMethod
  public void setRestrictedHeaders(List<String>  restrictedHeaders) {
    this.restrictedHeaders = restrictedHeaders;
  }

  /**
   * This is the setter method this will set the restrictedHeaders
   * Waf restricted http headers.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedHeaders
   */
  @VsoMethod
  public WafConfig addRestrictedHeadersItem(String restrictedHeadersItem) {
    if (this.restrictedHeaders == null) {
      this.restrictedHeaders = new ArrayList<String>();
    }
    this.restrictedHeaders.add(restrictedHeadersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Whether or not to send waf status in a request header to pool servers.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return sendStatusHeader
   */
  @VsoMethod
  public Boolean getSendStatusHeader() {
    return sendStatusHeader;
  }

  /**
   * This is the setter method to the attribute.
   * Whether or not to send waf status in a request header to pool servers.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param sendStatusHeader set the sendStatusHeader.
   */
  @VsoMethod
  public void setSendStatusHeader(Boolean  sendStatusHeader) {
    this.sendStatusHeader = sendStatusHeader;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum size for response body scanned by waf.
   * Allowed values are 1-32768.
   * Field introduced in 17.2.1.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @return serverResponseMaxBodySize
   */
  @VsoMethod
  public Integer getServerResponseMaxBodySize() {
    return serverResponseMaxBodySize;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum size for response body scanned by waf.
   * Allowed values are 1-32768.
   * Field introduced in 17.2.1.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @param serverResponseMaxBodySize set the serverResponseMaxBodySize.
   */
  @VsoMethod
  public void setServerResponseMaxBodySize(Integer  serverResponseMaxBodySize) {
    this.serverResponseMaxBodySize = serverResponseMaxBodySize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf static file extensions.
   * Get and head requests with no query args and one of these extensions are allowed and not checked by the ruleset.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticExtensions
   */
  @VsoMethod
  public List<String> getStaticExtensions() {
    return staticExtensions;
  }

  /**
   * This is the setter method. this will set the staticExtensions
   * Waf static file extensions.
   * Get and head requests with no query args and one of these extensions are allowed and not checked by the ruleset.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticExtensions
   */
  @VsoMethod
  public void setStaticExtensions(List<String>  staticExtensions) {
    this.staticExtensions = staticExtensions;
  }

  /**
   * This is the setter method this will set the staticExtensions
   * Waf static file extensions.
   * Get and head requests with no query args and one of these extensions are allowed and not checked by the ruleset.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticExtensions
   */
  @VsoMethod
  public WafConfig addStaticExtensionsItem(String staticExtensionsItem) {
    if (this.staticExtensions == null) {
      this.staticExtensions = new ArrayList<String>();
    }
    this.staticExtensions.add(staticExtensionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Http status code used by waf positive security model when rejecting a request.
   * Enum options - HTTP_RESPONSE_CODE_0, HTTP_RESPONSE_CODE_100, HTTP_RESPONSE_CODE_101, HTTP_RESPONSE_CODE_200, HTTP_RESPONSE_CODE_201,
   * HTTP_RESPONSE_CODE_202, HTTP_RESPONSE_CODE_203, HTTP_RESPONSE_CODE_204, HTTP_RESPONSE_CODE_205, HTTP_RESPONSE_CODE_206, HTTP_RESPONSE_CODE_300,
   * HTTP_RESPONSE_CODE_301, HTTP_RESPONSE_CODE_302, HTTP_RESPONSE_CODE_303, HTTP_RESPONSE_CODE_304, HTTP_RESPONSE_CODE_305, HTTP_RESPONSE_CODE_307,
   * HTTP_RESPONSE_CODE_400, HTTP_RESPONSE_CODE_401, HTTP_RESPONSE_CODE_402...
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "HTTP_RESPONSE_CODE_403".
   * @return statusCodeForRejectedRequests
   */
  @VsoMethod
  public String getStatusCodeForRejectedRequests() {
    return statusCodeForRejectedRequests;
  }

  /**
   * This is the setter method to the attribute.
   * Http status code used by waf positive security model when rejecting a request.
   * Enum options - HTTP_RESPONSE_CODE_0, HTTP_RESPONSE_CODE_100, HTTP_RESPONSE_CODE_101, HTTP_RESPONSE_CODE_200, HTTP_RESPONSE_CODE_201,
   * HTTP_RESPONSE_CODE_202, HTTP_RESPONSE_CODE_203, HTTP_RESPONSE_CODE_204, HTTP_RESPONSE_CODE_205, HTTP_RESPONSE_CODE_206, HTTP_RESPONSE_CODE_300,
   * HTTP_RESPONSE_CODE_301, HTTP_RESPONSE_CODE_302, HTTP_RESPONSE_CODE_303, HTTP_RESPONSE_CODE_304, HTTP_RESPONSE_CODE_305, HTTP_RESPONSE_CODE_307,
   * HTTP_RESPONSE_CODE_400, HTTP_RESPONSE_CODE_401, HTTP_RESPONSE_CODE_402...
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "HTTP_RESPONSE_CODE_403".
   * @param statusCodeForRejectedRequests set the statusCodeForRejectedRequests.
   */
  @VsoMethod
  public void setStatusCodeForRejectedRequests(String  statusCodeForRejectedRequests) {
    this.statusCodeForRejectedRequests = statusCodeForRejectedRequests;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the request header indicating waf evaluation status to pool servers.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "X-WAF-Result".
   * @return statusHeaderName
   */
  @VsoMethod
  public String getStatusHeaderName() {
    return statusHeaderName;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the request header indicating waf evaluation status to pool servers.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "X-WAF-Result".
   * @param statusHeaderName set the statusHeaderName.
   */
  @VsoMethod
  public void setStatusHeaderName(String  statusHeaderName) {
    this.statusHeaderName = statusHeaderName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Block or flag xml requests referring to external entities.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return xmlXxeProtection
   */
  @VsoMethod
  public Boolean getXmlXxeProtection() {
    return xmlXxeProtection;
  }

  /**
   * This is the setter method to the attribute.
   * Block or flag xml requests referring to external entities.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param xmlXxeProtection set the xmlXxeProtection.
   */
  @VsoMethod
  public void setXmlXxeProtection(Boolean  xmlXxeProtection) {
    this.xmlXxeProtection = xmlXxeProtection;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafConfig objWafConfig = (WafConfig) o;
  return   Objects.equals(this.requestHdrDefaultAction, objWafConfig.requestHdrDefaultAction)&&
  Objects.equals(this.requestBodyDefaultAction, objWafConfig.requestBodyDefaultAction)&&
  Objects.equals(this.responseHdrDefaultAction, objWafConfig.responseHdrDefaultAction)&&
  Objects.equals(this.responseBodyDefaultAction, objWafConfig.responseBodyDefaultAction)&&
  Objects.equals(this.allowedHttpVersions, objWafConfig.allowedHttpVersions)&&
  Objects.equals(this.allowedMethods, objWafConfig.allowedMethods)&&
  Objects.equals(this.restrictedExtensions, objWafConfig.restrictedExtensions)&&
  Objects.equals(this.restrictedHeaders, objWafConfig.restrictedHeaders)&&
  Objects.equals(this.staticExtensions, objWafConfig.staticExtensions)&&
  Objects.equals(this.serverResponseMaxBodySize, objWafConfig.serverResponseMaxBodySize)&&
  Objects.equals(this.argumentSeparator, objWafConfig.argumentSeparator)&&
  Objects.equals(this.cookieFormatVersion, objWafConfig.cookieFormatVersion)&&
  Objects.equals(this.regexMatchLimit, objWafConfig.regexMatchLimit)&&
  Objects.equals(this.maxExecutionTime, objWafConfig.maxExecutionTime)&&
  Objects.equals(this.clientRequestMaxBodySize, objWafConfig.clientRequestMaxBodySize)&&
  Objects.equals(this.ignoreIncompleteRequestBodyError, objWafConfig.ignoreIncompleteRequestBodyError)&&
  Objects.equals(this.statusCodeForRejectedRequests, objWafConfig.statusCodeForRejectedRequests)&&
  Objects.equals(this.regexRecursionLimit, objWafConfig.regexRecursionLimit)&&
  Objects.equals(this.xmlXxeProtection, objWafConfig.xmlXxeProtection)&&
  Objects.equals(this.statusHeaderName, objWafConfig.statusHeaderName)&&
  Objects.equals(this.sendStatusHeader, objWafConfig.sendStatusHeader)&&
  Objects.equals(this.contentTypeMappings, objWafConfig.contentTypeMappings)&&
  Objects.equals(this.allowedRequestContentTypeCharsets, objWafConfig.allowedRequestContentTypeCharsets);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafConfig {\n");
      sb.append("    allowedHttpVersions: ").append(toIndentedString(allowedHttpVersions)).append("\n");
        sb.append("    allowedMethods: ").append(toIndentedString(allowedMethods)).append("\n");
        sb.append("    allowedRequestContentTypeCharsets: ").append(toIndentedString(allowedRequestContentTypeCharsets)).append("\n");
        sb.append("    argumentSeparator: ").append(toIndentedString(argumentSeparator)).append("\n");
        sb.append("    clientRequestMaxBodySize: ").append(toIndentedString(clientRequestMaxBodySize)).append("\n");
        sb.append("    contentTypeMappings: ").append(toIndentedString(contentTypeMappings)).append("\n");
        sb.append("    cookieFormatVersion: ").append(toIndentedString(cookieFormatVersion)).append("\n");
        sb.append("    ignoreIncompleteRequestBodyError: ").append(toIndentedString(ignoreIncompleteRequestBodyError)).append("\n");
        sb.append("    maxExecutionTime: ").append(toIndentedString(maxExecutionTime)).append("\n");
        sb.append("    regexMatchLimit: ").append(toIndentedString(regexMatchLimit)).append("\n");
        sb.append("    regexRecursionLimit: ").append(toIndentedString(regexRecursionLimit)).append("\n");
        sb.append("    requestBodyDefaultAction: ").append(toIndentedString(requestBodyDefaultAction)).append("\n");
        sb.append("    requestHdrDefaultAction: ").append(toIndentedString(requestHdrDefaultAction)).append("\n");
        sb.append("    responseBodyDefaultAction: ").append(toIndentedString(responseBodyDefaultAction)).append("\n");
        sb.append("    responseHdrDefaultAction: ").append(toIndentedString(responseHdrDefaultAction)).append("\n");
        sb.append("    restrictedExtensions: ").append(toIndentedString(restrictedExtensions)).append("\n");
        sb.append("    restrictedHeaders: ").append(toIndentedString(restrictedHeaders)).append("\n");
        sb.append("    sendStatusHeader: ").append(toIndentedString(sendStatusHeader)).append("\n");
        sb.append("    serverResponseMaxBodySize: ").append(toIndentedString(serverResponseMaxBodySize)).append("\n");
        sb.append("    staticExtensions: ").append(toIndentedString(staticExtensions)).append("\n");
        sb.append("    statusCodeForRejectedRequests: ").append(toIndentedString(statusCodeForRejectedRequests)).append("\n");
        sb.append("    statusHeaderName: ").append(toIndentedString(statusHeaderName)).append("\n");
        sb.append("    xmlXxeProtection: ").append(toIndentedString(xmlXxeProtection)).append("\n");
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

