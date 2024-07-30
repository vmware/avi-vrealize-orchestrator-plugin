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
 * The ControllerSizingLimits is a POJO class extends AviRestResource that used for creating
 * ControllerSizingLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerSizingLimits")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERSIZINGLIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerSizingLimits extends AviRestResource {
    @JsonProperty("controller_sizing_cloud_limits")
    @JsonInclude(Include.NON_NULL)
    private List<ControllerSizingCloudLimits> controllerSizingCloudLimits;

    @JsonProperty("flavor")
    @JsonInclude(Include.NON_NULL)
    private String flavor;

    @JsonProperty("num_clouds")
    @JsonInclude(Include.NON_NULL)
    private Integer numClouds;

    @JsonProperty("num_east_west_virtualservices")
    @JsonInclude(Include.NON_NULL)
    private Integer numEastWestVirtualservices;

    @JsonProperty("num_pool_rt_metrics")
    @JsonInclude(Include.NON_NULL)
    private Integer numPoolRtMetrics;

    @JsonProperty("num_se_rt_metrics")
    @JsonInclude(Include.NON_NULL)
    private Integer numSeRtMetrics;

    @JsonProperty("num_servers")
    @JsonInclude(Include.NON_NULL)
    private Integer numServers;

    @JsonProperty("num_serviceengines")
    @JsonInclude(Include.NON_NULL)
    private Integer numServiceengines;

    @JsonProperty("num_tenants")
    @JsonInclude(Include.NON_NULL)
    private Integer numTenants;

    @JsonProperty("num_virtualservices")
    @JsonInclude(Include.NON_NULL)
    private Integer numVirtualservices;

    @JsonProperty("num_virtualservices_rt_metrics")
    @JsonInclude(Include.NON_NULL)
    private Integer numVirtualservicesRtMetrics;

    @JsonProperty("num_vrfs")
    @JsonInclude(Include.NON_NULL)
    private Integer numVrfs;

    @JsonProperty("num_waf_virtualservices")
    @JsonInclude(Include.NON_NULL)
    private Integer numWafVirtualservices;



  /**
   * This is the getter method this will return the attribute value.
   * Controller system limits specific to cloud type for this controller sizing.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerSizingCloudLimits
   */
  @VsoMethod
  public List<ControllerSizingCloudLimits> getControllerSizingCloudLimits() {
    return controllerSizingCloudLimits;
  }

  /**
   * This is the setter method. this will set the controllerSizingCloudLimits
   * Controller system limits specific to cloud type for this controller sizing.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerSizingCloudLimits
   */
  @VsoMethod
  public void setControllerSizingCloudLimits(List<ControllerSizingCloudLimits>  controllerSizingCloudLimits) {
    this.controllerSizingCloudLimits = controllerSizingCloudLimits;
  }

  /**
   * This is the setter method this will set the controllerSizingCloudLimits
   * Controller system limits specific to cloud type for this controller sizing.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerSizingCloudLimits
   */
  @VsoMethod
  public ControllerSizingLimits addControllerSizingCloudLimitsItem(ControllerSizingCloudLimits controllerSizingCloudLimitsItem) {
    if (this.controllerSizingCloudLimits == null) {
      this.controllerSizingCloudLimits = new ArrayList<ControllerSizingCloudLimits>();
    }
    this.controllerSizingCloudLimits.add(controllerSizingCloudLimitsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Controller flavor for this sizing limit.
   * Enum options - CONTROLLER_ESSENTIALS, CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE, CONTROLLER_EXTRA_LARGE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flavor
   */
  @VsoMethod
  public String getFlavor() {
    return flavor;
  }

  /**
   * This is the setter method to the attribute.
   * Controller flavor for this sizing limit.
   * Enum options - CONTROLLER_ESSENTIALS, CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE, CONTROLLER_EXTRA_LARGE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param flavor set the flavor.
   */
  @VsoMethod
  public void setFlavor(String  flavor) {
    this.flavor = flavor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of clouds.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numClouds
   */
  @VsoMethod
  public Integer getNumClouds() {
    return numClouds;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of clouds.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numClouds set the numClouds.
   */
  @VsoMethod
  public void setNumClouds(Integer  numClouds) {
    this.numClouds = numClouds;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of east-west virtualservices.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numEastWestVirtualservices
   */
  @VsoMethod
  public Integer getNumEastWestVirtualservices() {
    return numEastWestVirtualservices;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of east-west virtualservices.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numEastWestVirtualservices set the numEastWestVirtualservices.
   */
  @VsoMethod
  public void setNumEastWestVirtualservices(Integer  numEastWestVirtualservices) {
    this.numEastWestVirtualservices = numEastWestVirtualservices;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of pools with realtime metrics enabled.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numPoolRtMetrics
   */
  @VsoMethod
  public Integer getNumPoolRtMetrics() {
    return numPoolRtMetrics;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of pools with realtime metrics enabled.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numPoolRtMetrics set the numPoolRtMetrics.
   */
  @VsoMethod
  public void setNumPoolRtMetrics(Integer  numPoolRtMetrics) {
    this.numPoolRtMetrics = numPoolRtMetrics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of serviceengine with realtime metrics enabled.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numSeRtMetrics
   */
  @VsoMethod
  public Integer getNumSeRtMetrics() {
    return numSeRtMetrics;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of serviceengine with realtime metrics enabled.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numSeRtMetrics set the numSeRtMetrics.
   */
  @VsoMethod
  public void setNumSeRtMetrics(Integer  numSeRtMetrics) {
    this.numSeRtMetrics = numSeRtMetrics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of servers.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numServers
   */
  @VsoMethod
  public Integer getNumServers() {
    return numServers;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of servers.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numServers set the numServers.
   */
  @VsoMethod
  public void setNumServers(Integer  numServers) {
    this.numServers = numServers;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of serviceengines.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numServiceengines
   */
  @VsoMethod
  public Integer getNumServiceengines() {
    return numServiceengines;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of serviceengines.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numServiceengines set the numServiceengines.
   */
  @VsoMethod
  public void setNumServiceengines(Integer  numServiceengines) {
    this.numServiceengines = numServiceengines;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of tenants.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numTenants
   */
  @VsoMethod
  public Integer getNumTenants() {
    return numTenants;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of tenants.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numTenants set the numTenants.
   */
  @VsoMethod
  public void setNumTenants(Integer  numTenants) {
    this.numTenants = numTenants;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of virtualservices.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numVirtualservices
   */
  @VsoMethod
  public Integer getNumVirtualservices() {
    return numVirtualservices;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of virtualservices.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numVirtualservices set the numVirtualservices.
   */
  @VsoMethod
  public void setNumVirtualservices(Integer  numVirtualservices) {
    this.numVirtualservices = numVirtualservices;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of virtualservices with realtime metrics enabled.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numVirtualservicesRtMetrics
   */
  @VsoMethod
  public Integer getNumVirtualservicesRtMetrics() {
    return numVirtualservicesRtMetrics;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of virtualservices with realtime metrics enabled.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numVirtualservicesRtMetrics set the numVirtualservicesRtMetrics.
   */
  @VsoMethod
  public void setNumVirtualservicesRtMetrics(Integer  numVirtualservicesRtMetrics) {
    this.numVirtualservicesRtMetrics = numVirtualservicesRtMetrics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of vrfcontexts.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numVrfs
   */
  @VsoMethod
  public Integer getNumVrfs() {
    return numVrfs;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of vrfcontexts.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numVrfs set the numVrfs.
   */
  @VsoMethod
  public void setNumVrfs(Integer  numVrfs) {
    this.numVrfs = numVrfs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of virtualservices configured with waf.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numWafVirtualservices
   */
  @VsoMethod
  public Integer getNumWafVirtualservices() {
    return numWafVirtualservices;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of virtualservices configured with waf.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numWafVirtualservices set the numWafVirtualservices.
   */
  @VsoMethod
  public void setNumWafVirtualservices(Integer  numWafVirtualservices) {
    this.numWafVirtualservices = numWafVirtualservices;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerSizingLimits objControllerSizingLimits = (ControllerSizingLimits) o;
  return   Objects.equals(this.flavor, objControllerSizingLimits.flavor)&&
  Objects.equals(this.numVirtualservices, objControllerSizingLimits.numVirtualservices)&&
  Objects.equals(this.numVirtualservicesRtMetrics, objControllerSizingLimits.numVirtualservicesRtMetrics)&&
  Objects.equals(this.numEastWestVirtualservices, objControllerSizingLimits.numEastWestVirtualservices)&&
  Objects.equals(this.numServers, objControllerSizingLimits.numServers)&&
  Objects.equals(this.numServiceengines, objControllerSizingLimits.numServiceengines)&&
  Objects.equals(this.numVrfs, objControllerSizingLimits.numVrfs)&&
  Objects.equals(this.numClouds, objControllerSizingLimits.numClouds)&&
  Objects.equals(this.numTenants, objControllerSizingLimits.numTenants)&&
  Objects.equals(this.numWafVirtualservices, objControllerSizingLimits.numWafVirtualservices)&&
  Objects.equals(this.numPoolRtMetrics, objControllerSizingLimits.numPoolRtMetrics)&&
  Objects.equals(this.numSeRtMetrics, objControllerSizingLimits.numSeRtMetrics)&&
  Objects.equals(this.controllerSizingCloudLimits, objControllerSizingLimits.controllerSizingCloudLimits);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerSizingLimits {\n");
      sb.append("    controllerSizingCloudLimits: ").append(toIndentedString(controllerSizingCloudLimits)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    numClouds: ").append(toIndentedString(numClouds)).append("\n");
        sb.append("    numEastWestVirtualservices: ").append(toIndentedString(numEastWestVirtualservices)).append("\n");
        sb.append("    numPoolRtMetrics: ").append(toIndentedString(numPoolRtMetrics)).append("\n");
        sb.append("    numSeRtMetrics: ").append(toIndentedString(numSeRtMetrics)).append("\n");
        sb.append("    numServers: ").append(toIndentedString(numServers)).append("\n");
        sb.append("    numServiceengines: ").append(toIndentedString(numServiceengines)).append("\n");
        sb.append("    numTenants: ").append(toIndentedString(numTenants)).append("\n");
        sb.append("    numVirtualservices: ").append(toIndentedString(numVirtualservices)).append("\n");
        sb.append("    numVirtualservicesRtMetrics: ").append(toIndentedString(numVirtualservicesRtMetrics)).append("\n");
        sb.append("    numVrfs: ").append(toIndentedString(numVrfs)).append("\n");
        sb.append("    numWafVirtualservices: ").append(toIndentedString(numWafVirtualservices)).append("\n");
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

