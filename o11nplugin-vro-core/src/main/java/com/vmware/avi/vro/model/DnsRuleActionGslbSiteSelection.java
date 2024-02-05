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
 * The DnsRuleActionGslbSiteSelection is a POJO class extends AviRestResource that used for creating
 * DnsRuleActionGslbSiteSelection.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsRuleActionGslbSiteSelection")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULEACTIONGSLBSITESELECTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsRuleActionGslbSiteSelection extends AviRestResource {
    @JsonProperty("fallback_site_names")
    @JsonInclude(Include.NON_NULL)
    private List<String> fallbackSiteNames;

    @JsonProperty("is_site_preferred")
    @JsonInclude(Include.NON_NULL)
    private Boolean isSitePreferred = true;

    @JsonProperty("site_name")
    @JsonInclude(Include.NON_NULL)
    private String siteName;



  /**
   * This is the getter method this will return the attribute value.
   * Gslb fallback sites to use in case the desired site is down.
   * Field introduced in 17.2.5.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fallbackSiteNames
   */
  @VsoMethod
  public List<String> getFallbackSiteNames() {
    return fallbackSiteNames;
  }

  /**
   * This is the setter method. this will set the fallbackSiteNames
   * Gslb fallback sites to use in case the desired site is down.
   * Field introduced in 17.2.5.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fallbackSiteNames
   */
  @VsoMethod
  public void setFallbackSiteNames(List<String>  fallbackSiteNames) {
    this.fallbackSiteNames = fallbackSiteNames;
  }

  /**
   * This is the setter method this will set the fallbackSiteNames
   * Gslb fallback sites to use in case the desired site is down.
   * Field introduced in 17.2.5.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fallbackSiteNames
   */
  @VsoMethod
  public DnsRuleActionGslbSiteSelection addFallbackSiteNamesItem(String fallbackSiteNamesItem) {
    if (this.fallbackSiteNames == null) {
      this.fallbackSiteNames = new ArrayList<String>();
    }
    this.fallbackSiteNames.add(fallbackSiteNamesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * When set to true, gslb site is a preferred site.
   * This setting comes into play when the site is down, as well as no configured fallback site is available (all fallback sites are also down), then
   * any one available site is selected based on the default algorithm for gslb pool member selection.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return isSitePreferred
   */
  @VsoMethod
  public Boolean getIsSitePreferred() {
    return isSitePreferred;
  }

  /**
   * This is the setter method to the attribute.
   * When set to true, gslb site is a preferred site.
   * This setting comes into play when the site is down, as well as no configured fallback site is available (all fallback sites are also down), then
   * any one available site is selected based on the default algorithm for gslb pool member selection.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param isSitePreferred set the isSitePreferred.
   */
  @VsoMethod
  public void setIsSitePreferred(Boolean  isSitePreferred) {
    this.isSitePreferred = isSitePreferred;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gslb site name.
   * Field introduced in 17.1.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return siteName
   */
  @VsoMethod
  public String getSiteName() {
    return siteName;
  }

  /**
   * This is the setter method to the attribute.
   * Gslb site name.
   * Field introduced in 17.1.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param siteName set the siteName.
   */
  @VsoMethod
  public void setSiteName(String  siteName) {
    this.siteName = siteName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsRuleActionGslbSiteSelection objDnsRuleActionGslbSiteSelection = (DnsRuleActionGslbSiteSelection) o;
  return   Objects.equals(this.siteName, objDnsRuleActionGslbSiteSelection.siteName)&&
  Objects.equals(this.isSitePreferred, objDnsRuleActionGslbSiteSelection.isSitePreferred)&&
  Objects.equals(this.fallbackSiteNames, objDnsRuleActionGslbSiteSelection.fallbackSiteNames);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsRuleActionGslbSiteSelection {\n");
      sb.append("    fallbackSiteNames: ").append(toIndentedString(fallbackSiteNames)).append("\n");
        sb.append("    isSitePreferred: ").append(toIndentedString(isSitePreferred)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
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

