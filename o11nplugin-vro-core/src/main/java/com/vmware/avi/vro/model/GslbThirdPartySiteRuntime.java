package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbSiteRuntimeInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbThirdPartySiteRuntime is a POJO class extends AviRestResource that used for creating
 * GslbThirdPartySiteRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbThirdPartySiteRuntime")
@VsoFinder(name = Constants.FINDER_VRO_GSLBTHIRDPARTYSITERUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbThirdPartySiteRuntime extends AviRestResource {
    @JsonProperty("health_monitor_info")
    @JsonInclude(Include.NON_NULL)
    private String healthMonitorInfo;

    @JsonProperty("site_info")
    @JsonInclude(Include.NON_NULL)
    private GslbSiteRuntimeInfo siteInfo;



  /**
   * This is the getter method this will return the attribute value.
   * This field will provide information on origin(site name) of the health monitoring information.
   * Field introduced in 22.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return healthMonitorInfo
   */
  @VsoMethod
  public String getHealthMonitorInfo() {
    return healthMonitorInfo;
  }

  /**
   * This is the setter method to the attribute.
   * This field will provide information on origin(site name) of the health monitoring information.
   * Field introduced in 22.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param healthMonitorInfo set the healthMonitorInfo.
   */
  @VsoMethod
  public void setHealthMonitorInfo(String  healthMonitorInfo) {
    this.healthMonitorInfo = healthMonitorInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return siteInfo
   */
  @VsoMethod
  public GslbSiteRuntimeInfo getSiteInfo() {
    return siteInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param siteInfo set the siteInfo.
   */
  @VsoMethod
  public void setSiteInfo(GslbSiteRuntimeInfo siteInfo) {
    this.siteInfo = siteInfo;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbThirdPartySiteRuntime objGslbThirdPartySiteRuntime = (GslbThirdPartySiteRuntime) o;
  return   Objects.equals(this.siteInfo, objGslbThirdPartySiteRuntime.siteInfo)&&
  Objects.equals(this.healthMonitorInfo, objGslbThirdPartySiteRuntime.healthMonitorInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbThirdPartySiteRuntime {\n");
      sb.append("    healthMonitorInfo: ").append(toIndentedString(healthMonitorInfo)).append("\n");
        sb.append("    siteInfo: ").append(toIndentedString(siteInfo)).append("\n");
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

