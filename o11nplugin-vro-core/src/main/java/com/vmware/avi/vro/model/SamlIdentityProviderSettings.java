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
 * The SamlIdentityProviderSettings is a POJO class extends AviRestResource that used for creating
 * SamlIdentityProviderSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SamlIdentityProviderSettings")
@VsoFinder(name = Constants.FINDER_VRO_SAMLIDENTITYPROVIDERSETTINGS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SamlIdentityProviderSettings extends AviRestResource {
    @JsonProperty("metadata")
    @JsonInclude(Include.NON_NULL)
    private String metadata = null;

    @JsonProperty("metadata_url")
    @JsonInclude(Include.NON_NULL)
    private String metadataUrl = null;



  /**
   * This is the getter method this will return the attribute value.
   * Saml idp metadata.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metadata
   */
  @VsoMethod
  public String getMetadata() {
    return metadata;
  }

  /**
   * This is the setter method to the attribute.
   * Saml idp metadata.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metadata set the metadata.
   */
  @VsoMethod
  public void setMetadata(String  metadata) {
    this.metadata = metadata;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saml idp federation metadata url.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metadataUrl
   */
  @VsoMethod
  public String getMetadataUrl() {
    return metadataUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Saml idp federation metadata url.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metadataUrl set the metadataUrl.
   */
  @VsoMethod
  public void setMetadataUrl(String  metadataUrl) {
    this.metadataUrl = metadataUrl;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SamlIdentityProviderSettings objSamlIdentityProviderSettings = (SamlIdentityProviderSettings) o;
  return   Objects.equals(this.metadata, objSamlIdentityProviderSettings.metadata)&&
  Objects.equals(this.metadataUrl, objSamlIdentityProviderSettings.metadataUrl);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SamlIdentityProviderSettings {\n");
      sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    metadataUrl: ").append(toIndentedString(metadataUrl)).append("\n");
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

