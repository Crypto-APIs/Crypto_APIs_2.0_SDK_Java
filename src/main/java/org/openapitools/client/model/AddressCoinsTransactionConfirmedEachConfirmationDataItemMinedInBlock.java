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
 * Refers to the specific block the transaction was mined in.
 */
@ApiModel(description = "Refers to the specific block the transaction was mined in.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;


  public AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Defines the number of blocks in the blockchain preceding this specific block.
   * @return height
  **/
  @ApiModelProperty(example = "667754", required = true, value = "Defines the number of blocks in the blockchain preceding this specific block.")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Represents the hash of the block&#39;s header, i.e. an output that has a fixed length.
   * @return hash
  **/
  @ApiModelProperty(example = "dfe45f6724b550c281107ffaa5880cb280878fb4dbaa742aa21449f3d2340c13", required = true, value = "Represents the hash of the block's header, i.e. an output that has a fixed length.")

  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time when this transaction was mined in seconds since Unix Epoch time.
   * @return timestamp
  **/
  @ApiModelProperty(example = "1610365314", required = true, value = "Defines the exact date/time when this transaction was mined in seconds since Unix Epoch time.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock addressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock = (AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock) o;
    return Objects.equals(this.height, addressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock.height) &&
        Objects.equals(this.hash, addressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock.hash) &&
        Objects.equals(this.timestamp, addressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, hash, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

