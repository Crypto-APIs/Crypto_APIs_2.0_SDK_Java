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
 * ListTokensByAddressRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class ListTokensByAddressRI {
  public static final String SERIALIZED_NAME_CONFIRMED_BALANCE = "confirmedBalance";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_BALANCE)
  private String confirmedBalance;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contractAddress";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ListTokensByAddressRI confirmedBalance(String confirmedBalance) {
    
    this.confirmedBalance = confirmedBalance;
    return this;
  }

   /**
   * Defines the token balance that has been confirmed.
   * @return confirmedBalance
  **/
  @ApiModelProperty(example = "287090.926632", required = true, value = "Defines the token balance that has been confirmed.")

  public String getConfirmedBalance() {
    return confirmedBalance;
  }


  public void setConfirmedBalance(String confirmedBalance) {
    this.confirmedBalance = confirmedBalance;
  }


  public ListTokensByAddressRI contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Represents the contract address of the token, which controls its logic. It is not the address that holds the tokens.
   * @return contractAddress
  **/
  @ApiModelProperty(example = "0xdac17f958d2ee523a2206206994597c13d831ec7", required = true, value = "Represents the contract address of the token, which controls its logic. It is not the address that holds the tokens.")

  public String getContractAddress() {
    return contractAddress;
  }


  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public ListTokensByAddressRI name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Defines the token&#39;s name as a string.
   * @return name
  **/
  @ApiModelProperty(example = "Tether USD", required = true, value = "Defines the token's name as a string.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ListTokensByAddressRI symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Defines the token symbol by which the token contract is known. It is usually 3-4 characters in length.
   * @return symbol
  **/
  @ApiModelProperty(example = "USDT", required = true, value = "Defines the token symbol by which the token contract is known. It is usually 3-4 characters in length.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public ListTokensByAddressRI type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the specific token type.
   * @return type
  **/
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
    ListTokensByAddressRI listTokensByAddressRI = (ListTokensByAddressRI) o;
    return Objects.equals(this.confirmedBalance, listTokensByAddressRI.confirmedBalance) &&
        Objects.equals(this.contractAddress, listTokensByAddressRI.contractAddress) &&
        Objects.equals(this.name, listTokensByAddressRI.name) &&
        Objects.equals(this.symbol, listTokensByAddressRI.symbol) &&
        Objects.equals(this.type, listTokensByAddressRI.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmedBalance, contractAddress, name, symbol, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTokensByAddressRI {\n");
    sb.append("    confirmedBalance: ").append(toIndentedString(confirmedBalance)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

