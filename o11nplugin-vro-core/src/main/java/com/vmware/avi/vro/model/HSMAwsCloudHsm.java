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
 * The HSMAwsCloudHsm is a POJO class extends AviRestResource that used for creating
 * HSMAwsCloudHsm.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HSMAwsCloudHsm")
@VsoFinder(name = Constants.FINDER_VRO_HSMAWSCLOUDHSM)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HSMAwsCloudHsm extends AviRestResource {
    @JsonProperty("client_config")
    @JsonInclude(Include.NON_NULL)
    private String clientConfig;

    @JsonProperty("cluster_cert")
    @JsonInclude(Include.NON_NULL)
    private String clusterCert;

    @JsonProperty("crypto_user_name")
    @JsonInclude(Include.NON_NULL)
    private String cryptoUserName;

    @JsonProperty("crypto_user_password")
    @JsonInclude(Include.NON_NULL)
    private String cryptoUserPassword;

    @JsonProperty("hsm_ip")
    @JsonInclude(Include.NON_NULL)
    private List<String> hsmIp;

    @JsonProperty("mgmt_config")
    @JsonInclude(Include.NON_NULL)
    private String mgmtConfig;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return clientConfig
   */
  @VsoMethod
  public String getClientConfig() {
    return clientConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param clientConfig set the clientConfig.
   */
  @VsoMethod
  public void setClientConfig(String  clientConfig) {
    this.clientConfig = clientConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Aws cloudhsm cluster certificate.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterCert
   */
  @VsoMethod
  public String getClusterCert() {
    return clusterCert;
  }

  /**
   * This is the setter method to the attribute.
   * Aws cloudhsm cluster certificate.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clusterCert set the clusterCert.
   */
  @VsoMethod
  public void setClusterCert(String  clusterCert) {
    this.clusterCert = clusterCert;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Username of the crypto user.
   * This will be used to access the keys on the hsm.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cryptoUserName
   */
  @VsoMethod
  public String getCryptoUserName() {
    return cryptoUserName;
  }

  /**
   * This is the setter method to the attribute.
   * Username of the crypto user.
   * This will be used to access the keys on the hsm.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cryptoUserName set the cryptoUserName.
   */
  @VsoMethod
  public void setCryptoUserName(String  cryptoUserName) {
    this.cryptoUserName = cryptoUserName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Password of the crypto user.
   * This will be used to access the keys on the hsm.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cryptoUserPassword
   */
  @VsoMethod
  public String getCryptoUserPassword() {
    return cryptoUserPassword;
  }

  /**
   * This is the setter method to the attribute.
   * Password of the crypto user.
   * This will be used to access the keys on the hsm.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cryptoUserPassword set the cryptoUserPassword.
   */
  @VsoMethod
  public void setCryptoUserPassword(String  cryptoUserPassword) {
    this.cryptoUserPassword = cryptoUserPassword;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address of the hsm in the cluster.
   * If there are more than one hsms, only one is sufficient.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hsmIp
   */
  @VsoMethod
  public List<String> getHsmIp() {
    return hsmIp;
  }

  /**
   * This is the setter method. this will set the hsmIp
   * Ip address of the hsm in the cluster.
   * If there are more than one hsms, only one is sufficient.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hsmIp
   */
  @VsoMethod
  public void setHsmIp(List<String>  hsmIp) {
    this.hsmIp = hsmIp;
  }

  /**
   * This is the setter method this will set the hsmIp
   * Ip address of the hsm in the cluster.
   * If there are more than one hsms, only one is sufficient.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hsmIp
   */
  @VsoMethod
  public HSMAwsCloudHsm addHsmIpItem(String hsmIpItem) {
    if (this.hsmIp == null) {
      this.hsmIp = new ArrayList<String>();
    }
    this.hsmIp.add(hsmIpItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return mgmtConfig
   */
  @VsoMethod
  public String getMgmtConfig() {
    return mgmtConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param mgmtConfig set the mgmtConfig.
   */
  @VsoMethod
  public void setMgmtConfig(String  mgmtConfig) {
    this.mgmtConfig = mgmtConfig;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HSMAwsCloudHsm objHSMAwsCloudHsm = (HSMAwsCloudHsm) o;
  return   Objects.equals(this.clusterCert, objHSMAwsCloudHsm.clusterCert)&&
  Objects.equals(this.hsmIp, objHSMAwsCloudHsm.hsmIp)&&
  Objects.equals(this.clientConfig, objHSMAwsCloudHsm.clientConfig)&&
  Objects.equals(this.mgmtConfig, objHSMAwsCloudHsm.mgmtConfig)&&
  Objects.equals(this.cryptoUserName, objHSMAwsCloudHsm.cryptoUserName)&&
  Objects.equals(this.cryptoUserPassword, objHSMAwsCloudHsm.cryptoUserPassword);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HSMAwsCloudHsm {\n");
      sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
        sb.append("    clusterCert: ").append(toIndentedString(clusterCert)).append("\n");
        sb.append("    cryptoUserName: ").append(toIndentedString(cryptoUserName)).append("\n");
        sb.append("    cryptoUserPassword: ").append(toIndentedString(cryptoUserPassword)).append("\n");
        sb.append("    hsmIp: ").append(toIndentedString(hsmIp)).append("\n");
        sb.append("    mgmtConfig: ").append(toIndentedString(mgmtConfig)).append("\n");
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

