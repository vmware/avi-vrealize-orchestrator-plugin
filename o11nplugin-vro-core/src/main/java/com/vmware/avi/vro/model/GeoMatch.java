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
 * The GeoMatch is a POJO class extends AviRestResource that used for creating
 * GeoMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GeoMatch")
@VsoFinder(name = Constants.FINDER_VRO_GEOMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GeoMatch extends AviRestResource {
    @JsonProperty("attribute")
    @JsonInclude(Include.NON_NULL)
    private String attribute;

    @JsonProperty("match_operation")
    @JsonInclude(Include.NON_NULL)
    private String matchOperation;

    @JsonProperty("values")
    @JsonInclude(Include.NON_NULL)
    private List<String> values;



  /**
   * This is the getter method this will return the attribute value.
   * The geo data type to match on.
   * Enum options - ATTRIBUTE_IP_PREFIX, ATTRIBUTE_COUNTRY_CODE, ATTRIBUTE_COUNTRY_NAME, ATTRIBUTE_CONTINENT_CODE, ATTRIBUTE_CONTINENT_NAME,
   * ATTRIBUTE_REGION_NAME, ATTRIBUTE_CITY_NAME, ATTRIBUTE_ISP_NAME, ATTRIBUTE_ORGANIZATION_NAME, ATTRIBUTE_AS_NUMBER, ATTRIBUTE_AS_NAME,
   * ATTRIBUTE_LONGITUDE, ATTRIBUTE_LATITUDE, ATTRIBUTE_CUSTOM_1, ATTRIBUTE_CUSTOM_2, ATTRIBUTE_CUSTOM_3, ATTRIBUTE_CUSTOM_4, ATTRIBUTE_CUSTOM_5,
   * ATTRIBUTE_CUSTOM_6, ATTRIBUTE_CUSTOM_7...
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attribute
   */
  @VsoMethod
  public String getAttribute() {
    return attribute;
  }

  /**
   * This is the setter method to the attribute.
   * The geo data type to match on.
   * Enum options - ATTRIBUTE_IP_PREFIX, ATTRIBUTE_COUNTRY_CODE, ATTRIBUTE_COUNTRY_NAME, ATTRIBUTE_CONTINENT_CODE, ATTRIBUTE_CONTINENT_NAME,
   * ATTRIBUTE_REGION_NAME, ATTRIBUTE_CITY_NAME, ATTRIBUTE_ISP_NAME, ATTRIBUTE_ORGANIZATION_NAME, ATTRIBUTE_AS_NUMBER, ATTRIBUTE_AS_NAME,
   * ATTRIBUTE_LONGITUDE, ATTRIBUTE_LATITUDE, ATTRIBUTE_CUSTOM_1, ATTRIBUTE_CUSTOM_2, ATTRIBUTE_CUSTOM_3, ATTRIBUTE_CUSTOM_4, ATTRIBUTE_CUSTOM_5,
   * ATTRIBUTE_CUSTOM_6, ATTRIBUTE_CUSTOM_7...
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param attribute set the attribute.
   */
  @VsoMethod
  public void setAttribute(String  attribute) {
    this.attribute = attribute;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Match criteria.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchOperation
   */
  @VsoMethod
  public String getMatchOperation() {
    return matchOperation;
  }

  /**
   * This is the setter method to the attribute.
   * Match criteria.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchOperation set the matchOperation.
   */
  @VsoMethod
  public void setMatchOperation(String  matchOperation) {
    this.matchOperation = matchOperation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The values to match.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return values
   */
  @VsoMethod
  public List<String> getValues() {
    return values;
  }

  /**
   * This is the setter method. this will set the values
   * The values to match.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return values
   */
  @VsoMethod
  public void setValues(List<String>  values) {
    this.values = values;
  }

  /**
   * This is the setter method this will set the values
   * The values to match.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return values
   */
  @VsoMethod
  public GeoMatch addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
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
  GeoMatch objGeoMatch = (GeoMatch) o;
  return   Objects.equals(this.matchOperation, objGeoMatch.matchOperation)&&
  Objects.equals(this.attribute, objGeoMatch.attribute)&&
  Objects.equals(this.values, objGeoMatch.values);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GeoMatch {\n");
      sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
        sb.append("    matchOperation: ").append(toIndentedString(matchOperation)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

