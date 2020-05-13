package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DosThresholdProfile;
import com.vmware.avi.vro.model.RateLimiterProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * DosRateLimitProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DosRateLimitProfile")
@VsoFinder(name = Constants.FINDER_VRO_DOSRATELIMITPROFILE, idAccessor = "getObjectID()")
@Service
public class DosRateLimitProfile extends AviRestResource  {
  @JsonProperty("dos_profile")
  private DosThresholdProfile dosProfile = null;

  @JsonProperty("rl_profile")
  private RateLimiterProfile rlProfile = null;

  
  /**
   * Profile for DoS attack detection.
   * @return dosProfile
  **/
  @ApiModelProperty(value = "Profile for DoS attack detection.")

  @Valid

 
  @VsoMethod  
  public DosThresholdProfile getDosProfile() {
    return dosProfile;
  }
    
  @VsoMethod
  public void setDosProfile(DosThresholdProfile dosProfile) {
    this.dosProfile = dosProfile;
  }

  
  /**
   * Profile for Connections/Requests rate limiting.
   * @return rlProfile
  **/
  @ApiModelProperty(value = "Profile for Connections/Requests rate limiting.")

  @Valid

 
  @VsoMethod  
  public RateLimiterProfile getRlProfile() {
    return rlProfile;
  }
    
  @VsoMethod
  public void setRlProfile(RateLimiterProfile rlProfile) {
    this.rlProfile = rlProfile;
  }

  
  public String getObjectID() {
		return "DosRateLimitProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DosRateLimitProfile dosRateLimitProfile = (DosRateLimitProfile) o;
    return Objects.equals(this.dosProfile, dosRateLimitProfile.dosProfile) &&
        Objects.equals(this.rlProfile, dosRateLimitProfile.rlProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dosProfile, rlProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DosRateLimitProfile {\n");
    
    sb.append("    dosProfile: ").append(toIndentedString(dosProfile)).append("\n");
    sb.append("    rlProfile: ").append(toIndentedString(rlProfile)).append("\n");
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

