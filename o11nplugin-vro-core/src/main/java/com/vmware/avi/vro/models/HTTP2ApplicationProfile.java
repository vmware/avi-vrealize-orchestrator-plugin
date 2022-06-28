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
 * The HTTP2ApplicationProfile is a POJO class extends AviRestResource that used for creating
 * HTTP2ApplicationProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTP2ApplicationProfile")
@VsoFinder(name = Constants.FINDER_VRO_HTTP2APPLICATIONPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTP2ApplicationProfile extends AviRestResource {
    @JsonProperty("enable_http2_server_push")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableHttp2ServerPush = false;

    @JsonProperty("http2_initial_window_size")
    @JsonInclude(Include.NON_NULL)
    private Integer http2InitialWindowSize = 64;

    @JsonProperty("max_http2_concurrent_pushes_per_connection")
    @JsonInclude(Include.NON_NULL)
    private Integer maxHttp2ConcurrentPushesPerConnection = 10;

    @JsonProperty("max_http2_concurrent_streams_per_connection")
    @JsonInclude(Include.NON_NULL)
    private Integer maxHttp2ConcurrentStreamsPerConnection = 128;

    @JsonProperty("max_http2_control_frames_per_connection")
    @JsonInclude(Include.NON_NULL)
    private Integer maxHttp2ControlFramesPerConnection = 1000;

    @JsonProperty("max_http2_empty_data_frames_per_connection")
    @JsonInclude(Include.NON_NULL)
    private Integer maxHttp2EmptyDataFramesPerConnection = 1000;

    @JsonProperty("max_http2_header_field_size")
    @JsonInclude(Include.NON_NULL)
    private Integer maxHttp2HeaderFieldSize = 4096;

    @JsonProperty("max_http2_queued_frames_to_client_per_connection")
    @JsonInclude(Include.NON_NULL)
    private Integer maxHttp2QueuedFramesToClientPerConnection = 1000;

    @JsonProperty("max_http2_requests_per_connection")
    @JsonInclude(Include.NON_NULL)
    private Integer maxHttp2RequestsPerConnection = 1000;



  /**
   * This is the getter method this will return the attribute value.
   * Enables automatic conversion of preload links specified in the 'link' response header fields into server push requests.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableHttp2ServerPush
   */
  @VsoMethod
  public Boolean getEnableHttp2ServerPush() {
    return enableHttp2ServerPush;
  }

  /**
   * This is the setter method to the attribute.
   * Enables automatic conversion of preload links specified in the 'link' response header fields into server push requests.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableHttp2ServerPush set the enableHttp2ServerPush.
   */
  @VsoMethod
  public void setEnableHttp2ServerPush(Boolean  enableHttp2ServerPush) {
    this.enableHttp2ServerPush = enableHttp2ServerPush;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The initial flow control window size in kb for http/2 streams.
   * Allowed values are 64-32768.
   * Field introduced in 18.2.10, 20.1.1.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 64.
   * @return http2InitialWindowSize
   */
  @VsoMethod
  public Integer getHttp2InitialWindowSize() {
    return http2InitialWindowSize;
  }

  /**
   * This is the setter method to the attribute.
   * The initial flow control window size in kb for http/2 streams.
   * Allowed values are 64-32768.
   * Field introduced in 18.2.10, 20.1.1.
   * Unit is kb.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 64.
   * @param http2InitialWindowSize set the http2InitialWindowSize.
   */
  @VsoMethod
  public void setHttp2InitialWindowSize(Integer  http2InitialWindowSize) {
    this.http2InitialWindowSize = http2InitialWindowSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of concurrent push streams over a client side http/2 connection.
   * Allowed values are 1-256.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return maxHttp2ConcurrentPushesPerConnection
   */
  @VsoMethod
  public Integer getMaxHttp2ConcurrentPushesPerConnection() {
    return maxHttp2ConcurrentPushesPerConnection;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of concurrent push streams over a client side http/2 connection.
   * Allowed values are 1-256.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param maxHttp2ConcurrentPushesPerConnection set the maxHttp2ConcurrentPushesPerConnection.
   */
  @VsoMethod
  public void setMaxHttp2ConcurrentPushesPerConnection(Integer  maxHttp2ConcurrentPushesPerConnection) {
    this.maxHttp2ConcurrentPushesPerConnection = maxHttp2ConcurrentPushesPerConnection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of concurrent streams over a client side http/2 connection.
   * Allowed values are 1-256.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @return maxHttp2ConcurrentStreamsPerConnection
   */
  @VsoMethod
  public Integer getMaxHttp2ConcurrentStreamsPerConnection() {
    return maxHttp2ConcurrentStreamsPerConnection;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of concurrent streams over a client side http/2 connection.
   * Allowed values are 1-256.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @param maxHttp2ConcurrentStreamsPerConnection set the maxHttp2ConcurrentStreamsPerConnection.
   */
  @VsoMethod
  public void setMaxHttp2ConcurrentStreamsPerConnection(Integer  maxHttp2ConcurrentStreamsPerConnection) {
    this.maxHttp2ConcurrentStreamsPerConnection = maxHttp2ConcurrentStreamsPerConnection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of control frames that client can send over an http/2 connection.
   * '0' means unlimited.
   * Allowed values are 0-10000.
   * Special values are 0- unlimited control frames on a client side http/2 connection.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return maxHttp2ControlFramesPerConnection
   */
  @VsoMethod
  public Integer getMaxHttp2ControlFramesPerConnection() {
    return maxHttp2ControlFramesPerConnection;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of control frames that client can send over an http/2 connection.
   * '0' means unlimited.
   * Allowed values are 0-10000.
   * Special values are 0- unlimited control frames on a client side http/2 connection.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param maxHttp2ControlFramesPerConnection set the maxHttp2ControlFramesPerConnection.
   */
  @VsoMethod
  public void setMaxHttp2ControlFramesPerConnection(Integer  maxHttp2ControlFramesPerConnection) {
    this.maxHttp2ControlFramesPerConnection = maxHttp2ControlFramesPerConnection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of empty data frames that client can send over an http/2 connection.
   * '0' means unlimited.
   * Allowed values are 0-10000.
   * Special values are 0- unlimited empty data frames over a client side http/2 connection.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return maxHttp2EmptyDataFramesPerConnection
   */
  @VsoMethod
  public Integer getMaxHttp2EmptyDataFramesPerConnection() {
    return maxHttp2EmptyDataFramesPerConnection;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of empty data frames that client can send over an http/2 connection.
   * '0' means unlimited.
   * Allowed values are 0-10000.
   * Special values are 0- unlimited empty data frames over a client side http/2 connection.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param maxHttp2EmptyDataFramesPerConnection set the maxHttp2EmptyDataFramesPerConnection.
   */
  @VsoMethod
  public void setMaxHttp2EmptyDataFramesPerConnection(Integer  maxHttp2EmptyDataFramesPerConnection) {
    this.maxHttp2EmptyDataFramesPerConnection = maxHttp2EmptyDataFramesPerConnection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum size in bytes of the compressed request header field.
   * The limit applies equally to both name and value.
   * Allowed values are 1-8192.
   * Field introduced in 18.2.10, 20.1.1.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @return maxHttp2HeaderFieldSize
   */
  @VsoMethod
  public Integer getMaxHttp2HeaderFieldSize() {
    return maxHttp2HeaderFieldSize;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum size in bytes of the compressed request header field.
   * The limit applies equally to both name and value.
   * Allowed values are 1-8192.
   * Field introduced in 18.2.10, 20.1.1.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @param maxHttp2HeaderFieldSize set the maxHttp2HeaderFieldSize.
   */
  @VsoMethod
  public void setMaxHttp2HeaderFieldSize(Integer  maxHttp2HeaderFieldSize) {
    this.maxHttp2HeaderFieldSize = maxHttp2HeaderFieldSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of frames that can be queued waiting to be sent over a client side http/2 connection at any given time.
   * '0' means unlimited.
   * Allowed values are 0-10000.
   * Special values are 0- unlimited frames can be queued on a client side http/2 connection.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return maxHttp2QueuedFramesToClientPerConnection
   */
  @VsoMethod
  public Integer getMaxHttp2QueuedFramesToClientPerConnection() {
    return maxHttp2QueuedFramesToClientPerConnection;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of frames that can be queued waiting to be sent over a client side http/2 connection at any given time.
   * '0' means unlimited.
   * Allowed values are 0-10000.
   * Special values are 0- unlimited frames can be queued on a client side http/2 connection.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param maxHttp2QueuedFramesToClientPerConnection set the maxHttp2QueuedFramesToClientPerConnection.
   */
  @VsoMethod
  public void setMaxHttp2QueuedFramesToClientPerConnection(Integer  maxHttp2QueuedFramesToClientPerConnection) {
    this.maxHttp2QueuedFramesToClientPerConnection = maxHttp2QueuedFramesToClientPerConnection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of requests over a client side http/2 connection.
   * Allowed values are 0-10000.
   * Special values are 0- unlimited requests on a client side http/2 connection.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return maxHttp2RequestsPerConnection
   */
  @VsoMethod
  public Integer getMaxHttp2RequestsPerConnection() {
    return maxHttp2RequestsPerConnection;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of requests over a client side http/2 connection.
   * Allowed values are 0-10000.
   * Special values are 0- unlimited requests on a client side http/2 connection.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param maxHttp2RequestsPerConnection set the maxHttp2RequestsPerConnection.
   */
  @VsoMethod
  public void setMaxHttp2RequestsPerConnection(Integer  maxHttp2RequestsPerConnection) {
    this.maxHttp2RequestsPerConnection = maxHttp2RequestsPerConnection;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTP2ApplicationProfile objHTTP2ApplicationProfile = (HTTP2ApplicationProfile) o;
  return   Objects.equals(this.maxHttp2ControlFramesPerConnection, objHTTP2ApplicationProfile.maxHttp2ControlFramesPerConnection)&&
  Objects.equals(this.maxHttp2QueuedFramesToClientPerConnection, objHTTP2ApplicationProfile.maxHttp2QueuedFramesToClientPerConnection)&&
  Objects.equals(this.maxHttp2EmptyDataFramesPerConnection, objHTTP2ApplicationProfile.maxHttp2EmptyDataFramesPerConnection)&&
  Objects.equals(this.maxHttp2ConcurrentStreamsPerConnection, objHTTP2ApplicationProfile.maxHttp2ConcurrentStreamsPerConnection)&&
  Objects.equals(this.maxHttp2RequestsPerConnection, objHTTP2ApplicationProfile.maxHttp2RequestsPerConnection)&&
  Objects.equals(this.maxHttp2HeaderFieldSize, objHTTP2ApplicationProfile.maxHttp2HeaderFieldSize)&&
  Objects.equals(this.http2InitialWindowSize, objHTTP2ApplicationProfile.http2InitialWindowSize)&&
  Objects.equals(this.enableHttp2ServerPush, objHTTP2ApplicationProfile.enableHttp2ServerPush)&&
  Objects.equals(this.maxHttp2ConcurrentPushesPerConnection, objHTTP2ApplicationProfile.maxHttp2ConcurrentPushesPerConnection);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTP2ApplicationProfile {\n");
      sb.append("    enableHttp2ServerPush: ").append(toIndentedString(enableHttp2ServerPush)).append("\n");
        sb.append("    http2InitialWindowSize: ").append(toIndentedString(http2InitialWindowSize)).append("\n");
        sb.append("    maxHttp2ConcurrentPushesPerConnection: ").append(toIndentedString(maxHttp2ConcurrentPushesPerConnection)).append("\n");
        sb.append("    maxHttp2ConcurrentStreamsPerConnection: ").append(toIndentedString(maxHttp2ConcurrentStreamsPerConnection)).append("\n");
        sb.append("    maxHttp2ControlFramesPerConnection: ").append(toIndentedString(maxHttp2ControlFramesPerConnection)).append("\n");
        sb.append("    maxHttp2EmptyDataFramesPerConnection: ").append(toIndentedString(maxHttp2EmptyDataFramesPerConnection)).append("\n");
        sb.append("    maxHttp2HeaderFieldSize: ").append(toIndentedString(maxHttp2HeaderFieldSize)).append("\n");
        sb.append("    maxHttp2QueuedFramesToClientPerConnection: ").append(toIndentedString(maxHttp2QueuedFramesToClientPerConnection)).append("\n");
        sb.append("    maxHttp2RequestsPerConnection: ").append(toIndentedString(maxHttp2RequestsPerConnection)).append("\n");
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

