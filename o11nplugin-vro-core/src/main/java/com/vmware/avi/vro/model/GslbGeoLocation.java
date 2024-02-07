package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GeoLocation;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbGeoLocation is a POJO class extends AviRestResource that used for creating
 * GslbGeoLocation.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbGeoLocation")
@VsoFinder(name = Constants.FINDER_VRO_GSLBGEOLOCATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbGeoLocation extends AviRestResource {
    @JsonProperty("location")
    @JsonInclude(Include.NON_NULL)
    private GeoLocation location;

    @JsonProperty("source")
    @JsonInclude(Include.NON_NULL)
    private String source;



  /**
   * This is the getter method this will return the attribute value.
   * Geographic location of the site.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return location
   */
  @VsoMethod
  public GeoLocation getLocation() {
    return location;
  }

  /**
   * This is the setter method to the attribute.
   * Geographic location of the site.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param location set the location.
   */
  @VsoMethod
  public void setLocation(GeoLocation location) {
    this.location = location;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field describes the source of the geolocation.
   * Enum options - GSLB_LOCATION_SRC_USER_CONFIGURED, GSLB_LOCATION_SRC_INHERIT_FROM_SITE, GSLB_LOCATION_SRC_FROM_GEODB.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return source
   */
  @VsoMethod
  public String getSource() {
    return source;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the source of the geolocation.
   * Enum options - GSLB_LOCATION_SRC_USER_CONFIGURED, GSLB_LOCATION_SRC_INHERIT_FROM_SITE, GSLB_LOCATION_SRC_FROM_GEODB.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param source set the source.
   */
  @VsoMethod
  public void setSource(String  source) {
    this.source = source;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbGeoLocation objGslbGeoLocation = (GslbGeoLocation) o;
  return   Objects.equals(this.source, objGslbGeoLocation.source)&&
  Objects.equals(this.location, objGslbGeoLocation.location);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbGeoLocation {\n");
      sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

