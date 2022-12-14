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
 * The ClientLogConfiguration is a POJO class extends AviRestResource that used for creating
 * ClientLogConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ClientLogConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_CLIENTLOGCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ClientLogConfiguration extends AviRestResource {
    @JsonProperty("enable_significant_log_collection")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableSignificantLogCollection;

    @JsonProperty("filtered_log_processing")
    @JsonInclude(Include.NON_NULL)
    private String filteredLogProcessing = "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND";

    @JsonProperty("non_significant_log_processing")
    @JsonInclude(Include.NON_NULL)
    private String nonSignificantLogProcessing = "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND";

    @JsonProperty("significant_log_processing")
    @JsonInclude(Include.NON_NULL)
    private String significantLogProcessing = "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND";



  /**
   * This is the getter method this will return the attribute value.
   * Enable significant log collection.
   * By default, this flag is enabled, which means that avi ses collect significant logs and forward them to controller for further processing.
   * For example, these logs correspond to error conditions such as when the response code for a request is 500.
   * Users can deactivate this flag to turn off default significant log collection.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @return enableSignificantLogCollection
   */
  @VsoMethod
  public Boolean getEnableSignificantLogCollection() {
    return enableSignificantLogCollection;
  }

  /**
   * This is the setter method to the attribute.
   * Enable significant log collection.
   * By default, this flag is enabled, which means that avi ses collect significant logs and forward them to controller for further processing.
   * For example, these logs correspond to error conditions such as when the response code for a request is 500.
   * Users can deactivate this flag to turn off default significant log collection.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @param enableSignificantLogCollection set the enableSignificantLogCollection.
   */
  @VsoMethod
  public void setEnableSignificantLogCollection(Boolean  enableSignificantLogCollection) {
    this.enableSignificantLogCollection = enableSignificantLogCollection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filtered logs are logs that match any client log filters or rules with logging enabled.
   * Such logs are processed by the logs analytics system according to this setting.
   * Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX,
   * LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND".
   * @return filteredLogProcessing
   */
  @VsoMethod
  public String getFilteredLogProcessing() {
    return filteredLogProcessing;
  }

  /**
   * This is the setter method to the attribute.
   * Filtered logs are logs that match any client log filters or rules with logging enabled.
   * Such logs are processed by the logs analytics system according to this setting.
   * Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX,
   * LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND".
   * @param filteredLogProcessing set the filteredLogProcessing.
   */
  @VsoMethod
  public void setFilteredLogProcessing(String  filteredLogProcessing) {
    this.filteredLogProcessing = filteredLogProcessing;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Logs that are neither significant nor filtered, are processed by the logs analytics system according to this setting.
   * Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX,
   * LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND".
   * @return nonSignificantLogProcessing
   */
  @VsoMethod
  public String getNonSignificantLogProcessing() {
    return nonSignificantLogProcessing;
  }

  /**
   * This is the setter method to the attribute.
   * Logs that are neither significant nor filtered, are processed by the logs analytics system according to this setting.
   * Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX,
   * LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND".
   * @param nonSignificantLogProcessing set the nonSignificantLogProcessing.
   */
  @VsoMethod
  public void setNonSignificantLogProcessing(String  nonSignificantLogProcessing) {
    this.nonSignificantLogProcessing = nonSignificantLogProcessing;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Significant logs are processed by the logs analytics system according to this setting.
   * Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX,
   * LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND".
   * @return significantLogProcessing
   */
  @VsoMethod
  public String getSignificantLogProcessing() {
    return significantLogProcessing;
  }

  /**
   * This is the setter method to the attribute.
   * Significant logs are processed by the logs analytics system according to this setting.
   * Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX,
   * LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND".
   * @param significantLogProcessing set the significantLogProcessing.
   */
  @VsoMethod
  public void setSignificantLogProcessing(String  significantLogProcessing) {
    this.significantLogProcessing = significantLogProcessing;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ClientLogConfiguration objClientLogConfiguration = (ClientLogConfiguration) o;
  return   Objects.equals(this.enableSignificantLogCollection, objClientLogConfiguration.enableSignificantLogCollection)&&
  Objects.equals(this.significantLogProcessing, objClientLogConfiguration.significantLogProcessing)&&
  Objects.equals(this.filteredLogProcessing, objClientLogConfiguration.filteredLogProcessing)&&
  Objects.equals(this.nonSignificantLogProcessing, objClientLogConfiguration.nonSignificantLogProcessing);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ClientLogConfiguration {\n");
      sb.append("    enableSignificantLogCollection: ").append(toIndentedString(enableSignificantLogCollection)).append("\n");
        sb.append("    filteredLogProcessing: ").append(toIndentedString(filteredLogProcessing)).append("\n");
        sb.append("    nonSignificantLogProcessing: ").append(toIndentedString(nonSignificantLogProcessing)).append("\n");
        sb.append("    significantLogProcessing: ").append(toIndentedString(significantLogProcessing)).append("\n");
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

