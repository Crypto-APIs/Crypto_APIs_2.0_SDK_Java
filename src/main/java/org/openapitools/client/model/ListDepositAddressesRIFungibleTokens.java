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
 * ListDepositAddressesRIFungibleTokens
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class ListDepositAddressesRIFungibleTokens {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_TOKEN_DECIMALS = "tokenDecimals";
  @SerializedName(SERIALIZED_NAME_TOKEN_DECIMALS)
  private Integer tokenDecimals;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ListDepositAddressesRIFungibleTokens() { 
  }

  public ListDepositAddressesRIFungibleTokens amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of the fungible tokens.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.254", required = true, value = "Defines the amount of the fungible tokens.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ListDepositAddressesRIFungibleTokens identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Defines the specific token identifier. For Bitcoin-based transactions it should be the propertyId and for Ethereum-based transactions - the contract.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xdac17f958d2ee523a2206206994597c13d831ec7", required = true, value = "Defines the specific token identifier. For Bitcoin-based transactions it should be the propertyId and for Ethereum-based transactions - the contract.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public ListDepositAddressesRIFungibleTokens name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Defines the token&#39;s name as a string.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Tether USD", required = true, value = "Defines the token's name as a string.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ListDepositAddressesRIFungibleTokens symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Defines the symbol of the fungible tokens.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USDT", required = true, value = "Defines the symbol of the fungible tokens.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public ListDepositAddressesRIFungibleTokens tokenDecimals(Integer tokenDecimals) {
    
    this.tokenDecimals = tokenDecimals;
    return this;
  }

   /**
   * Defines the decimals of the token, i.e. the number of digits that come after the decimal coma of the token.
   * @return tokenDecimals
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6", required = true, value = "Defines the decimals of the token, i.e. the number of digits that come after the decimal coma of the token.")

  public Integer getTokenDecimals() {
    return tokenDecimals;
  }


  public void setTokenDecimals(Integer tokenDecimals) {
    this.tokenDecimals = tokenDecimals;
  }


  public ListDepositAddressesRIFungibleTokens type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the specific token type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ERC-20", required = true, value = "Defines the specific token type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDepositAddressesRIFungibleTokens listDepositAddressesRIFungibleTokens = (ListDepositAddressesRIFungibleTokens) o;
    return Objects.equals(this.amount, listDepositAddressesRIFungibleTokens.amount) &&
        Objects.equals(this.identifier, listDepositAddressesRIFungibleTokens.identifier) &&
        Objects.equals(this.name, listDepositAddressesRIFungibleTokens.name) &&
        Objects.equals(this.symbol, listDepositAddressesRIFungibleTokens.symbol) &&
        Objects.equals(this.tokenDecimals, listDepositAddressesRIFungibleTokens.tokenDecimals) &&
        Objects.equals(this.type, listDepositAddressesRIFungibleTokens.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, identifier, name, symbol, tokenDecimals, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDepositAddressesRIFungibleTokens {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tokenDecimals: ").append(toIndentedString(tokenDecimals)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

