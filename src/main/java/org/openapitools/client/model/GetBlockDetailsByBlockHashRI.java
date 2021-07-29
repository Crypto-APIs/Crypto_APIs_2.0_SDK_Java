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
import org.openapitools.client.model.GetBlockDetailsByBlockHashRIBS;

/**
 * GetBlockDetailsByBlockHashRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class GetBlockDetailsByBlockHashRI {
  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_NEXT_BLOCK_HASH = "nextBlockHash";
  @SerializedName(SERIALIZED_NAME_NEXT_BLOCK_HASH)
  private String nextBlockHash;

  public static final String SERIALIZED_NAME_PREVIOUS_BLOCK_HASH = "previousBlockHash";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_BLOCK_HASH)
  private String previousBlockHash;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTIONS_COUNT = "transactionsCount";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_COUNT)
  private Integer transactionsCount;

  public static final String SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC = "blockchainSpecific";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC)
  private GetBlockDetailsByBlockHashRIBS blockchainSpecific;


  public GetBlockDetailsByBlockHashRI hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return hash
  **/
  @ApiModelProperty(example = "0000000006b3f483bec16b8a85c632bdd30a14a202c83a9148002c9ee441dd0c", required = true, value = "Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public GetBlockDetailsByBlockHashRI height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;.
   * @return height
  **/
  @ApiModelProperty(example = "1941208", required = true, value = "Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \"Genesis block\".")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public GetBlockDetailsByBlockHashRI nextBlockHash(String nextBlockHash) {
    
    this.nextBlockHash = nextBlockHash;
    return this;
  }

   /**
   * Represents the hash of the next block. When this is the last block of the blockchain this value will be an empty string.
   * @return nextBlockHash
  **/
  @ApiModelProperty(example = "0000000000000003b08ca90b701da447fb3e7c5c6b43acd33a5e4062fe98dea5", required = true, value = "Represents the hash of the next block. When this is the last block of the blockchain this value will be an empty string.")

  public String getNextBlockHash() {
    return nextBlockHash;
  }


  public void setNextBlockHash(String nextBlockHash) {
    this.nextBlockHash = nextBlockHash;
  }


  public GetBlockDetailsByBlockHashRI previousBlockHash(String previousBlockHash) {
    
    this.previousBlockHash = previousBlockHash;
    return this;
  }

   /**
   * Represents the hash of the previous block, also known as the parent block.
   * @return previousBlockHash
  **/
  @ApiModelProperty(example = "00000000844434fd86a630ba8e29503d5396a2b6c4003d69bf0a08d96169d4cd", required = true, value = "Represents the hash of the previous block, also known as the parent block.")

  public String getPreviousBlockHash() {
    return previousBlockHash;
  }


  public void setPreviousBlockHash(String previousBlockHash) {
    this.previousBlockHash = previousBlockHash;
  }


  public GetBlockDetailsByBlockHashRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time when this block was mined in Unix Timestamp.
   * @return timestamp
  **/
  @ApiModelProperty(example = "1615378134", required = true, value = "Defines the exact date/time when this block was mined in Unix Timestamp.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public GetBlockDetailsByBlockHashRI transactionsCount(Integer transactionsCount) {
    
    this.transactionsCount = transactionsCount;
    return this;
  }

   /**
   * Represents the total number of all transactions as part of this block.
   * @return transactionsCount
  **/
  @ApiModelProperty(example = "145", required = true, value = "Represents the total number of all transactions as part of this block.")

  public Integer getTransactionsCount() {
    return transactionsCount;
  }


  public void setTransactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
  }


  public GetBlockDetailsByBlockHashRI blockchainSpecific(GetBlockDetailsByBlockHashRIBS blockchainSpecific) {
    
    this.blockchainSpecific = blockchainSpecific;
    return this;
  }

   /**
   * Get blockchainSpecific
   * @return blockchainSpecific
  **/
  @ApiModelProperty(required = true, value = "")

  public GetBlockDetailsByBlockHashRIBS getBlockchainSpecific() {
    return blockchainSpecific;
  }


  public void setBlockchainSpecific(GetBlockDetailsByBlockHashRIBS blockchainSpecific) {
    this.blockchainSpecific = blockchainSpecific;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBlockDetailsByBlockHashRI getBlockDetailsByBlockHashRI = (GetBlockDetailsByBlockHashRI) o;
    return Objects.equals(this.hash, getBlockDetailsByBlockHashRI.hash) &&
        Objects.equals(this.height, getBlockDetailsByBlockHashRI.height) &&
        Objects.equals(this.nextBlockHash, getBlockDetailsByBlockHashRI.nextBlockHash) &&
        Objects.equals(this.previousBlockHash, getBlockDetailsByBlockHashRI.previousBlockHash) &&
        Objects.equals(this.timestamp, getBlockDetailsByBlockHashRI.timestamp) &&
        Objects.equals(this.transactionsCount, getBlockDetailsByBlockHashRI.transactionsCount) &&
        Objects.equals(this.blockchainSpecific, getBlockDetailsByBlockHashRI.blockchainSpecific);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, height, nextBlockHash, previousBlockHash, timestamp, transactionsCount, blockchainSpecific);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBlockDetailsByBlockHashRI {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    nextBlockHash: ").append(toIndentedString(nextBlockHash)).append("\n");
    sb.append("    previousBlockHash: ").append(toIndentedString(previousBlockHash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
    sb.append("    blockchainSpecific: ").append(toIndentedString(blockchainSpecific)).append("\n");
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

