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
import org.openapitools.client.model.ListHDWalletXPubYPubZPubTransactionsRIFee;
import org.openapitools.client.model.ListHDWalletXPubYPubZPubTransactionsRIRecipients;
import org.openapitools.client.model.ListHDWalletXPubYPubZPubTransactionsRISenders;

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
 * ListHDWalletXPubYPubZPubTransactionsRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListHDWalletXPubYPubZPubTransactionsRI {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HASH = "minedInBlockHash";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HASH)
  private String minedInBlockHash;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT = "minedInBlockHeight";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT)
  private Integer minedInBlockHeight;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<ListHDWalletXPubYPubZPubTransactionsRIRecipients> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private List<ListHDWalletXPubYPubZPubTransactionsRISenders> senders = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transactionHash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private ListHDWalletXPubYPubZPubTransactionsRIFee fee;

  public ListHDWalletXPubYPubZPubTransactionsRI() { 
  }

  public ListHDWalletXPubYPubZPubTransactionsRI index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Represents the index position of the transaction in the block.
   * @return index
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Represents the index position of the transaction in the block.")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public ListHDWalletXPubYPubZPubTransactionsRI minedInBlockHash(String minedInBlockHash) {
    
    this.minedInBlockHash = minedInBlockHash;
    return this;
  }

   /**
   * Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return minedInBlockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00000000407f119ecb74b44229228910400aaeb9f4e3b9869955b85a53e9b7db", required = true, value = "Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getMinedInBlockHash() {
    return minedInBlockHash;
  }


  public void setMinedInBlockHash(String minedInBlockHash) {
    this.minedInBlockHash = minedInBlockHash;
  }


  public ListHDWalletXPubYPubZPubTransactionsRI minedInBlockHeight(Integer minedInBlockHeight) {
    
    this.minedInBlockHeight = minedInBlockHeight;
    return this;
  }

   /**
   * Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.
   * @return minedInBlockHeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1903849", required = true, value = "Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.")

  public Integer getMinedInBlockHeight() {
    return minedInBlockHeight;
  }


  public void setMinedInBlockHeight(Integer minedInBlockHeight) {
    this.minedInBlockHeight = minedInBlockHeight;
  }


  public ListHDWalletXPubYPubZPubTransactionsRI recipients(List<ListHDWalletXPubYPubZPubTransactionsRIRecipients> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public ListHDWalletXPubYPubZPubTransactionsRI addRecipientsItem(ListHDWalletXPubYPubZPubTransactionsRIRecipients recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.
   * @return recipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.")

  public List<ListHDWalletXPubYPubZPubTransactionsRIRecipients> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<ListHDWalletXPubYPubZPubTransactionsRIRecipients> recipients) {
    this.recipients = recipients;
  }


  public ListHDWalletXPubYPubZPubTransactionsRI senders(List<ListHDWalletXPubYPubZPubTransactionsRISenders> senders) {
    
    this.senders = senders;
    return this;
  }

  public ListHDWalletXPubYPubZPubTransactionsRI addSendersItem(ListHDWalletXPubYPubZPubTransactionsRISenders sendersItem) {
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Represents a list of sender addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.
   * @return senders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents a list of sender addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.")

  public List<ListHDWalletXPubYPubZPubTransactionsRISenders> getSenders() {
    return senders;
  }


  public void setSenders(List<ListHDWalletXPubYPubZPubTransactionsRISenders> senders) {
    this.senders = senders;
  }


  public ListHDWalletXPubYPubZPubTransactionsRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1582202940", required = true, value = "Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public ListHDWalletXPubYPubZPubTransactionsRI transactionHash(String transactionHash) {
    
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Represents the same as &#x60;transactionId&#x60; for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols &#x60;hash&#x60; is different from &#x60;transactionId&#x60; for SegWit transactions.
   * @return transactionHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1ec73b0f61359927d02376b35993b756b1097cb9a857bec23da4c98c4977d2b2", required = true, value = "Represents the same as `transactionId` for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols `hash` is different from `transactionId` for SegWit transactions.")

  public String getTransactionHash() {
    return transactionHash;
  }


  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  public ListHDWalletXPubYPubZPubTransactionsRI transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4b66461bf88b61e1e4326356534c135129defb504c7acb2fd6c92697d79eb250", required = true, value = "Represents the unique identifier of a transaction, i.e. it could be `transactionId` in UTXO-based protocols like Bitcoin, and transaction `hash` in Ethereum blockchain.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public ListHDWalletXPubYPubZPubTransactionsRI fee(ListHDWalletXPubYPubZPubTransactionsRIFee fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListHDWalletXPubYPubZPubTransactionsRIFee getFee() {
    return fee;
  }


  public void setFee(ListHDWalletXPubYPubZPubTransactionsRIFee fee) {
    this.fee = fee;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListHDWalletXPubYPubZPubTransactionsRI listHDWalletXPubYPubZPubTransactionsRI = (ListHDWalletXPubYPubZPubTransactionsRI) o;
    return Objects.equals(this.index, listHDWalletXPubYPubZPubTransactionsRI.index) &&
        Objects.equals(this.minedInBlockHash, listHDWalletXPubYPubZPubTransactionsRI.minedInBlockHash) &&
        Objects.equals(this.minedInBlockHeight, listHDWalletXPubYPubZPubTransactionsRI.minedInBlockHeight) &&
        Objects.equals(this.recipients, listHDWalletXPubYPubZPubTransactionsRI.recipients) &&
        Objects.equals(this.senders, listHDWalletXPubYPubZPubTransactionsRI.senders) &&
        Objects.equals(this.timestamp, listHDWalletXPubYPubZPubTransactionsRI.timestamp) &&
        Objects.equals(this.transactionHash, listHDWalletXPubYPubZPubTransactionsRI.transactionHash) &&
        Objects.equals(this.transactionId, listHDWalletXPubYPubZPubTransactionsRI.transactionId) &&
        Objects.equals(this.fee, listHDWalletXPubYPubZPubTransactionsRI.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, minedInBlockHash, minedInBlockHeight, recipients, senders, timestamp, transactionHash, transactionId, fee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListHDWalletXPubYPubZPubTransactionsRI {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    minedInBlockHash: ").append(toIndentedString(minedInBlockHash)).append("\n");
    sb.append("    minedInBlockHeight: ").append(toIndentedString(minedInBlockHeight)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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
    openapiFields.add("index");
    openapiFields.add("minedInBlockHash");
    openapiFields.add("minedInBlockHeight");
    openapiFields.add("recipients");
    openapiFields.add("senders");
    openapiFields.add("timestamp");
    openapiFields.add("transactionHash");
    openapiFields.add("transactionId");
    openapiFields.add("fee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("index");
    openapiRequiredFields.add("minedInBlockHash");
    openapiRequiredFields.add("minedInBlockHeight");
    openapiRequiredFields.add("recipients");
    openapiRequiredFields.add("senders");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("transactionHash");
    openapiRequiredFields.add("transactionId");
    openapiRequiredFields.add("fee");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListHDWalletXPubYPubZPubTransactionsRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListHDWalletXPubYPubZPubTransactionsRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListHDWalletXPubYPubZPubTransactionsRI is not found in the empty JSON string", ListHDWalletXPubYPubZPubTransactionsRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListHDWalletXPubYPubZPubTransactionsRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListHDWalletXPubYPubZPubTransactionsRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListHDWalletXPubYPubZPubTransactionsRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("minedInBlockHash") != null && !jsonObj.get("minedInBlockHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minedInBlockHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minedInBlockHash").toString()));
      }
      JsonArray jsonArrayrecipients = jsonObj.getAsJsonArray("recipients");
      if (jsonArrayrecipients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("recipients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `recipients` to be an array in the JSON string but got `%s`", jsonObj.get("recipients").toString()));
        }

        // validate the optional field `recipients` (array)
        for (int i = 0; i < jsonArrayrecipients.size(); i++) {
          ListHDWalletXPubYPubZPubTransactionsRIRecipients.validateJsonObject(jsonArrayrecipients.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraysenders = jsonObj.getAsJsonArray("senders");
      if (jsonArraysenders != null) {
        // ensure the json data is an array
        if (!jsonObj.get("senders").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `senders` to be an array in the JSON string but got `%s`", jsonObj.get("senders").toString()));
        }

        // validate the optional field `senders` (array)
        for (int i = 0; i < jsonArraysenders.size(); i++) {
          ListHDWalletXPubYPubZPubTransactionsRISenders.validateJsonObject(jsonArraysenders.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("transactionHash") != null && !jsonObj.get("transactionHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionHash").toString()));
      }
      if (jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
      // validate the optional field `fee`
      if (jsonObj.getAsJsonObject("fee") != null) {
        ListHDWalletXPubYPubZPubTransactionsRIFee.validateJsonObject(jsonObj.getAsJsonObject("fee"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListHDWalletXPubYPubZPubTransactionsRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListHDWalletXPubYPubZPubTransactionsRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListHDWalletXPubYPubZPubTransactionsRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListHDWalletXPubYPubZPubTransactionsRI.class));

       return (TypeAdapter<T>) new TypeAdapter<ListHDWalletXPubYPubZPubTransactionsRI>() {
           @Override
           public void write(JsonWriter out, ListHDWalletXPubYPubZPubTransactionsRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListHDWalletXPubYPubZPubTransactionsRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListHDWalletXPubYPubZPubTransactionsRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListHDWalletXPubYPubZPubTransactionsRI
  * @throws IOException if the JSON string is invalid with respect to ListHDWalletXPubYPubZPubTransactionsRI
  */
  public static ListHDWalletXPubYPubZPubTransactionsRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListHDWalletXPubYPubZPubTransactionsRI.class);
  }

 /**
  * Convert an instance of ListHDWalletXPubYPubZPubTransactionsRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

