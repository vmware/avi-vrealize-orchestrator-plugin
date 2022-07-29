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
 * The HttpCookiePersistenceProfile is a POJO class extends AviRestResource that used for creating
 * HttpCookiePersistenceProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HttpCookiePersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_HTTPCOOKIEPERSISTENCEPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HttpCookiePersistenceProfile extends AviRestResource {
    @JsonProperty("always_send_cookie")
    @JsonInclude(Include.NON_NULL)
    private Boolean alwaysSendCookie = false;

    @JsonProperty("cookie_name")
    @JsonInclude(Include.NON_NULL)
    private String cookieName = null;

    @JsonProperty("encryption_key")
    @JsonInclude(Include.NON_NULL)
    private String encryptionKey = null;

    @JsonProperty("http_only")
    @JsonInclude(Include.NON_NULL)
    private Boolean httpOnly = false;

    @JsonProperty("is_persistent_cookie")
    @JsonInclude(Include.NON_NULL)
    private Boolean isPersistentCookie = false;

    @JsonProperty("key")
    @JsonInclude(Include.NON_NULL)
    private List<HttpCookiePersistenceKey> key = null;

    @JsonProperty("timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer timeout = null;



  /**
   * This is the getter method this will return the attribute value.
   * If no persistence cookie was received from the client, always send it.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return alwaysSendCookie
   */
  @VsoMethod
  public Boolean getAlwaysSendCookie() {
    return alwaysSendCookie;
  }

  /**
   * This is the setter method to the attribute.
   * If no persistence cookie was received from the client, always send it.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param alwaysSendCookie set the alwaysSendCookie.
   */
  @VsoMethod
  public void setAlwaysSendCookie(Boolean  alwaysSendCookie) {
    this.alwaysSendCookie = alwaysSendCookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http cookie name for cookie persistence.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cookieName
   */
  @VsoMethod
  public String getCookieName() {
    return cookieName;
  }

  /**
   * This is the setter method to the attribute.
   * Http cookie name for cookie persistence.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cookieName set the cookieName.
   */
  @VsoMethod
  public void setCookieName(String  cookieName) {
    this.cookieName = cookieName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Key name to use for cookie encryption.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return encryptionKey
   */
  @VsoMethod
  public String getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * This is the setter method to the attribute.
   * Key name to use for cookie encryption.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param encryptionKey set the encryptionKey.
   */
  @VsoMethod
  public void setEncryptionKey(String  encryptionKey) {
    this.encryptionKey = encryptionKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sets the httponly attribute in the cookie.
   * Setting this helps to prevent the client side scripts from accessing this cookie, if supported by browser.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return httpOnly
   */
  @VsoMethod
  public Boolean getHttpOnly() {
    return httpOnly;
  }

  /**
   * This is the setter method to the attribute.
   * Sets the httponly attribute in the cookie.
   * Setting this helps to prevent the client side scripts from accessing this cookie, if supported by browser.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param httpOnly set the httpOnly.
   */
  @VsoMethod
  public void setHttpOnly(Boolean  httpOnly) {
    this.httpOnly = httpOnly;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When true, the cookie used is a persistent cookie, i.e.
   * The cookie shouldn't be used at the end of the timeout.
   * By default, it is set to false, making the cookie a session cookie, which allows clients to use it even after the timeout, if the session is
   * still open.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isPersistentCookie
   */
  @VsoMethod
  public Boolean getIsPersistentCookie() {
    return isPersistentCookie;
  }

  /**
   * This is the setter method to the attribute.
   * When true, the cookie used is a persistent cookie, i.e.
   * The cookie shouldn't be used at the end of the timeout.
   * By default, it is set to false, making the cookie a session cookie, which allows clients to use it even after the timeout, if the session is
   * still open.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isPersistentCookie set the isPersistentCookie.
   */
  @VsoMethod
  public void setIsPersistentCookie(Boolean  isPersistentCookie) {
    this.isPersistentCookie = isPersistentCookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return key
   */
  @VsoMethod
  public List<HttpCookiePersistenceKey> getKey() {
    return key;
  }

  /**
   * This is the setter method. this will set the key
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return key
   */
  @VsoMethod
  public void setKey(List<HttpCookiePersistenceKey>  key) {
    this.key = key;
  }

  /**
   * This is the setter method this will set the key
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return key
   */
  @VsoMethod
  public HttpCookiePersistenceProfile addKeyItem(HttpCookiePersistenceKey keyItem) {
    if (this.key == null) {
      this.key = new ArrayList<HttpCookiePersistenceKey>();
    }
    this.key.add(keyItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The maximum lifetime of any session cookie.
   * No value or 'zero' indicates no timeout.
   * Allowed values are 1-14400.
   * Special values are 0- no timeout.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timeout
   */
  @VsoMethod
  public Integer getTimeout() {
    return timeout;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum lifetime of any session cookie.
   * No value or 'zero' indicates no timeout.
   * Allowed values are 1-14400.
   * Special values are 0- no timeout.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timeout set the timeout.
   */
  @VsoMethod
  public void setTimeout(Integer  timeout) {
    this.timeout = timeout;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HttpCookiePersistenceProfile objHttpCookiePersistenceProfile = (HttpCookiePersistenceProfile) o;
  return   Objects.equals(this.encryptionKey, objHttpCookiePersistenceProfile.encryptionKey)&&
  Objects.equals(this.cookieName, objHttpCookiePersistenceProfile.cookieName)&&
  Objects.equals(this.key, objHttpCookiePersistenceProfile.key)&&
  Objects.equals(this.timeout, objHttpCookiePersistenceProfile.timeout)&&
  Objects.equals(this.alwaysSendCookie, objHttpCookiePersistenceProfile.alwaysSendCookie)&&
  Objects.equals(this.httpOnly, objHttpCookiePersistenceProfile.httpOnly)&&
  Objects.equals(this.isPersistentCookie, objHttpCookiePersistenceProfile.isPersistentCookie);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HttpCookiePersistenceProfile {\n");
      sb.append("    alwaysSendCookie: ").append(toIndentedString(alwaysSendCookie)).append("\n");
        sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
        sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
        sb.append("    httpOnly: ").append(toIndentedString(httpOnly)).append("\n");
        sb.append("    isPersistentCookie: ").append(toIndentedString(isPersistentCookie)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

