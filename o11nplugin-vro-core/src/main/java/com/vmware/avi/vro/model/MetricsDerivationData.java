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
 * The MetricsDerivationData is a POJO class extends AviRestResource that used for creating
 * MetricsDerivationData.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsDerivationData")
@VsoFinder(name = Constants.FINDER_VRO_METRICSDERIVATIONDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsDerivationData extends AviRestResource {
    @JsonProperty("derivation_fn")
    @JsonInclude(Include.NON_NULL)
    private String derivationFn = null;

    @JsonProperty("exclude_derived_metric")
    @JsonInclude(Include.NON_NULL)
    private Boolean excludeDerivedMetric = false;

    @JsonProperty("include_derivation_metrics")
    @JsonInclude(Include.NON_NULL)
    private Boolean includeDerivationMetrics = false;

    @JsonProperty("join_tables")
    @JsonInclude(Include.NON_NULL)
    private String joinTables = null;

    @JsonProperty("metric_ids")
    @JsonInclude(Include.NON_NULL)
    private String metricIds = null;

    @JsonProperty("result_has_additional_fields")
    @JsonInclude(Include.NON_NULL)
    private Boolean resultHasAdditionalFields = false;

    @JsonProperty("second_order_derivation")
    @JsonInclude(Include.NON_NULL)
    private Boolean secondOrderDerivation = false;

    @JsonProperty("skip_backend_derivation")
    @JsonInclude(Include.NON_NULL)
    private Boolean skipBackendDerivation = false;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - METRICS_ALIAS, SUM_FIRST_N_DIVIDE_BY_LAST, SUM_BW_GAUGE, AVG_GET_POST_OTHER_LATENCY, APPDEX_ON_3_BUCKETS, APPDEX_ON_4_BUCKETS,
   * SUM_GAUGE, SUM_N_METRICS, APPDEX_ON_5_BUCKETS, APPDEX_ON_6_BUCKETS, APPDEX_ON_CONNECTIONS, APPDEX_ON_2_BUCKETS, AVG_CLIENT_LATENCY,
   * AVG_APPLICATION_LATENCY, MIN_N_METRICS, SUM_FIRST_N_DIVIDE_BY_LAST_PERCENTAGE, L4_CONNECTION_ERROR_PERCENTAGE, AVG_L4_CLIENT_LATENCY,
   * CHECK_FOR_TRANSITIONS, SUBSTRACT_ALL_FROM_FIRST...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return derivationFn
   */
  @VsoMethod
  public String getDerivationFn() {
    return derivationFn;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - METRICS_ALIAS, SUM_FIRST_N_DIVIDE_BY_LAST, SUM_BW_GAUGE, AVG_GET_POST_OTHER_LATENCY, APPDEX_ON_3_BUCKETS, APPDEX_ON_4_BUCKETS,
   * SUM_GAUGE, SUM_N_METRICS, APPDEX_ON_5_BUCKETS, APPDEX_ON_6_BUCKETS, APPDEX_ON_CONNECTIONS, APPDEX_ON_2_BUCKETS, AVG_CLIENT_LATENCY,
   * AVG_APPLICATION_LATENCY, MIN_N_METRICS, SUM_FIRST_N_DIVIDE_BY_LAST_PERCENTAGE, L4_CONNECTION_ERROR_PERCENTAGE, AVG_L4_CLIENT_LATENCY,
   * CHECK_FOR_TRANSITIONS, SUBSTRACT_ALL_FROM_FIRST...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param derivationFn set the derivationFn.
   */
  @VsoMethod
  public void setDerivationFn(String  derivationFn) {
    this.derivationFn = derivationFn;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return excludeDerivedMetric
   */
  @VsoMethod
  public Boolean getExcludeDerivedMetric() {
    return excludeDerivedMetric;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param excludeDerivedMetric set the excludeDerivedMetric.
   */
  @VsoMethod
  public void setExcludeDerivedMetric(Boolean  excludeDerivedMetric) {
    this.excludeDerivedMetric = excludeDerivedMetric;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return includeDerivationMetrics
   */
  @VsoMethod
  public Boolean getIncludeDerivationMetrics() {
    return includeDerivationMetrics;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param includeDerivationMetrics set the includeDerivationMetrics.
   */
  @VsoMethod
  public void setIncludeDerivationMetrics(Boolean  includeDerivationMetrics) {
    this.includeDerivationMetrics = includeDerivationMetrics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - METRICS_TABLE_NONE, METRICS_TABLE_ANOMALY, METRICS_TABLE_CONTROLLER_STATS, METRICS_TABLE_HEALTH_SCORE, METRICS_TABLE_SE_STATS,
   * METRICS_TABLE_VSERVER_L4_SERVER, METRICS_TABLE_VSERVER_L4_CLIENT, METRICS_TABLE_VSERVER_L7_CLIENT, METRICS_TABLE_VSERVER_L7_SERVER,
   * METRICS_TABLE_RUM_PREAGG_BROWSER, METRICS_TABLE_RUM_PREAGG_COUNTRY, METRICS_TABLE_RUM_PREAGG_DEVTYPE, METRICS_TABLE_RUM_PREAGG_LANG,
   * METRICS_TABLE_RUM_PREAGG_OS, METRICS_TABLE_RUM_PREAGG_URL, METRICS_TABLE_RUM_ANALYTICS, METRICS_TABLE_VM_STATS, METRICS_TABLE_RESOURCE_TIMING_DIM,
   * METRICS_TABLE_RESOURCE_TIMING_BLOB, METRICS_TABLE_RUM_PREAGG_IPGROUP...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return joinTables
   */
  @VsoMethod
  public String getJoinTables() {
    return joinTables;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - METRICS_TABLE_NONE, METRICS_TABLE_ANOMALY, METRICS_TABLE_CONTROLLER_STATS, METRICS_TABLE_HEALTH_SCORE, METRICS_TABLE_SE_STATS,
   * METRICS_TABLE_VSERVER_L4_SERVER, METRICS_TABLE_VSERVER_L4_CLIENT, METRICS_TABLE_VSERVER_L7_CLIENT, METRICS_TABLE_VSERVER_L7_SERVER,
   * METRICS_TABLE_RUM_PREAGG_BROWSER, METRICS_TABLE_RUM_PREAGG_COUNTRY, METRICS_TABLE_RUM_PREAGG_DEVTYPE, METRICS_TABLE_RUM_PREAGG_LANG,
   * METRICS_TABLE_RUM_PREAGG_OS, METRICS_TABLE_RUM_PREAGG_URL, METRICS_TABLE_RUM_ANALYTICS, METRICS_TABLE_VM_STATS, METRICS_TABLE_RESOURCE_TIMING_DIM,
   * METRICS_TABLE_RESOURCE_TIMING_BLOB, METRICS_TABLE_RUM_PREAGG_IPGROUP...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param joinTables set the joinTables.
   */
  @VsoMethod
  public void setJoinTables(String  joinTables) {
    this.joinTables = joinTables;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricIds
   */
  @VsoMethod
  public String getMetricIds() {
    return metricIds;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricIds set the metricIds.
   */
  @VsoMethod
  public void setMetricIds(String  metricIds) {
    this.metricIds = metricIds;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return resultHasAdditionalFields
   */
  @VsoMethod
  public Boolean getResultHasAdditionalFields() {
    return resultHasAdditionalFields;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param resultHasAdditionalFields set the resultHasAdditionalFields.
   */
  @VsoMethod
  public void setResultHasAdditionalFields(Boolean  resultHasAdditionalFields) {
    this.resultHasAdditionalFields = resultHasAdditionalFields;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return secondOrderDerivation
   */
  @VsoMethod
  public Boolean getSecondOrderDerivation() {
    return secondOrderDerivation;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param secondOrderDerivation set the secondOrderDerivation.
   */
  @VsoMethod
  public void setSecondOrderDerivation(Boolean  secondOrderDerivation) {
    this.secondOrderDerivation = secondOrderDerivation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return skipBackendDerivation
   */
  @VsoMethod
  public Boolean getSkipBackendDerivation() {
    return skipBackendDerivation;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param skipBackendDerivation set the skipBackendDerivation.
   */
  @VsoMethod
  public void setSkipBackendDerivation(Boolean  skipBackendDerivation) {
    this.skipBackendDerivation = skipBackendDerivation;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsDerivationData objMetricsDerivationData = (MetricsDerivationData) o;
  return   Objects.equals(this.metricIds, objMetricsDerivationData.metricIds)&&
  Objects.equals(this.derivationFn, objMetricsDerivationData.derivationFn)&&
  Objects.equals(this.includeDerivationMetrics, objMetricsDerivationData.includeDerivationMetrics)&&
  Objects.equals(this.excludeDerivedMetric, objMetricsDerivationData.excludeDerivedMetric)&&
  Objects.equals(this.resultHasAdditionalFields, objMetricsDerivationData.resultHasAdditionalFields)&&
  Objects.equals(this.joinTables, objMetricsDerivationData.joinTables)&&
  Objects.equals(this.skipBackendDerivation, objMetricsDerivationData.skipBackendDerivation)&&
  Objects.equals(this.secondOrderDerivation, objMetricsDerivationData.secondOrderDerivation);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsDerivationData {\n");
      sb.append("    derivationFn: ").append(toIndentedString(derivationFn)).append("\n");
        sb.append("    excludeDerivedMetric: ").append(toIndentedString(excludeDerivedMetric)).append("\n");
        sb.append("    includeDerivationMetrics: ").append(toIndentedString(includeDerivationMetrics)).append("\n");
        sb.append("    joinTables: ").append(toIndentedString(joinTables)).append("\n");
        sb.append("    metricIds: ").append(toIndentedString(metricIds)).append("\n");
        sb.append("    resultHasAdditionalFields: ").append(toIndentedString(resultHasAdditionalFields)).append("\n");
        sb.append("    secondOrderDerivation: ").append(toIndentedString(secondOrderDerivation)).append("\n");
        sb.append("    skipBackendDerivation: ").append(toIndentedString(skipBackendDerivation)).append("\n");
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

