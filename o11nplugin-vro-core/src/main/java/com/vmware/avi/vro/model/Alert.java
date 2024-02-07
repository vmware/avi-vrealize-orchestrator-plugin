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
 * The Alert is a POJO class extends AviRestResource that used for creating
 * Alert.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Alert")
@VsoFinder(name = Constants.FINDER_VRO_ALERT, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Alert extends AviRestResource {
    @JsonProperty("action_script_output")
    @JsonInclude(Include.NON_NULL)
    private String actionScriptOutput;

    @JsonProperty("alert_config_ref")
    @JsonInclude(Include.NON_NULL)
    private String alertConfigRef;

    @JsonProperty("app_events")
    @JsonInclude(Include.NON_NULL)
    private List<ApplicationLog> appEvents;

    @JsonProperty("conn_events")
    @JsonInclude(Include.NON_NULL)
    private List<ConnectionLog> connEvents;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("event_pages")
    @JsonInclude(Include.NON_NULL)
    private List<String> eventPages;

    @JsonProperty("events")
    @JsonInclude(Include.NON_NULL)
    private List<EventLog> events;

    @JsonProperty("last_throttle_timestamp")
    @JsonInclude(Include.NON_NULL)
    private Float lastThrottleTimestamp;

    @JsonProperty("level")
    @JsonInclude(Include.NON_NULL)
    private String level;

    @JsonProperty("metric_info")
    @JsonInclude(Include.NON_NULL)
    private List<MetricLog> metricInfo;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("obj_key")
    @JsonInclude(Include.NON_NULL)
    private String objKey;

    @JsonProperty("obj_name")
    @JsonInclude(Include.NON_NULL)
    private String objName;

    @JsonProperty("obj_uuid")
    @JsonInclude(Include.NON_NULL)
    private String objUuid;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;

    @JsonProperty("related_uuids")
    @JsonInclude(Include.NON_NULL)
    private List<String> relatedUuids;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private String state;

    @JsonProperty("summary")
    @JsonInclude(Include.NON_NULL)
    private String summary;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer threshold;

    @JsonProperty("throttle_count")
    @JsonInclude(Include.NON_NULL)
    private Integer throttleCount = 0;

    @JsonProperty("timestamp")
    @JsonInclude(Include.NON_NULL)
    private Float timestamp;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Output of the alert action script.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actionScriptOutput
   */
  @VsoMethod
  public String getActionScriptOutput() {
    return actionScriptOutput;
  }

  /**
   * This is the setter method to the attribute.
   * Output of the alert action script.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param actionScriptOutput set the actionScriptOutput.
   */
  @VsoMethod
  public void setActionScriptOutput(String  actionScriptOutput) {
    this.actionScriptOutput = actionScriptOutput;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type alertconfig.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return alertConfigRef
   */
  @VsoMethod
  public String getAlertConfigRef() {
    return alertConfigRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type alertconfig.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param alertConfigRef set the alertConfigRef.
   */
  @VsoMethod
  public void setAlertConfigRef(String  alertConfigRef) {
    this.alertConfigRef = alertConfigRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return appEvents
   */
  @VsoMethod
  public List<ApplicationLog> getAppEvents() {
    return appEvents;
  }

  /**
   * This is the setter method. this will set the appEvents
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return appEvents
   */
  @VsoMethod
  public void setAppEvents(List<ApplicationLog>  appEvents) {
    this.appEvents = appEvents;
  }

  /**
   * This is the setter method this will set the appEvents
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return appEvents
   */
  @VsoMethod
  public Alert addAppEventsItem(ApplicationLog appEventsItem) {
    if (this.appEvents == null) {
      this.appEvents = new ArrayList<ApplicationLog>();
    }
    this.appEvents.add(appEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connEvents
   */
  @VsoMethod
  public List<ConnectionLog> getConnEvents() {
    return connEvents;
  }

  /**
   * This is the setter method. this will set the connEvents
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connEvents
   */
  @VsoMethod
  public void setConnEvents(List<ConnectionLog>  connEvents) {
    this.connEvents = connEvents;
  }

  /**
   * This is the setter method this will set the connEvents
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connEvents
   */
  @VsoMethod
  public Alert addConnEventsItem(ConnectionLog connEventsItem) {
    if (this.connEvents == null) {
      this.connEvents = new ArrayList<ConnectionLog>();
    }
    this.connEvents.add(connEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Alert generation criteria.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Alert generation criteria.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of event pages this alert is associated with.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventPages
   */
  @VsoMethod
  public List<String> getEventPages() {
    return eventPages;
  }

  /**
   * This is the setter method. this will set the eventPages
   * List of event pages this alert is associated with.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventPages
   */
  @VsoMethod
  public void setEventPages(List<String>  eventPages) {
    this.eventPages = eventPages;
  }

  /**
   * This is the setter method this will set the eventPages
   * List of event pages this alert is associated with.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventPages
   */
  @VsoMethod
  public Alert addEventPagesItem(String eventPagesItem) {
    if (this.eventPages == null) {
      this.eventPages = new ArrayList<String>();
    }
    this.eventPages.add(eventPagesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public List<EventLog> getEvents() {
    return events;
  }

  /**
   * This is the setter method. this will set the events
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public void setEvents(List<EventLog>  events) {
    this.events = events;
  }

  /**
   * This is the setter method this will set the events
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public Alert addEventsItem(EventLog eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<EventLog>();
    }
    this.events.add(eventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Unix timestamp of the last throttling in seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastThrottleTimestamp
   */
  @VsoMethod
  public Float getLastThrottleTimestamp() {
    return lastThrottleTimestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Unix timestamp of the last throttling in seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastThrottleTimestamp set the lastThrottleTimestamp.
   */
  @VsoMethod
  public void setLastThrottleTimestamp(Float  lastThrottleTimestamp) {
    this.lastThrottleTimestamp = lastThrottleTimestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Resolved alert type.
   * Enum options - ALERT_LOW, ALERT_MEDIUM, ALERT_HIGH.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return level
   */
  @VsoMethod
  public String getLevel() {
    return level;
  }

  /**
   * This is the setter method to the attribute.
   * Resolved alert type.
   * Enum options - ALERT_LOW, ALERT_MEDIUM, ALERT_HIGH.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param level set the level.
   */
  @VsoMethod
  public void setLevel(String  level) {
    this.level = level;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricInfo
   */
  @VsoMethod
  public List<MetricLog> getMetricInfo() {
    return metricInfo;
  }

  /**
   * This is the setter method. this will set the metricInfo
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricInfo
   */
  @VsoMethod
  public void setMetricInfo(List<MetricLog>  metricInfo) {
    this.metricInfo = metricInfo;
  }

  /**
   * This is the setter method this will set the metricInfo
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricInfo
   */
  @VsoMethod
  public Alert addMetricInfoItem(MetricLog metricInfoItem) {
    if (this.metricInfo == null) {
      this.metricInfo = new ArrayList<MetricLog>();
    }
    this.metricInfo.add(metricInfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objKey
   */
  @VsoMethod
  public String getObjKey() {
    return objKey;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objKey set the objKey.
   */
  @VsoMethod
  public void setObjKey(String  objKey) {
    this.objKey = objKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objName
   */
  @VsoMethod
  public String getObjName() {
    return objName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objName set the objName.
   */
  @VsoMethod
  public void setObjName(String  objName) {
    this.objName = objName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objUuid
   */
  @VsoMethod
  public String getObjUuid() {
    return objUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objUuid set the objUuid.
   */
  @VsoMethod
  public void setObjUuid(String  objUuid) {
    this.objUuid = objUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Related uuids for the connection log.
   * Only log agent needs to fill this.
   * Server uuid should be in formatpool_uuid-ip-port.
   * In case of no port is set for server it shouldstill be operational port for the server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return relatedUuids
   */
  @VsoMethod
  public List<String> getRelatedUuids() {
    return relatedUuids;
  }

  /**
   * This is the setter method. this will set the relatedUuids
   * Related uuids for the connection log.
   * Only log agent needs to fill this.
   * Server uuid should be in formatpool_uuid-ip-port.
   * In case of no port is set for server it shouldstill be operational port for the server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return relatedUuids
   */
  @VsoMethod
  public void setRelatedUuids(List<String>  relatedUuids) {
    this.relatedUuids = relatedUuids;
  }

  /**
   * This is the setter method this will set the relatedUuids
   * Related uuids for the connection log.
   * Only log agent needs to fill this.
   * Server uuid should be in formatpool_uuid-ip-port.
   * In case of no port is set for server it shouldstill be operational port for the server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return relatedUuids
   */
  @VsoMethod
  public Alert addRelatedUuidsItem(String relatedUuidsItem) {
    if (this.relatedUuids == null) {
      this.relatedUuids = new ArrayList<String>();
    }
    this.relatedUuids.add(relatedUuidsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * State of the alert.
   * It would be active when createdit would be changed to state read when read by the admin.
   * Enum options - ALERT_STATE_ON, ALERT_STATE_DISMISSED, ALERT_STATE_THROTTLED.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * State of the alert.
   * It would be active when createdit would be changed to state read when read by the admin.
   * Enum options - ALERT_STATE_ON, ALERT_STATE_DISMISSED, ALERT_STATE_THROTTLED.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(String  state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Summary of alert based on alert config.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return summary
   */
  @VsoMethod
  public String getSummary() {
    return summary;
  }

  /**
   * This is the setter method to the attribute.
   * Summary of alert based on alert config.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param summary set the summary.
   */
  @VsoMethod
  public void setSummary(String  summary) {
    this.summary = summary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return threshold
   */
  @VsoMethod
  public Integer getThreshold() {
    return threshold;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param threshold set the threshold.
   */
  @VsoMethod
  public void setThreshold(Integer  threshold) {
    this.threshold = threshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of times it was throttled.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return throttleCount
   */
  @VsoMethod
  public Integer getThrottleCount() {
    return throttleCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of times it was throttled.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param throttleCount set the throttleCount.
   */
  @VsoMethod
  public void setThrottleCount(Integer  throttleCount) {
    this.throttleCount = throttleCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unix timestamp of the last throttling in seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timestamp
   */
  @VsoMethod
  public Float getTimestamp() {
    return timestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Unix timestamp of the last throttling in seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timestamp set the timestamp.
   */
  @VsoMethod
  public void setTimestamp(Float  timestamp) {
    this.timestamp = timestamp;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Alert objAlert = (Alert) o;
  return   Objects.equals(this.uuid, objAlert.uuid)&&
  Objects.equals(this.name, objAlert.name)&&
  Objects.equals(this.alertConfigRef, objAlert.alertConfigRef)&&
  Objects.equals(this.level, objAlert.level)&&
  Objects.equals(this.reason, objAlert.reason)&&
  Objects.equals(this.state, objAlert.state)&&
  Objects.equals(this.timestamp, objAlert.timestamp)&&
  Objects.equals(this.objUuid, objAlert.objUuid)&&
  Objects.equals(this.objKey, objAlert.objKey)&&
  Objects.equals(this.objName, objAlert.objName)&&
  Objects.equals(this.threshold, objAlert.threshold)&&
  Objects.equals(this.events, objAlert.events)&&
  Objects.equals(this.appEvents, objAlert.appEvents)&&
  Objects.equals(this.connEvents, objAlert.connEvents)&&
  Objects.equals(this.metricInfo, objAlert.metricInfo)&&
  Objects.equals(this.throttleCount, objAlert.throttleCount)&&
  Objects.equals(this.lastThrottleTimestamp, objAlert.lastThrottleTimestamp)&&
  Objects.equals(this.relatedUuids, objAlert.relatedUuids)&&
  Objects.equals(this.eventPages, objAlert.eventPages)&&
  Objects.equals(this.summary, objAlert.summary)&&
  Objects.equals(this.description, objAlert.description)&&
  Objects.equals(this.actionScriptOutput, objAlert.actionScriptOutput)&&
  Objects.equals(this.tenantRef, objAlert.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Alert {\n");
      sb.append("    actionScriptOutput: ").append(toIndentedString(actionScriptOutput)).append("\n");
        sb.append("    alertConfigRef: ").append(toIndentedString(alertConfigRef)).append("\n");
        sb.append("    appEvents: ").append(toIndentedString(appEvents)).append("\n");
        sb.append("    connEvents: ").append(toIndentedString(connEvents)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eventPages: ").append(toIndentedString(eventPages)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    lastThrottleTimestamp: ").append(toIndentedString(lastThrottleTimestamp)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    metricInfo: ").append(toIndentedString(metricInfo)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objKey: ").append(toIndentedString(objKey)).append("\n");
        sb.append("    objName: ").append(toIndentedString(objName)).append("\n");
        sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    relatedUuids: ").append(toIndentedString(relatedUuids)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    throttleCount: ").append(toIndentedString(throttleCount)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

