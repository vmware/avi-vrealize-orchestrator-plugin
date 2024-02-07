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
 * The EventDetailsFilter is a POJO class extends AviRestResource that used for creating
 * EventDetailsFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "EventDetailsFilter")
@VsoFinder(name = Constants.FINDER_VRO_EVENTDETAILSFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class EventDetailsFilter extends AviRestResource {
    @JsonProperty("comparator")
    @JsonInclude(Include.NON_NULL)
    private String comparator = "ALERT_OP_EQ";

    @JsonProperty("event_details_key")
    @JsonInclude(Include.NON_NULL)
    private String eventDetailsKey;

    @JsonProperty("event_details_value")
    @JsonInclude(Include.NON_NULL)
    private String eventDetailsValue;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - ALERT_OP_LT, ALERT_OP_LE, ALERT_OP_EQ, ALERT_OP_NE, ALERT_OP_GE, ALERT_OP_GT.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ALERT_OP_EQ".
   * @return comparator
   */
  @VsoMethod
  public String getComparator() {
    return comparator;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - ALERT_OP_LT, ALERT_OP_LE, ALERT_OP_EQ, ALERT_OP_NE, ALERT_OP_GE, ALERT_OP_GT.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ALERT_OP_EQ".
   * @param comparator set the comparator.
   */
  @VsoMethod
  public void setComparator(String  comparator) {
    this.comparator = comparator;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventDetailsKey
   */
  @VsoMethod
  public String getEventDetailsKey() {
    return eventDetailsKey;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eventDetailsKey set the eventDetailsKey.
   */
  @VsoMethod
  public void setEventDetailsKey(String  eventDetailsKey) {
    this.eventDetailsKey = eventDetailsKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventDetailsValue
   */
  @VsoMethod
  public String getEventDetailsValue() {
    return eventDetailsValue;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eventDetailsValue set the eventDetailsValue.
   */
  @VsoMethod
  public void setEventDetailsValue(String  eventDetailsValue) {
    this.eventDetailsValue = eventDetailsValue;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  EventDetailsFilter objEventDetailsFilter = (EventDetailsFilter) o;
  return   Objects.equals(this.eventDetailsKey, objEventDetailsFilter.eventDetailsKey)&&
  Objects.equals(this.eventDetailsValue, objEventDetailsFilter.eventDetailsValue)&&
  Objects.equals(this.comparator, objEventDetailsFilter.comparator);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class EventDetailsFilter {\n");
      sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
        sb.append("    eventDetailsKey: ").append(toIndentedString(eventDetailsKey)).append("\n");
        sb.append("    eventDetailsValue: ").append(toIndentedString(eventDetailsValue)).append("\n");
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

