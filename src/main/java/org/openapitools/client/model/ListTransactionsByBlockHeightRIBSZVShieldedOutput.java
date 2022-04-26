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
 * ListTransactionsByBlockHeightRIBSZVShieldedOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListTransactionsByBlockHeightRIBSZVShieldedOutput {
  public static final String SERIALIZED_NAME_CMU = "cmu";
  @SerializedName(SERIALIZED_NAME_CMU)
  private String cmu;

  public static final String SERIALIZED_NAME_CV = "cv";
  @SerializedName(SERIALIZED_NAME_CV)
  private String cv;

  public static final String SERIALIZED_NAME_ENC_CIPHER_TEXT = "encCipherText";
  @SerializedName(SERIALIZED_NAME_ENC_CIPHER_TEXT)
  private String encCipherText;

  public static final String SERIALIZED_NAME_EPHEMERAL_KEY = "ephemeralKey";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL_KEY)
  private String ephemeralKey;

  public static final String SERIALIZED_NAME_OUT_CIPHER_TEXT = "outCipherText";
  @SerializedName(SERIALIZED_NAME_OUT_CIPHER_TEXT)
  private String outCipherText;

  public static final String SERIALIZED_NAME_PROOF = "proof";
  @SerializedName(SERIALIZED_NAME_PROOF)
  private String proof;

  public ListTransactionsByBlockHeightRIBSZVShieldedOutput() { 
  }

  public ListTransactionsByBlockHeightRIBSZVShieldedOutput cmu(String cmu) {
    
    this.cmu = cmu;
    return this;
  }

   /**
   * Represents the 𝑢-coordinate of the note commitment for the output note.
   * @return cmu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4eb188a762d4fd4358ae70b2dac1b6a596ad653be92471792bf4b157850a1011", required = true, value = "Represents the 𝑢-coordinate of the note commitment for the output note.")

  public String getCmu() {
    return cmu;
  }


  public void setCmu(String cmu) {
    this.cmu = cmu;
  }


  public ListTransactionsByBlockHeightRIBSZVShieldedOutput cv(String cv) {
    
    this.cv = cv;
    return this;
  }

   /**
   * Defines a value commitment to the value of the input note.
   * @return cv
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "547a9cef4937304f97acacfcd9827b5aa1b2e5b1ae32e360fae828b955564a0e", required = true, value = "Defines a value commitment to the value of the input note.")

  public String getCv() {
    return cv;
  }


  public void setCv(String cv) {
    this.cv = cv;
  }


  public ListTransactionsByBlockHeightRIBSZVShieldedOutput encCipherText(String encCipherText) {
    
    this.encCipherText = encCipherText;
    return this;
  }

   /**
   * Represents a ciphertext component for the encrypted output note.
   * @return encCipherText
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "a6c0084214eef0058f4b51c1e25b4c05ac282fec0edc5938c4283aa2a6d7c426d7a3c927d11596f81780b18c0eee90848702eb7fa512f7a6386e52d9bc17d5bc0e20bc24608ece560a314570aaf4c095bc988a9a0f8ef72ed91d0eee7d927eb37428c62af28c6a5c9379ac48aef3cdfb9b83eed77edde50acab7615f8fecdb1f24500fab6b8a72440e6fadbf0e6ad0ff8989df4d27bb2bc56c3a99c6da2e82c68a319857902842cf15aec180b6ea0ff3ebedf1cfd02b434ac715bc4afb17f67286d5708864a7aabb461461f080bbcf0315c38d782be6d0aae7ac3beb6574babf12c9182574d6c6e900888b5c4da40952c403b7d4ebe96e051893e388bcb7026d839e1d49ddbb132706fbadae1ef272d7e8dbf297dfbe7867651cfd843e52239d8270c1b6d46f2589643a5a325018f2d0b82b53955a5a3c5c3cecf8f0829594777887028456bd708c7c4ad88e588609c1b33d9060d8cf0015bfc18676ebc7022956ab6d4c6aae24550422e702733da234e2ce6f5adbafc4e2d97ae9846febddeacfaefda7f186b7e8182f4692c34bff4bd31eeeab15c5b5f7a41c93acae05a4f3c378fbe6cf33ab3628f4c5b8e04b9368ec69ea1c7c816c803d9ef7bbafe232f43959c7b49dd7c3328dc028040f440fd3cb2e08449db77c191288f120c065870d800ebdca234e6c2ba1fa6d44d04f4fed2e41b1c65d273b0ce58287274e8dc71a2a174244f026971bb9c698e7f7964eec615515910c627a201b52c3c2c504623ac45f5606d0400120bd5b6e1f431775fe92fb2c9eb5546c9dc12693ee9b679e49fce2cf71", required = true, value = "Represents a ciphertext component for the encrypted output note.")

  public String getEncCipherText() {
    return encCipherText;
  }


  public void setEncCipherText(String encCipherText) {
    this.encCipherText = encCipherText;
  }


  public ListTransactionsByBlockHeightRIBSZVShieldedOutput ephemeralKey(String ephemeralKey) {
    
    this.ephemeralKey = ephemeralKey;
    return this;
  }

   /**
   * Represents an encoding of an ephemeral Jubjub public key.
   * @return ephemeralKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "04c59e908296aeac1160ba8def90916988bf8389564343e6fb3b9e52c27fba0a", required = true, value = "Represents an encoding of an ephemeral Jubjub public key.")

  public String getEphemeralKey() {
    return ephemeralKey;
  }


  public void setEphemeralKey(String ephemeralKey) {
    this.ephemeralKey = ephemeralKey;
  }


  public ListTransactionsByBlockHeightRIBSZVShieldedOutput outCipherText(String outCipherText) {
    
    this.outCipherText = outCipherText;
    return this;
  }

   /**
   * Represents a ciphertext component that allows the holder of the outgoing cipher key to recover the diversified transmission key pkd and ephemeral private key esk, hence the entire note plaintext.
   * @return outCipherText
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "b3f02b333a61b69e63dfeaf1ad430534985cd6958abe92664abe85449ca68b5c145f536e9a636a881aab5e314b4f550b2b8f5600dc1ed636f643b11e00bb6c469bf5205f16197372dcf5e4b0871e42f4", required = true, value = "Represents a ciphertext component that allows the holder of the outgoing cipher key to recover the diversified transmission key pkd and ephemeral private key esk, hence the entire note plaintext.")

  public String getOutCipherText() {
    return outCipherText;
  }


  public void setOutCipherText(String outCipherText) {
    this.outCipherText = outCipherText;
  }


  public ListTransactionsByBlockHeightRIBSZVShieldedOutput proof(String proof) {
    
    this.proof = proof;
    return this;
  }

   /**
   * Represents the proof
   * @return proof
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8dd9c988c9f337bd55c07fa9e2fa405cf4dda2cb915214fc0b5924870eed0f0187a0db001b5d8ea43a537e423d91d0fc868a456fa3e0bf9e99d1b04f43c6983a05a99458a69903add73ccaa4177844df9056d40c5a71ae14a70835cb30ca7d810fa1d48c9180ddec2ca1cecfaa8706ab514d6e8fe2dd228d7dc012d9407517523b774107a6a78dc972b175b94d1681b980e2b9ba7d39f880973787080a12bf14dc3f038333245a60bbcd9cb1fe2baba30ed083535752cc26ea0c57134e0c774e", required = true, value = "Represents the proof")

  public String getProof() {
    return proof;
  }


  public void setProof(String proof) {
    this.proof = proof;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionsByBlockHeightRIBSZVShieldedOutput listTransactionsByBlockHeightRIBSZVShieldedOutput = (ListTransactionsByBlockHeightRIBSZVShieldedOutput) o;
    return Objects.equals(this.cmu, listTransactionsByBlockHeightRIBSZVShieldedOutput.cmu) &&
        Objects.equals(this.cv, listTransactionsByBlockHeightRIBSZVShieldedOutput.cv) &&
        Objects.equals(this.encCipherText, listTransactionsByBlockHeightRIBSZVShieldedOutput.encCipherText) &&
        Objects.equals(this.ephemeralKey, listTransactionsByBlockHeightRIBSZVShieldedOutput.ephemeralKey) &&
        Objects.equals(this.outCipherText, listTransactionsByBlockHeightRIBSZVShieldedOutput.outCipherText) &&
        Objects.equals(this.proof, listTransactionsByBlockHeightRIBSZVShieldedOutput.proof);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cmu, cv, encCipherText, ephemeralKey, outCipherText, proof);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByBlockHeightRIBSZVShieldedOutput {\n");
    sb.append("    cmu: ").append(toIndentedString(cmu)).append("\n");
    sb.append("    cv: ").append(toIndentedString(cv)).append("\n");
    sb.append("    encCipherText: ").append(toIndentedString(encCipherText)).append("\n");
    sb.append("    ephemeralKey: ").append(toIndentedString(ephemeralKey)).append("\n");
    sb.append("    outCipherText: ").append(toIndentedString(outCipherText)).append("\n");
    sb.append("    proof: ").append(toIndentedString(proof)).append("\n");
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
    openapiFields.add("cmu");
    openapiFields.add("cv");
    openapiFields.add("encCipherText");
    openapiFields.add("ephemeralKey");
    openapiFields.add("outCipherText");
    openapiFields.add("proof");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cmu");
    openapiRequiredFields.add("cv");
    openapiRequiredFields.add("encCipherText");
    openapiRequiredFields.add("ephemeralKey");
    openapiRequiredFields.add("outCipherText");
    openapiRequiredFields.add("proof");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListTransactionsByBlockHeightRIBSZVShieldedOutput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListTransactionsByBlockHeightRIBSZVShieldedOutput.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListTransactionsByBlockHeightRIBSZVShieldedOutput is not found in the empty JSON string", ListTransactionsByBlockHeightRIBSZVShieldedOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListTransactionsByBlockHeightRIBSZVShieldedOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListTransactionsByBlockHeightRIBSZVShieldedOutput` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListTransactionsByBlockHeightRIBSZVShieldedOutput.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("cmu") != null && !jsonObj.get("cmu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cmu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cmu").toString()));
      }
      if (jsonObj.get("cv") != null && !jsonObj.get("cv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cv").toString()));
      }
      if (jsonObj.get("encCipherText") != null && !jsonObj.get("encCipherText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encCipherText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encCipherText").toString()));
      }
      if (jsonObj.get("ephemeralKey") != null && !jsonObj.get("ephemeralKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ephemeralKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ephemeralKey").toString()));
      }
      if (jsonObj.get("outCipherText") != null && !jsonObj.get("outCipherText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outCipherText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outCipherText").toString()));
      }
      if (jsonObj.get("proof") != null && !jsonObj.get("proof").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proof` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proof").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListTransactionsByBlockHeightRIBSZVShieldedOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListTransactionsByBlockHeightRIBSZVShieldedOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListTransactionsByBlockHeightRIBSZVShieldedOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHeightRIBSZVShieldedOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListTransactionsByBlockHeightRIBSZVShieldedOutput>() {
           @Override
           public void write(JsonWriter out, ListTransactionsByBlockHeightRIBSZVShieldedOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListTransactionsByBlockHeightRIBSZVShieldedOutput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListTransactionsByBlockHeightRIBSZVShieldedOutput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListTransactionsByBlockHeightRIBSZVShieldedOutput
  * @throws IOException if the JSON string is invalid with respect to ListTransactionsByBlockHeightRIBSZVShieldedOutput
  */
  public static ListTransactionsByBlockHeightRIBSZVShieldedOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListTransactionsByBlockHeightRIBSZVShieldedOutput.class);
  }

 /**
  * Convert an instance of ListTransactionsByBlockHeightRIBSZVShieldedOutput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

