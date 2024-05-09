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
 * The DNSConfiguration is a POJO class extends AviRestResource that used for creating
 * DNSConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DNSConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_DNSCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DNSConfiguration extends AviRestResource {
    @JsonProperty("search_domain")
    @JsonInclude(Include.NON_NULL)
    private String searchDomain;

    @JsonProperty("server_list")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> serverList;



  /**
   * This is the getter method this will return the attribute value.
   * Search domain to use in dns lookup, multiple domains must be delimited by space only.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return searchDomain
   */
  @VsoMethod
  public String getSearchDomain() {
    return searchDomain;
  }

  /**
   * This is the setter method to the attribute.
   * Search domain to use in dns lookup, multiple domains must be delimited by space only.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param searchDomain set the searchDomain.
   */
  @VsoMethod
  public void setSearchDomain(String  searchDomain) {
    this.searchDomain = searchDomain;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of dns server ip(v4/v6) addresses or fqdns.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverList
   */
  @VsoMethod
  public List<IpAddr> getServerList() {
    return serverList;
  }

  /**
   * This is the setter method. this will set the serverList
   * List of dns server ip(v4/v6) addresses or fqdns.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverList
   */
  @VsoMethod
  public void setServerList(List<IpAddr>  serverList) {
    this.serverList = serverList;
  }

  /**
   * This is the setter method this will set the serverList
   * List of dns server ip(v4/v6) addresses or fqdns.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverList
   */
  @VsoMethod
  public DNSConfiguration addServerListItem(IpAddr serverListItem) {
    if (this.serverList == null) {
      this.serverList = new ArrayList<IpAddr>();
    }
    this.serverList.add(serverListItem);
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
  DNSConfiguration objDNSConfiguration = (DNSConfiguration) o;
  return   Objects.equals(this.serverList, objDNSConfiguration.serverList)&&
  Objects.equals(this.searchDomain, objDNSConfiguration.searchDomain);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DNSConfiguration {\n");
      sb.append("    searchDomain: ").append(toIndentedString(searchDomain)).append("\n");
        sb.append("    serverList: ").append(toIndentedString(serverList)).append("\n");
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

