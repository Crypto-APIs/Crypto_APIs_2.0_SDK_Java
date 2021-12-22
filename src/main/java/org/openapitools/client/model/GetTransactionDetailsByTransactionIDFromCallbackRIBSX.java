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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDFromCallbackRIBSXValue;
import org.openapitools.client.model.GetXRPRippleTransactionDetailsByTransactionIDRIOffer;
import org.openapitools.client.model.GetXRPRippleTransactionDetailsByTransactionIDRIReceive;

/**
 * XRP
 */
@ApiModel(description = "XRP")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class GetTransactionDetailsByTransactionIDFromCallbackRIBSX {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private String additionalData;

  public static final String SERIALIZED_NAME_DESTINATION_TAG = "destinationTag";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TAG)
  private Integer destinationTag;

  public static final String SERIALIZED_NAME_OFFER = "offer";
  @SerializedName(SERIALIZED_NAME_OFFER)
  private GetXRPRippleTransactionDetailsByTransactionIDRIOffer offer;

  public static final String SERIALIZED_NAME_RECEIVE = "receive";
  @SerializedName(SERIALIZED_NAME_RECEIVE)
  private GetXRPRippleTransactionDetailsByTransactionIDRIReceive receive;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private GetTransactionDetailsByTransactionIDFromCallbackRIBSXValue value;

  public GetTransactionDetailsByTransactionIDFromCallbackRIBSX() { 
  }

  public GetTransactionDetailsByTransactionIDFromCallbackRIBSX additionalData(String additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Represents additional data that may be needed.
   * @return additionalData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "rPmPErQe4g9725pcNxJpuvKkdqTESTQ6Tu", required = true, value = "Represents additional data that may be needed.")

  public String getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(String additionalData) {
    this.additionalData = additionalData;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBSX destinationTag(Integer destinationTag) {
    
    this.destinationTag = destinationTag;
    return this;
  }

   /**
   * Defines the destination tag value.
   * @return destinationTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3999472835", value = "Defines the destination tag value.")

  public Integer getDestinationTag() {
    return destinationTag;
  }


  public void setDestinationTag(Integer destinationTag) {
    this.destinationTag = destinationTag;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBSX offer(GetXRPRippleTransactionDetailsByTransactionIDRIOffer offer) {
    
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetXRPRippleTransactionDetailsByTransactionIDRIOffer getOffer() {
    return offer;
  }


  public void setOffer(GetXRPRippleTransactionDetailsByTransactionIDRIOffer offer) {
    this.offer = offer;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBSX receive(GetXRPRippleTransactionDetailsByTransactionIDRIReceive receive) {
    
    this.receive = receive;
    return this;
  }

   /**
   * Get receive
   * @return receive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetXRPRippleTransactionDetailsByTransactionIDRIReceive getReceive() {
    return receive;
  }


  public void setReceive(GetXRPRippleTransactionDetailsByTransactionIDRIReceive receive) {
    this.receive = receive;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBSX sequence(Integer sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Defines the transaction input&#39;s sequence as an integer, which is is used when transactions are replaced with newer versions before LockTime.
   * @return sequence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4294967295", required = true, value = "Defines the transaction input's sequence as an integer, which is is used when transactions are replaced with newer versions before LockTime.")

  public Integer getSequence() {
    return sequence;
  }


  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBSX status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Defines the status of the transaction.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "tesSUCCESS", required = true, value = "Defines the status of the transaction.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBSX type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the type of the transaction.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Payment", required = true, value = "Defines the type of the transaction.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBSX value(GetTransactionDetailsByTransactionIDFromCallbackRIBSXValue value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetTransactionDetailsByTransactionIDFromCallbackRIBSXValue getValue() {
    return value;
  }


  public void setValue(GetTransactionDetailsByTransactionIDFromCallbackRIBSXValue value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionDetailsByTransactionIDFromCallbackRIBSX getTransactionDetailsByTransactionIDFromCallbackRIBSX = (GetTransactionDetailsByTransactionIDFromCallbackRIBSX) o;
    return Objects.equals(this.additionalData, getTransactionDetailsByTransactionIDFromCallbackRIBSX.additionalData) &&
        Objects.equals(this.destinationTag, getTransactionDetailsByTransactionIDFromCallbackRIBSX.destinationTag) &&
        Objects.equals(this.offer, getTransactionDetailsByTransactionIDFromCallbackRIBSX.offer) &&
        Objects.equals(this.receive, getTransactionDetailsByTransactionIDFromCallbackRIBSX.receive) &&
        Objects.equals(this.sequence, getTransactionDetailsByTransactionIDFromCallbackRIBSX.sequence) &&
        Objects.equals(this.status, getTransactionDetailsByTransactionIDFromCallbackRIBSX.status) &&
        Objects.equals(this.type, getTransactionDetailsByTransactionIDFromCallbackRIBSX.type) &&
        Objects.equals(this.value, getTransactionDetailsByTransactionIDFromCallbackRIBSX.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, destinationTag, offer, receive, sequence, status, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDFromCallbackRIBSX {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    destinationTag: ").append(toIndentedString(destinationTag)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    receive: ").append(toIndentedString(receive)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

