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
import org.openapitools.client.model.ListZilliqaTransactionsByBlockHashRI;

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
 * ListZilliqaTransactionsByBlockHashRData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListZilliqaTransactionsByBlockHashRData {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ListZilliqaTransactionsByBlockHashRI> items = new ArrayList<>();

  public ListZilliqaTransactionsByBlockHashRData() { 
  }

  public ListZilliqaTransactionsByBlockHashRData limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Defines how many items should be returned in the response per page basis.
   * @return limit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "50", required = true, value = "Defines how many items should be returned in the response per page basis.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public ListZilliqaTransactionsByBlockHashRData offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The starting index of the response items, i.e. where the response should start listing the returned items.
   * @return offset
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "The starting index of the response items, i.e. where the response should start listing the returned items.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public ListZilliqaTransactionsByBlockHashRData total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Defines the total number of items returned in the response.
   * @return total
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "Defines the total number of items returned in the response.")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public ListZilliqaTransactionsByBlockHashRData items(List<ListZilliqaTransactionsByBlockHashRI> items) {
    
    this.items = items;
    return this;
  }

  public ListZilliqaTransactionsByBlockHashRData addItemsItem(ListZilliqaTransactionsByBlockHashRI itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[]", required = true, value = "")

  public List<ListZilliqaTransactionsByBlockHashRI> getItems() {
    return items;
  }


  public void setItems(List<ListZilliqaTransactionsByBlockHashRI> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListZilliqaTransactionsByBlockHashRData listZilliqaTransactionsByBlockHashRData = (ListZilliqaTransactionsByBlockHashRData) o;
    return Objects.equals(this.limit, listZilliqaTransactionsByBlockHashRData.limit) &&
        Objects.equals(this.offset, listZilliqaTransactionsByBlockHashRData.offset) &&
        Objects.equals(this.total, listZilliqaTransactionsByBlockHashRData.total) &&
        Objects.equals(this.items, listZilliqaTransactionsByBlockHashRData.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, total, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListZilliqaTransactionsByBlockHashRData {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("total");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("limit");
    openapiRequiredFields.add("offset");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("items");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListZilliqaTransactionsByBlockHashRData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListZilliqaTransactionsByBlockHashRData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListZilliqaTransactionsByBlockHashRData is not found in the empty JSON string", ListZilliqaTransactionsByBlockHashRData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListZilliqaTransactionsByBlockHashRData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListZilliqaTransactionsByBlockHashRData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListZilliqaTransactionsByBlockHashRData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          ListZilliqaTransactionsByBlockHashRI.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListZilliqaTransactionsByBlockHashRData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListZilliqaTransactionsByBlockHashRData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListZilliqaTransactionsByBlockHashRData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListZilliqaTransactionsByBlockHashRData.class));

       return (TypeAdapter<T>) new TypeAdapter<ListZilliqaTransactionsByBlockHashRData>() {
           @Override
           public void write(JsonWriter out, ListZilliqaTransactionsByBlockHashRData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListZilliqaTransactionsByBlockHashRData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListZilliqaTransactionsByBlockHashRData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListZilliqaTransactionsByBlockHashRData
  * @throws IOException if the JSON string is invalid with respect to ListZilliqaTransactionsByBlockHashRData
  */
  public static ListZilliqaTransactionsByBlockHashRData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListZilliqaTransactionsByBlockHashRData.class);
  }

 /**
  * Convert an instance of ListZilliqaTransactionsByBlockHashRData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

