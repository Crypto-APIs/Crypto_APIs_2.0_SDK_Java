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
 * GetContractDetailsByAddressRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class GetContractDetailsByAddressRI {
  public static final String SERIALIZED_NAME_CONFIRMED_BALANCE = "confirmedBalance";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_BALANCE)
  private String confirmedBalance;

  public static final String SERIALIZED_NAME_CREATOR_ADDRESS = "creatorAddress";
  @SerializedName(SERIALIZED_NAME_CREATOR_ADDRESS)
  private String creatorAddress;

  public static final String SERIALIZED_NAME_TOKEN_DECIMALS = "tokenDecimals";
  @SerializedName(SERIALIZED_NAME_TOKEN_DECIMALS)
  private String tokenDecimals;

  public static final String SERIALIZED_NAME_TOKEN_NAME = "tokenName";
  @SerializedName(SERIALIZED_NAME_TOKEN_NAME)
  private String tokenName;

  public static final String SERIALIZED_NAME_TOKEN_SYMBOL = "tokenSymbol";
  @SerializedName(SERIALIZED_NAME_TOKEN_SYMBOL)
  private String tokenSymbol;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "tokenType";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public static final String SERIALIZED_NAME_TOKENS_BALANCE = "tokensBalance";
  @SerializedName(SERIALIZED_NAME_TOKENS_BALANCE)
  private String tokensBalance;

  public static final String SERIALIZED_NAME_TOTAL_SUPPLY = "totalSupply";
  @SerializedName(SERIALIZED_NAME_TOTAL_SUPPLY)
  private String totalSupply;


  public GetContractDetailsByAddressRI confirmedBalance(String confirmedBalance) {
    
    this.confirmedBalance = confirmedBalance;
    return this;
  }

   /**
   * Token balance
   * @return confirmedBalance
  **/
  @ApiModelProperty(required = true, value = "Token balance")

  public String getConfirmedBalance() {
    return confirmedBalance;
  }


  public void setConfirmedBalance(String confirmedBalance) {
    this.confirmedBalance = confirmedBalance;
  }


  public GetContractDetailsByAddressRI creatorAddress(String creatorAddress) {
    
    this.creatorAddress = creatorAddress;
    return this;
  }

   /**
   * Token creator
   * @return creatorAddress
  **/
  @ApiModelProperty(required = true, value = "Token creator")

  public String getCreatorAddress() {
    return creatorAddress;
  }


  public void setCreatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
  }


  public GetContractDetailsByAddressRI tokenDecimals(String tokenDecimals) {
    
    this.tokenDecimals = tokenDecimals;
    return this;
  }

   /**
   * Number of decimals
   * @return tokenDecimals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of decimals")

  public String getTokenDecimals() {
    return tokenDecimals;
  }


  public void setTokenDecimals(String tokenDecimals) {
    this.tokenDecimals = tokenDecimals;
  }


  public GetContractDetailsByAddressRI tokenName(String tokenName) {
    
    this.tokenName = tokenName;
    return this;
  }

   /**
   * Token name
   * @return tokenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token name")

  public String getTokenName() {
    return tokenName;
  }


  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }


  public GetContractDetailsByAddressRI tokenSymbol(String tokenSymbol) {
    
    this.tokenSymbol = tokenSymbol;
    return this;
  }

   /**
   * Token symbol
   * @return tokenSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token symbol")

  public String getTokenSymbol() {
    return tokenSymbol;
  }


  public void setTokenSymbol(String tokenSymbol) {
    this.tokenSymbol = tokenSymbol;
  }


  public GetContractDetailsByAddressRI tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Token type
   * @return tokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token type")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  public GetContractDetailsByAddressRI tokensBalance(String tokensBalance) {
    
    this.tokensBalance = tokensBalance;
    return this;
  }

   /**
   * Token balance
   * @return tokensBalance
  **/
  @ApiModelProperty(required = true, value = "Token balance")

  public String getTokensBalance() {
    return tokensBalance;
  }


  public void setTokensBalance(String tokensBalance) {
    this.tokensBalance = tokensBalance;
  }


  public GetContractDetailsByAddressRI totalSupply(String totalSupply) {
    
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * Token total supply
   * @return totalSupply
  **/
  @ApiModelProperty(required = true, value = "Token total supply")

  public String getTotalSupply() {
    return totalSupply;
  }


  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractDetailsByAddressRI getContractDetailsByAddressRI = (GetContractDetailsByAddressRI) o;
    return Objects.equals(this.confirmedBalance, getContractDetailsByAddressRI.confirmedBalance) &&
        Objects.equals(this.creatorAddress, getContractDetailsByAddressRI.creatorAddress) &&
        Objects.equals(this.tokenDecimals, getContractDetailsByAddressRI.tokenDecimals) &&
        Objects.equals(this.tokenName, getContractDetailsByAddressRI.tokenName) &&
        Objects.equals(this.tokenSymbol, getContractDetailsByAddressRI.tokenSymbol) &&
        Objects.equals(this.tokenType, getContractDetailsByAddressRI.tokenType) &&
        Objects.equals(this.tokensBalance, getContractDetailsByAddressRI.tokensBalance) &&
        Objects.equals(this.totalSupply, getContractDetailsByAddressRI.totalSupply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmedBalance, creatorAddress, tokenDecimals, tokenName, tokenSymbol, tokenType, tokensBalance, totalSupply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractDetailsByAddressRI {\n");
    sb.append("    confirmedBalance: ").append(toIndentedString(confirmedBalance)).append("\n");
    sb.append("    creatorAddress: ").append(toIndentedString(creatorAddress)).append("\n");
    sb.append("    tokenDecimals: ").append(toIndentedString(tokenDecimals)).append("\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    tokenSymbol: ").append(toIndentedString(tokenSymbol)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    tokensBalance: ").append(toIndentedString(tokensBalance)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
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
