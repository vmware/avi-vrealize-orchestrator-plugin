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
 * The NsxtSIRuleDetails is a POJO class extends AviRestResource that used for creating
 * NsxtSIRuleDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtSIRuleDetails")
@VsoFinder(name = Constants.FINDER_VRO_NSXTSIRULEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtSIRuleDetails extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private String action;

    @JsonProperty("destexclude")
    @JsonInclude(Include.NON_NULL)
    private Boolean destexclude;

    @JsonProperty("dests")
    @JsonInclude(Include.NON_NULL)
    private List<String> dests;

    @JsonProperty("direction")
    @JsonInclude(Include.NON_NULL)
    private String direction;

    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString;

    @JsonProperty("pool")
    @JsonInclude(Include.NON_NULL)
    private String pool;

    @JsonProperty("segroup")
    @JsonInclude(Include.NON_NULL)
    private String segroup;

    @JsonProperty("services")
    @JsonInclude(Include.NON_NULL)
    private List<String> services;

    @JsonProperty("sources")
    @JsonInclude(Include.NON_NULL)
    private List<String> sources;

    @JsonProperty("vs")
    @JsonInclude(Include.NON_NULL)
    private String vs;



  /**
   * This is the getter method this will return the attribute value.
   * Rule action.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Rule action.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Destinatios excluded or not.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return destexclude
   */
  @VsoMethod
  public Boolean getDestexclude() {
    return destexclude;
  }

  /**
   * This is the setter method to the attribute.
   * Destinatios excluded or not.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param destexclude set the destexclude.
   */
  @VsoMethod
  public void setDestexclude(Boolean  destexclude) {
    this.destexclude = destexclude;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Destination of redirection rule.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dests
   */
  @VsoMethod
  public List<String> getDests() {
    return dests;
  }

  /**
   * This is the setter method. this will set the dests
   * Destination of redirection rule.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dests
   */
  @VsoMethod
  public void setDests(List<String>  dests) {
    this.dests = dests;
  }

  /**
   * This is the setter method this will set the dests
   * Destination of redirection rule.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dests
   */
  @VsoMethod
  public NsxtSIRuleDetails addDestsItem(String destsItem) {
    if (this.dests == null) {
      this.dests = new ArrayList<String>();
    }
    this.dests.add(destsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Rule direction.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return direction
   */
  @VsoMethod
  public String getDirection() {
    return direction;
  }

  /**
   * This is the setter method to the attribute.
   * Rule direction.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param direction set the direction.
   */
  @VsoMethod
  public void setDirection(String  direction) {
    this.direction = direction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error message.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Error message.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pool name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pool
   */
  @VsoMethod
  public String getPool() {
    return pool;
  }

  /**
   * This is the setter method to the attribute.
   * Pool name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pool set the pool.
   */
  @VsoMethod
  public void setPool(String  pool) {
    this.pool = pool;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceenginegroup name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segroup
   */
  @VsoMethod
  public String getSegroup() {
    return segroup;
  }

  /**
   * This is the setter method to the attribute.
   * Serviceenginegroup name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segroup set the segroup.
   */
  @VsoMethod
  public void setSegroup(String  segroup) {
    this.segroup = segroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Services of redirection rule.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return services
   */
  @VsoMethod
  public List<String> getServices() {
    return services;
  }

  /**
   * This is the setter method. this will set the services
   * Services of redirection rule.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return services
   */
  @VsoMethod
  public void setServices(List<String>  services) {
    this.services = services;
  }

  /**
   * This is the setter method this will set the services
   * Services of redirection rule.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return services
   */
  @VsoMethod
  public NsxtSIRuleDetails addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<String>();
    }
    this.services.add(servicesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Sources of redirection rule.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sources
   */
  @VsoMethod
  public List<String> getSources() {
    return sources;
  }

  /**
   * This is the setter method. this will set the sources
   * Sources of redirection rule.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sources
   */
  @VsoMethod
  public void setSources(List<String>  sources) {
    this.sources = sources;
  }

  /**
   * This is the setter method this will set the sources
   * Sources of redirection rule.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sources
   */
  @VsoMethod
  public NsxtSIRuleDetails addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<String>();
    }
    this.sources.add(sourcesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Vs name.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vs
   */
  @VsoMethod
  public String getVs() {
    return vs;
  }

  /**
   * This is the setter method to the attribute.
   * Vs name.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vs set the vs.
   */
  @VsoMethod
  public void setVs(String  vs) {
    this.vs = vs;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NsxtSIRuleDetails objNsxtSIRuleDetails = (NsxtSIRuleDetails) o;
  return   Objects.equals(this.segroup, objNsxtSIRuleDetails.segroup)&&
  Objects.equals(this.errorString, objNsxtSIRuleDetails.errorString)&&
  Objects.equals(this.pool, objNsxtSIRuleDetails.pool)&&
  Objects.equals(this.action, objNsxtSIRuleDetails.action)&&
  Objects.equals(this.direction, objNsxtSIRuleDetails.direction)&&
  Objects.equals(this.sources, objNsxtSIRuleDetails.sources)&&
  Objects.equals(this.services, objNsxtSIRuleDetails.services)&&
  Objects.equals(this.dests, objNsxtSIRuleDetails.dests)&&
  Objects.equals(this.destexclude, objNsxtSIRuleDetails.destexclude)&&
  Objects.equals(this.vs, objNsxtSIRuleDetails.vs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtSIRuleDetails {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    destexclude: ").append(toIndentedString(destexclude)).append("\n");
        sb.append("    dests: ").append(toIndentedString(dests)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
        sb.append("    segroup: ").append(toIndentedString(segroup)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    vs: ").append(toIndentedString(vs)).append("\n");
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

