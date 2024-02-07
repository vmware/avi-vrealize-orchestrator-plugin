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
 * The AlertRuleEvent is a POJO class extends AviRestResource that used for creating
 * AlertRuleEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AlertRuleEvent")
@VsoFinder(name = Constants.FINDER_VRO_ALERTRULEEVENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AlertRuleEvent extends AviRestResource {
    @JsonProperty("event_details")
    @JsonInclude(Include.NON_NULL)
    private List<EventDetailsFilter> eventDetails;

    @JsonProperty("event_id")
    @JsonInclude(Include.NON_NULL)
    private String eventId;

    @JsonProperty("not_cond")
    @JsonInclude(Include.NON_NULL)
    private Boolean notCond = false;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventDetails
   */
  @VsoMethod
  public List<EventDetailsFilter> getEventDetails() {
    return eventDetails;
  }

  /**
   * This is the setter method. this will set the eventDetails
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventDetails
   */
  @VsoMethod
  public void setEventDetails(List<EventDetailsFilter>  eventDetails) {
    this.eventDetails = eventDetails;
  }

  /**
   * This is the setter method this will set the eventDetails
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventDetails
   */
  @VsoMethod
  public AlertRuleEvent addEventDetailsItem(EventDetailsFilter eventDetailsItem) {
    if (this.eventDetails == null) {
      this.eventDetails = new ArrayList<EventDetailsFilter>();
    }
    this.eventDetails.add(eventDetailsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * When the selected event occurs, trigger this alert.
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
   * When the selected event occurs, trigger this alert.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return notCond
   */
  @VsoMethod
  public Boolean getNotCond() {
    return notCond;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param notCond set the notCond.
   */
  @VsoMethod
  public void setNotCond(Boolean  notCond) {
    this.notCond = notCond;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AlertRuleEvent objAlertRuleEvent = (AlertRuleEvent) o;
  return   Objects.equals(this.eventId, objAlertRuleEvent.eventId)&&
  Objects.equals(this.notCond, objAlertRuleEvent.notCond)&&
  Objects.equals(this.eventDetails, objAlertRuleEvent.eventDetails);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AlertRuleEvent {\n");
      sb.append("    eventDetails: ").append(toIndentedString(eventDetails)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    notCond: ").append(toIndentedString(notCond)).append("\n");
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

