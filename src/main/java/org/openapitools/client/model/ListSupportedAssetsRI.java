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
 * ListSupportedAssetsRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class ListSupportedAssetsRI {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_ASSET_NAME = "assetName";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName;

  public static final String SERIALIZED_NAME_ASSET_SYMBOL = "assetSymbol";
  @SerializedName(SERIALIZED_NAME_ASSET_SYMBOL)
  private String assetSymbol;

  /**
   * Defines the type of the supported asset. This could be either \&quot;crypto\&quot; or \&quot;fiat\&quot;.
   */
  @JsonAdapter(AssetTypeEnum.Adapter.class)
  public enum AssetTypeEnum {
    FIAT("fiat"),
    
    CRYPTO("crypto");

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

  public static final String SERIALIZED_NAME_ORIGINAL_SYMBOL = "originalSymbol";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_SYMBOL)
  private String originalSymbol;


  public ListSupportedAssetsRI assetId(String assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * Defines the unique ID of the specific asset.
   * @return assetId
  **/
  @ApiModelProperty(example = "5b1ea92e584bf50020130615", required = true, value = "Defines the unique ID of the specific asset.")

  public String getAssetId() {
    return assetId;
  }


  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public ListSupportedAssetsRI assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * Specifies the name of the asset in question.
   * @return assetName
  **/
  @ApiModelProperty(example = "Bitcoin", required = true, value = "Specifies the name of the asset in question.")

  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public ListSupportedAssetsRI assetSymbol(String assetSymbol) {
    
    this.assetSymbol = assetSymbol;
    return this;
  }

   /**
   * Specifies the asset&#39;s unique symbol in the Crypto APIs listings.
   * @return assetSymbol
  **/
  @ApiModelProperty(example = "BTC", required = true, value = "Specifies the asset's unique symbol in the Crypto APIs listings.")

  public String getAssetSymbol() {
    return assetSymbol;
  }


  public void setAssetSymbol(String assetSymbol) {
    this.assetSymbol = assetSymbol;
  }


  public ListSupportedAssetsRI assetType(AssetTypeEnum assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Defines the type of the supported asset. This could be either \&quot;crypto\&quot; or \&quot;fiat\&quot;.
   * @return assetType
  **/
  @ApiModelProperty(example = "crypto", required = true, value = "Defines the type of the supported asset. This could be either \"crypto\" or \"fiat\".")

  public AssetTypeEnum getAssetType() {
    return assetType;
  }


  public void setAssetType(AssetTypeEnum assetType) {
    this.assetType = assetType;
  }


  public ListSupportedAssetsRI originalSymbol(String originalSymbol) {
    
    this.originalSymbol = originalSymbol;
    return this;
  }

   /**
   * Specifies the asset&#39;s original symbol as introduced by its founders.
   * @return originalSymbol
  **/
  @ApiModelProperty(example = "BTC", required = true, value = "Specifies the asset's original symbol as introduced by its founders.")

  public String getOriginalSymbol() {
    return originalSymbol;
  }


  public void setOriginalSymbol(String originalSymbol) {
    this.originalSymbol = originalSymbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSupportedAssetsRI listSupportedAssetsRI = (ListSupportedAssetsRI) o;
    return Objects.equals(this.assetId, listSupportedAssetsRI.assetId) &&
        Objects.equals(this.assetName, listSupportedAssetsRI.assetName) &&
        Objects.equals(this.assetSymbol, listSupportedAssetsRI.assetSymbol) &&
        Objects.equals(this.assetType, listSupportedAssetsRI.assetType) &&
        Objects.equals(this.originalSymbol, listSupportedAssetsRI.originalSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetName, assetSymbol, assetType, originalSymbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSupportedAssetsRI {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    assetSymbol: ").append(toIndentedString(assetSymbol)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    originalSymbol: ").append(toIndentedString(originalSymbol)).append("\n");
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

