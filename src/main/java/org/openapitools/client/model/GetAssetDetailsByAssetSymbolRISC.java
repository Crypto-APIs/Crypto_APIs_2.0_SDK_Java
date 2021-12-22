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

/**
 * Crypto Type Data
 */
@ApiModel(description = "Crypto Type Data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class GetAssetDetailsByAssetSymbolRISC {
  public static final String SERIALIZED_NAME_1HOUR_PRICE_CHANGE_IN_PERCENTAGE = "1HourPriceChangeInPercentage";
  @SerializedName(SERIALIZED_NAME_1HOUR_PRICE_CHANGE_IN_PERCENTAGE)
  private String _1hourPriceChangeInPercentage;

  public static final String SERIALIZED_NAME_1WEEK_PRICE_CHANGE_IN_PERCENTAGE = "1WeekPriceChangeInPercentage";
  @SerializedName(SERIALIZED_NAME_1WEEK_PRICE_CHANGE_IN_PERCENTAGE)
  private String _1weekPriceChangeInPercentage;

  public static final String SERIALIZED_NAME_24HOURS_PRICE_CHANGE_IN_PERCENTAGE = "24HoursPriceChangeInPercentage";
  @SerializedName(SERIALIZED_NAME_24HOURS_PRICE_CHANGE_IN_PERCENTAGE)
  private String _24hoursPriceChangeInPercentage;

  public static final String SERIALIZED_NAME_24HOURS_TRADING_VOLUME = "24HoursTradingVolume";
  @SerializedName(SERIALIZED_NAME_24HOURS_TRADING_VOLUME)
  private String _24hoursTradingVolume;

  /**
   * Defines the type of the supported asset. This could be either \&quot;crypto\&quot; or \&quot;fiat\&quot;.
   */
  @JsonAdapter(AssetTypeEnum.Adapter.class)
  public enum AssetTypeEnum {
    COIN("coin"),
    
    TOKEN("token");

    private String value;

    AssetTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssetTypeEnum fromValue(String value) {
      for (AssetTypeEnum b : AssetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssetTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssetTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssetTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ASSET_TYPE = "assetType";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private AssetTypeEnum assetType;

  public static final String SERIALIZED_NAME_CIRCULATING_SUPPLY = "circulatingSupply";
  @SerializedName(SERIALIZED_NAME_CIRCULATING_SUPPLY)
  private String circulatingSupply;

  public static final String SERIALIZED_NAME_MARKET_CAP_IN_U_S_D = "marketCapInUSD";
  @SerializedName(SERIALIZED_NAME_MARKET_CAP_IN_U_S_D)
  private String marketCapInUSD;

  public static final String SERIALIZED_NAME_MAX_SUPPLY = "maxSupply";
  @SerializedName(SERIALIZED_NAME_MAX_SUPPLY)
  private String maxSupply;

  public GetAssetDetailsByAssetSymbolRISC() { 
  }

  public GetAssetDetailsByAssetSymbolRISC _1hourPriceChangeInPercentage(String _1hourPriceChangeInPercentage) {
    
    this._1hourPriceChangeInPercentage = _1hourPriceChangeInPercentage;
    return this;
  }

   /**
   * Represents the percentage of the asset&#39;s current price against the its price from 1 hour ago.
   * @return _1hourPriceChangeInPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "-0.4277852328344024", required = true, value = "Represents the percentage of the asset's current price against the its price from 1 hour ago.")

  public String get1hourPriceChangeInPercentage() {
    return _1hourPriceChangeInPercentage;
  }


  public void set1hourPriceChangeInPercentage(String _1hourPriceChangeInPercentage) {
    this._1hourPriceChangeInPercentage = _1hourPriceChangeInPercentage;
  }


  public GetAssetDetailsByAssetSymbolRISC _1weekPriceChangeInPercentage(String _1weekPriceChangeInPercentage) {
    
    this._1weekPriceChangeInPercentage = _1weekPriceChangeInPercentage;
    return this;
  }

   /**
   * Represents the percentage of the asset&#39;s current price against the its price from 1 week ago.
   * @return _1weekPriceChangeInPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1.6572304104646762", required = true, value = "Represents the percentage of the asset's current price against the its price from 1 week ago.")

  public String get1weekPriceChangeInPercentage() {
    return _1weekPriceChangeInPercentage;
  }


  public void set1weekPriceChangeInPercentage(String _1weekPriceChangeInPercentage) {
    this._1weekPriceChangeInPercentage = _1weekPriceChangeInPercentage;
  }


  public GetAssetDetailsByAssetSymbolRISC _24hoursPriceChangeInPercentage(String _24hoursPriceChangeInPercentage) {
    
    this._24hoursPriceChangeInPercentage = _24hoursPriceChangeInPercentage;
    return this;
  }

   /**
   * Represents the percentage of the asset&#39;s current price against the its price from 24 hours ago.
   * @return _24hoursPriceChangeInPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "-0.059688916478600924", required = true, value = "Represents the percentage of the asset's current price against the its price from 24 hours ago.")

  public String get24hoursPriceChangeInPercentage() {
    return _24hoursPriceChangeInPercentage;
  }


  public void set24hoursPriceChangeInPercentage(String _24hoursPriceChangeInPercentage) {
    this._24hoursPriceChangeInPercentage = _24hoursPriceChangeInPercentage;
  }


  public GetAssetDetailsByAssetSymbolRISC _24hoursTradingVolume(String _24hoursTradingVolume) {
    
    this._24hoursTradingVolume = _24hoursTradingVolume;
    return this;
  }

   /**
   * Represents the trading volume of the asset for the time frame of 24 hours.
   * @return _24hoursTradingVolume
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3116834672.508857", required = true, value = "Represents the trading volume of the asset for the time frame of 24 hours.")

  public String get24hoursTradingVolume() {
    return _24hoursTradingVolume;
  }


  public void set24hoursTradingVolume(String _24hoursTradingVolume) {
    this._24hoursTradingVolume = _24hoursTradingVolume;
  }


  public GetAssetDetailsByAssetSymbolRISC assetType(AssetTypeEnum assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Defines the type of the supported asset. This could be either \&quot;crypto\&quot; or \&quot;fiat\&quot;.
   * @return assetType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "coin", required = true, value = "Defines the type of the supported asset. This could be either \"crypto\" or \"fiat\".")

  public AssetTypeEnum getAssetType() {
    return assetType;
  }


  public void setAssetType(AssetTypeEnum assetType) {
    this.assetType = assetType;
  }


  public GetAssetDetailsByAssetSymbolRISC circulatingSupply(String circulatingSupply) {
    
    this.circulatingSupply = circulatingSupply;
    return this;
  }

   /**
   * Represents the amount of the asset that is circulating on the market and in public hands.
   * @return circulatingSupply
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "18562881", required = true, value = "Represents the amount of the asset that is circulating on the market and in public hands.")

  public String getCirculatingSupply() {
    return circulatingSupply;
  }


  public void setCirculatingSupply(String circulatingSupply) {
    this.circulatingSupply = circulatingSupply;
  }


  public GetAssetDetailsByAssetSymbolRISC marketCapInUSD(String marketCapInUSD) {
    
    this.marketCapInUSD = marketCapInUSD;
    return this;
  }

   /**
   * Defines the total market value of the asset&#39;s circulating supply in USD.
   * @return marketCapInUSD
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1146119021006.8835", required = true, value = "Defines the total market value of the asset's circulating supply in USD.")

  public String getMarketCapInUSD() {
    return marketCapInUSD;
  }


  public void setMarketCapInUSD(String marketCapInUSD) {
    this.marketCapInUSD = marketCapInUSD;
  }


  public GetAssetDetailsByAssetSymbolRISC maxSupply(String maxSupply) {
    
    this.maxSupply = maxSupply;
    return this;
  }

   /**
   * Represents the maximum amount of all coins of a specific asset that will ever exist in its lifetime.
   * @return maxSupply
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "21000000", required = true, value = "Represents the maximum amount of all coins of a specific asset that will ever exist in its lifetime.")

  public String getMaxSupply() {
    return maxSupply;
  }


  public void setMaxSupply(String maxSupply) {
    this.maxSupply = maxSupply;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAssetDetailsByAssetSymbolRISC getAssetDetailsByAssetSymbolRISC = (GetAssetDetailsByAssetSymbolRISC) o;
    return Objects.equals(this._1hourPriceChangeInPercentage, getAssetDetailsByAssetSymbolRISC._1hourPriceChangeInPercentage) &&
        Objects.equals(this._1weekPriceChangeInPercentage, getAssetDetailsByAssetSymbolRISC._1weekPriceChangeInPercentage) &&
        Objects.equals(this._24hoursPriceChangeInPercentage, getAssetDetailsByAssetSymbolRISC._24hoursPriceChangeInPercentage) &&
        Objects.equals(this._24hoursTradingVolume, getAssetDetailsByAssetSymbolRISC._24hoursTradingVolume) &&
        Objects.equals(this.assetType, getAssetDetailsByAssetSymbolRISC.assetType) &&
        Objects.equals(this.circulatingSupply, getAssetDetailsByAssetSymbolRISC.circulatingSupply) &&
        Objects.equals(this.marketCapInUSD, getAssetDetailsByAssetSymbolRISC.marketCapInUSD) &&
        Objects.equals(this.maxSupply, getAssetDetailsByAssetSymbolRISC.maxSupply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1hourPriceChangeInPercentage, _1weekPriceChangeInPercentage, _24hoursPriceChangeInPercentage, _24hoursTradingVolume, assetType, circulatingSupply, marketCapInUSD, maxSupply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAssetDetailsByAssetSymbolRISC {\n");
    sb.append("    _1hourPriceChangeInPercentage: ").append(toIndentedString(_1hourPriceChangeInPercentage)).append("\n");
    sb.append("    _1weekPriceChangeInPercentage: ").append(toIndentedString(_1weekPriceChangeInPercentage)).append("\n");
    sb.append("    _24hoursPriceChangeInPercentage: ").append(toIndentedString(_24hoursPriceChangeInPercentage)).append("\n");
    sb.append("    _24hoursTradingVolume: ").append(toIndentedString(_24hoursTradingVolume)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    circulatingSupply: ").append(toIndentedString(circulatingSupply)).append("\n");
    sb.append("    marketCapInUSD: ").append(toIndentedString(marketCapInUSD)).append("\n");
    sb.append("    maxSupply: ").append(toIndentedString(maxSupply)).append("\n");
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

