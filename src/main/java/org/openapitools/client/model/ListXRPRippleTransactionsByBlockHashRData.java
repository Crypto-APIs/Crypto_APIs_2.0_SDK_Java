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
import org.openapitools.client.model.ListXRPRippleTransactionsByBlockHashRI;

/**
 * ListXRPRippleTransactionsByBlockHashRData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class ListXRPRippleTransactionsByBlockHashRData {
  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ListXRPRippleTransactionsByBlockHashRI> items = new ArrayList<ListXRPRippleTransactionsByBlockHashRI>();

  public ListXRPRippleTransactionsByBlockHashRData() { 
  }

  public ListXRPRippleTransactionsByBlockHashRData offset(Integer offset) {
    
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


  public ListXRPRippleTransactionsByBlockHashRData limit(Integer limit) {
    
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


  public ListXRPRippleTransactionsByBlockHashRData total(Integer total) {
    
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


  public ListXRPRippleTransactionsByBlockHashRData items(List<ListXRPRippleTransactionsByBlockHashRI> items) {
    
    this.items = items;
    return this;
  }

  public ListXRPRippleTransactionsByBlockHashRData addItemsItem(ListXRPRippleTransactionsByBlockHashRI itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[]", required = true, value = "")

  public List<ListXRPRippleTransactionsByBlockHashRI> getItems() {
    return items;
  }


  public void setItems(List<ListXRPRippleTransactionsByBlockHashRI> items) {
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
    ListXRPRippleTransactionsByBlockHashRData listXRPRippleTransactionsByBlockHashRData = (ListXRPRippleTransactionsByBlockHashRData) o;
    return Objects.equals(this.offset, listXRPRippleTransactionsByBlockHashRData.offset) &&
        Objects.equals(this.limit, listXRPRippleTransactionsByBlockHashRData.limit) &&
        Objects.equals(this.total, listXRPRippleTransactionsByBlockHashRData.total) &&
        Objects.equals(this.items, listXRPRippleTransactionsByBlockHashRData.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, total, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListXRPRippleTransactionsByBlockHashRData {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

}

