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
import org.openapitools.client.model.ListConfirmedTransactionsByAddressRIBSD2ScriptSig;

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
 * ListAllUnconfirmedTransactionsRIBSD2Vin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListAllUnconfirmedTransactionsRIBSD2Vin {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCRIPT_SIG = "scriptSig";
  @SerializedName(SERIALIZED_NAME_SCRIPT_SIG)
  private ListConfirmedTransactionsByAddressRIBSD2ScriptSig scriptSig;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private String sequence;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_TXINWITNESS = "txinwitness";
  @SerializedName(SERIALIZED_NAME_TXINWITNESS)
  private List<String> txinwitness = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private Integer vout;

  public ListAllUnconfirmedTransactionsRIBSD2Vin() { 
  }

  public ListAllUnconfirmedTransactionsRIBSD2Vin addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public ListAllUnconfirmedTransactionsRIBSD2Vin addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public ListAllUnconfirmedTransactionsRIBSD2Vin scriptSig(ListConfirmedTransactionsByAddressRIBSD2ScriptSig scriptSig) {
    
    this.scriptSig = scriptSig;
    return this;
  }

   /**
   * Get scriptSig
   * @return scriptSig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListConfirmedTransactionsByAddressRIBSD2ScriptSig getScriptSig() {
    return scriptSig;
  }


  public void setScriptSig(ListConfirmedTransactionsByAddressRIBSD2ScriptSig scriptSig) {
    this.scriptSig = scriptSig;
  }


  public ListAllUnconfirmedTransactionsRIBSD2Vin sequence(String sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Represents the script sequence number.
   * @return sequence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4294967295", required = true, value = "Represents the script sequence number.")

  public String getSequence() {
    return sequence;
  }


  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  public ListAllUnconfirmedTransactionsRIBSD2Vin txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * Represents the reference transaction identifier.
   * @return txid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "54b8f0e54b4b66fab386c6f9dea76bfe06524ab71d1d42b321aea9a7fea50f48", required = true, value = "Represents the reference transaction identifier.")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public ListAllUnconfirmedTransactionsRIBSD2Vin txinwitness(List<String> txinwitness) {
    
    this.txinwitness = txinwitness;
    return this;
  }

  public ListAllUnconfirmedTransactionsRIBSD2Vin addTxinwitnessItem(String txinwitnessItem) {
    this.txinwitness.add(txinwitnessItem);
    return this;
  }

   /**
   * Get txinwitness
   * @return txinwitness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTxinwitness() {
    return txinwitness;
  }


  public void setTxinwitness(List<String> txinwitness) {
    this.txinwitness = txinwitness;
  }


  public ListAllUnconfirmedTransactionsRIBSD2Vin value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Represents the sent/received amount.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "7.76021116", required = true, value = "Represents the sent/received amount.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ListAllUnconfirmedTransactionsRIBSD2Vin vout(Integer vout) {
    
    this.vout = vout;
    return this;
  }

   /**
   * It refers to the index of the output address of this transaction. The index starts from 0.
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "It refers to the index of the output address of this transaction. The index starts from 0.")

  public Integer getVout() {
    return vout;
  }


  public void setVout(Integer vout) {
    this.vout = vout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAllUnconfirmedTransactionsRIBSD2Vin listAllUnconfirmedTransactionsRIBSD2Vin = (ListAllUnconfirmedTransactionsRIBSD2Vin) o;
    return Objects.equals(this.addresses, listAllUnconfirmedTransactionsRIBSD2Vin.addresses) &&
        Objects.equals(this.scriptSig, listAllUnconfirmedTransactionsRIBSD2Vin.scriptSig) &&
        Objects.equals(this.sequence, listAllUnconfirmedTransactionsRIBSD2Vin.sequence) &&
        Objects.equals(this.txid, listAllUnconfirmedTransactionsRIBSD2Vin.txid) &&
        Objects.equals(this.txinwitness, listAllUnconfirmedTransactionsRIBSD2Vin.txinwitness) &&
        Objects.equals(this.value, listAllUnconfirmedTransactionsRIBSD2Vin.value) &&
        Objects.equals(this.vout, listAllUnconfirmedTransactionsRIBSD2Vin.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, scriptSig, sequence, txid, txinwitness, value, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAllUnconfirmedTransactionsRIBSD2Vin {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    scriptSig: ").append(toIndentedString(scriptSig)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    txinwitness: ").append(toIndentedString(txinwitness)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    vout: ").append(toIndentedString(vout)).append("\n");
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
    openapiFields.add("addresses");
    openapiFields.add("scriptSig");
    openapiFields.add("sequence");
    openapiFields.add("txid");
    openapiFields.add("txinwitness");
    openapiFields.add("value");
    openapiFields.add("vout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("addresses");
    openapiRequiredFields.add("scriptSig");
    openapiRequiredFields.add("sequence");
    openapiRequiredFields.add("txid");
    openapiRequiredFields.add("txinwitness");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("vout");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAllUnconfirmedTransactionsRIBSD2Vin
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListAllUnconfirmedTransactionsRIBSD2Vin.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAllUnconfirmedTransactionsRIBSD2Vin is not found in the empty JSON string", ListAllUnconfirmedTransactionsRIBSD2Vin.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAllUnconfirmedTransactionsRIBSD2Vin.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAllUnconfirmedTransactionsRIBSD2Vin` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListAllUnconfirmedTransactionsRIBSD2Vin.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }
      // validate the optional field `scriptSig`
      if (jsonObj.getAsJsonObject("scriptSig") != null) {
        ListConfirmedTransactionsByAddressRIBSD2ScriptSig.validateJsonObject(jsonObj.getAsJsonObject("scriptSig"));
      }
      if (jsonObj.get("sequence") != null && !jsonObj.get("sequence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sequence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sequence").toString()));
      }
      if (jsonObj.get("txid") != null && !jsonObj.get("txid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `txid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("txid").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("txinwitness") != null && !jsonObj.get("txinwitness").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `txinwitness` to be an array in the JSON string but got `%s`", jsonObj.get("txinwitness").toString()));
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAllUnconfirmedTransactionsRIBSD2Vin.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAllUnconfirmedTransactionsRIBSD2Vin' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAllUnconfirmedTransactionsRIBSD2Vin> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAllUnconfirmedTransactionsRIBSD2Vin.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAllUnconfirmedTransactionsRIBSD2Vin>() {
           @Override
           public void write(JsonWriter out, ListAllUnconfirmedTransactionsRIBSD2Vin value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAllUnconfirmedTransactionsRIBSD2Vin read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAllUnconfirmedTransactionsRIBSD2Vin given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAllUnconfirmedTransactionsRIBSD2Vin
  * @throws IOException if the JSON string is invalid with respect to ListAllUnconfirmedTransactionsRIBSD2Vin
  */
  public static ListAllUnconfirmedTransactionsRIBSD2Vin fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAllUnconfirmedTransactionsRIBSD2Vin.class);
  }

 /**
  * Convert an instance of ListAllUnconfirmedTransactionsRIBSD2Vin to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

