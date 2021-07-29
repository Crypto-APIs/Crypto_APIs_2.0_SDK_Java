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
import java.util.ArrayList;
import java.util.List;

/**
 * Binance Smart Chain
 */
@ApiModel(description = "Binance Smart Chain")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class GetBlockDetailsByBlockHashRIBSBSC {
  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private String difficulty;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Integer nonce;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_EXTRA_DATA = "extraData";
  @SerializedName(SERIALIZED_NAME_EXTRA_DATA)
  private String extraData;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private String gasUsed;

  public static final String SERIALIZED_NAME_MINED_IN_SECONDS = "minedInSeconds";
  @SerializedName(SERIALIZED_NAME_MINED_IN_SECONDS)
  private Integer minedInSeconds;

  public static final String SERIALIZED_NAME_SHA3_UNCLES = "sha3Uncles";
  @SerializedName(SERIALIZED_NAME_SHA3_UNCLES)
  private String sha3Uncles;

  public static final String SERIALIZED_NAME_TOTAL_DIFFICULTY = "totalDifficulty";
  @SerializedName(SERIALIZED_NAME_TOTAL_DIFFICULTY)
  private String totalDifficulty;

  public static final String SERIALIZED_NAME_UNCLES = "uncles";
  @SerializedName(SERIALIZED_NAME_UNCLES)
  private List<String> uncles = new ArrayList<String>();


  public GetBlockDetailsByBlockHashRIBSBSC difficulty(String difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Represents a mathematical value of how hard it is to find a valid hash for this block.
   * @return difficulty
  **/
  @ApiModelProperty(example = "209515044.4071968", required = true, value = "Represents a mathematical value of how hard it is to find a valid hash for this block.")

  public String getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }


  public GetBlockDetailsByBlockHashRIBSBSC nonce(Integer nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents a random value that can be adjusted to satisfy the Proof of Work.
   * @return nonce
  **/
  @ApiModelProperty(example = "1535290446", required = true, value = "Represents a random value that can be adjusted to satisfy the Proof of Work.")

  public Integer getNonce() {
    return nonce;
  }


  public void setNonce(Integer nonce) {
    this.nonce = nonce;
  }


  public GetBlockDetailsByBlockHashRIBSBSC size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of the block in Bytes.
   * @return size
  **/
  @ApiModelProperty(example = "53598", required = true, value = "Represents the total size of the block in Bytes.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public GetBlockDetailsByBlockHashRIBSBSC extraData(String extraData) {
    
    this.extraData = extraData;
    return this;
  }

   /**
   * Numeric representation of the block extra data
   * @return extraData
  **/
  @ApiModelProperty(required = true, value = "Numeric representation of the block extra data")

  public String getExtraData() {
    return extraData;
  }


  public void setExtraData(String extraData) {
    this.extraData = extraData;
  }


  public GetBlockDetailsByBlockHashRIBSBSC gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Numeric representation of the block gas limit
   * @return gasLimit
  **/
  @ApiModelProperty(required = true, value = "Numeric representation of the block gas limit")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public GetBlockDetailsByBlockHashRIBSBSC gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Numeric representation of the block gas used
   * @return gasUsed
  **/
  @ApiModelProperty(required = true, value = "Numeric representation of the block gas used")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  public GetBlockDetailsByBlockHashRIBSBSC minedInSeconds(Integer minedInSeconds) {
    
    this.minedInSeconds = minedInSeconds;
    return this;
  }

   /**
   * Numeric representation of the block gas limit
   * @return minedInSeconds
  **/
  @ApiModelProperty(required = true, value = "Numeric representation of the block gas limit")

  public Integer getMinedInSeconds() {
    return minedInSeconds;
  }


  public void setMinedInSeconds(Integer minedInSeconds) {
    this.minedInSeconds = minedInSeconds;
  }


  public GetBlockDetailsByBlockHashRIBSBSC sha3Uncles(String sha3Uncles) {
    
    this.sha3Uncles = sha3Uncles;
    return this;
  }

   /**
   * Numeric representation of the block sha3 uncles
   * @return sha3Uncles
  **/
  @ApiModelProperty(required = true, value = "Numeric representation of the block sha3 uncles")

  public String getSha3Uncles() {
    return sha3Uncles;
  }


  public void setSha3Uncles(String sha3Uncles) {
    this.sha3Uncles = sha3Uncles;
  }


  public GetBlockDetailsByBlockHashRIBSBSC totalDifficulty(String totalDifficulty) {
    
    this.totalDifficulty = totalDifficulty;
    return this;
  }

   /**
   * Numeric representation of the block total difficulty
   * @return totalDifficulty
  **/
  @ApiModelProperty(required = true, value = "Numeric representation of the block total difficulty")

  public String getTotalDifficulty() {
    return totalDifficulty;
  }


  public void setTotalDifficulty(String totalDifficulty) {
    this.totalDifficulty = totalDifficulty;
  }


  public GetBlockDetailsByBlockHashRIBSBSC uncles(List<String> uncles) {
    
    this.uncles = uncles;
    return this;
  }

  public GetBlockDetailsByBlockHashRIBSBSC addUnclesItem(String unclesItem) {
    this.uncles.add(unclesItem);
    return this;
  }

   /**
   * Get uncles
   * @return uncles
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getUncles() {
    return uncles;
  }


  public void setUncles(List<String> uncles) {
    this.uncles = uncles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBlockDetailsByBlockHashRIBSBSC getBlockDetailsByBlockHashRIBSBSC = (GetBlockDetailsByBlockHashRIBSBSC) o;
    return Objects.equals(this.difficulty, getBlockDetailsByBlockHashRIBSBSC.difficulty) &&
        Objects.equals(this.nonce, getBlockDetailsByBlockHashRIBSBSC.nonce) &&
        Objects.equals(this.size, getBlockDetailsByBlockHashRIBSBSC.size) &&
        Objects.equals(this.extraData, getBlockDetailsByBlockHashRIBSBSC.extraData) &&
        Objects.equals(this.gasLimit, getBlockDetailsByBlockHashRIBSBSC.gasLimit) &&
        Objects.equals(this.gasUsed, getBlockDetailsByBlockHashRIBSBSC.gasUsed) &&
        Objects.equals(this.minedInSeconds, getBlockDetailsByBlockHashRIBSBSC.minedInSeconds) &&
        Objects.equals(this.sha3Uncles, getBlockDetailsByBlockHashRIBSBSC.sha3Uncles) &&
        Objects.equals(this.totalDifficulty, getBlockDetailsByBlockHashRIBSBSC.totalDifficulty) &&
        Objects.equals(this.uncles, getBlockDetailsByBlockHashRIBSBSC.uncles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(difficulty, nonce, size, extraData, gasLimit, gasUsed, minedInSeconds, sha3Uncles, totalDifficulty, uncles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBlockDetailsByBlockHashRIBSBSC {\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    minedInSeconds: ").append(toIndentedString(minedInSeconds)).append("\n");
    sb.append("    sha3Uncles: ").append(toIndentedString(sha3Uncles)).append("\n");
    sb.append("    totalDifficulty: ").append(toIndentedString(totalDifficulty)).append("\n");
    sb.append("    uncles: ").append(toIndentedString(uncles)).append("\n");
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

