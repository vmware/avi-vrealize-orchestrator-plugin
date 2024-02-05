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
 * The DnsQueryNameMatch is a POJO class extends AviRestResource that used for creating
 * DnsQueryNameMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsQueryNameMatch")
@VsoFinder(name = Constants.FINDER_VRO_DNSQUERYNAMEMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsQueryNameMatch extends AviRestResource {
    @JsonProperty("match_criteria")
    @JsonInclude(Include.NON_NULL)
    private String matchCriteria;

    @JsonProperty("query_domain_names")
    @JsonInclude(Include.NON_NULL)
    private List<String> queryDomainNames;

    @JsonProperty("string_group_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> stringGroupRefs;



  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for string matching the dns query domain name in the question section.
   * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
   * REGEX_DOES_NOT_MATCH.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values-
   * begins_with,does_not_begin_with,contains,does_not_contain,ends_with,does_not_end_with,equals,does_not_equal), basic edition(allowed values-
   * begins_with,does_not_begin_with,contains,does_not_contain,ends_with,does_not_end_with,equals,does_not_equal), enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for string matching the dns query domain name in the question section.
   * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
   * REGEX_DOES_NOT_MATCH.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values-
   * begins_with,does_not_begin_with,contains,does_not_contain,ends_with,does_not_end_with,equals,does_not_equal), basic edition(allowed values-
   * begins_with,does_not_begin_with,contains,does_not_contain,ends_with,does_not_end_with,equals,does_not_equal), enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Domain name to match against that specified in the question section of the dns query.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return queryDomainNames
   */
  @VsoMethod
  public List<String> getQueryDomainNames() {
    return queryDomainNames;
  }

  /**
   * This is the setter method. this will set the queryDomainNames
   * Domain name to match against that specified in the question section of the dns query.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return queryDomainNames
   */
  @VsoMethod
  public void setQueryDomainNames(List<String>  queryDomainNames) {
    this.queryDomainNames = queryDomainNames;
  }

  /**
   * This is the setter method this will set the queryDomainNames
   * Domain name to match against that specified in the question section of the dns query.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return queryDomainNames
   */
  @VsoMethod
  public DnsQueryNameMatch addQueryDomainNamesItem(String queryDomainNamesItem) {
    if (this.queryDomainNames == null) {
      this.queryDomainNames = new ArrayList<String>();
    }
    this.queryDomainNames.add(queryDomainNamesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the string group(s) for matching against dns query domain name in the question section.
   * It is a reference to an object of type stringgroup.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public List<String> getStringGroupRefs() {
    return stringGroupRefs;
  }

  /**
   * This is the setter method. this will set the stringGroupRefs
   * Uuid of the string group(s) for matching against dns query domain name in the question section.
   * It is a reference to an object of type stringgroup.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public void setStringGroupRefs(List<String>  stringGroupRefs) {
    this.stringGroupRefs = stringGroupRefs;
  }

  /**
   * This is the setter method this will set the stringGroupRefs
   * Uuid of the string group(s) for matching against dns query domain name in the question section.
   * It is a reference to an object of type stringgroup.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public DnsQueryNameMatch addStringGroupRefsItem(String stringGroupRefsItem) {
    if (this.stringGroupRefs == null) {
      this.stringGroupRefs = new ArrayList<String>();
    }
    this.stringGroupRefs.add(stringGroupRefsItem);
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
  DnsQueryNameMatch objDnsQueryNameMatch = (DnsQueryNameMatch) o;
  return   Objects.equals(this.matchCriteria, objDnsQueryNameMatch.matchCriteria)&&
  Objects.equals(this.queryDomainNames, objDnsQueryNameMatch.queryDomainNames)&&
  Objects.equals(this.stringGroupRefs, objDnsQueryNameMatch.stringGroupRefs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsQueryNameMatch {\n");
      sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
        sb.append("    queryDomainNames: ").append(toIndentedString(queryDomainNames)).append("\n");
        sb.append("    stringGroupRefs: ").append(toIndentedString(stringGroupRefs)).append("\n");
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

