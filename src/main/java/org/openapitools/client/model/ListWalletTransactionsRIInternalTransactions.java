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
 * ListWalletTransactionsRIInternalTransactions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class ListWalletTransactionsRIInternalTransactions {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CONVERTED_AMOUNT = "convertedAmount";
  @SerializedName(SERIALIZED_NAME_CONVERTED_AMOUNT)
  private String convertedAmount;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE_UNIT = "exchangeRateUnit";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE_UNIT)
  private String exchangeRateUnit;

  public static final String SERIALIZED_NAME_OPERATION_ID = "operationId";
  @SerializedName(SERIALIZED_NAME_OPERATION_ID)
  private String operationId;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public ListWalletTransactionsRIInternalTransactions() { 
  }

  public ListWalletTransactionsRIInternalTransactions amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the specific amount of the transaction.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.001", required = true, value = "Defines the specific amount of the transaction.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ListWalletTransactionsRIInternalTransactions convertedAmount(String convertedAmount) {
    
    this.convertedAmount = convertedAmount;
    return this;
  }

   /**
   * Represents the converted amount.
   * @return convertedAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4.30365936483792", required = true, value = "Represents the converted amount.")

  public String getConvertedAmount() {
    return convertedAmount;
  }


  public void setConvertedAmount(String convertedAmount) {
    this.convertedAmount = convertedAmount;
  }


  public ListWalletTransactionsRIInternalTransactions exchangeRateUnit(String exchangeRateUnit) {
    
    this.exchangeRateUnit = exchangeRateUnit;
    return this;
  }

   /**
   * Defines the base asset symbol to get a rate for.
   * @return exchangeRateUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "Defines the base asset symbol to get a rate for.")

  public String getExchangeRateUnit() {
    return exchangeRateUnit;
  }


  public void setExchangeRateUnit(String exchangeRateUnit) {
    this.exchangeRateUnit = exchangeRateUnit;
  }


  public ListWalletTransactionsRIInternalTransactions operationId(String operationId) {
    
    this.operationId = operationId;
    return this;
  }

   /**
   * Represents the unique internal transaction ID in regards to the parent transaction (type trace address).
   * @return operationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "call_0", required = true, value = "Represents the unique internal transaction ID in regards to the parent transaction (type trace address).")

  public String getOperationId() {
    return operationId;
  }


  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  public ListWalletTransactionsRIInternalTransactions recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * Represents the recipient address with the respective amount.
   * @return recipient
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x07344b7649c5ff096b0317957d9a208931d04d5e", required = true, value = "Represents the recipient address with the respective amount.")

  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  public ListWalletTransactionsRIInternalTransactions sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Represents the sender address with the respective amount.
   * @return sender
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x4b8ec9e58a8b08f3803f84fb52d0a50e84444592", required = true, value = "Represents the sender address with the respective amount.")

  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    this.sender = sender;
  }


  public ListWalletTransactionsRIInternalTransactions symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Represents the unique unit symbol.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ETH", required = true, value = "Represents the unique unit symbol.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListWalletTransactionsRIInternalTransactions listWalletTransactionsRIInternalTransactions = (ListWalletTransactionsRIInternalTransactions) o;
    return Objects.equals(this.amount, listWalletTransactionsRIInternalTransactions.amount) &&
        Objects.equals(this.convertedAmount, listWalletTransactionsRIInternalTransactions.convertedAmount) &&
        Objects.equals(this.exchangeRateUnit, listWalletTransactionsRIInternalTransactions.exchangeRateUnit) &&
        Objects.equals(this.operationId, listWalletTransactionsRIInternalTransactions.operationId) &&
        Objects.equals(this.recipient, listWalletTransactionsRIInternalTransactions.recipient) &&
        Objects.equals(this.sender, listWalletTransactionsRIInternalTransactions.sender) &&
        Objects.equals(this.symbol, listWalletTransactionsRIInternalTransactions.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, convertedAmount, exchangeRateUnit, operationId, recipient, sender, symbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWalletTransactionsRIInternalTransactions {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    convertedAmount: ").append(toIndentedString(convertedAmount)).append("\n");
    sb.append("    exchangeRateUnit: ").append(toIndentedString(exchangeRateUnit)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

