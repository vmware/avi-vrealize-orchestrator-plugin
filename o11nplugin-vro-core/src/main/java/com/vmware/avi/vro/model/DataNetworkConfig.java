package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.NsxtTier1SegmentConfig;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DataNetworkConfig is a POJO class extends AviRestResource that used for creating
 * DataNetworkConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DataNetworkConfig")
@VsoFinder(name = Constants.FINDER_VRO_DATANETWORKCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DataNetworkConfig extends AviRestResource {
    @JsonProperty("tier1_segment_config")
    @JsonInclude(Include.NON_NULL)
    private NsxtTier1SegmentConfig tier1SegmentConfig;

    @JsonProperty("transport_zone")
    @JsonInclude(Include.NON_NULL)
    private String transportZone;

    @JsonProperty("tz_type")
    @JsonInclude(Include.NON_NULL)
    private String tzType;

    @JsonProperty("vlan_segments")
    @JsonInclude(Include.NON_NULL)
    private List<String> vlanSegments;



  /**
   * This is the getter method this will return the attribute value.
   * Nsxt tier1 segment configuration for avi service engine data path.
   * This should be set only when transport zone is of type overlay.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tier1SegmentConfig
   */
  @VsoMethod
  public NsxtTier1SegmentConfig getTier1SegmentConfig() {
    return tier1SegmentConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Nsxt tier1 segment configuration for avi service engine data path.
   * This should be set only when transport zone is of type overlay.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tier1SegmentConfig set the tier1SegmentConfig.
   */
  @VsoMethod
  public void setTier1SegmentConfig(NsxtTier1SegmentConfig tier1SegmentConfig) {
    this.tier1SegmentConfig = tier1SegmentConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Data transport zone path for avi service engines.
   * Example- /infra/sites/default/enforcement-points/default/transport-zones/xxx-xxx-xxxx.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return transportZone
   */
  @VsoMethod
  public String getTransportZone() {
    return transportZone;
  }

  /**
   * This is the setter method to the attribute.
   * Data transport zone path for avi service engines.
   * Example- /infra/sites/default/enforcement-points/default/transport-zones/xxx-xxx-xxxx.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param transportZone set the transportZone.
   */
  @VsoMethod
  public void setTransportZone(String  transportZone) {
    this.transportZone = transportZone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Data transport zone type overlay or vlan.
   * Enum options - OVERLAY, VLAN.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tzType
   */
  @VsoMethod
  public String getTzType() {
    return tzType;
  }

  /**
   * This is the setter method to the attribute.
   * Data transport zone type overlay or vlan.
   * Enum options - OVERLAY, VLAN.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tzType set the tzType.
   */
  @VsoMethod
  public void setTzType(String  tzType) {
    this.tzType = tzType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Data vlan segments path to use for avi service engines.
   * Example- /infra/segments/vlanls.
   * This should be set only when transport zone is of type vlan.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vlanSegments
   */
  @VsoMethod
  public List<String> getVlanSegments() {
    return vlanSegments;
  }

  /**
   * This is the setter method. this will set the vlanSegments
   * Data vlan segments path to use for avi service engines.
   * Example- /infra/segments/vlanls.
   * This should be set only when transport zone is of type vlan.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vlanSegments
   */
  @VsoMethod
  public void setVlanSegments(List<String>  vlanSegments) {
    this.vlanSegments = vlanSegments;
  }

  /**
   * This is the setter method this will set the vlanSegments
   * Data vlan segments path to use for avi service engines.
   * Example- /infra/segments/vlanls.
   * This should be set only when transport zone is of type vlan.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vlanSegments
   */
  @VsoMethod
  public DataNetworkConfig addVlanSegmentsItem(String vlanSegmentsItem) {
    if (this.vlanSegments == null) {
      this.vlanSegments = new ArrayList<String>();
    }
    this.vlanSegments.add(vlanSegmentsItem);
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
  DataNetworkConfig objDataNetworkConfig = (DataNetworkConfig) o;
  return   Objects.equals(this.tzType, objDataNetworkConfig.tzType)&&
  Objects.equals(this.transportZone, objDataNetworkConfig.transportZone)&&
  Objects.equals(this.vlanSegments, objDataNetworkConfig.vlanSegments)&&
  Objects.equals(this.tier1SegmentConfig, objDataNetworkConfig.tier1SegmentConfig);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DataNetworkConfig {\n");
      sb.append("    tier1SegmentConfig: ").append(toIndentedString(tier1SegmentConfig)).append("\n");
        sb.append("    transportZone: ").append(toIndentedString(transportZone)).append("\n");
        sb.append("    tzType: ").append(toIndentedString(tzType)).append("\n");
        sb.append("    vlanSegments: ").append(toIndentedString(vlanSegments)).append("\n");
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

