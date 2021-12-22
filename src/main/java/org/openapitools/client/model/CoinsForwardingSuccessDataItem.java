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
 * Defines an &#x60;item&#x60; as one result.
 */
@ApiModel(description = "Defines an `item` as one result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class CoinsForwardingSuccessDataItem {
  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "fromAddress";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private String fromAddress;

  public static final String SERIALIZED_NAME_TO_ADDRESS = "toAddress";
  @SerializedName(SERIALIZED_NAME_TO_ADDRESS)
  private String toAddress;

  public static final String SERIALIZED_NAME_FORWARDED_AMOUNT = "forwardedAmount";
  @SerializedName(SERIALIZED_NAME_FORWARDED_AMOUNT)
  private String forwardedAmount;

  public static final String SERIALIZED_NAME_FORWARDED_UNIT = "forwardedUnit";
  @SerializedName(SERIALIZED_NAME_FORWARDED_UNIT)
  private String forwardedUnit;

  public static final String SERIALIZED_NAME_SPENT_FEES_AMOUNT = "spentFeesAmount";
  @SerializedName(SERIALIZED_NAME_SPENT_FEES_AMOUNT)
  private String spentFeesAmount;

  public static final String SERIALIZED_NAME_SPENT_FEES_UNIT = "spentFeesUnit";
  @SerializedName(SERIALIZED_NAME_SPENT_FEES_UNIT)
  private String spentFeesUnit;

  public static final String SERIALIZED_NAME_TRIGGER_TRANSACTION_ID = "triggerTransactionId";
  @SerializedName(SERIALIZED_NAME_TRIGGER_TRANSACTION_ID)
  private String triggerTransactionId;

  public static final String SERIALIZED_NAME_FORWARDING_TRANSACTION_ID = "forwardingTransactionId";
  @SerializedName(SERIALIZED_NAME_FORWARDING_TRANSACTION_ID)
  private String forwardingTransactionId;

  public CoinsForwardingSuccessDataItem() { 
  }

  public CoinsForwardingSuccessDataItem blockchain(String blockchain) {
    
    this.blockchain = blockchain;
    return this;
  }

   /**
   * Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
   * @return blockchain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "bitcoin", required = true, value = "Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.")

  public String getBlockchain() {
    return blockchain;
  }


  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public CoinsForwardingSuccessDataItem network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks.
   * @return network
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "testnet", required = true, value = "Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public CoinsForwardingSuccessDataItem fromAddress(String fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Represents the hash of the address that provides the coins.
   * @return fromAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "mmd963W1fECjLyaDCHcioSCZYHkRwjkGST", required = true, value = "Represents the hash of the address that provides the coins.")

  public String getFromAddress() {
    return fromAddress;
  }


  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  public CoinsForwardingSuccessDataItem toAddress(String toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

   /**
   * Represents the hash of the address to forward the coins to.
   * @return toAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ms4KNsbNpoU8g424pzmEjbkFbfAHae1msB", required = true, value = "Represents the hash of the address to forward the coins to.")

  public String getToAddress() {
    return toAddress;
  }


  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  public CoinsForwardingSuccessDataItem forwardedAmount(String forwardedAmount) {
    
    this.forwardedAmount = forwardedAmount;
    return this;
  }

   /**
   * Represents the amount of coins that have been forwarded.
   * @return forwardedAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00059441", required = true, value = "Represents the amount of coins that have been forwarded.")

  public String getForwardedAmount() {
    return forwardedAmount;
  }


  public void setForwardedAmount(String forwardedAmount) {
    this.forwardedAmount = forwardedAmount;
  }


  public CoinsForwardingSuccessDataItem forwardedUnit(String forwardedUnit) {
    
    this.forwardedUnit = forwardedUnit;
    return this;
  }

   /**
   * Represents the unit of coins that have been forwarded, e.g. BTC.
   * @return forwardedUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "Represents the unit of coins that have been forwarded, e.g. BTC.")

  public String getForwardedUnit() {
    return forwardedUnit;
  }


  public void setForwardedUnit(String forwardedUnit) {
    this.forwardedUnit = forwardedUnit;
  }


  public CoinsForwardingSuccessDataItem spentFeesAmount(String spentFeesAmount) {
    
    this.spentFeesAmount = spentFeesAmount;
    return this;
  }

   /**
   * Represents the amount of the fee spent for the coins to be forwarded.
   * @return spentFeesAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00022827", required = true, value = "Represents the amount of the fee spent for the coins to be forwarded.")

  public String getSpentFeesAmount() {
    return spentFeesAmount;
  }


  public void setSpentFeesAmount(String spentFeesAmount) {
    this.spentFeesAmount = spentFeesAmount;
  }


  public CoinsForwardingSuccessDataItem spentFeesUnit(String spentFeesUnit) {
    
    this.spentFeesUnit = spentFeesUnit;
    return this;
  }

   /**
   * Represents the unit of the fee spent for the coins to be forwarded, e.g. BTC.
   * @return spentFeesUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "Represents the unit of the fee spent for the coins to be forwarded, e.g. BTC.")

  public String getSpentFeesUnit() {
    return spentFeesUnit;
  }


  public void setSpentFeesUnit(String spentFeesUnit) {
    this.spentFeesUnit = spentFeesUnit;
  }


  public CoinsForwardingSuccessDataItem triggerTransactionId(String triggerTransactionId) {
    
    this.triggerTransactionId = triggerTransactionId;
    return this;
  }

   /**
   * Defines the unique Transaction ID that triggered the coin forwarding.
   * @return triggerTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "86a7546bde4ac28b34504909d138592a6d6fc1277ea1f8f2f9c75dc04bdf3b7b", required = true, value = "Defines the unique Transaction ID that triggered the coin forwarding.")

  public String getTriggerTransactionId() {
    return triggerTransactionId;
  }


  public void setTriggerTransactionId(String triggerTransactionId) {
    this.triggerTransactionId = triggerTransactionId;
  }


  public CoinsForwardingSuccessDataItem forwardingTransactionId(String forwardingTransactionId) {
    
    this.forwardingTransactionId = forwardingTransactionId;
    return this;
  }

   /**
   * Defines the unique Transaction ID that forwarded the coins.
   * @return forwardingTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2241b5264fac8acb92e9fc597035b99cdd22f6578d63c6f52b099729f7c4f979", required = true, value = "Defines the unique Transaction ID that forwarded the coins.")

  public String getForwardingTransactionId() {
    return forwardingTransactionId;
  }


  public void setForwardingTransactionId(String forwardingTransactionId) {
    this.forwardingTransactionId = forwardingTransactionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinsForwardingSuccessDataItem coinsForwardingSuccessDataItem = (CoinsForwardingSuccessDataItem) o;
    return Objects.equals(this.blockchain, coinsForwardingSuccessDataItem.blockchain) &&
        Objects.equals(this.network, coinsForwardingSuccessDataItem.network) &&
        Objects.equals(this.fromAddress, coinsForwardingSuccessDataItem.fromAddress) &&
        Objects.equals(this.toAddress, coinsForwardingSuccessDataItem.toAddress) &&
        Objects.equals(this.forwardedAmount, coinsForwardingSuccessDataItem.forwardedAmount) &&
        Objects.equals(this.forwardedUnit, coinsForwardingSuccessDataItem.forwardedUnit) &&
        Objects.equals(this.spentFeesAmount, coinsForwardingSuccessDataItem.spentFeesAmount) &&
        Objects.equals(this.spentFeesUnit, coinsForwardingSuccessDataItem.spentFeesUnit) &&
        Objects.equals(this.triggerTransactionId, coinsForwardingSuccessDataItem.triggerTransactionId) &&
        Objects.equals(this.forwardingTransactionId, coinsForwardingSuccessDataItem.forwardingTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, fromAddress, toAddress, forwardedAmount, forwardedUnit, spentFeesAmount, spentFeesUnit, triggerTransactionId, forwardingTransactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinsForwardingSuccessDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    forwardedAmount: ").append(toIndentedString(forwardedAmount)).append("\n");
    sb.append("    forwardedUnit: ").append(toIndentedString(forwardedUnit)).append("\n");
    sb.append("    spentFeesAmount: ").append(toIndentedString(spentFeesAmount)).append("\n");
    sb.append("    spentFeesUnit: ").append(toIndentedString(spentFeesUnit)).append("\n");
    sb.append("    triggerTransactionId: ").append(toIndentedString(triggerTransactionId)).append("\n");
    sb.append("    forwardingTransactionId: ").append(toIndentedString(forwardingTransactionId)).append("\n");
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

