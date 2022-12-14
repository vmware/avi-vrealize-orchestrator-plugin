package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.EventDetails;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The EventLog is a POJO class extends AviRestResource that used for creating
 * EventLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "EventLog")
@VsoFinder(name = Constants.FINDER_VRO_EVENTLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class EventLog extends AviRestResource {
    @JsonProperty("context")
    @JsonInclude(Include.NON_NULL)
    private String context = null;

    @JsonProperty("details_summary")
    @JsonInclude(Include.NON_NULL)
    private String detailsSummary = null;

    @JsonProperty("event_description")
    @JsonInclude(Include.NON_NULL)
    private String eventDescription = null;

    @JsonProperty("event_details")
    @JsonInclude(Include.NON_NULL)
    private EventDetails eventDetails = null;

    @JsonProperty("event_id")
    @JsonInclude(Include.NON_NULL)
    private String eventId = null;

    @JsonProperty("event_pages")
    @JsonInclude(Include.NON_NULL)
    private List<String> eventPages = null;

    @JsonProperty("ignore_event_details_display")
    @JsonInclude(Include.NON_NULL)
    private Boolean ignoreEventDetailsDisplay = false;

    @JsonProperty("internal")
    @JsonInclude(Include.NON_NULL)
    private String internal = "EVENT_INTERNAL";

    @JsonProperty("is_security_event")
    @JsonInclude(Include.NON_NULL)
    private Boolean isSecurityEvent = false;

    @JsonProperty("module")
    @JsonInclude(Include.NON_NULL)
    private String module = null;

    @JsonProperty("obj_name")
    @JsonInclude(Include.NON_NULL)
    private String objName = null;

    @JsonProperty("obj_type")
    @JsonInclude(Include.NON_NULL)
    private String objType = null;

    @JsonProperty("obj_uuid")
    @JsonInclude(Include.NON_NULL)
    private String objUuid = null;

    @JsonProperty("reason_code")
    @JsonInclude(Include.NON_NULL)
    private String reasonCode = null;

    @JsonProperty("related_uuids")
    @JsonInclude(Include.NON_NULL)
    private List<String> relatedUuids = null;

    @JsonProperty("report_timestamp")
    @JsonInclude(Include.NON_NULL)
    private Integer reportTimestamp = null;

    @JsonProperty("tenant")
    @JsonInclude(Include.NON_NULL)
    private String tenant = null;

    @JsonProperty("tenant_name")
    @JsonInclude(Include.NON_NULL)
    private String tenantName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - EVENT_CONTEXT_SYSTEM, EVENT_CONTEXT_CONFIG, EVENT_CONTEXT_APP, EVENT_CONTEXT_ALL.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return context
   */
  @VsoMethod
  public String getContext() {
    return context;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - EVENT_CONTEXT_SYSTEM, EVENT_CONTEXT_CONFIG, EVENT_CONTEXT_APP, EVENT_CONTEXT_ALL.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param context set the context.
   */
  @VsoMethod
  public void setContext(String  context) {
    this.context = context;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Summary of event details.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return detailsSummary
   */
  @VsoMethod
  public String getDetailsSummary() {
    return detailsSummary;
  }

  /**
   * This is the setter method to the attribute.
   * Summary of event details.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param detailsSummary set the detailsSummary.
   */
  @VsoMethod
  public void setDetailsSummary(String  detailsSummary) {
    this.detailsSummary = detailsSummary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Event description for each event  in the table view.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventDescription
   */
  @VsoMethod
  public String getEventDescription() {
    return eventDescription;
  }

  /**
   * This is the setter method to the attribute.
   * Event description for each event  in the table view.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eventDescription set the eventDescription.
   */
  @VsoMethod
  public void setEventDescription(String  eventDescription) {
    this.eventDescription = eventDescription;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventDetails
   */
  @VsoMethod
  public EventDetails getEventDetails() {
    return eventDetails;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eventDetails set the eventDetails.
   */
  @VsoMethod
  public void setEventDetails(EventDetails eventDetails) {
    this.eventDetails = eventDetails;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VINFRA_DISC_DC, VINFRA_DISC_HOST, VINFRA_DISC_CLUSTER, VINFRA_DISC_VM, VINFRA_DISC_NW, MGMT_NW_NAME_CHANGED,
   * DISCOVERY_DATACENTER_DEL, VM_ADDED, VM_REMOVED, VINFRA_DISC_COMPLETE, VCENTER_ADDRESS_ERROR, SE_GROUP_CLUSTER_DEL, SE_GROUP_MGMT_NW_DEL,
   * MGMT_NW_DEL, VCENTER_BAD_CREDENTIALS, ESX_HOST_UNREACHABLE, SERVER_DELETED, SE_GROUP_HOST_DEL, VINFRA_DISC_FAILURE, ESX_HOST_POWERED_DOWN...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventId
   */
  @VsoMethod
  public String getEventId() {
    return eventId;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - VINFRA_DISC_DC, VINFRA_DISC_HOST, VINFRA_DISC_CLUSTER, VINFRA_DISC_VM, VINFRA_DISC_NW, MGMT_NW_NAME_CHANGED,
   * DISCOVERY_DATACENTER_DEL, VM_ADDED, VM_REMOVED, VINFRA_DISC_COMPLETE, VCENTER_ADDRESS_ERROR, SE_GROUP_CLUSTER_DEL, SE_GROUP_MGMT_NW_DEL,
   * MGMT_NW_DEL, VCENTER_BAD_CREDENTIALS, ESX_HOST_UNREACHABLE, SERVER_DELETED, SE_GROUP_HOST_DEL, VINFRA_DISC_FAILURE, ESX_HOST_POWERED_DOWN...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eventId set the eventId.
   */
  @VsoMethod
  public void setEventId(String  eventId) {
    this.eventId = eventId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pages in which event should come up.
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
   * Pages in which event should come up.
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
   * Pages in which event should come up.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventPages
   */
  @VsoMethod
  public EventLog addEventPagesItem(String eventPagesItem) {
    if (this.eventPages == null) {
      this.eventPages = new ArrayList<String>();
    }
    this.eventPages.add(eventPagesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return ignoreEventDetailsDisplay
   */
  @VsoMethod
  public Boolean getIgnoreEventDetailsDisplay() {
    return ignoreEventDetailsDisplay;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param ignoreEventDetailsDisplay set the ignoreEventDetailsDisplay.
   */
  @VsoMethod
  public void setIgnoreEventDetailsDisplay(Boolean  ignoreEventDetailsDisplay) {
    this.ignoreEventDetailsDisplay = ignoreEventDetailsDisplay;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - EVENT_INTERNAL, EVENT_EXTERNAL.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "EVENT_INTERNAL".
   * @return internal
   */
  @VsoMethod
  public String getInternal() {
    return internal;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - EVENT_INTERNAL, EVENT_EXTERNAL.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "EVENT_INTERNAL".
   * @param internal set the internal.
   */
  @VsoMethod
  public void setInternal(String  internal) {
    this.internal = internal;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isSecurityEvent
   */
  @VsoMethod
  public Boolean getIsSecurityEvent() {
    return isSecurityEvent;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isSecurityEvent set the isSecurityEvent.
   */
  @VsoMethod
  public void setIsSecurityEvent(Boolean  isSecurityEvent) {
    this.isSecurityEvent = isSecurityEvent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - UNKNOWN, VSMGR, SEMGR, RESMGR, VIMGR, METRICSMGR, CONFIG, SE_GENERAL, SE_FLOWTABLE, SE_HM, SE_POOL_PERSISTENCE, SE_POOL, VSERVER,
   * CLOUD_CONNECTOR, CLUSTERMGR, HSMGR, NW_MGR, LICENSE_MGR, RES_MONITOR, STATEDBCACHE...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return module
   */
  @VsoMethod
  public String getModule() {
    return module;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - UNKNOWN, VSMGR, SEMGR, RESMGR, VIMGR, METRICSMGR, CONFIG, SE_GENERAL, SE_FLOWTABLE, SE_HM, SE_POOL_PERSISTENCE, SE_POOL, VSERVER,
   * CLOUD_CONNECTOR, CLUSTERMGR, HSMGR, NW_MGR, LICENSE_MGR, RES_MONITOR, STATEDBCACHE...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param module set the module.
   */
  @VsoMethod
  public void setModule(String  module) {
    this.module = module;
  }

  /**
   * This is the getter method this will return the attribute value.
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
   * Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP,
   * STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT,
   * PKIPROFILE, AUTHPROFILE, CLOUD...
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
   * Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP,
   * STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT,
   * PKIPROFILE, AUTHPROFILE, CLOUD...
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
   * @return objUuid
   */
  @VsoMethod
  public String getObjUuid() {
    return objUuid;
  }

  /**
   * This is the setter method to the attribute.
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
   * Reason code for generating the event.
   * This would be added to the alert where it would say alert generated  on event with reason <reason code>.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reasonCode
   */
  @VsoMethod
  public String getReasonCode() {
    return reasonCode;
  }

  /**
   * This is the setter method to the attribute.
   * Reason code for generating the event.
   * This would be added to the alert where it would say alert generated  on event with reason <reason code>.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reasonCode set the reasonCode.
   */
  @VsoMethod
  public void setReasonCode(String  reasonCode) {
    this.reasonCode = reasonCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Related objects corresponding to the events.
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
   * Related objects corresponding to the events.
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
   * Related objects corresponding to the events.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return relatedUuids
   */
  @VsoMethod
  public EventLog addRelatedUuidsItem(String relatedUuidsItem) {
    if (this.relatedUuids == null) {
      this.relatedUuids = new ArrayList<String>();
    }
    this.relatedUuids.add(relatedUuidsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reportTimestamp
   */
  @VsoMethod
  public Integer getReportTimestamp() {
    return reportTimestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reportTimestamp set the reportTimestamp.
   */
  @VsoMethod
  public void setReportTimestamp(Integer  reportTimestamp) {
    this.reportTimestamp = reportTimestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenant
   */
  @VsoMethod
  public String getTenant() {
    return tenant;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenant set the tenant.
   */
  @VsoMethod
  public void setTenant(String  tenant) {
    this.tenant = tenant;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantName
   */
  @VsoMethod
  public String getTenantName() {
    return tenantName;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantName set the tenantName.
   */
  @VsoMethod
  public void setTenantName(String  tenantName) {
    this.tenantName = tenantName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  EventLog objEventLog = (EventLog) o;
  return   Objects.equals(this.reportTimestamp, objEventLog.reportTimestamp)&&
  Objects.equals(this.objType, objEventLog.objType)&&
  Objects.equals(this.eventId, objEventLog.eventId)&&
  Objects.equals(this.module, objEventLog.module)&&
  Objects.equals(this.internal, objEventLog.internal)&&
  Objects.equals(this.context, objEventLog.context)&&
  Objects.equals(this.objUuid, objEventLog.objUuid)&&
  Objects.equals(this.objName, objEventLog.objName)&&
  Objects.equals(this.reasonCode, objEventLog.reasonCode)&&
  Objects.equals(this.eventDetails, objEventLog.eventDetails)&&
  Objects.equals(this.detailsSummary, objEventLog.detailsSummary)&&
  Objects.equals(this.relatedUuids, objEventLog.relatedUuids)&&
  Objects.equals(this.eventDescription, objEventLog.eventDescription)&&
  Objects.equals(this.eventPages, objEventLog.eventPages)&&
  Objects.equals(this.ignoreEventDetailsDisplay, objEventLog.ignoreEventDetailsDisplay)&&
  Objects.equals(this.isSecurityEvent, objEventLog.isSecurityEvent)&&
  Objects.equals(this.tenantName, objEventLog.tenantName)&&
  Objects.equals(this.tenant, objEventLog.tenant);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class EventLog {\n");
      sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    detailsSummary: ").append(toIndentedString(detailsSummary)).append("\n");
        sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
        sb.append("    eventDetails: ").append(toIndentedString(eventDetails)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventPages: ").append(toIndentedString(eventPages)).append("\n");
        sb.append("    ignoreEventDetailsDisplay: ").append(toIndentedString(ignoreEventDetailsDisplay)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    isSecurityEvent: ").append(toIndentedString(isSecurityEvent)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    objName: ").append(toIndentedString(objName)).append("\n");
        sb.append("    objType: ").append(toIndentedString(objType)).append("\n");
        sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
        sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
        sb.append("    relatedUuids: ").append(toIndentedString(relatedUuids)).append("\n");
        sb.append("    reportTimestamp: ").append(toIndentedString(reportTimestamp)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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

