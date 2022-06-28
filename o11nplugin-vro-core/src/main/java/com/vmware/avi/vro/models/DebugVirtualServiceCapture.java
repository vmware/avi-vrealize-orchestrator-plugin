package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.CaptureFileSize;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DebugVirtualServiceCapture is a POJO class extends AviRestResource that used for creating
 * DebugVirtualServiceCapture.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DebugVirtualServiceCapture")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGVIRTUALSERVICECAPTURE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DebugVirtualServiceCapture extends AviRestResource {
    @JsonProperty("capture_file_size")
    @JsonInclude(Include.NON_NULL)
    private CaptureFileSize captureFileSize = null;

    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration = 0;

    @JsonProperty("enable_ssl_session_key_capture")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableSslSessionKeyCapture = false;

    @JsonProperty("file_count")
    @JsonInclude(Include.NON_NULL)
    private Integer fileCount = 2;

    @JsonProperty("num_pkts")
    @JsonInclude(Include.NON_NULL)
    private Integer numPkts = null;

    @JsonProperty("pcap_ng")
    @JsonInclude(Include.NON_NULL)
    private Boolean pcapNg = true;

    @JsonProperty("pkt_size")
    @JsonInclude(Include.NON_NULL)
    private Integer pktSize = 128;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum allowed size of pcap capture file per se.
   * Max(absolute_size, percentage_size) will be final value.
   * Set both to 0 for avi default size.
   * Dos, ipc and drop pcaps not applicaple.
   * Field introduced in 18.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return captureFileSize
   */
  @VsoMethod
  public CaptureFileSize getCaptureFileSize() {
    return captureFileSize;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum allowed size of pcap capture file per se.
   * Max(absolute_size, percentage_size) will be final value.
   * Set both to 0 for avi default size.
   * Dos, ipc and drop pcaps not applicaple.
   * Field introduced in 18.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param captureFileSize set the captureFileSize.
   */
  @VsoMethod
  public void setCaptureFileSize(CaptureFileSize captureFileSize) {
    this.captureFileSize = captureFileSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of minutes to capture packets.
   * Use 0 to capture until manually stopped.
   * Special values are 0 - infinite.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Number of minutes to capture packets.
   * Use 0 to capture until manually stopped.
   * Special values are 0 - infinite.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable ssl session key capture.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableSslSessionKeyCapture
   */
  @VsoMethod
  public Boolean getEnableSslSessionKeyCapture() {
    return enableSslSessionKeyCapture;
  }

  /**
   * This is the setter method to the attribute.
   * Enable ssl session key capture.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableSslSessionKeyCapture set the enableSslSessionKeyCapture.
   */
  @VsoMethod
  public void setEnableSslSessionKeyCapture(Boolean  enableSslSessionKeyCapture) {
    this.enableSslSessionKeyCapture = enableSslSessionKeyCapture;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of files to maintain for se pcap file rotation.file count set to 1 indicates no rotate.
   * Allowed values are 1-10.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return fileCount
   */
  @VsoMethod
  public Integer getFileCount() {
    return fileCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of files to maintain for se pcap file rotation.file count set to 1 indicates no rotate.
   * Allowed values are 1-10.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param fileCount set the fileCount.
   */
  @VsoMethod
  public void setFileCount(Integer  fileCount) {
    this.fileCount = fileCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of packets to capture.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numPkts
   */
  @VsoMethod
  public Integer getNumPkts() {
    return numPkts;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of packets to capture.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numPkts set the numPkts.
   */
  @VsoMethod
  public void setNumPkts(Integer  numPkts) {
    this.numPkts = numPkts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable pcapng for packet capture.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return pcapNg
   */
  @VsoMethod
  public Boolean getPcapNg() {
    return pcapNg;
  }

  /**
   * This is the setter method to the attribute.
   * Enable pcapng for packet capture.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param pcapNg set the pcapNg.
   */
  @VsoMethod
  public void setPcapNg(Boolean  pcapNg) {
    this.pcapNg = pcapNg;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of bytes of each packet to capture.
   * Use 0 to capture the entire packet.
   * Allowed values are 64-1514.
   * Special values are 0 - full capture.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @return pktSize
   */
  @VsoMethod
  public Integer getPktSize() {
    return pktSize;
  }

  /**
   * This is the setter method to the attribute.
   * Number of bytes of each packet to capture.
   * Use 0 to capture the entire packet.
   * Allowed values are 64-1514.
   * Special values are 0 - full capture.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @param pktSize set the pktSize.
   */
  @VsoMethod
  public void setPktSize(Integer  pktSize) {
    this.pktSize = pktSize;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DebugVirtualServiceCapture objDebugVirtualServiceCapture = (DebugVirtualServiceCapture) o;
  return   Objects.equals(this.pktSize, objDebugVirtualServiceCapture.pktSize)&&
  Objects.equals(this.duration, objDebugVirtualServiceCapture.duration)&&
  Objects.equals(this.numPkts, objDebugVirtualServiceCapture.numPkts)&&
  Objects.equals(this.enableSslSessionKeyCapture, objDebugVirtualServiceCapture.enableSslSessionKeyCapture)&&
  Objects.equals(this.pcapNg, objDebugVirtualServiceCapture.pcapNg)&&
  Objects.equals(this.captureFileSize, objDebugVirtualServiceCapture.captureFileSize)&&
  Objects.equals(this.fileCount, objDebugVirtualServiceCapture.fileCount);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DebugVirtualServiceCapture {\n");
      sb.append("    captureFileSize: ").append(toIndentedString(captureFileSize)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    enableSslSessionKeyCapture: ").append(toIndentedString(enableSslSessionKeyCapture)).append("\n");
        sb.append("    fileCount: ").append(toIndentedString(fileCount)).append("\n");
        sb.append("    numPkts: ").append(toIndentedString(numPkts)).append("\n");
        sb.append("    pcapNg: ").append(toIndentedString(pcapNg)).append("\n");
        sb.append("    pktSize: ").append(toIndentedString(pktSize)).append("\n");
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

