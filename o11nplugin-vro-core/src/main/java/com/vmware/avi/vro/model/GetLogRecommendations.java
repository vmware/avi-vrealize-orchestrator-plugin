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
 * The GetLogRecommendations is a POJO class extends AviRestResource that used for creating
 * GetLogRecommendations.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GetLogRecommendations")
@VsoFinder(name = Constants.FINDER_VRO_GETLOGRECOMMENDATIONS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GetLogRecommendations extends AviRestResource {
    @JsonProperty("requests")
    @JsonInclude(Include.NON_NULL)
    private List<RecommendationRequest> requests = null;



  /**
   * This is the getter method this will return the attribute value.
   * Describe the recommendation we want to get.
   * Field introduced in 21.1.3.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requests
   */
  @VsoMethod
  public List<RecommendationRequest> getRequests() {
    return requests;
  }

  /**
   * This is the setter method. this will set the requests
   * Describe the recommendation we want to get.
   * Field introduced in 21.1.3.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requests
   */
  @VsoMethod
  public void setRequests(List<RecommendationRequest>  requests) {
    this.requests = requests;
  }

  /**
   * This is the setter method this will set the requests
   * Describe the recommendation we want to get.
   * Field introduced in 21.1.3.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requests
   */
  @VsoMethod
  public GetLogRecommendations addRequestsItem(RecommendationRequest requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<RecommendationRequest>();
    }
    this.requests.add(requestsItem);
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
  GetLogRecommendations objGetLogRecommendations = (GetLogRecommendations) o;
  return   Objects.equals(this.requests, objGetLogRecommendations.requests);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GetLogRecommendations {\n");
      sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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

