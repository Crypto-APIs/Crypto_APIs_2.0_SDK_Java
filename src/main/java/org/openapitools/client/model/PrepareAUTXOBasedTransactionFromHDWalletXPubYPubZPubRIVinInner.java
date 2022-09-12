/*
 * CryptoAPIs
 * Crypto APIs is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2021-03-20
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
 * PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  private Long change;

  public static final String SERIALIZED_NAME_DERIVATION_INDEX = "derivationIndex";
  @SerializedName(SERIALIZED_NAME_DERIVATION_INDEX)
  private Long derivationIndex;

  public static final String SERIALIZED_NAME_OUTPUT_INDEX = "outputIndex";
  @SerializedName(SERIALIZED_NAME_OUTPUT_INDEX)
  private Integer outputIndex;

  public static final String SERIALIZED_NAME_SATOSHIS = "satoshis";
  @SerializedName(SERIALIZED_NAME_SATOSHIS)
  private Long satoshis;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public static final String SERIALIZED_NAME_SIGHASH = "sighash";
  @SerializedName(SERIALIZED_NAME_SIGHASH)
  private String sighash;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner() { 
  }

  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Representation of the address
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "tb1q8wus03xdv3t6aknmsnpd0jmeu7dgh93j34pj5a", required = true, value = "Representation of the address")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner change(Long change) {
    
    this.change = change;
    return this;
  }

   /**
   * Representation of the change value
   * @return change
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Representation of the change value")

  public Long getChange() {
    return change;
  }


  public void setChange(Long change) {
    this.change = change;
  }


  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner derivationIndex(Long derivationIndex) {
    
    this.derivationIndex = derivationIndex;
    return this;
  }

   /**
   * Representation of the derivation index of the xpub address.
   * @return derivationIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Representation of the derivation index of the xpub address.")

  public Long getDerivationIndex() {
    return derivationIndex;
  }


  public void setDerivationIndex(Long derivationIndex) {
    this.derivationIndex = derivationIndex;
  }


  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner outputIndex(Integer outputIndex) {
    
    this.outputIndex = outputIndex;
    return this;
  }

   /**
   * Representation of the output index
   * @return outputIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Representation of the output index")

  public Integer getOutputIndex() {
    return outputIndex;
  }


  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }


  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner satoshis(Long satoshis) {
    
    this.satoshis = satoshis;
    return this;
  }

   /**
   * Representation of the satoshis value
   * @return satoshis
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10000", required = true, value = "Representation of the satoshis value")

  public Long getSatoshis() {
    return satoshis;
  }


  public void setSatoshis(Long satoshis) {
    this.satoshis = satoshis;
  }


  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner script(String script) {
    
    this.script = script;
    return this;
  }

   /**
   * Representation of the script string
   * @return script
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00143bb907c4cd6457aeda7b84c2d7cb79e79a8b9632", required = true, value = "Representation of the script string")

  public String getScript() {
    return script;
  }


  public void setScript(String script) {
    this.script = script;
  }


  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner sighash(String sighash) {
    
    this.sighash = sighash;
    return this;
  }

   /**
   * Representation of the hash that should be signed.
   * @return sighash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "90cfeef03b2755586b8e81668d8009b16b34d48abf2968729892279222e8d893", required = true, value = "Representation of the hash that should be signed.")

  public String getSighash() {
    return sighash;
  }


  public void setSighash(String sighash) {
    this.sighash = sighash;
  }


  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Represents the reference transaction identifier.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ff59ac56616ece7498e62c7f9f957cfdd50f6f2a74402058154e3022e7617bf2", required = true, value = "Represents the reference transaction identifier.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner = (PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner) o;
    return Objects.equals(this.address, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.address) &&
        Objects.equals(this.change, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.change) &&
        Objects.equals(this.derivationIndex, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.derivationIndex) &&
        Objects.equals(this.outputIndex, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.outputIndex) &&
        Objects.equals(this.satoshis, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.satoshis) &&
        Objects.equals(this.script, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.script) &&
        Objects.equals(this.sighash, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.sighash) &&
        Objects.equals(this.transactionId, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, change, derivationIndex, outputIndex, satoshis, script, sighash, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    derivationIndex: ").append(toIndentedString(derivationIndex)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    satoshis: ").append(toIndentedString(satoshis)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    sighash: ").append(toIndentedString(sighash)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("change");
    openapiFields.add("derivationIndex");
    openapiFields.add("outputIndex");
    openapiFields.add("satoshis");
    openapiFields.add("script");
    openapiFields.add("sighash");
    openapiFields.add("transactionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("outputIndex");
    openapiRequiredFields.add("satoshis");
    openapiRequiredFields.add("script");
    openapiRequiredFields.add("sighash");
    openapiRequiredFields.add("transactionId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner is not found in the empty JSON string", PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("script") != null && !jsonObj.get("script").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `script` to be a primitive type in the JSON string but got `%s`", jsonObj.get("script").toString()));
      }
      if (jsonObj.get("sighash") != null && !jsonObj.get("sighash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sighash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sighash").toString()));
      }
      if (jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner>() {
           @Override
           public void write(JsonWriter out, PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner
  * @throws IOException if the JSON string is invalid with respect to PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner
  */
  public static PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.class);
  }

 /**
  * Convert an instance of PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
