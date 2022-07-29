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
 * The DnsRuleActionPoolSwitching is a POJO class extends AviRestResource that used for creating
 * DnsRuleActionPoolSwitching.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsRuleActionPoolSwitching")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULEACTIONPOOLSWITCHING)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsRuleActionPoolSwitching extends AviRestResource {
    @JsonProperty("pool_group_ref")
    @JsonInclude(Include.NON_NULL)
    private String poolGroupRef = null;

    @JsonProperty("pool_ref")
    @JsonInclude(Include.NON_NULL)
    private String poolRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Reference of the pool group to serve the passthrough dns query which cannot be served locally.
   * It is a reference to an object of type poolgroup.
   * Field introduced in 18.1.3, 17.2.12.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolGroupRef
   */
  @VsoMethod
  public String getPoolGroupRef() {
    return poolGroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * Reference of the pool group to serve the passthrough dns query which cannot be served locally.
   * It is a reference to an object of type poolgroup.
   * Field introduced in 18.1.3, 17.2.12.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolGroupRef set the poolGroupRef.
   */
  @VsoMethod
  public void setPoolGroupRef(String  poolGroupRef) {
    this.poolGroupRef = poolGroupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reference of the pool to serve the passthrough dns query which cannot be served locally.
   * It is a reference to an object of type pool.
   * Field introduced in 18.1.3, 17.2.12.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolRef
   */
  @VsoMethod
  public String getPoolRef() {
    return poolRef;
  }

  /**
   * This is the setter method to the attribute.
   * Reference of the pool to serve the passthrough dns query which cannot be served locally.
   * It is a reference to an object of type pool.
   * Field introduced in 18.1.3, 17.2.12.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolRef set the poolRef.
   */
  @VsoMethod
  public void setPoolRef(String  poolRef) {
    this.poolRef = poolRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsRuleActionPoolSwitching objDnsRuleActionPoolSwitching = (DnsRuleActionPoolSwitching) o;
  return   Objects.equals(this.poolRef, objDnsRuleActionPoolSwitching.poolRef)&&
  Objects.equals(this.poolGroupRef, objDnsRuleActionPoolSwitching.poolGroupRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsRuleActionPoolSwitching {\n");
      sb.append("    poolGroupRef: ").append(toIndentedString(poolGroupRef)).append("\n");
        sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
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

