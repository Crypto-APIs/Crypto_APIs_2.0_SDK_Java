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

/**
 * NewConfirmedTokensTransactionsAndEachConfirmationRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class NewConfirmedTokensTransactionsAndEachConfirmationRI {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "createdTimestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Integer createdTimestamp;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;


  public NewConfirmedTokensTransactionsAndEachConfirmationRI address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Represents the address of the transaction, per which the result is returned.
   * @return address
  **/
  @ApiModelProperty(example = "mwDuExdjRewYKYoR454sZGvd15LnJVsmoR", required = true, value = "Represents the address of the transaction, per which the result is returned.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public NewConfirmedTokensTransactionsAndEachConfirmationRI callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs.
   * @return callbackUrl
  **/
  @ApiModelProperty(example = "https://example.com", required = true, value = "Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs.")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public NewConfirmedTokensTransactionsAndEachConfirmationRI createdTimestamp(Integer createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Defines the specific time/date when the subscription was created in Unix Timestamp.
   * @return createdTimestamp
  **/
  @ApiModelProperty(example = "1236238648", required = true, value = "Defines the specific time/date when the subscription was created in Unix Timestamp.")

  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public NewConfirmedTokensTransactionsAndEachConfirmationRI eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Defines the type of the specific event available for the customer to subscribe to for callback notification.
   * @return eventType
  **/
  @ApiModelProperty(example = "ADDRESS_TOKENS_TRANSACTION_CONFIRMED_EACH_CONFIRAMTION", required = true, value = "Defines the type of the specific event available for the customer to subscribe to for callback notification.")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public NewConfirmedTokensTransactionsAndEachConfirmationRI referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Represents a unique ID used to reference the specific callback subscription.
   * @return referenceId
  **/
  @ApiModelProperty(example = "c748624f-1843-4738-a7de-8258ada0f524", required = true, value = "Represents a unique ID used to reference the specific callback subscription.")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewConfirmedTokensTransactionsAndEachConfirmationRI newConfirmedTokensTransactionsAndEachConfirmationRI = (NewConfirmedTokensTransactionsAndEachConfirmationRI) o;
    return Objects.equals(this.address, newConfirmedTokensTransactionsAndEachConfirmationRI.address) &&
        Objects.equals(this.callbackUrl, newConfirmedTokensTransactionsAndEachConfirmationRI.callbackUrl) &&
        Objects.equals(this.createdTimestamp, newConfirmedTokensTransactionsAndEachConfirmationRI.createdTimestamp) &&
        Objects.equals(this.eventType, newConfirmedTokensTransactionsAndEachConfirmationRI.eventType) &&
        Objects.equals(this.referenceId, newConfirmedTokensTransactionsAndEachConfirmationRI.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, callbackUrl, createdTimestamp, eventType, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewConfirmedTokensTransactionsAndEachConfirmationRI {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

