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
 * The AnomalyEventDetails is a POJO class extends AviRestResource that used for creating
 * AnomalyEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AnomalyEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_ANOMALYEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AnomalyEventDetails extends AviRestResource {
    @JsonProperty("deviation")
    @JsonInclude(Include.NON_NULL)
    private Float deviation = 0.0f;

    @JsonProperty("metric_id")
    @JsonInclude(Include.NON_NULL)
    private String metricId;

    @JsonProperty("metric_timestamp")
    @JsonInclude(Include.NON_NULL)
    private String metricTimestamp;

    @JsonProperty("model")
    @JsonInclude(Include.NON_NULL)
    private String model = "EXPONENTIAL_WEIGHTED_MOVING_AVG";

    @JsonProperty("models")
    @JsonInclude(Include.NON_NULL)
    private List<String> models;

    @JsonProperty("node_id")
    @JsonInclude(Include.NON_NULL)
    private String nodeId;

    @JsonProperty("obj_type")
    @JsonInclude(Include.NON_NULL)
    private String objType;

    @JsonProperty("pool_name")
    @JsonInclude(Include.NON_NULL)
    private String poolName;

    @JsonProperty("pool_uuid")
    @JsonInclude(Include.NON_NULL)
    private String poolUuid;

    @JsonProperty("priority")
    @JsonInclude(Include.NON_NULL)
    private String priority;

    @JsonProperty("server")
    @JsonInclude(Include.NON_NULL)
    private String server;

    @JsonProperty("value")
    @JsonInclude(Include.NON_NULL)
    private Float value;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @return deviation
   */
  @VsoMethod
  public Float getDeviation() {
    return deviation;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @param deviation set the deviation.
   */
  @VsoMethod
  public void setDeviation(Float  deviation) {
    this.deviation = deviation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricId
   */
  @VsoMethod
  public String getMetricId() {
    return metricId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricId set the metricId.
   */
  @VsoMethod
  public void setMetricId(String  metricId) {
    this.metricId = metricId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricTimestamp
   */
  @VsoMethod
  public String getMetricTimestamp() {
    return metricTimestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricTimestamp set the metricTimestamp.
   */
  @VsoMethod
  public void setMetricTimestamp(String  metricTimestamp) {
    this.metricTimestamp = metricTimestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Deprecated.
   * Enum options - EXPONENTIAL_MOVING_AVG, EXPONENTIAL_WEIGHTED_MOVING_AVG, HOLTWINTERS_AT_AS, HOLTWINTERS_AT_MS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "EXPONENTIAL_WEIGHTED_MOVING_AVG".
   * @return model
   */
  @VsoMethod
  public String getModel() {
    return model;
  }

  /**
   * This is the setter method to the attribute.
   * Deprecated.
   * Enum options - EXPONENTIAL_MOVING_AVG, EXPONENTIAL_WEIGHTED_MOVING_AVG, HOLTWINTERS_AT_AS, HOLTWINTERS_AT_MS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "EXPONENTIAL_WEIGHTED_MOVING_AVG".
   * @param model set the model.
   */
  @VsoMethod
  public void setModel(String  model) {
    this.model = model;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - EXPONENTIAL_MOVING_AVG, EXPONENTIAL_WEIGHTED_MOVING_AVG, HOLTWINTERS_AT_AS, HOLTWINTERS_AT_MS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return models
   */
  @VsoMethod
  public List<String> getModels() {
    return models;
  }

  /**
   * This is the setter method. this will set the models
   * Enum options - EXPONENTIAL_MOVING_AVG, EXPONENTIAL_WEIGHTED_MOVING_AVG, HOLTWINTERS_AT_AS, HOLTWINTERS_AT_MS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return models
   */
  @VsoMethod
  public void setModels(List<String>  models) {
    this.models = models;
  }

  /**
   * This is the setter method this will set the models
   * Enum options - EXPONENTIAL_MOVING_AVG, EXPONENTIAL_WEIGHTED_MOVING_AVG, HOLTWINTERS_AT_AS, HOLTWINTERS_AT_MS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return models
   */
  @VsoMethod
  public AnomalyEventDetails addModelsItem(String modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<String>();
    }
    this.models.add(modelsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeId
   */
  @VsoMethod
  public String getNodeId() {
    return nodeId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nodeId set the nodeId.
   */
  @VsoMethod
  public void setNodeId(String  nodeId) {
    this.nodeId = nodeId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - METRICS_OBJ_TYPE_UNKNOWN, VSERVER_L4_SERVER, VSERVER_L4_CLIENT, VSERVER_L7_SERVER, VSERVER_L7_CLIENT, VM_METRICS_OBJ,
   * SE_METRICS_OBJ, VSERVER_RUM, CONTROLLER_METRICS_OBJ, METRICS_COLLECTION, METRICS_RUM_PREAGG_BROWSER_OBJ, METRICS_RUM_PREAGG_COUNTRY_OBJ,
   * METRICS_RUM_PREAGG_DEVTYPE_OBJ, METRICS_RUM_PREAGG_LANG_OBJ, METRICS_RUM_PREAGG_OS_OBJ, METRICS_RUM_PREAGG_URL_OBJ, METRICS_ANOMALY_OBJ,
   * METRICS_HEALTHSCORE_OBJ, METRICS_RESOURCE_TIMING_BROWSER_OBJ, METRICS_RESOURCE_TIMING_OS_OBJ...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objType
   */
  @VsoMethod
  public String getObjType() {
    return objType;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - METRICS_OBJ_TYPE_UNKNOWN, VSERVER_L4_SERVER, VSERVER_L4_CLIENT, VSERVER_L7_SERVER, VSERVER_L7_CLIENT, VM_METRICS_OBJ,
   * SE_METRICS_OBJ, VSERVER_RUM, CONTROLLER_METRICS_OBJ, METRICS_COLLECTION, METRICS_RUM_PREAGG_BROWSER_OBJ, METRICS_RUM_PREAGG_COUNTRY_OBJ,
   * METRICS_RUM_PREAGG_DEVTYPE_OBJ, METRICS_RUM_PREAGG_LANG_OBJ, METRICS_RUM_PREAGG_OS_OBJ, METRICS_RUM_PREAGG_URL_OBJ, METRICS_ANOMALY_OBJ,
   * METRICS_HEALTHSCORE_OBJ, METRICS_RESOURCE_TIMING_BROWSER_OBJ, METRICS_RESOURCE_TIMING_OS_OBJ...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objType set the objType.
   */
  @VsoMethod
  public void setObjType(String  objType) {
    this.objType = objType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolName
   */
  @VsoMethod
  public String getPoolName() {
    return poolName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolName set the poolName.
   */
  @VsoMethod
  public void setPoolName(String  poolName) {
    this.poolName = poolName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolUuid
   */
  @VsoMethod
  public String getPoolUuid() {
    return poolUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolUuid set the poolUuid.
   */
  @VsoMethod
  public void setPoolUuid(String  poolUuid) {
    this.poolUuid = poolUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - ANZ_PRIORITY_HIGH, ANZ_PRIORITY_MEDIUM, ANZ_PRIORITY_LOW.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return priority
   */
  @VsoMethod
  public String getPriority() {
    return priority;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - ANZ_PRIORITY_HIGH, ANZ_PRIORITY_MEDIUM, ANZ_PRIORITY_LOW.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param priority set the priority.
   */
  @VsoMethod
  public void setPriority(String  priority) {
    this.priority = priority;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return server
   */
  @VsoMethod
  public String getServer() {
    return server;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param server set the server.
   */
  @VsoMethod
  public void setServer(String  server) {
    this.server = server;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return value
   */
  @VsoMethod
  public Float getValue() {
    return value;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param value set the value.
   */
  @VsoMethod
  public void setValue(Float  value) {
    this.value = value;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AnomalyEventDetails objAnomalyEventDetails = (AnomalyEventDetails) o;
  return   Objects.equals(this.deviation, objAnomalyEventDetails.deviation)&&
  Objects.equals(this.value, objAnomalyEventDetails.value)&&
  Objects.equals(this.metricTimestamp, objAnomalyEventDetails.metricTimestamp)&&
  Objects.equals(this.model, objAnomalyEventDetails.model)&&
  Objects.equals(this.metricId, objAnomalyEventDetails.metricId)&&
  Objects.equals(this.priority, objAnomalyEventDetails.priority)&&
  Objects.equals(this.nodeId, objAnomalyEventDetails.nodeId)&&
  Objects.equals(this.objType, objAnomalyEventDetails.objType)&&
  Objects.equals(this.server, objAnomalyEventDetails.server)&&
  Objects.equals(this.poolUuid, objAnomalyEventDetails.poolUuid)&&
  Objects.equals(this.poolName, objAnomalyEventDetails.poolName)&&
  Objects.equals(this.models, objAnomalyEventDetails.models);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AnomalyEventDetails {\n");
      sb.append("    deviation: ").append(toIndentedString(deviation)).append("\n");
        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
        sb.append("    metricTimestamp: ").append(toIndentedString(metricTimestamp)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    objType: ").append(toIndentedString(objType)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

