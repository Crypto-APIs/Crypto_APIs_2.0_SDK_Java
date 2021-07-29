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
 * Defines the logo of the asset.
 */
@ApiModel(description = "Defines the logo of the asset.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class ListAssetsDetailsRIAssetLogo {
  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  private String encoding;

  public static final String SERIALIZED_NAME_IMAGE_DATA = "imageData";
  @SerializedName(SERIALIZED_NAME_IMAGE_DATA)
  private String imageData;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;


  public ListAssetsDetailsRIAssetLogo encoding(String encoding) {
    
    this.encoding = encoding;
    return this;
  }

   /**
   * Defines the encoding of the image data which is usually base64.
   * @return encoding
  **/
  @ApiModelProperty(example = "base64", required = true, value = "Defines the encoding of the image data which is usually base64.")

  public String getEncoding() {
    return encoding;
  }


  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }


  public ListAssetsDetailsRIAssetLogo imageData(String imageData) {
    
    this.imageData = imageData;
    return this;
  }

   /**
   * Defines the encoded image data as a string.
   * @return imageData
  **/
  @ApiModelProperty(example = "PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIzMiIgaGVpZ2h0PSIzMiI+PGcgZmlsbD0ibm9uZSIgZmlsbC1ydWxlPSJldmVub2RkIj48Y2lyY2xlIGN4PSIxNiIgY3k9IjE2IiByPSIxNiIgZmlsbD0iIzYyN0VFQSIvPjxnIGZpbGw9IiNGRkYiIGZpbGwtcnVsZT0ibm9uemVybyI+PHBhdGggZmlsbC1vcGFjaXR5PSIuNjAyIiBkPSJNMTYuNDk4IDR2OC44N2w3LjQ5NyAzLjM1eiIvPjxwYXRoIGQ9Ik0xNi40OTggNEw5IDE2LjIybDcuNDk4LTMuMzV6Ii8+PHBhdGggZmlsbC1vcGFjaXR5PSIuNjAyIiBkPSJNMTYuNDk4IDIxLjk2OHY2LjAyN0wyNCAxNy42MTZ6Ii8+PHBhdGggZD0iTTE2LjQ5OCAyNy45OTV2LTYuMDI4TDkgMTcuNjE2eiIvPjxwYXRoIGZpbGwtb3BhY2l0eT0iLjIiIGQ9Ik0xNi40OTggMjAuNTczbDcuNDk3LTQuMzUzLTcuNDk3LTMuMzQ4eiIvPjxwYXRoIGZpbGwtb3BhY2l0eT0iLjYwMiIgZD0iTTkgMTYuMjJsNy40OTggNC4zNTN2LTcuNzAxeiIvPjwvZz48L2c+PC9zdmc+", required = true, value = "Defines the encoded image data as a string.")

  public String getImageData() {
    return imageData;
  }


  public void setImageData(String imageData) {
    this.imageData = imageData;
  }


  public ListAssetsDetailsRIAssetLogo mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Defines the image type of the logo - jpg, png, svg, etc.
   * @return mimeType
  **/
  @ApiModelProperty(example = "\"image/svg+xml\"", required = true, value = "Defines the image type of the logo - jpg, png, svg, etc.")

  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAssetsDetailsRIAssetLogo listAssetsDetailsRIAssetLogo = (ListAssetsDetailsRIAssetLogo) o;
    return Objects.equals(this.encoding, listAssetsDetailsRIAssetLogo.encoding) &&
        Objects.equals(this.imageData, listAssetsDetailsRIAssetLogo.imageData) &&
        Objects.equals(this.mimeType, listAssetsDetailsRIAssetLogo.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, imageData, mimeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAssetsDetailsRIAssetLogo {\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

