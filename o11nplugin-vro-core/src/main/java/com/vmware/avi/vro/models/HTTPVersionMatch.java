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
 * The HTTPVersionMatch is a POJO class extends AviRestResource that used for creating
 * HTTPVersionMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPVersionMatch")
@VsoFinder(name = Constants.FINDER_VRO_HTTPVERSIONMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPVersionMatch extends AviRestResource {
    @JsonProperty("match_criteria")
    @JsonInclude(Include.NON_NULL)
    private String matchCriteria = null;

    @JsonProperty("versions")
    @JsonInclude(Include.NON_NULL)
    private List<String> versions = null;



  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for http version matching the version used in the http request.
   * Enum options - IS_IN, IS_NOT_IN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for http version matching the version used in the http request.
   * Enum options - IS_IN, IS_NOT_IN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http protocol version.
   * Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO.
   * Minimum of 1 items required.
   * Maximum of 8 items allowed.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- one_zero,one_one), basic edition(allowed values-
   * one_zero,one_one), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return versions
   */
  @VsoMethod
  public List<String> getVersions() {
    return versions;
  }

  /**
   * This is the setter method. this will set the versions
   * Http protocol version.
   * Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO.
   * Minimum of 1 items required.
   * Maximum of 8 items allowed.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- one_zero,one_one), basic edition(allowed values-
   * one_zero,one_one), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return versions
   */
  @VsoMethod
  public void setVersions(List<String>  versions) {
    this.versions = versions;
  }

  /**
   * This is the setter method this will set the versions
   * Http protocol version.
   * Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO.
   * Minimum of 1 items required.
   * Maximum of 8 items allowed.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- one_zero,one_one), basic edition(allowed values-
   * one_zero,one_one), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return versions
   */
  @VsoMethod
  public HTTPVersionMatch addVersionsItem(String versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<String>();
    }
    this.versions.add(versionsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPVersionMatch objHTTPVersionMatch = (HTTPVersionMatch) o;
  return   Objects.equals(this.matchCriteria, objHTTPVersionMatch.matchCriteria)&&
  Objects.equals(this.versions, objHTTPVersionMatch.versions);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPVersionMatch {\n");
      sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

