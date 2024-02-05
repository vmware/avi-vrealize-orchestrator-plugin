package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The RateLimiterProfile is a POJO class extends AviRestResource that used for creating
 * RateLimiterProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RateLimiterProfile")
@VsoFinder(name = Constants.FINDER_VRO_RATELIMITERPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RateLimiterProfile extends AviRestResource {
    @JsonProperty("client_ip_connections_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile clientIpConnectionsRateLimit;

    @JsonProperty("client_ip_failed_requests_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile clientIpFailedRequestsRateLimit;

    @JsonProperty("client_ip_requests_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile clientIpRequestsRateLimit;

    @JsonProperty("client_ip_scanners_requests_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile clientIpScannersRequestsRateLimit;

    @JsonProperty("client_ip_to_uri_failed_requests_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile clientIpToUriFailedRequestsRateLimit;

    @JsonProperty("client_ip_to_uri_requests_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile clientIpToUriRequestsRateLimit;

    @JsonProperty("custom_requests_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile customRequestsRateLimit;

    @JsonProperty("http_header_rate_limits")
    @JsonInclude(Include.NON_NULL)
    private List<RateProfile> httpHeaderRateLimits;

    @JsonProperty("uri_failed_requests_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile uriFailedRequestsRateLimit;

    @JsonProperty("uri_requests_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile uriRequestsRateLimit;

    @JsonProperty("uri_scanners_requests_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile uriScannersRequestsRateLimit;



  /**
   * This is the getter method this will return the attribute value.
   * Rate limit all connections made from any single client ip address to the virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIpConnectionsRateLimit
   */
  @VsoMethod
  public RateProfile getClientIpConnectionsRateLimit() {
    return clientIpConnectionsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limit all connections made from any single client ip address to the virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIpConnectionsRateLimit set the clientIpConnectionsRateLimit.
   */
  @VsoMethod
  public void setClientIpConnectionsRateLimit(RateProfile clientIpConnectionsRateLimit) {
    this.clientIpConnectionsRateLimit = clientIpConnectionsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limit all requests from a client for a specified period of time once the count of failed requests from that client crosses a threshold for
   * that period.
   * Clients are tracked based on their ip address.
   * Count and time period are specified through the rateprofile.
   * Requests are deemed failed based on client or server side error status codes, consistent with how avi logs and metrics subsystems mark failed
   * requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIpFailedRequestsRateLimit
   */
  @VsoMethod
  public RateProfile getClientIpFailedRequestsRateLimit() {
    return clientIpFailedRequestsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limit all requests from a client for a specified period of time once the count of failed requests from that client crosses a threshold for
   * that period.
   * Clients are tracked based on their ip address.
   * Count and time period are specified through the rateprofile.
   * Requests are deemed failed based on client or server side error status codes, consistent with how avi logs and metrics subsystems mark failed
   * requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIpFailedRequestsRateLimit set the clientIpFailedRequestsRateLimit.
   */
  @VsoMethod
  public void setClientIpFailedRequestsRateLimit(RateProfile clientIpFailedRequestsRateLimit) {
    this.clientIpFailedRequestsRateLimit = clientIpFailedRequestsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limit all http requests from any single client ip address to all urls of the virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIpRequestsRateLimit
   */
  @VsoMethod
  public RateProfile getClientIpRequestsRateLimit() {
    return clientIpRequestsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limit all http requests from any single client ip address to all urls of the virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIpRequestsRateLimit set the clientIpRequestsRateLimit.
   */
  @VsoMethod
  public void setClientIpRequestsRateLimit(RateProfile clientIpRequestsRateLimit) {
    this.clientIpRequestsRateLimit = clientIpRequestsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Automatically track clients and classify them into 3 groups - good, bad, unknown.
   * Clients are tracked based on their ip address.
   * Clients are added to the good group when the avi scan detection system builds history of requests from them that complete successfully.
   * Clients are added to unknown group when there is insufficient history about them.
   * Requests from such clients are rate limited to the rate specified in the rateprofile.
   * Finally, clients with history of failed requests are added to bad group and their requests are rate limited with stricter thresholds than the
   * unknown clients group.
   * The avi scan detection system automatically tunes itself so that the good, bad, and unknown client ips group membership changes dynamically with
   * the changes in traffic patterns through the adc.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIpScannersRequestsRateLimit
   */
  @VsoMethod
  public RateProfile getClientIpScannersRequestsRateLimit() {
    return clientIpScannersRequestsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Automatically track clients and classify them into 3 groups - good, bad, unknown.
   * Clients are tracked based on their ip address.
   * Clients are added to the good group when the avi scan detection system builds history of requests from them that complete successfully.
   * Clients are added to unknown group when there is insufficient history about them.
   * Requests from such clients are rate limited to the rate specified in the rateprofile.
   * Finally, clients with history of failed requests are added to bad group and their requests are rate limited with stricter thresholds than the
   * unknown clients group.
   * The avi scan detection system automatically tunes itself so that the good, bad, and unknown client ips group membership changes dynamically with
   * the changes in traffic patterns through the adc.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIpScannersRequestsRateLimit set the clientIpScannersRequestsRateLimit.
   */
  @VsoMethod
  public void setClientIpScannersRequestsRateLimit(RateProfile clientIpScannersRequestsRateLimit) {
    this.clientIpScannersRequestsRateLimit = clientIpScannersRequestsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limit all requests from a client to a uri for a specified period of time once the count of failed requests from that client to the uri
   * crosses a threshold for that period.
   * Clients are tracked based on their ip address.
   * Count and time period are specified through the rateprofile.
   * Requests are deemed failed based on client or server side error status codes, consistent with how avi logs and metrics subsystems mark failed
   * requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIpToUriFailedRequestsRateLimit
   */
  @VsoMethod
  public RateProfile getClientIpToUriFailedRequestsRateLimit() {
    return clientIpToUriFailedRequestsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limit all requests from a client to a uri for a specified period of time once the count of failed requests from that client to the uri
   * crosses a threshold for that period.
   * Clients are tracked based on their ip address.
   * Count and time period are specified through the rateprofile.
   * Requests are deemed failed based on client or server side error status codes, consistent with how avi logs and metrics subsystems mark failed
   * requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIpToUriFailedRequestsRateLimit set the clientIpToUriFailedRequestsRateLimit.
   */
  @VsoMethod
  public void setClientIpToUriFailedRequestsRateLimit(RateProfile clientIpToUriFailedRequestsRateLimit) {
    this.clientIpToUriFailedRequestsRateLimit = clientIpToUriFailedRequestsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limit all http requests from any single client ip address to any single url.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIpToUriRequestsRateLimit
   */
  @VsoMethod
  public RateProfile getClientIpToUriRequestsRateLimit() {
    return clientIpToUriRequestsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limit all http requests from any single client ip address to any single url.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIpToUriRequestsRateLimit set the clientIpToUriRequestsRateLimit.
   */
  @VsoMethod
  public void setClientIpToUriRequestsRateLimit(RateProfile clientIpToUriRequestsRateLimit) {
    this.clientIpToUriRequestsRateLimit = clientIpToUriRequestsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limit all http requests that map to any custom string.
   * Field introduced in 17.2.13,18.1.3,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customRequestsRateLimit
   */
  @VsoMethod
  public RateProfile getCustomRequestsRateLimit() {
    return customRequestsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limit all http requests that map to any custom string.
   * Field introduced in 17.2.13,18.1.3,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param customRequestsRateLimit set the customRequestsRateLimit.
   */
  @VsoMethod
  public void setCustomRequestsRateLimit(RateProfile customRequestsRateLimit) {
    this.customRequestsRateLimit = customRequestsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limit all http requests from all client ip addresses that contain any single http header value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpHeaderRateLimits
   */
  @VsoMethod
  public List<RateProfile> getHttpHeaderRateLimits() {
    return httpHeaderRateLimits;
  }

  /**
   * This is the setter method. this will set the httpHeaderRateLimits
   * Rate limit all http requests from all client ip addresses that contain any single http header value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpHeaderRateLimits
   */
  @VsoMethod
  public void setHttpHeaderRateLimits(List<RateProfile>  httpHeaderRateLimits) {
    this.httpHeaderRateLimits = httpHeaderRateLimits;
  }

  /**
   * This is the setter method this will set the httpHeaderRateLimits
   * Rate limit all http requests from all client ip addresses that contain any single http header value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpHeaderRateLimits
   */
  @VsoMethod
  public RateLimiterProfile addHttpHeaderRateLimitsItem(RateProfile httpHeaderRateLimitsItem) {
    if (this.httpHeaderRateLimits == null) {
      this.httpHeaderRateLimits = new ArrayList<RateProfile>();
    }
    this.httpHeaderRateLimits.add(httpHeaderRateLimitsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Rate limit all requests to a uri for a specified period of time once the count of failed requests to that uri crosses a threshold for that
   * period.
   * Count and time period are specified through the rateprofile.
   * Requests are deemed failed based on client or server side error status codes, consistent with how avi logs and metrics subsystems mark failed
   * requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriFailedRequestsRateLimit
   */
  @VsoMethod
  public RateProfile getUriFailedRequestsRateLimit() {
    return uriFailedRequestsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limit all requests to a uri for a specified period of time once the count of failed requests to that uri crosses a threshold for that
   * period.
   * Count and time period are specified through the rateprofile.
   * Requests are deemed failed based on client or server side error status codes, consistent with how avi logs and metrics subsystems mark failed
   * requests.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uriFailedRequestsRateLimit set the uriFailedRequestsRateLimit.
   */
  @VsoMethod
  public void setUriFailedRequestsRateLimit(RateProfile uriFailedRequestsRateLimit) {
    this.uriFailedRequestsRateLimit = uriFailedRequestsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limit all http requests from all client ip addresses to any single url.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriRequestsRateLimit
   */
  @VsoMethod
  public RateProfile getUriRequestsRateLimit() {
    return uriRequestsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limit all http requests from all client ip addresses to any single url.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uriRequestsRateLimit set the uriRequestsRateLimit.
   */
  @VsoMethod
  public void setUriRequestsRateLimit(RateProfile uriRequestsRateLimit) {
    this.uriRequestsRateLimit = uriRequestsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Automatically track uris and classify them into 3 groups - good, bad, unknown.
   * Uris are added to the good group when the avi scan detection system builds history of requests to uris that complete successfully.
   * Uris are added to unknown group when there is insufficient history about them.
   * Requests for such uris are rate limited to the rate specified in the rateprofile.
   * Finally, uris with history of failed requests are added to bad group and requests to them are rate limited with stricter thresholds than the
   * unknown uris group.
   * The avi scan detection system automatically tunes itself so that the good, bad, and unknown uris group membership changes dynamically with the
   * changes in traffic patterns through the adc.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriScannersRequestsRateLimit
   */
  @VsoMethod
  public RateProfile getUriScannersRequestsRateLimit() {
    return uriScannersRequestsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Automatically track uris and classify them into 3 groups - good, bad, unknown.
   * Uris are added to the good group when the avi scan detection system builds history of requests to uris that complete successfully.
   * Uris are added to unknown group when there is insufficient history about them.
   * Requests for such uris are rate limited to the rate specified in the rateprofile.
   * Finally, uris with history of failed requests are added to bad group and requests to them are rate limited with stricter thresholds than the
   * unknown uris group.
   * The avi scan detection system automatically tunes itself so that the good, bad, and unknown uris group membership changes dynamically with the
   * changes in traffic patterns through the adc.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uriScannersRequestsRateLimit set the uriScannersRequestsRateLimit.
   */
  @VsoMethod
  public void setUriScannersRequestsRateLimit(RateProfile uriScannersRequestsRateLimit) {
    this.uriScannersRequestsRateLimit = uriScannersRequestsRateLimit;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RateLimiterProfile objRateLimiterProfile = (RateLimiterProfile) o;
  return   Objects.equals(this.clientIpConnectionsRateLimit, objRateLimiterProfile.clientIpConnectionsRateLimit)&&
  Objects.equals(this.clientIpRequestsRateLimit, objRateLimiterProfile.clientIpRequestsRateLimit)&&
  Objects.equals(this.uriRequestsRateLimit, objRateLimiterProfile.uriRequestsRateLimit)&&
  Objects.equals(this.clientIpToUriRequestsRateLimit, objRateLimiterProfile.clientIpToUriRequestsRateLimit)&&
  Objects.equals(this.clientIpFailedRequestsRateLimit, objRateLimiterProfile.clientIpFailedRequestsRateLimit)&&
  Objects.equals(this.uriFailedRequestsRateLimit, objRateLimiterProfile.uriFailedRequestsRateLimit)&&
  Objects.equals(this.clientIpToUriFailedRequestsRateLimit, objRateLimiterProfile.clientIpToUriFailedRequestsRateLimit)&&
  Objects.equals(this.clientIpScannersRequestsRateLimit, objRateLimiterProfile.clientIpScannersRequestsRateLimit)&&
  Objects.equals(this.uriScannersRequestsRateLimit, objRateLimiterProfile.uriScannersRequestsRateLimit)&&
  Objects.equals(this.httpHeaderRateLimits, objRateLimiterProfile.httpHeaderRateLimits)&&
  Objects.equals(this.customRequestsRateLimit, objRateLimiterProfile.customRequestsRateLimit);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RateLimiterProfile {\n");
      sb.append("    clientIpConnectionsRateLimit: ").append(toIndentedString(clientIpConnectionsRateLimit)).append("\n");
        sb.append("    clientIpFailedRequestsRateLimit: ").append(toIndentedString(clientIpFailedRequestsRateLimit)).append("\n");
        sb.append("    clientIpRequestsRateLimit: ").append(toIndentedString(clientIpRequestsRateLimit)).append("\n");
        sb.append("    clientIpScannersRequestsRateLimit: ").append(toIndentedString(clientIpScannersRequestsRateLimit)).append("\n");
        sb.append("    clientIpToUriFailedRequestsRateLimit: ").append(toIndentedString(clientIpToUriFailedRequestsRateLimit)).append("\n");
        sb.append("    clientIpToUriRequestsRateLimit: ").append(toIndentedString(clientIpToUriRequestsRateLimit)).append("\n");
        sb.append("    customRequestsRateLimit: ").append(toIndentedString(customRequestsRateLimit)).append("\n");
        sb.append("    httpHeaderRateLimits: ").append(toIndentedString(httpHeaderRateLimits)).append("\n");
        sb.append("    uriFailedRequestsRateLimit: ").append(toIndentedString(uriFailedRequestsRateLimit)).append("\n");
        sb.append("    uriRequestsRateLimit: ").append(toIndentedString(uriRequestsRateLimit)).append("\n");
        sb.append("    uriScannersRequestsRateLimit: ").append(toIndentedString(uriScannersRequestsRateLimit)).append("\n");
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

