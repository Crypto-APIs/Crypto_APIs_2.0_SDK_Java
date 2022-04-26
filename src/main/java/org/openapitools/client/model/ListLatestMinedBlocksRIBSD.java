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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.cryptoapis.sdk.JSON;

/**
 * Dash
 */
@ApiModel(description = "Dash")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListLatestMinedBlocksRIBSD {
  public static final String SERIALIZED_NAME_BITS = "bits";
  @SerializedName(SERIALIZED_NAME_BITS)
  private String bits;

  public static final String SERIALIZED_NAME_CHAINWORK = "chainwork";
  @SerializedName(SERIALIZED_NAME_CHAINWORK)
  private String chainwork;

  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private String difficulty;

  public static final String SERIALIZED_NAME_MERKLE_ROOT = "merkleRoot";
  @SerializedName(SERIALIZED_NAME_MERKLE_ROOT)
  private String merkleRoot;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Integer nonce;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VERSION_HEX = "versionHex";
  @SerializedName(SERIALIZED_NAME_VERSION_HEX)
  private String versionHex;

  public ListLatestMinedBlocksRIBSD() { 
  }

  public ListLatestMinedBlocksRIBSD bits(String bits) {
    
    this.bits = bits;
    return this;
  }

   /**
   * Represents a specific sub-unit of Dash. Bits have two-decimal precision.
   * @return bits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1c0b6b81", required = true, value = "Represents a specific sub-unit of Dash. Bits have two-decimal precision.")

  public String getBits() {
    return bits;
  }


  public void setBits(String bits) {
    this.bits = bits;
  }


  public ListLatestMinedBlocksRIBSD chainwork(String chainwork) {
    
    this.chainwork = chainwork;
    return this;
  }

   /**
   * Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes.
   * @return chainwork
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "000000000000000000000000000000000000000000004f2b087db88ad29f2da6", required = true, value = "Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes.")

  public String getChainwork() {
    return chainwork;
  }


  public void setChainwork(String chainwork) {
    this.chainwork = chainwork;
  }


  public ListLatestMinedBlocksRIBSD difficulty(String difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Represents a mathematical value of how hard it is to find a valid hash for this block.
   * @return difficulty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "21448277761059.71", required = true, value = "Represents a mathematical value of how hard it is to find a valid hash for this block.")

  public String getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }


  public ListLatestMinedBlocksRIBSD merkleRoot(String merkleRoot) {
    
    this.merkleRoot = merkleRoot;
    return this;
  }

   /**
   * Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions&#39; hashes that are part of a blockchain block.
   * @return merkleRoot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "67eab41d993576c37ee9ce89054641660e9e61de98fa2b701d19c25cfb4ce037", required = true, value = "Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions' hashes that are part of a blockchain block.")

  public String getMerkleRoot() {
    return merkleRoot;
  }


  public void setMerkleRoot(String merkleRoot) {
    this.merkleRoot = merkleRoot;
  }


  public ListLatestMinedBlocksRIBSD nonce(Integer nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents a random value that can be adjusted to satisfy the proof of work
   * @return nonce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2113101077", required = true, value = "Represents a random value that can be adjusted to satisfy the proof of work")

  public Integer getNonce() {
    return nonce;
  }


  public void setNonce(Integer nonce) {
    this.nonce = nonce;
  }


  public ListLatestMinedBlocksRIBSD size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of the block in Bytes.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1408113", required = true, value = "Represents the total size of the block in Bytes.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public ListLatestMinedBlocksRIBSD version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents the version of the specific block on the blockchain.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "536870912", required = true, value = "Represents the version of the specific block on the blockchain.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ListLatestMinedBlocksRIBSD versionHex(String versionHex) {
    
    this.versionHex = versionHex;
    return this;
  }

   /**
   * Is the hexadecimal string representation of the block&#39;s version.
   * @return versionHex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20000010", required = true, value = "Is the hexadecimal string representation of the block's version.")

  public String getVersionHex() {
    return versionHex;
  }


  public void setVersionHex(String versionHex) {
    this.versionHex = versionHex;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLatestMinedBlocksRIBSD listLatestMinedBlocksRIBSD = (ListLatestMinedBlocksRIBSD) o;
    return Objects.equals(this.bits, listLatestMinedBlocksRIBSD.bits) &&
        Objects.equals(this.chainwork, listLatestMinedBlocksRIBSD.chainwork) &&
        Objects.equals(this.difficulty, listLatestMinedBlocksRIBSD.difficulty) &&
        Objects.equals(this.merkleRoot, listLatestMinedBlocksRIBSD.merkleRoot) &&
        Objects.equals(this.nonce, listLatestMinedBlocksRIBSD.nonce) &&
        Objects.equals(this.size, listLatestMinedBlocksRIBSD.size) &&
        Objects.equals(this.version, listLatestMinedBlocksRIBSD.version) &&
        Objects.equals(this.versionHex, listLatestMinedBlocksRIBSD.versionHex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bits, chainwork, difficulty, merkleRoot, nonce, size, version, versionHex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLatestMinedBlocksRIBSD {\n");
    sb.append("    bits: ").append(toIndentedString(bits)).append("\n");
    sb.append("    chainwork: ").append(toIndentedString(chainwork)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    merkleRoot: ").append(toIndentedString(merkleRoot)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionHex: ").append(toIndentedString(versionHex)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("bits");
    openapiFields.add("chainwork");
    openapiFields.add("difficulty");
    openapiFields.add("merkleRoot");
    openapiFields.add("nonce");
    openapiFields.add("size");
    openapiFields.add("version");
    openapiFields.add("versionHex");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bits");
    openapiRequiredFields.add("chainwork");
    openapiRequiredFields.add("difficulty");
    openapiRequiredFields.add("merkleRoot");
    openapiRequiredFields.add("nonce");
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("versionHex");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListLatestMinedBlocksRIBSD
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListLatestMinedBlocksRIBSD.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListLatestMinedBlocksRIBSD is not found in the empty JSON string", ListLatestMinedBlocksRIBSD.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListLatestMinedBlocksRIBSD.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListLatestMinedBlocksRIBSD` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListLatestMinedBlocksRIBSD.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("bits") != null && !jsonObj.get("bits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bits").toString()));
      }
      if (jsonObj.get("chainwork") != null && !jsonObj.get("chainwork").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chainwork` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chainwork").toString()));
      }
      if (jsonObj.get("difficulty") != null && !jsonObj.get("difficulty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `difficulty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("difficulty").toString()));
      }
      if (jsonObj.get("merkleRoot") != null && !jsonObj.get("merkleRoot").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merkleRoot` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merkleRoot").toString()));
      }
      if (jsonObj.get("versionHex") != null && !jsonObj.get("versionHex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionHex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionHex").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListLatestMinedBlocksRIBSD.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListLatestMinedBlocksRIBSD' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListLatestMinedBlocksRIBSD> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListLatestMinedBlocksRIBSD.class));

       return (TypeAdapter<T>) new TypeAdapter<ListLatestMinedBlocksRIBSD>() {
           @Override
           public void write(JsonWriter out, ListLatestMinedBlocksRIBSD value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListLatestMinedBlocksRIBSD read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListLatestMinedBlocksRIBSD given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListLatestMinedBlocksRIBSD
  * @throws IOException if the JSON string is invalid with respect to ListLatestMinedBlocksRIBSD
  */
  public static ListLatestMinedBlocksRIBSD fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListLatestMinedBlocksRIBSD.class);
  }

 /**
  * Convert an instance of ListLatestMinedBlocksRIBSD to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

