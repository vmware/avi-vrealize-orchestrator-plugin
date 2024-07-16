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
 * The IpReputationConfig is a POJO class extends AviRestResource that used for creating
 * IpReputationConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IpReputationConfig")
@VsoFinder(name = Constants.FINDER_VRO_IPREPUTATIONCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IpReputationConfig extends AviRestResource {
    @JsonProperty("enable_ipv4_reputation")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableIpv4Reputation;

    @JsonProperty("enable_ipv6_reputation")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableIpv6Reputation;

    @JsonProperty("ip_reputation_file_object_expiry_duration")
    @JsonInclude(Include.NON_NULL)
    private Integer ipReputationFileObjectExpiryDuration = 3;

    @JsonProperty("ip_reputation_sync_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer ipReputationSyncInterval = 60;



  /**
   * This is the getter method this will return the attribute value.
   * Enable ipv4 reputation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enableIpv4Reputation
   */
  @VsoMethod
  public Boolean getEnableIpv4Reputation() {
    return enableIpv4Reputation;
  }

  /**
   * This is the setter method to the attribute.
   * Enable ipv4 reputation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enableIpv4Reputation set the enableIpv4Reputation.
   */
  @VsoMethod
  public void setEnableIpv4Reputation(Boolean  enableIpv4Reputation) {
    this.enableIpv4Reputation = enableIpv4Reputation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable ipv6 reputation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enableIpv6Reputation
   */
  @VsoMethod
  public Boolean getEnableIpv6Reputation() {
    return enableIpv6Reputation;
  }

  /**
   * This is the setter method to the attribute.
   * Enable ipv6 reputation.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enableIpv6Reputation set the enableIpv6Reputation.
   */
  @VsoMethod
  public void setEnableIpv6Reputation(Boolean  enableIpv6Reputation) {
    this.enableIpv6Reputation = enableIpv6Reputation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip reputation db file object expiry duration in days.
   * Allowed values are 1-7.
   * Field introduced in 20.1.1.
   * Unit is days.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return ipReputationFileObjectExpiryDuration
   */
  @VsoMethod
  public Integer getIpReputationFileObjectExpiryDuration() {
    return ipReputationFileObjectExpiryDuration;
  }

  /**
   * This is the setter method to the attribute.
   * Ip reputation db file object expiry duration in days.
   * Allowed values are 1-7.
   * Field introduced in 20.1.1.
   * Unit is days.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param ipReputationFileObjectExpiryDuration set the ipReputationFileObjectExpiryDuration.
   */
  @VsoMethod
  public void setIpReputationFileObjectExpiryDuration(Integer  ipReputationFileObjectExpiryDuration) {
    this.ipReputationFileObjectExpiryDuration = ipReputationFileObjectExpiryDuration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip reputation db sync interval in minutes.
   * Allowed values are 30-1440.
   * Field introduced in 20.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 60), basic edition(allowed values- 60), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return ipReputationSyncInterval
   */
  @VsoMethod
  public Integer getIpReputationSyncInterval() {
    return ipReputationSyncInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Ip reputation db sync interval in minutes.
   * Allowed values are 30-1440.
   * Field introduced in 20.1.1.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 60), basic edition(allowed values- 60), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param ipReputationSyncInterval set the ipReputationSyncInterval.
   */
  @VsoMethod
  public void setIpReputationSyncInterval(Integer  ipReputationSyncInterval) {
    this.ipReputationSyncInterval = ipReputationSyncInterval;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IpReputationConfig objIpReputationConfig = (IpReputationConfig) o;
  return   Objects.equals(this.ipReputationSyncInterval, objIpReputationConfig.ipReputationSyncInterval)&&
  Objects.equals(this.ipReputationFileObjectExpiryDuration, objIpReputationConfig.ipReputationFileObjectExpiryDuration)&&
  Objects.equals(this.enableIpv4Reputation, objIpReputationConfig.enableIpv4Reputation)&&
  Objects.equals(this.enableIpv6Reputation, objIpReputationConfig.enableIpv6Reputation);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IpReputationConfig {\n");
      sb.append("    enableIpv4Reputation: ").append(toIndentedString(enableIpv4Reputation)).append("\n");
        sb.append("    enableIpv6Reputation: ").append(toIndentedString(enableIpv6Reputation)).append("\n");
        sb.append("    ipReputationFileObjectExpiryDuration: ").append(toIndentedString(ipReputationFileObjectExpiryDuration)).append("\n");
        sb.append("    ipReputationSyncInterval: ").append(toIndentedString(ipReputationSyncInterval)).append("\n");
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

