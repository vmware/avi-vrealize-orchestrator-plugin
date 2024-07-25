package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.CRL;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The FileObject is a POJO class extends AviRestResource that used for creating
 * FileObject.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FileObject")
@VsoFinder(name = Constants.FINDER_VRO_FILEOBJECT, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FileObject extends AviRestResource {
    @JsonProperty("checksum")
    @JsonInclude(Include.NON_NULL)
    private String checksum;

    @JsonProperty("compressed")
    @JsonInclude(Include.NON_NULL)
    private Boolean compressed = false;

    @JsonProperty("created")
    @JsonInclude(Include.NON_NULL)
    private String created;

    @JsonProperty("crl_info")
    @JsonInclude(Include.NON_NULL)
    private CRL crlInfo;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("expires_at")
    @JsonInclude(Include.NON_NULL)
    private String expiresAt;

    @JsonProperty("is_federated")
    @JsonInclude(Include.NON_NULL)
    private Boolean isFederated = false;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private String path;

    @JsonProperty("read_only")
    @JsonInclude(Include.NON_NULL)
    private Boolean readOnly;

    @JsonProperty("restrict_download")
    @JsonInclude(Include.NON_NULL)
    private Boolean restrictDownload;

    @JsonProperty("size")
    @JsonInclude(Include.NON_NULL)
    private Integer size;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version;



  /**
   * This is the getter method this will return the attribute value.
   * Sha1 checksum of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return checksum
   */
  @VsoMethod
  public String getChecksum() {
    return checksum;
  }

  /**
   * This is the setter method to the attribute.
   * Sha1 checksum of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param checksum set the checksum.
   */
  @VsoMethod
  public void setChecksum(String  checksum) {
    this.checksum = checksum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field indicates whether the file is gzip-compressed.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return compressed
   */
  @VsoMethod
  public Boolean getCompressed() {
    return compressed;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates whether the file is gzip-compressed.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param compressed set the compressed.
   */
  @VsoMethod
  public void setCompressed(Boolean  compressed) {
    this.compressed = compressed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp of creation for the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return created
   */
  @VsoMethod
  public String getCreated() {
    return created;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp of creation for the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param created set the created.
   */
  @VsoMethod
  public void setCreated(String  created) {
    this.created = created;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field contains certificate revocation list metadata.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return crlInfo
   */
  @VsoMethod
  public CRL getCrlInfo() {
    return crlInfo;
  }

  /**
   * This is the setter method to the attribute.
   * This field contains certificate revocation list metadata.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param crlInfo set the crlInfo.
   */
  @VsoMethod
  public void setCrlInfo(CRL crlInfo) {
    this.crlInfo = crlInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Description of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Description of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp when the file will be no longer needed and can be removed by the system.
   * If this is set, a garbage collector process will try to remove the file after this time.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return expiresAt
   */
  @VsoMethod
  public String getExpiresAt() {
    return expiresAt;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp when the file will be no longer needed and can be removed by the system.
   * If this is set, a garbage collector process will try to remove the file after this time.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param expiresAt set the expiresAt.
   */
  @VsoMethod
  public void setExpiresAt(String  expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field describes the object's replication scope.
   * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
   * If the field is set to true, then the object is replicated across the federation.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isFederated
   */
  @VsoMethod
  public Boolean getIsFederated() {
    return isFederated;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the object's replication scope.
   * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
   * If the field is set to true, then the object is replicated across the federation.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isFederated set the isFederated.
   */
  @VsoMethod
  public void setIsFederated(Boolean  isFederated) {
    this.isFederated = isFederated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the file object.
   * Field introduced in 20.1.1.
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
   * Name of the file object.
   * Field introduced in 20.1.1.
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
   * Path to the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public String getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Path to the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(String  path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enforce read-only on the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return readOnly
   */
  @VsoMethod
  public Boolean getReadOnly() {
    return readOnly;
  }

  /**
   * This is the setter method to the attribute.
   * Enforce read-only on the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param readOnly set the readOnly.
   */
  @VsoMethod
  public void setReadOnly(Boolean  readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag to allow/restrict download of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictDownload
   */
  @VsoMethod
  public Boolean getRestrictDownload() {
    return restrictDownload;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to allow/restrict download of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param restrictDownload set the restrictDownload.
   */
  @VsoMethod
  public void setRestrictDownload(Boolean  restrictDownload) {
    this.restrictDownload = restrictDownload;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Size of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return size
   */
  @VsoMethod
  public Integer getSize() {
    return size;
  }

  /**
   * This is the setter method to the attribute.
   * Size of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param size set the size.
   */
  @VsoMethod
  public void setSize(Integer  size) {
    this.size = size;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of the file.
   * Enum options - OTHER_FILE_TYPES, IP_REPUTATION, GEO_DB, TECH_SUPPORT, HSMPACKAGES, IPAMDNSSCRIPTS, CONTROLLER_IMAGE, CRL_DATA,
   * IP_REPUTATION_IPV6.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- other_file_types), basic edition(allowed values-
   * other_file_types), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the file.
   * Enum options - OTHER_FILE_TYPES, IP_REPUTATION, GEO_DB, TECH_SUPPORT, HSMPACKAGES, IPAMDNSSCRIPTS, CONTROLLER_IMAGE, CRL_DATA,
   * IP_REPUTATION_IPV6.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- other_file_types), basic edition(allowed values-
   * other_file_types), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Version of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Version of the file.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FileObject objFileObject = (FileObject) o;
  return   Objects.equals(this.uuid, objFileObject.uuid)&&
  Objects.equals(this.tenantRef, objFileObject.tenantRef)&&
  Objects.equals(this.name, objFileObject.name)&&
  Objects.equals(this.path, objFileObject.path)&&
  Objects.equals(this.size, objFileObject.size)&&
  Objects.equals(this.checksum, objFileObject.checksum)&&
  Objects.equals(this.type, objFileObject.type)&&
  Objects.equals(this.readOnly, objFileObject.readOnly)&&
  Objects.equals(this.version, objFileObject.version)&&
  Objects.equals(this.description, objFileObject.description)&&
  Objects.equals(this.created, objFileObject.created)&&
  Objects.equals(this.restrictDownload, objFileObject.restrictDownload)&&
  Objects.equals(this.isFederated, objFileObject.isFederated)&&
  Objects.equals(this.compressed, objFileObject.compressed)&&
  Objects.equals(this.expiresAt, objFileObject.expiresAt)&&
  Objects.equals(this.crlInfo, objFileObject.crlInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FileObject {\n");
      sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
        sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    crlInfo: ").append(toIndentedString(crlInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    restrictDownload: ").append(toIndentedString(restrictDownload)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

