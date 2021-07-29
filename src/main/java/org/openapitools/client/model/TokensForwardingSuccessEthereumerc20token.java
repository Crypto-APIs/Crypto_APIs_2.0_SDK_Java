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
 * ethereumERC20Token
 */
@ApiModel(description = "ethereumERC20Token")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class TokensForwardingSuccessEthereumerc20token {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_DECIMALS = "decimals";
  @SerializedName(SERIALIZED_NAME_DECIMALS)
  private String decimals;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contractAddress";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;


  public TokensForwardingSuccessEthereumerc20token name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the token.
   * @return name
  **/
  @ApiModelProperty(example = "Tether USD", required = true, value = "Specifies the name of the token.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TokensForwardingSuccessEthereumerc20token symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Specifies an identifier of the token, where up to five alphanumeric characters can be used for it.
   * @return symbol
  **/
  @ApiModelProperty(example = "USDT", required = true, value = "Specifies an identifier of the token, where up to five alphanumeric characters can be used for it.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public TokensForwardingSuccessEthereumerc20token decimals(String decimals) {
    
    this.decimals = decimals;
    return this;
  }

   /**
   * Defines how many decimals can be used to break the token.
   * @return decimals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "Defines how many decimals can be used to break the token.")

  public String getDecimals() {
    return decimals;
  }


  public void setDecimals(String decimals) {
    this.decimals = decimals;
  }


  public TokensForwardingSuccessEthereumerc20token amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of tokens sent with the confirmed transaction.
   * @return amount
  **/
  @ApiModelProperty(example = "9.5", required = true, value = "Defines the amount of tokens sent with the confirmed transaction.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TokensForwardingSuccessEthereumerc20token contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Defines the address of the contract.
   * @return contractAddress
  **/
  @ApiModelProperty(example = "0xdaF17f958d2ee523a2206206994597c13t831ec6", required = true, value = "Defines the address of the contract.")

  public String getContractAddress() {
    return contractAddress;
  }


  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokensForwardingSuccessEthereumerc20token tokensForwardingSuccessEthereumerc20token = (TokensForwardingSuccessEthereumerc20token) o;
    return Objects.equals(this.name, tokensForwardingSuccessEthereumerc20token.name) &&
        Objects.equals(this.symbol, tokensForwardingSuccessEthereumerc20token.symbol) &&
        Objects.equals(this.decimals, tokensForwardingSuccessEthereumerc20token.decimals) &&
        Objects.equals(this.amount, tokensForwardingSuccessEthereumerc20token.amount) &&
        Objects.equals(this.contractAddress, tokensForwardingSuccessEthereumerc20token.contractAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, symbol, decimals, amount, contractAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokensForwardingSuccessEthereumerc20token {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
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

