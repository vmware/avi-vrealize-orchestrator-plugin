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
 * The GeoLocation is a POJO class extends AviRestResource that used for creating
 * GeoLocation.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GeoLocation")
@VsoFinder(name = Constants.FINDER_VRO_GEOLOCATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GeoLocation extends AviRestResource {
    @JsonProperty("latitude")
    @JsonInclude(Include.NON_NULL)
    private Float latitude;

    @JsonProperty("longitude")
    @JsonInclude(Include.NON_NULL)
    private Float longitude;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("tag")
    @JsonInclude(Include.NON_NULL)
    private String tag;



  /**
   * This is the getter method this will return the attribute value.
   * Latitude of the location.
   * This is represented as degrees.minutes.
   * The range is from -90.0 (south) to +90.0 (north).
   * Allowed values are -90.0-+90.0.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return latitude
   */
  @VsoMethod
  public Float getLatitude() {
    return latitude;
  }

  /**
   * This is the setter method to the attribute.
   * Latitude of the location.
   * This is represented as degrees.minutes.
   * The range is from -90.0 (south) to +90.0 (north).
   * Allowed values are -90.0-+90.0.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param latitude set the latitude.
   */
  @VsoMethod
  public void setLatitude(Float  latitude) {
    this.latitude = latitude;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Longitude of the location.
   * This is represented as degrees.minutes.
   * The range is from -180.0 (west) to +180.0 (east).
   * Allowed values are -180.0-+180.0.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return longitude
   */
  @VsoMethod
  public Float getLongitude() {
    return longitude;
  }

  /**
   * This is the setter method to the attribute.
   * Longitude of the location.
   * This is represented as degrees.minutes.
   * The range is from -180.0 (west) to +180.0 (east).
   * Allowed values are -180.0-+180.0.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param longitude set the longitude.
   */
  @VsoMethod
  public void setLongitude(Float  longitude) {
    this.longitude = longitude;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Location name in the format country/state/city.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Location name in the format country/state/city.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Location tag string - example  useast.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tag
   */
  @VsoMethod
  public String getTag() {
    return tag;
  }

  /**
   * This is the setter method to the attribute.
   * Location tag string - example  useast.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tag set the tag.
   */
  @VsoMethod
  public void setTag(String  tag) {
    this.tag = tag;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GeoLocation objGeoLocation = (GeoLocation) o;
  return   Objects.equals(this.latitude, objGeoLocation.latitude)&&
  Objects.equals(this.longitude, objGeoLocation.longitude)&&
  Objects.equals(this.name, objGeoLocation.name)&&
  Objects.equals(this.tag, objGeoLocation.tag);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GeoLocation {\n");
      sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

