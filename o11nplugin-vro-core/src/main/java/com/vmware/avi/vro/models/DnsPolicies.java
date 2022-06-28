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
 * The DnsPolicies is a POJO class extends AviRestResource that used for creating
 * DnsPolicies.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsPolicies")
@VsoFinder(name = Constants.FINDER_VRO_DNSPOLICIES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsPolicies extends AviRestResource {
    @JsonProperty("dns_policy_ref")
    @JsonInclude(Include.NON_NULL)
    private String dnsPolicyRef = null;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index = null;



  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the dns policy.
   * It is a reference to an object of type dnspolicy.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsPolicyRef
   */
  @VsoMethod
  public String getDnsPolicyRef() {
    return dnsPolicyRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the dns policy.
   * It is a reference to an object of type dnspolicy.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dnsPolicyRef set the dnsPolicyRef.
   */
  @VsoMethod
  public void setDnsPolicyRef(String  dnsPolicyRef) {
    this.dnsPolicyRef = dnsPolicyRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index of the dns policy.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the dns policy.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsPolicies objDnsPolicies = (DnsPolicies) o;
  return   Objects.equals(this.index, objDnsPolicies.index)&&
  Objects.equals(this.dnsPolicyRef, objDnsPolicies.dnsPolicyRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsPolicies {\n");
      sb.append("    dnsPolicyRef: ").append(toIndentedString(dnsPolicyRef)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

