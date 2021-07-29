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
 * Binance Smart Chain
 */
@ApiModel(description = "Binance Smart Chain")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class GetLatestMinedBlockRIBSBSC {
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


  public GetLatestMinedBlockRIBSBSC difficulty(String difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Represents a mathematical value of how hard it is to find a valid hash for this block.
   * @return difficulty
  **/
  @ApiModelProperty(example = "21448277761059.71", required = true, value = "Represents a mathematical value of how hard it is to find a valid hash for this block.")

  public String getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }


  public GetLatestMinedBlockRIBSBSC nonce(Integer nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents a random value that can be adjusted to satisfy the proof of work
   * @return nonce
  **/
  @ApiModelProperty(example = "2113101077", required = true, value = "Represents a random value that can be adjusted to satisfy the proof of work")

  public Integer getNonce() {
    return nonce;
  }


  public void setNonce(Integer nonce) {
    this.nonce = nonce;
  }


  public GetLatestMinedBlockRIBSBSC size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of the block in Bytes.
   * @return size
  **/
  @ApiModelProperty(example = "1408113", required = true, value = "Represents the total size of the block in Bytes.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public GetLatestMinedBlockRIBSBSC extraData(String extraData) {
    
    this.extraData = extraData;
    return this;
  }

   /**
   * Numeric representation of the block extra data
   * @return extraData
  **/
  @ApiModelProperty(example = "0xd883010001846765746888676f312e31342e34856c696e757800000000000000eb8c4ee17a97af3c7d18e6cfb87d25bf9a483933d393b4fce778c9a7d64eab76471a8ab92c3a7d131c0f9cfbbd9a54b438c80b491c7a579da0e37db6ca823eda01", required = true, value = "Numeric representation of the block extra data")

  public String getExtraData() {
    return extraData;
  }


  public void setExtraData(String extraData) {
    this.extraData = extraData;
  }


  public GetLatestMinedBlockRIBSBSC gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Numeric representation of the block gas limit
   * @return gasLimit
  **/
  @ApiModelProperty(example = "30000000", required = true, value = "Numeric representation of the block gas limit")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public GetLatestMinedBlockRIBSBSC gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Numeric representation of the block gas used
   * @return gasUsed
  **/
  @ApiModelProperty(example = "686304", required = true, value = "Numeric representation of the block gas used")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  public GetLatestMinedBlockRIBSBSC minedInSeconds(Integer minedInSeconds) {
    
    this.minedInSeconds = minedInSeconds;
    return this;
  }

   /**
   * Numeric representation of the block gas limit
   * @return minedInSeconds
  **/
  @ApiModelProperty(example = "3", required = true, value = "Numeric representation of the block gas limit")

  public Integer getMinedInSeconds() {
    return minedInSeconds;
  }


  public void setMinedInSeconds(Integer minedInSeconds) {
    this.minedInSeconds = minedInSeconds;
  }


  public GetLatestMinedBlockRIBSBSC sha3Uncles(String sha3Uncles) {
    
    this.sha3Uncles = sha3Uncles;
    return this;
  }

   /**
   * Numeric representation of the block sha3 uncles
   * @return sha3Uncles
  **/
  @ApiModelProperty(example = "0x1dcc4de8dec75d7aab85b567b6ccd41ad312451b948a7413f0a142fd40d49347", required = true, value = "Numeric representation of the block sha3 uncles")

  public String getSha3Uncles() {
    return sha3Uncles;
  }


  public void setSha3Uncles(String sha3Uncles) {
    this.sha3Uncles = sha3Uncles;
  }


  public GetLatestMinedBlockRIBSBSC totalDifficulty(String totalDifficulty) {
    
    this.totalDifficulty = totalDifficulty;
    return this;
  }

   /**
   * Numeric representation of the block total difficulty
   * @return totalDifficulty
  **/
  @ApiModelProperty(example = "2437536", required = true, value = "Numeric representation of the block total difficulty")

  public String getTotalDifficulty() {
    return totalDifficulty;
  }


  public void setTotalDifficulty(String totalDifficulty) {
    this.totalDifficulty = totalDifficulty;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLatestMinedBlockRIBSBSC getLatestMinedBlockRIBSBSC = (GetLatestMinedBlockRIBSBSC) o;
    return Objects.equals(this.difficulty, getLatestMinedBlockRIBSBSC.difficulty) &&
        Objects.equals(this.nonce, getLatestMinedBlockRIBSBSC.nonce) &&
        Objects.equals(this.size, getLatestMinedBlockRIBSBSC.size) &&
        Objects.equals(this.extraData, getLatestMinedBlockRIBSBSC.extraData) &&
        Objects.equals(this.gasLimit, getLatestMinedBlockRIBSBSC.gasLimit) &&
        Objects.equals(this.gasUsed, getLatestMinedBlockRIBSBSC.gasUsed) &&
        Objects.equals(this.minedInSeconds, getLatestMinedBlockRIBSBSC.minedInSeconds) &&
        Objects.equals(this.sha3Uncles, getLatestMinedBlockRIBSBSC.sha3Uncles) &&
        Objects.equals(this.totalDifficulty, getLatestMinedBlockRIBSBSC.totalDifficulty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(difficulty, nonce, size, extraData, gasLimit, gasUsed, minedInSeconds, sha3Uncles, totalDifficulty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLatestMinedBlockRIBSBSC {\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    minedInSeconds: ").append(toIndentedString(minedInSeconds)).append("\n");
    sb.append("    sha3Uncles: ").append(toIndentedString(sha3Uncles)).append("\n");
    sb.append("    totalDifficulty: ").append(toIndentedString(totalDifficulty)).append("\n");
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

