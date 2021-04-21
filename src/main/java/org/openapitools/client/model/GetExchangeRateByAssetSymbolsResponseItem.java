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
 * GetExchangeRateByAssetSymbolsResponseItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T16:59:17.199745Z[Etc/UTC]")
public class GetExchangeRateByAssetSymbolsResponseItem {
  public static final String SERIALIZED_NAME_CALCULATION_TIMESTAMP = "calculationTimestamp";
  @SerializedName(SERIALIZED_NAME_CALCULATION_TIMESTAMP)
  private Integer calculationTimestamp;

  public static final String SERIALIZED_NAME_FROM_ASSET_ID = "fromAssetId";
  @SerializedName(SERIALIZED_NAME_FROM_ASSET_ID)
  private String fromAssetId;

  public static final String SERIALIZED_NAME_FROM_ASSET_SYMBOL = "fromAssetSymbol";
  @SerializedName(SERIALIZED_NAME_FROM_ASSET_SYMBOL)
  private String fromAssetSymbol;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_TO_ASSET_ID = "toAssetId";
  @SerializedName(SERIALIZED_NAME_TO_ASSET_ID)
  private String toAssetId;

  public static final String SERIALIZED_NAME_TO_ASSET_SYMBOL = "toAssetSymbol";
  @SerializedName(SERIALIZED_NAME_TO_ASSET_SYMBOL)
  private String toAssetSymbol;


  public GetExchangeRateByAssetSymbolsResponseItem calculationTimestamp(Integer calculationTimestamp) {
    
    this.calculationTimestamp = calculationTimestamp;
    return this;
  }

   /**
   * Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp.
   * @return calculationTimestamp
  **/
  @ApiModelProperty(example = "1618577849", required = true, value = "Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp.")

  public Integer getCalculationTimestamp() {
    return calculationTimestamp;
  }


  public void setCalculationTimestamp(Integer calculationTimestamp) {
    this.calculationTimestamp = calculationTimestamp;
  }


  public GetExchangeRateByAssetSymbolsResponseItem fromAssetId(String fromAssetId) {
    
    this.fromAssetId = fromAssetId;
    return this;
  }

   /**
   * Defines the base asset Reference ID to get a rate for.
   * @return fromAssetId
  **/
  @ApiModelProperty(example = "5b1ea92e584bf50020130612", required = true, value = "Defines the base asset Reference ID to get a rate for.")

  public String getFromAssetId() {
    return fromAssetId;
  }


  public void setFromAssetId(String fromAssetId) {
    this.fromAssetId = fromAssetId;
  }


  public GetExchangeRateByAssetSymbolsResponseItem fromAssetSymbol(String fromAssetSymbol) {
    
    this.fromAssetSymbol = fromAssetSymbol;
    return this;
  }

   /**
   * Defines the base asset symbol to get a rate for.
   * @return fromAssetSymbol
  **/
  @ApiModelProperty(example = "BTC", required = true, value = "Defines the base asset symbol to get a rate for.")

  public String getFromAssetSymbol() {
    return fromAssetSymbol;
  }


  public void setFromAssetSymbol(String fromAssetSymbol) {
    this.fromAssetSymbol = fromAssetSymbol;
  }


  public GetExchangeRateByAssetSymbolsResponseItem rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Defines the exchange rate between assets calculated by weighted average of the last trades in every exchange for the last 24 hours by giving more weight to exchanges with higher volume.
   * @return rate
  **/
  @ApiModelProperty(example = "54768.26745499848", required = true, value = "Defines the exchange rate between assets calculated by weighted average of the last trades in every exchange for the last 24 hours by giving more weight to exchanges with higher volume.")

  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    this.rate = rate;
  }


  public GetExchangeRateByAssetSymbolsResponseItem toAssetId(String toAssetId) {
    
    this.toAssetId = toAssetId;
    return this;
  }

   /**
   * Defines the relation asset Reference ID in which the base asset rate will be displayed.
   * @return toAssetId
  **/
  @ApiModelProperty(example = "5b1ea92e584bf50020130615", required = true, value = "Defines the relation asset Reference ID in which the base asset rate will be displayed.")

  public String getToAssetId() {
    return toAssetId;
  }


  public void setToAssetId(String toAssetId) {
    this.toAssetId = toAssetId;
  }


  public GetExchangeRateByAssetSymbolsResponseItem toAssetSymbol(String toAssetSymbol) {
    
    this.toAssetSymbol = toAssetSymbol;
    return this;
  }

   /**
   * Defines the relation asset symbol in which the base asset rate will be displayed.
   * @return toAssetSymbol
  **/
  @ApiModelProperty(example = "USD", required = true, value = "Defines the relation asset symbol in which the base asset rate will be displayed.")

  public String getToAssetSymbol() {
    return toAssetSymbol;
  }


  public void setToAssetSymbol(String toAssetSymbol) {
    this.toAssetSymbol = toAssetSymbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExchangeRateByAssetSymbolsResponseItem getExchangeRateByAssetSymbolsResponseItem = (GetExchangeRateByAssetSymbolsResponseItem) o;
    return Objects.equals(this.calculationTimestamp, getExchangeRateByAssetSymbolsResponseItem.calculationTimestamp) &&
        Objects.equals(this.fromAssetId, getExchangeRateByAssetSymbolsResponseItem.fromAssetId) &&
        Objects.equals(this.fromAssetSymbol, getExchangeRateByAssetSymbolsResponseItem.fromAssetSymbol) &&
        Objects.equals(this.rate, getExchangeRateByAssetSymbolsResponseItem.rate) &&
        Objects.equals(this.toAssetId, getExchangeRateByAssetSymbolsResponseItem.toAssetId) &&
        Objects.equals(this.toAssetSymbol, getExchangeRateByAssetSymbolsResponseItem.toAssetSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationTimestamp, fromAssetId, fromAssetSymbol, rate, toAssetId, toAssetSymbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExchangeRateByAssetSymbolsResponseItem {\n");
    sb.append("    calculationTimestamp: ").append(toIndentedString(calculationTimestamp)).append("\n");
    sb.append("    fromAssetId: ").append(toIndentedString(fromAssetId)).append("\n");
    sb.append("    fromAssetSymbol: ").append(toIndentedString(fromAssetSymbol)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    toAssetId: ").append(toIndentedString(toAssetId)).append("\n");
    sb.append("    toAssetSymbol: ").append(toIndentedString(toAssetSymbol)).append("\n");
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

