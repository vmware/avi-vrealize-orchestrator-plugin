package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.StringMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The JWTClaimMatch is a POJO class extends AviRestResource that used for creating
 * JWTClaimMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JWTClaimMatch")
@VsoFinder(name = Constants.FINDER_VRO_JWTCLAIMMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JWTClaimMatch extends AviRestResource {
    @JsonProperty("bool_match")
    @JsonInclude(Include.NON_NULL)
    private Boolean boolMatch = null;

    @JsonProperty("int_match")
    @JsonInclude(Include.NON_NULL)
    private Integer intMatch = null;

    @JsonProperty("is_mandatory")
    @JsonInclude(Include.NON_NULL)
    private Boolean isMandatory = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("string_match")
    @JsonInclude(Include.NON_NULL)
    private StringMatch stringMatch = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;

    @JsonProperty("validate")
    @JsonInclude(Include.NON_NULL)
    private Boolean validate = null;



  /**
   * This is the getter method this will return the attribute value.
   * Boolean value against which the claim is matched.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return boolMatch
   */
  @VsoMethod
  public Boolean getBoolMatch() {
    return boolMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Boolean value against which the claim is matched.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param boolMatch set the boolMatch.
   */
  @VsoMethod
  public void setBoolMatch(Boolean  boolMatch) {
    this.boolMatch = boolMatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Integer value against which the claim is matched.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return intMatch
   */
  @VsoMethod
  public Integer getIntMatch() {
    return intMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Integer value against which the claim is matched.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param intMatch set the intMatch.
   */
  @VsoMethod
  public void setIntMatch(Integer  intMatch) {
    this.intMatch = intMatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specified claim should be present in the jwt.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return isMandatory
   */
  @VsoMethod
  public Boolean getIsMandatory() {
    return isMandatory;
  }

  /**
   * This is the setter method to the attribute.
   * Specified claim should be present in the jwt.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param isMandatory set the isMandatory.
   */
  @VsoMethod
  public void setIsMandatory(Boolean  isMandatory) {
    this.isMandatory = isMandatory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Jwt claim name to be validated.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Jwt claim name to be validated.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * String values against which the claim is matched.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringMatch
   */
  @VsoMethod
  public StringMatch getStringMatch() {
    return stringMatch;
  }

  /**
   * This is the setter method to the attribute.
   * String values against which the claim is matched.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param stringMatch set the stringMatch.
   */
  @VsoMethod
  public void setStringMatch(StringMatch stringMatch) {
    this.stringMatch = stringMatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the type of the claim.
   * Enum options - JWT_CLAIM_TYPE_BOOL, JWT_CLAIM_TYPE_INT, JWT_CLAIM_TYPE_STRING.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the type of the claim.
   * Enum options - JWT_CLAIM_TYPE_BOOL, JWT_CLAIM_TYPE_INT, JWT_CLAIM_TYPE_STRING.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies whether to validate the claim value.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return validate
   */
  @VsoMethod
  public Boolean getValidate() {
    return validate;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies whether to validate the claim value.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param validate set the validate.
   */
  @VsoMethod
  public void setValidate(Boolean  validate) {
    this.validate = validate;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  JWTClaimMatch objJWTClaimMatch = (JWTClaimMatch) o;
  return   Objects.equals(this.name, objJWTClaimMatch.name)&&
  Objects.equals(this.isMandatory, objJWTClaimMatch.isMandatory)&&
  Objects.equals(this.validate, objJWTClaimMatch.validate)&&
  Objects.equals(this.type, objJWTClaimMatch.type)&&
  Objects.equals(this.intMatch, objJWTClaimMatch.intMatch)&&
  Objects.equals(this.boolMatch, objJWTClaimMatch.boolMatch)&&
  Objects.equals(this.stringMatch, objJWTClaimMatch.stringMatch);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JWTClaimMatch {\n");
      sb.append("    boolMatch: ").append(toIndentedString(boolMatch)).append("\n");
        sb.append("    intMatch: ").append(toIndentedString(intMatch)).append("\n");
        sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    stringMatch: ").append(toIndentedString(stringMatch)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
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

