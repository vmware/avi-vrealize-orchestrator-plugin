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
 * The DockerUCPSetup is a POJO class extends AviRestResource that used for creating
 * DockerUCPSetup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DockerUCPSetup")
@VsoFinder(name = Constants.FINDER_VRO_DOCKERUCPSETUP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DockerUCPSetup extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId;

    @JsonProperty("docker_ucp_access")
    @JsonInclude(Include.NON_NULL)
    private Boolean dockerUcpAccess;

    @JsonProperty("failed_hosts")
    @JsonInclude(Include.NON_NULL)
    private List<String> failedHosts;

    @JsonProperty("fleet_endpoint")
    @JsonInclude(Include.NON_NULL)
    private String fleetEndpoint;

    @JsonProperty("hosts")
    @JsonInclude(Include.NON_NULL)
    private List<String> hosts;

    @JsonProperty("missing_hosts")
    @JsonInclude(Include.NON_NULL)
    private List<String> missingHosts;

    @JsonProperty("new_hosts")
    @JsonInclude(Include.NON_NULL)
    private List<String> newHosts;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;

    @JsonProperty("se_deploy_method_access")
    @JsonInclude(Include.NON_NULL)
    private Boolean seDeployMethodAccess;

    @JsonProperty("se_name")
    @JsonInclude(Include.NON_NULL)
    private String seName;

    @JsonProperty("ucp_nodes")
    @JsonInclude(Include.NON_NULL)
    private List<String> ucpNodes;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dockerUcpAccess
   */
  @VsoMethod
  public Boolean getDockerUcpAccess() {
    return dockerUcpAccess;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dockerUcpAccess set the dockerUcpAccess.
   */
  @VsoMethod
  public void setDockerUcpAccess(Boolean  dockerUcpAccess) {
    this.dockerUcpAccess = dockerUcpAccess;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return failedHosts
   */
  @VsoMethod
  public List<String> getFailedHosts() {
    return failedHosts;
  }

  /**
   * This is the setter method. this will set the failedHosts
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return failedHosts
   */
  @VsoMethod
  public void setFailedHosts(List<String>  failedHosts) {
    this.failedHosts = failedHosts;
  }

  /**
   * This is the setter method this will set the failedHosts
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return failedHosts
   */
  @VsoMethod
  public DockerUCPSetup addFailedHostsItem(String failedHostsItem) {
    if (this.failedHosts == null) {
      this.failedHosts = new ArrayList<String>();
    }
    this.failedHosts.add(failedHostsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fleetEndpoint
   */
  @VsoMethod
  public String getFleetEndpoint() {
    return fleetEndpoint;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fleetEndpoint set the fleetEndpoint.
   */
  @VsoMethod
  public void setFleetEndpoint(String  fleetEndpoint) {
    this.fleetEndpoint = fleetEndpoint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hosts
   */
  @VsoMethod
  public List<String> getHosts() {
    return hosts;
  }

  /**
   * This is the setter method. this will set the hosts
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hosts
   */
  @VsoMethod
  public void setHosts(List<String>  hosts) {
    this.hosts = hosts;
  }

  /**
   * This is the setter method this will set the hosts
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hosts
   */
  @VsoMethod
  public DockerUCPSetup addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<String>();
    }
    this.hosts.add(hostsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return missingHosts
   */
  @VsoMethod
  public List<String> getMissingHosts() {
    return missingHosts;
  }

  /**
   * This is the setter method. this will set the missingHosts
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return missingHosts
   */
  @VsoMethod
  public void setMissingHosts(List<String>  missingHosts) {
    this.missingHosts = missingHosts;
  }

  /**
   * This is the setter method this will set the missingHosts
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return missingHosts
   */
  @VsoMethod
  public DockerUCPSetup addMissingHostsItem(String missingHostsItem) {
    if (this.missingHosts == null) {
      this.missingHosts = new ArrayList<String>();
    }
    this.missingHosts.add(missingHostsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newHosts
   */
  @VsoMethod
  public List<String> getNewHosts() {
    return newHosts;
  }

  /**
   * This is the setter method. this will set the newHosts
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newHosts
   */
  @VsoMethod
  public void setNewHosts(List<String>  newHosts) {
    this.newHosts = newHosts;
  }

  /**
   * This is the setter method this will set the newHosts
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newHosts
   */
  @VsoMethod
  public DockerUCPSetup addNewHostsItem(String newHostsItem) {
    if (this.newHosts == null) {
      this.newHosts = new ArrayList<String>();
    }
    this.newHosts.add(newHostsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seDeployMethodAccess
   */
  @VsoMethod
  public Boolean getSeDeployMethodAccess() {
    return seDeployMethodAccess;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seDeployMethodAccess set the seDeployMethodAccess.
   */
  @VsoMethod
  public void setSeDeployMethodAccess(Boolean  seDeployMethodAccess) {
    this.seDeployMethodAccess = seDeployMethodAccess;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ucpNodes
   */
  @VsoMethod
  public List<String> getUcpNodes() {
    return ucpNodes;
  }

  /**
   * This is the setter method. this will set the ucpNodes
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ucpNodes
   */
  @VsoMethod
  public void setUcpNodes(List<String>  ucpNodes) {
    this.ucpNodes = ucpNodes;
  }

  /**
   * This is the setter method this will set the ucpNodes
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ucpNodes
   */
  @VsoMethod
  public DockerUCPSetup addUcpNodesItem(String ucpNodesItem) {
    if (this.ucpNodes == null) {
      this.ucpNodes = new ArrayList<String>();
    }
    this.ucpNodes.add(ucpNodesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DockerUCPSetup objDockerUCPSetup = (DockerUCPSetup) o;
  return   Objects.equals(this.ccId, objDockerUCPSetup.ccId)&&
  Objects.equals(this.ucpNodes, objDockerUCPSetup.ucpNodes)&&
  Objects.equals(this.dockerUcpAccess, objDockerUCPSetup.dockerUcpAccess)&&
  Objects.equals(this.fleetEndpoint, objDockerUCPSetup.fleetEndpoint)&&
  Objects.equals(this.seDeployMethodAccess, objDockerUCPSetup.seDeployMethodAccess)&&
  Objects.equals(this.reason, objDockerUCPSetup.reason)&&
  Objects.equals(this.version, objDockerUCPSetup.version)&&
  Objects.equals(this.seName, objDockerUCPSetup.seName)&&
  Objects.equals(this.hosts, objDockerUCPSetup.hosts)&&
  Objects.equals(this.newHosts, objDockerUCPSetup.newHosts)&&
  Objects.equals(this.missingHosts, objDockerUCPSetup.missingHosts)&&
  Objects.equals(this.failedHosts, objDockerUCPSetup.failedHosts);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DockerUCPSetup {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    dockerUcpAccess: ").append(toIndentedString(dockerUcpAccess)).append("\n");
        sb.append("    failedHosts: ").append(toIndentedString(failedHosts)).append("\n");
        sb.append("    fleetEndpoint: ").append(toIndentedString(fleetEndpoint)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    missingHosts: ").append(toIndentedString(missingHosts)).append("\n");
        sb.append("    newHosts: ").append(toIndentedString(newHosts)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    seDeployMethodAccess: ").append(toIndentedString(seDeployMethodAccess)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    ucpNodes: ").append(toIndentedString(ucpNodes)).append("\n");
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

