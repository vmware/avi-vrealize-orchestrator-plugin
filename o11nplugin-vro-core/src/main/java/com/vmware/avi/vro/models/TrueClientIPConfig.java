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
 * The TrueClientIPConfig is a POJO class extends AviRestResource that used for creating
 * TrueClientIPConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TrueClientIPConfig")
@VsoFinder(name = Constants.FINDER_VRO_TRUECLIENTIPCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TrueClientIPConfig extends AviRestResource {
    @JsonProperty("direction")
    @JsonInclude(Include.NON_NULL)
    private String direction = "LEFT";

    @JsonProperty("headers")
    @JsonInclude(Include.NON_NULL)
    private List<String> headers = null;

    @JsonProperty("index_in_header")
    @JsonInclude(Include.NON_NULL)
    private Integer indexInHeader = 1;



  /**
   * This is the getter method this will return the attribute value.
   * Denotes the end from which to count the ips in the specified header value.
   * Enum options - LEFT, RIGHT.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LEFT".
   * @return direction
   */
  @VsoMethod
  public String getDirection() {
    return direction;
  }

  /**
   * This is the setter method to the attribute.
   * Denotes the end from which to count the ips in the specified header value.
   * Enum options - LEFT, RIGHT.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LEFT".
   * @param direction set the direction.
   */
  @VsoMethod
  public void setDirection(String  direction) {
    this.direction = direction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Headers to derive client ip from.
   * The header value needs to be a comma-separated list of ip addresses.
   * If none specified and use_true_client_ip is set to true, it will use x-forwarded-for header, if present.
   * Field introduced in 21.1.3.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return headers
   */
  @VsoMethod
  public List<String> getHeaders() {
    return headers;
  }

  /**
   * This is the setter method. this will set the headers
   * Headers to derive client ip from.
   * The header value needs to be a comma-separated list of ip addresses.
   * If none specified and use_true_client_ip is set to true, it will use x-forwarded-for header, if present.
   * Field introduced in 21.1.3.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return headers
   */
  @VsoMethod
  public void setHeaders(List<String>  headers) {
    this.headers = headers;
  }

  /**
   * This is the setter method this will set the headers
   * Headers to derive client ip from.
   * The header value needs to be a comma-separated list of ip addresses.
   * If none specified and use_true_client_ip is set to true, it will use x-forwarded-for header, if present.
   * Field introduced in 21.1.3.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return headers
   */
  @VsoMethod
  public TrueClientIPConfig addHeadersItem(String headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<String>();
    }
    this.headers.add(headersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Position in the configured direction, in the specified header's value, to be used to set true client ip.
   * If the value is greater than the number of ip addresses in the header, then the last ip address in the configured direction in the header will be
   * used.
   * Allowed values are 1-1000.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return indexInHeader
   */
  @VsoMethod
  public Integer getIndexInHeader() {
    return indexInHeader;
  }

  /**
   * This is the setter method to the attribute.
   * Position in the configured direction, in the specified header's value, to be used to set true client ip.
   * If the value is greater than the number of ip addresses in the header, then the last ip address in the configured direction in the header will be
   * used.
   * Allowed values are 1-1000.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param indexInHeader set the indexInHeader.
   */
  @VsoMethod
  public void setIndexInHeader(Integer  indexInHeader) {
    this.indexInHeader = indexInHeader;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TrueClientIPConfig objTrueClientIPConfig = (TrueClientIPConfig) o;
  return   Objects.equals(this.headers, objTrueClientIPConfig.headers)&&
  Objects.equals(this.indexInHeader, objTrueClientIPConfig.indexInHeader)&&
  Objects.equals(this.direction, objTrueClientIPConfig.direction);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TrueClientIPConfig {\n");
      sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    indexInHeader: ").append(toIndentedString(indexInHeader)).append("\n");
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

