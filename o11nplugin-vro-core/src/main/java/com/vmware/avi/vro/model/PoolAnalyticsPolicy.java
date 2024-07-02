package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.MetricsRealTimeUpdate;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The PoolAnalyticsPolicy is a POJO class extends AviRestResource that used for creating
 * PoolAnalyticsPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PoolAnalyticsPolicy")
@VsoFinder(name = Constants.FINDER_VRO_POOLANALYTICSPOLICY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PoolAnalyticsPolicy extends AviRestResource {
    @JsonProperty("enable_realtime_metrics")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableRealtimeMetrics;

    @JsonProperty("metrics_realtime_update")
    @JsonInclude(Include.NON_NULL)
    private MetricsRealTimeUpdate metricsRealtimeUpdate;



  /**
   * This is the getter method this will return the attribute value.
   * Enable real time metrics for server and pool metrics eg.
   * L4_server.xxx, l7_server.xxx.
   * Field deprecated in 31.1.1.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return enableRealtimeMetrics
   */
  @VsoMethod
  public Boolean getEnableRealtimeMetrics() {
    return enableRealtimeMetrics;
  }

  /**
   * This is the setter method to the attribute.
   * Enable real time metrics for server and pool metrics eg.
   * L4_server.xxx, l7_server.xxx.
   * Field deprecated in 31.1.1.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param enableRealtimeMetrics set the enableRealtimeMetrics.
   */
  @VsoMethod
  public void setEnableRealtimeMetrics(Boolean  enableRealtimeMetrics) {
    this.enableRealtimeMetrics = enableRealtimeMetrics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable realtime metrics and its duration.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricsRealtimeUpdate
   */
  @VsoMethod
  public MetricsRealTimeUpdate getMetricsRealtimeUpdate() {
    return metricsRealtimeUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * Enable realtime metrics and its duration.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricsRealtimeUpdate set the metricsRealtimeUpdate.
   */
  @VsoMethod
  public void setMetricsRealtimeUpdate(MetricsRealTimeUpdate metricsRealtimeUpdate) {
    this.metricsRealtimeUpdate = metricsRealtimeUpdate;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PoolAnalyticsPolicy objPoolAnalyticsPolicy = (PoolAnalyticsPolicy) o;
  return   Objects.equals(this.enableRealtimeMetrics, objPoolAnalyticsPolicy.enableRealtimeMetrics)&&
  Objects.equals(this.metricsRealtimeUpdate, objPoolAnalyticsPolicy.metricsRealtimeUpdate);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PoolAnalyticsPolicy {\n");
      sb.append("    enableRealtimeMetrics: ").append(toIndentedString(enableRealtimeMetrics)).append("\n");
        sb.append("    metricsRealtimeUpdate: ").append(toIndentedString(metricsRealtimeUpdate)).append("\n");
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

