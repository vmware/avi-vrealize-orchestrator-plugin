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
 * The GslbSubDomainPlacementRuntime is a POJO class extends AviRestResource that used for creating
 * GslbSubDomainPlacementRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbSubDomainPlacementRuntime")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSUBDOMAINPLACEMENTRUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbSubDomainPlacementRuntime extends AviRestResource {
    @JsonProperty("placement_allowed")
    @JsonInclude(Include.NON_NULL)
    private Boolean placementAllowed;

    @JsonProperty("sub_domain")
    @JsonInclude(Include.NON_NULL)
    private String subDomain;

    @JsonProperty("transition_ops")
    @JsonInclude(Include.NON_NULL)
    private String transitionOps = "GSLB_NONE";



  /**
   * This is the getter method this will return the attribute value.
   * This field describes the placement status of fqdns mapping to the above subdomain.
   * If placement allowed is true, then the fqdn/gslbservice will be placed on the dns-vs.
   * Otherwise, it shall not be placed on the dns-vs.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return placementAllowed
   */
  @VsoMethod
  public Boolean getPlacementAllowed() {
    return placementAllowed;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the placement status of fqdns mapping to the above subdomain.
   * If placement allowed is true, then the fqdn/gslbservice will be placed on the dns-vs.
   * Otherwise, it shall not be placed on the dns-vs.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param placementAllowed set the placementAllowed.
   */
  @VsoMethod
  public void setPlacementAllowed(Boolean  placementAllowed) {
    this.placementAllowed = placementAllowed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field identifies the subdomain.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subDomain
   */
  @VsoMethod
  public String getSubDomain() {
    return subDomain;
  }

  /**
   * This is the setter method to the attribute.
   * This field identifies the subdomain.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subDomain set the subDomain.
   */
  @VsoMethod
  public void setSubDomain(String  subDomain) {
    this.subDomain = subDomain;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field describes the transition operation to be initiated downstream when subdomain placement rules change.
   * For example  if a.com was not placed on dns-vs-1 and due to configuration change if it is to be placed on dns-vs-1, then all the gslbservices
   * whose fqdn maps a.com will be pushed to dns-vs-1.
   * In this scenario, the transition ops will be gslb_create.
   * If there is a configuration change where a.com is not placed on dns-vs-1 then the transition ops will be gslb_delete.
   * Enum options - GSLB_NONE, GSLB_CREATE, GSLB_UPDATE, GSLB_DELETE, GSLB_PURGE, GSLB_DECL.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_NONE".
   * @return transitionOps
   */
  @VsoMethod
  public String getTransitionOps() {
    return transitionOps;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the transition operation to be initiated downstream when subdomain placement rules change.
   * For example  if a.com was not placed on dns-vs-1 and due to configuration change if it is to be placed on dns-vs-1, then all the gslbservices
   * whose fqdn maps a.com will be pushed to dns-vs-1.
   * In this scenario, the transition ops will be gslb_create.
   * If there is a configuration change where a.com is not placed on dns-vs-1 then the transition ops will be gslb_delete.
   * Enum options - GSLB_NONE, GSLB_CREATE, GSLB_UPDATE, GSLB_DELETE, GSLB_PURGE, GSLB_DECL.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_NONE".
   * @param transitionOps set the transitionOps.
   */
  @VsoMethod
  public void setTransitionOps(String  transitionOps) {
    this.transitionOps = transitionOps;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbSubDomainPlacementRuntime objGslbSubDomainPlacementRuntime = (GslbSubDomainPlacementRuntime) o;
  return   Objects.equals(this.subDomain, objGslbSubDomainPlacementRuntime.subDomain)&&
  Objects.equals(this.placementAllowed, objGslbSubDomainPlacementRuntime.placementAllowed)&&
  Objects.equals(this.transitionOps, objGslbSubDomainPlacementRuntime.transitionOps);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbSubDomainPlacementRuntime {\n");
      sb.append("    placementAllowed: ").append(toIndentedString(placementAllowed)).append("\n");
        sb.append("    subDomain: ").append(toIndentedString(subDomain)).append("\n");
        sb.append("    transitionOps: ").append(toIndentedString(transitionOps)).append("\n");
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

