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
 * GetTransactionDetailsByTransactionIDRIBSZVJoinSplit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class GetTransactionDetailsByTransactionIDRIBSZVJoinSplit {
  public static final String SERIALIZED_NAME_ANCHOR = "anchor";
  @SerializedName(SERIALIZED_NAME_ANCHOR)
  private String anchor;

  public static final String SERIALIZED_NAME_CIPHER_TEXTS = "cipherTexts";
  @SerializedName(SERIALIZED_NAME_CIPHER_TEXTS)
  private List<String> cipherTexts = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMITMENTS = "commitments";
  @SerializedName(SERIALIZED_NAME_COMMITMENTS)
  private List<String> commitments = new ArrayList<>();

  public static final String SERIALIZED_NAME_MACS = "macs";
  @SerializedName(SERIALIZED_NAME_MACS)
  private List<String> macs = new ArrayList<>();

  public static final String SERIALIZED_NAME_NULLIFIERS = "nullifiers";
  @SerializedName(SERIALIZED_NAME_NULLIFIERS)
  private List<String> nullifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_ONE_TIME_PUB_KEY = "oneTimePubKey";
  @SerializedName(SERIALIZED_NAME_ONE_TIME_PUB_KEY)
  private String oneTimePubKey;

  public static final String SERIALIZED_NAME_PROOF = "proof";
  @SerializedName(SERIALIZED_NAME_PROOF)
  private String proof;

  public static final String SERIALIZED_NAME_RANDOM_SEED = "randomSeed";
  @SerializedName(SERIALIZED_NAME_RANDOM_SEED)
  private String randomSeed;

  public static final String SERIALIZED_NAME_V_PUB_NEW = "vPubNew";
  @SerializedName(SERIALIZED_NAME_V_PUB_NEW)
  private String vPubNew;

  public static final String SERIALIZED_NAME_V_PUB_OLD = "vPubOld";
  @SerializedName(SERIALIZED_NAME_V_PUB_OLD)
  private String vPubOld;

  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit() { 
  }

  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit anchor(String anchor) {
    
    this.anchor = anchor;
    return this;
  }

   /**
   * Defines a Merkle tree root of a note commitment tree which uniquely identifies a note commitment tree state given the assumed security properties of the Merkle tree’s  hash function.
   * @return anchor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "d32ddbaf0d9dc8c10783c01fd9ba5bd0bc2e5efe3d1665d7d6771eb4393736b4", required = true, value = "Defines a Merkle tree root of a note commitment tree which uniquely identifies a note commitment tree state given the assumed security properties of the Merkle tree’s  hash function.")

  public String getAnchor() {
    return anchor;
  }


  public void setAnchor(String anchor) {
    this.anchor = anchor;
  }


  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit cipherTexts(List<String> cipherTexts) {
    
    this.cipherTexts = cipherTexts;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit addCipherTextsItem(String cipherTextsItem) {
    this.cipherTexts.add(cipherTextsItem);
    return this;
  }

   /**
   * Get cipherTexts
   * @return cipherTexts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getCipherTexts() {
    return cipherTexts;
  }


  public void setCipherTexts(List<String> cipherTexts) {
    this.cipherTexts = cipherTexts;
  }


  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit commitments(List<String> commitments) {
    
    this.commitments = commitments;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit addCommitmentsItem(String commitmentsItem) {
    this.commitments.add(commitmentsItem);
    return this;
  }

   /**
   * Get commitments
   * @return commitments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getCommitments() {
    return commitments;
  }


  public void setCommitments(List<String> commitments) {
    this.commitments = commitments;
  }


  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit macs(List<String> macs) {
    
    this.macs = macs;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit addMacsItem(String macsItem) {
    this.macs.add(macsItem);
    return this;
  }

   /**
   * Get macs
   * @return macs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getMacs() {
    return macs;
  }


  public void setMacs(List<String> macs) {
    this.macs = macs;
  }


  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit nullifiers(List<String> nullifiers) {
    
    this.nullifiers = nullifiers;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit addNullifiersItem(String nullifiersItem) {
    this.nullifiers.add(nullifiersItem);
    return this;
  }

   /**
   * Get nullifiers
   * @return nullifiers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getNullifiers() {
    return nullifiers;
  }


  public void setNullifiers(List<String> nullifiers) {
    this.nullifiers = nullifiers;
  }


  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit oneTimePubKey(String oneTimePubKey) {
    
    this.oneTimePubKey = oneTimePubKey;
    return this;
  }

   /**
   * Defines the one time public key.
   * @return oneTimePubKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0a2e7ba03903480af852cb47d8ce76eb6546aef69bdb35b28b8ae815012d4d13", required = true, value = "Defines the one time public key.")

  public String getOneTimePubKey() {
    return oneTimePubKey;
  }


  public void setOneTimePubKey(String oneTimePubKey) {
    this.oneTimePubKey = oneTimePubKey;
  }


  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit proof(String proof) {
    
    this.proof = proof;
    return this;
  }

   /**
   * Defines the proof.
   * @return proof
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8dd9c988c9f337bd55c07fa9e2fa405cf4dda2cb915214fc0b5924870eed0f0187a0db001b5d8ea43a537e423d91d0fc868a456fa3e0bf9e99d1b04f43c6983a05a99458a69903add73ccaa4177844df9056d40c5a71ae14a70835cb30ca7d810fa1d48c9180ddec2ca1cecfaa8706ab514d6e8fe2dd228d7dc012d9407517523b774107a6a78dc972b175b94d1681b980e2b9ba7d39f880973787080a12bf14dc3f038333245a60bbcd9cb1fe2baba30ed083535752cc26ea0c57134e0c774e", required = true, value = "Defines the proof.")

  public String getProof() {
    return proof;
  }


  public void setProof(String proof) {
    this.proof = proof;
  }


  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit randomSeed(String randomSeed) {
    
    this.randomSeed = randomSeed;
    return this;
  }

   /**
   * Represents a 256-bit seed that must be chosen independently at random for each JoinSplit description.
   * @return randomSeed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "05eb35ce1cec5f5824f708ee9d95467d2318d24c8d4220040df92d48b1f182e8", required = true, value = "Represents a 256-bit seed that must be chosen independently at random for each JoinSplit description.")

  public String getRandomSeed() {
    return randomSeed;
  }


  public void setRandomSeed(String randomSeed) {
    this.randomSeed = randomSeed;
  }


  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit vPubNew(String vPubNew) {
    
    this.vPubNew = vPubNew;
    return this;
  }

   /**
   * Defines the value that the joinSplit transfer will insert into the transparent transaction value pool
   * @return vPubNew
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "50.02989193", required = true, value = "Defines the value that the joinSplit transfer will insert into the transparent transaction value pool")

  public String getvPubNew() {
    return vPubNew;
  }


  public void setvPubNew(String vPubNew) {
    this.vPubNew = vPubNew;
  }


  public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit vPubOld(String vPubOld) {
    
    this.vPubOld = vPubOld;
    return this;
  }

   /**
   * Defines the value that the joinSplit transfer will remove from the transparent transaction value pool.
   * @return vPubOld
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Defines the value that the joinSplit transfer will remove from the transparent transaction value pool.")

  public String getvPubOld() {
    return vPubOld;
  }


  public void setvPubOld(String vPubOld) {
    this.vPubOld = vPubOld;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionDetailsByTransactionIDRIBSZVJoinSplit getTransactionDetailsByTransactionIDRIBSZVJoinSplit = (GetTransactionDetailsByTransactionIDRIBSZVJoinSplit) o;
    return Objects.equals(this.anchor, getTransactionDetailsByTransactionIDRIBSZVJoinSplit.anchor) &&
        Objects.equals(this.cipherTexts, getTransactionDetailsByTransactionIDRIBSZVJoinSplit.cipherTexts) &&
        Objects.equals(this.commitments, getTransactionDetailsByTransactionIDRIBSZVJoinSplit.commitments) &&
        Objects.equals(this.macs, getTransactionDetailsByTransactionIDRIBSZVJoinSplit.macs) &&
        Objects.equals(this.nullifiers, getTransactionDetailsByTransactionIDRIBSZVJoinSplit.nullifiers) &&
        Objects.equals(this.oneTimePubKey, getTransactionDetailsByTransactionIDRIBSZVJoinSplit.oneTimePubKey) &&
        Objects.equals(this.proof, getTransactionDetailsByTransactionIDRIBSZVJoinSplit.proof) &&
        Objects.equals(this.randomSeed, getTransactionDetailsByTransactionIDRIBSZVJoinSplit.randomSeed) &&
        Objects.equals(this.vPubNew, getTransactionDetailsByTransactionIDRIBSZVJoinSplit.vPubNew) &&
        Objects.equals(this.vPubOld, getTransactionDetailsByTransactionIDRIBSZVJoinSplit.vPubOld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchor, cipherTexts, commitments, macs, nullifiers, oneTimePubKey, proof, randomSeed, vPubNew, vPubOld);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDRIBSZVJoinSplit {\n");
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    cipherTexts: ").append(toIndentedString(cipherTexts)).append("\n");
    sb.append("    commitments: ").append(toIndentedString(commitments)).append("\n");
    sb.append("    macs: ").append(toIndentedString(macs)).append("\n");
    sb.append("    nullifiers: ").append(toIndentedString(nullifiers)).append("\n");
    sb.append("    oneTimePubKey: ").append(toIndentedString(oneTimePubKey)).append("\n");
    sb.append("    proof: ").append(toIndentedString(proof)).append("\n");
    sb.append("    randomSeed: ").append(toIndentedString(randomSeed)).append("\n");
    sb.append("    vPubNew: ").append(toIndentedString(vPubNew)).append("\n");
    sb.append("    vPubOld: ").append(toIndentedString(vPubOld)).append("\n");
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
    openapiFields.add("anchor");
    openapiFields.add("cipherTexts");
    openapiFields.add("commitments");
    openapiFields.add("macs");
    openapiFields.add("nullifiers");
    openapiFields.add("oneTimePubKey");
    openapiFields.add("proof");
    openapiFields.add("randomSeed");
    openapiFields.add("vPubNew");
    openapiFields.add("vPubOld");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("anchor");
    openapiRequiredFields.add("cipherTexts");
    openapiRequiredFields.add("commitments");
    openapiRequiredFields.add("macs");
    openapiRequiredFields.add("nullifiers");
    openapiRequiredFields.add("oneTimePubKey");
    openapiRequiredFields.add("proof");
    openapiRequiredFields.add("randomSeed");
    openapiRequiredFields.add("vPubNew");
    openapiRequiredFields.add("vPubOld");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTransactionDetailsByTransactionIDRIBSZVJoinSplit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetTransactionDetailsByTransactionIDRIBSZVJoinSplit.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTransactionDetailsByTransactionIDRIBSZVJoinSplit is not found in the empty JSON string", GetTransactionDetailsByTransactionIDRIBSZVJoinSplit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetTransactionDetailsByTransactionIDRIBSZVJoinSplit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTransactionDetailsByTransactionIDRIBSZVJoinSplit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTransactionDetailsByTransactionIDRIBSZVJoinSplit.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("anchor") != null && !jsonObj.get("anchor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `anchor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("anchor").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("cipherTexts") != null && !jsonObj.get("cipherTexts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cipherTexts` to be an array in the JSON string but got `%s`", jsonObj.get("cipherTexts").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("commitments") != null && !jsonObj.get("commitments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `commitments` to be an array in the JSON string but got `%s`", jsonObj.get("commitments").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("macs") != null && !jsonObj.get("macs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `macs` to be an array in the JSON string but got `%s`", jsonObj.get("macs").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("nullifiers") != null && !jsonObj.get("nullifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nullifiers` to be an array in the JSON string but got `%s`", jsonObj.get("nullifiers").toString()));
      }
      if (jsonObj.get("oneTimePubKey") != null && !jsonObj.get("oneTimePubKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oneTimePubKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oneTimePubKey").toString()));
      }
      if (jsonObj.get("proof") != null && !jsonObj.get("proof").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proof` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proof").toString()));
      }
      if (jsonObj.get("randomSeed") != null && !jsonObj.get("randomSeed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `randomSeed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("randomSeed").toString()));
      }
      if (jsonObj.get("vPubNew") != null && !jsonObj.get("vPubNew").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vPubNew` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vPubNew").toString()));
      }
      if (jsonObj.get("vPubOld") != null && !jsonObj.get("vPubOld").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vPubOld` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vPubOld").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTransactionDetailsByTransactionIDRIBSZVJoinSplit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTransactionDetailsByTransactionIDRIBSZVJoinSplit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSZVJoinSplit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSZVJoinSplit.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTransactionDetailsByTransactionIDRIBSZVJoinSplit>() {
           @Override
           public void write(JsonWriter out, GetTransactionDetailsByTransactionIDRIBSZVJoinSplit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTransactionDetailsByTransactionIDRIBSZVJoinSplit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTransactionDetailsByTransactionIDRIBSZVJoinSplit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTransactionDetailsByTransactionIDRIBSZVJoinSplit
  * @throws IOException if the JSON string is invalid with respect to GetTransactionDetailsByTransactionIDRIBSZVJoinSplit
  */
  public static GetTransactionDetailsByTransactionIDRIBSZVJoinSplit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTransactionDetailsByTransactionIDRIBSZVJoinSplit.class);
  }

 /**
  * Convert an instance of GetTransactionDetailsByTransactionIDRIBSZVJoinSplit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

