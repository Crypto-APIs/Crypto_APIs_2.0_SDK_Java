/*
 * CryptoAPIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: developers@cryptoapis.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.AddressTokensTransactionUnconfirmedData;

/**
 * AddressTokensTransactionUnconfirmed
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class AddressTokensTransactionUnconfirmed {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotencyKey";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AddressTokensTransactionUnconfirmedData data;

  public AddressTokensTransactionUnconfirmed() { 
  }

  public AddressTokensTransactionUnconfirmed apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Specifies the version of the API that incorporates this endpoint.
   * @return apiVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2.0", required = true, value = "Specifies the version of the API that incorporates this endpoint.")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public AddressTokensTransactionUnconfirmed referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Represents a unique identifier that serves as reference to the specific request which prompts a callback, e.g. Blockchain Events Subscription, Blockchain Automation, etc.
   * @return referenceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6038d09050653d1f0e40584c", required = true, value = "Represents a unique identifier that serves as reference to the specific request which prompts a callback, e.g. Blockchain Events Subscription, Blockchain Automation, etc.")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public AddressTokensTransactionUnconfirmed idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * Specifies a unique ID generated by the system and attached to each callback. It is used by the server to recognize consecutive requests with the same data with the purpose not to perform the same operation twice.
   * @return idempotencyKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "e55bf7a4a7188855f1c27541a6c387d04cc3b22ee34d1304b0e6ecad61c9906c", required = true, value = "Specifies a unique ID generated by the system and attached to each callback. It is used by the server to recognize consecutive requests with the same data with the purpose not to perform the same operation twice.")

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public AddressTokensTransactionUnconfirmed data(AddressTokensTransactionUnconfirmedData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddressTokensTransactionUnconfirmedData getData() {
    return data;
  }


  public void setData(AddressTokensTransactionUnconfirmedData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressTokensTransactionUnconfirmed addressTokensTransactionUnconfirmed = (AddressTokensTransactionUnconfirmed) o;
    return Objects.equals(this.apiVersion, addressTokensTransactionUnconfirmed.apiVersion) &&
        Objects.equals(this.referenceId, addressTokensTransactionUnconfirmed.referenceId) &&
        Objects.equals(this.idempotencyKey, addressTokensTransactionUnconfirmed.idempotencyKey) &&
        Objects.equals(this.data, addressTokensTransactionUnconfirmed.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, referenceId, idempotencyKey, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTokensTransactionUnconfirmed {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

