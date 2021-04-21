/*
 * Crypto APIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: bizdev@cryptoapis.io
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
 * Dogecoin
 */
@ApiModel(description = "Dogecoin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T16:59:17.199745Z[Etc/UTC]")
public class GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin {
  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private String difficulty;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_BITS = "bits";
  @SerializedName(SERIALIZED_NAME_BITS)
  private String bits;

  public static final String SERIALIZED_NAME_CHAINWORK = "chainwork";
  @SerializedName(SERIALIZED_NAME_CHAINWORK)
  private String chainwork;

  public static final String SERIALIZED_NAME_MERKLE_ROOT = "merkleRoot";
  @SerializedName(SERIALIZED_NAME_MERKLE_ROOT)
  private String merkleRoot;

  public static final String SERIALIZED_NAME_STRIPPED_SIZE = "strippedSize";
  @SerializedName(SERIALIZED_NAME_STRIPPED_SIZE)
  private Integer strippedSize;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;


  public GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin difficulty(String difficulty) {
    
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


  public GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin nonce(String nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents a random value that can be adjusted to satisfy the proof of work
   * @return nonce
  **/
  @ApiModelProperty(example = "2113101077", required = true, value = "Represents a random value that can be adjusted to satisfy the proof of work")

  public String getNonce() {
    return nonce;
  }


  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin size(Integer size) {
    
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


  public GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin bits(String bits) {
    
    this.bits = bits;
    return this;
  }

   /**
   * Represents a specific sub-unit of Doge. Bits have two-decimal precision.
   * @return bits
  **/
  @ApiModelProperty(example = "1a031996", required = true, value = "Represents a specific sub-unit of Doge. Bits have two-decimal precision.")

  public String getBits() {
    return bits;
  }


  public void setBits(String bits) {
    this.bits = bits;
  }


  public GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin chainwork(String chainwork) {
    
    this.chainwork = chainwork;
    return this;
  }

   /**
   * Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes.
   * @return chainwork
  **/
  @ApiModelProperty(example = "00000000000000000000000000000000000000000000048ea6f3be405ae0a819", required = true, value = "Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes.")

  public String getChainwork() {
    return chainwork;
  }


  public void setChainwork(String chainwork) {
    this.chainwork = chainwork;
  }


  public GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin merkleRoot(String merkleRoot) {
    
    this.merkleRoot = merkleRoot;
    return this;
  }

   /**
   * Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions&#39; hashes that are part of a blockchain block.
   * @return merkleRoot
  **/
  @ApiModelProperty(example = "bfeb2ed090f955ec07c51be25bbddc91ea73cafbe8c3d6f1a76b288e70b19df6", required = true, value = "Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions' hashes that are part of a blockchain block.")

  public String getMerkleRoot() {
    return merkleRoot;
  }


  public void setMerkleRoot(String merkleRoot) {
    this.merkleRoot = merkleRoot;
  }


  public GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin strippedSize(Integer strippedSize) {
    
    this.strippedSize = strippedSize;
    return this;
  }

   /**
   * Defines the numeric representation of the block size excluding the witness data.
   * @return strippedSize
  **/
  @ApiModelProperty(example = "4322", required = true, value = "Defines the numeric representation of the block size excluding the witness data.")

  public Integer getStrippedSize() {
    return strippedSize;
  }


  public void setStrippedSize(Integer strippedSize) {
    this.strippedSize = strippedSize;
  }


  public GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents the version of the specific block on the blockchain.
   * @return version
  **/
  @ApiModelProperty(example = "6422788", required = true, value = "Represents the version of the specific block on the blockchain.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Represents a measurement to compare the size of different transactions to each other in proportion to the block size limit.
   * @return weight
  **/
  @ApiModelProperty(example = "17288", required = true, value = "Represents a measurement to compare the size of different transactions to each other in proportion to the block size limit.")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin getLatestMinedBlockResponseItemBlockchainSpecificDogecoin = (GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin) o;
    return Objects.equals(this.difficulty, getLatestMinedBlockResponseItemBlockchainSpecificDogecoin.difficulty) &&
        Objects.equals(this.nonce, getLatestMinedBlockResponseItemBlockchainSpecificDogecoin.nonce) &&
        Objects.equals(this.size, getLatestMinedBlockResponseItemBlockchainSpecificDogecoin.size) &&
        Objects.equals(this.bits, getLatestMinedBlockResponseItemBlockchainSpecificDogecoin.bits) &&
        Objects.equals(this.chainwork, getLatestMinedBlockResponseItemBlockchainSpecificDogecoin.chainwork) &&
        Objects.equals(this.merkleRoot, getLatestMinedBlockResponseItemBlockchainSpecificDogecoin.merkleRoot) &&
        Objects.equals(this.strippedSize, getLatestMinedBlockResponseItemBlockchainSpecificDogecoin.strippedSize) &&
        Objects.equals(this.version, getLatestMinedBlockResponseItemBlockchainSpecificDogecoin.version) &&
        Objects.equals(this.weight, getLatestMinedBlockResponseItemBlockchainSpecificDogecoin.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(difficulty, nonce, size, bits, chainwork, merkleRoot, strippedSize, version, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin {\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    bits: ").append(toIndentedString(bits)).append("\n");
    sb.append("    chainwork: ").append(toIndentedString(chainwork)).append("\n");
    sb.append("    merkleRoot: ").append(toIndentedString(merkleRoot)).append("\n");
    sb.append("    strippedSize: ").append(toIndentedString(strippedSize)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

