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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ListOmniTransactionsByAddressRIRecipients;
import org.openapitools.client.model.ListUnconfirmedOmniTransactionsByAddressRIFee;
import org.openapitools.client.model.ListUnconfirmedOmniTransactionsByAddressRISenders;

/**
 * ListUnconfirmedOmniTransactionsByAddressRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class ListUnconfirmedOmniTransactionsByAddressRI {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DIVISIBLE = "divisible";
  @SerializedName(SERIALIZED_NAME_DIVISIBLE)
  private Boolean divisible;

  public static final String SERIALIZED_NAME_MINED = "mined";
  @SerializedName(SERIALIZED_NAME_MINED)
  private Boolean mined;

  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private Integer propertyId;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<ListOmniTransactionsByAddressRIRecipients> recipients = new ArrayList<ListOmniTransactionsByAddressRIRecipients>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private List<ListUnconfirmedOmniTransactionsByAddressRISenders> senders = new ArrayList<ListUnconfirmedOmniTransactionsByAddressRISenders>();

  public static final String SERIALIZED_NAME_SENT = "sent";
  @SerializedName(SERIALIZED_NAME_SENT)
  private Boolean sent;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TYPE_INT = "typeInt";
  @SerializedName(SERIALIZED_NAME_TYPE_INT)
  private Integer typeInt;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private ListUnconfirmedOmniTransactionsByAddressRIFee fee;

  public ListUnconfirmedOmniTransactionsByAddressRI() { 
  }

  public ListUnconfirmedOmniTransactionsByAddressRI amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of the sent tokens.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "14.915785", required = true, value = "Defines the amount of the sent tokens.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI divisible(Boolean divisible) {
    
    this.divisible = divisible;
    return this;
  }

   /**
   * Defines whether the attribute can be divisible or not, as boolean. E.g., if it is \&quot;true\&quot;, the attribute is divisible.
   * @return divisible
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Defines whether the attribute can be divisible or not, as boolean. E.g., if it is \"true\", the attribute is divisible.")

  public Boolean getDivisible() {
    return divisible;
  }


  public void setDivisible(Boolean divisible) {
    this.divisible = divisible;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI mined(Boolean mined) {
    
    this.mined = mined;
    return this;
  }

   /**
   * Defines whether the transaction has been mined or not, as boolean. E.g. if set to \&quot;true\&quot;, it means the transaction is mined.
   * @return mined
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Defines whether the transaction has been mined or not, as boolean. E.g. if set to \"true\", it means the transaction is mined.")

  public Boolean getMined() {
    return mined;
  }


  public void setMined(Boolean mined) {
    this.mined = mined;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI propertyId(Integer propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Represents the identifier of the tokens to send.
   * @return propertyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Represents the identifier of the tokens to send.")

  public Integer getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(Integer propertyId) {
    this.propertyId = propertyId;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI recipients(List<ListOmniTransactionsByAddressRIRecipients> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public ListUnconfirmedOmniTransactionsByAddressRI addRecipientsItem(ListOmniTransactionsByAddressRIRecipients recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Represents an object of addresses that receive the transactions.
   * @return recipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents an object of addresses that receive the transactions.")

  public List<ListOmniTransactionsByAddressRIRecipients> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<ListOmniTransactionsByAddressRIRecipients> recipients) {
    this.recipients = recipients;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI senders(List<ListUnconfirmedOmniTransactionsByAddressRISenders> senders) {
    
    this.senders = senders;
    return this;
  }

  public ListUnconfirmedOmniTransactionsByAddressRI addSendersItem(ListUnconfirmedOmniTransactionsByAddressRISenders sendersItem) {
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Represents an object of addresses that provide the funds.
   * @return senders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents an object of addresses that provide the funds.")

  public List<ListUnconfirmedOmniTransactionsByAddressRISenders> getSenders() {
    return senders;
  }


  public void setSenders(List<ListUnconfirmedOmniTransactionsByAddressRISenders> senders) {
    this.senders = senders;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI sent(Boolean sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * Defines whether the transaction has been sent or not, as boolean. E.g. if set to \&quot;true\&quot;, it means the transaction is sent.
   * @return sent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Defines whether the transaction has been sent or not, as boolean. E.g. if set to \"true\", it means the transaction is sent.")

  public Boolean getSent() {
    return sent;
  }


  public void setSent(Boolean sent) {
    this.sent = sent;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1616429665", required = true, value = "Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "b3e76370a1ccdf5549a3654f1d14be27bebb4a834a81b489fcc99d057ada3dd1", required = true, value = "Represents the unique identifier of a transaction, i.e. it could be `transactionId` in UTXO-based protocols like Bitcoin, and transaction `hash` in Ethereum blockchain.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the type of the transaction as a string.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Simple Send", required = true, value = "Defines the type of the transaction as a string.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI typeInt(Integer typeInt) {
    
    this.typeInt = typeInt;
    return this;
  }

   /**
   * Defines the type of the transaction as a number.
   * @return typeInt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Defines the type of the transaction as a number.")

  public Integer getTypeInt() {
    return typeInt;
  }


  public void setTypeInt(Integer typeInt) {
    this.typeInt = typeInt;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Defines the specific version.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Defines the specific version.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ListUnconfirmedOmniTransactionsByAddressRI fee(ListUnconfirmedOmniTransactionsByAddressRIFee fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListUnconfirmedOmniTransactionsByAddressRIFee getFee() {
    return fee;
  }


  public void setFee(ListUnconfirmedOmniTransactionsByAddressRIFee fee) {
    this.fee = fee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUnconfirmedOmniTransactionsByAddressRI listUnconfirmedOmniTransactionsByAddressRI = (ListUnconfirmedOmniTransactionsByAddressRI) o;
    return Objects.equals(this.amount, listUnconfirmedOmniTransactionsByAddressRI.amount) &&
        Objects.equals(this.divisible, listUnconfirmedOmniTransactionsByAddressRI.divisible) &&
        Objects.equals(this.mined, listUnconfirmedOmniTransactionsByAddressRI.mined) &&
        Objects.equals(this.propertyId, listUnconfirmedOmniTransactionsByAddressRI.propertyId) &&
        Objects.equals(this.recipients, listUnconfirmedOmniTransactionsByAddressRI.recipients) &&
        Objects.equals(this.senders, listUnconfirmedOmniTransactionsByAddressRI.senders) &&
        Objects.equals(this.sent, listUnconfirmedOmniTransactionsByAddressRI.sent) &&
        Objects.equals(this.timestamp, listUnconfirmedOmniTransactionsByAddressRI.timestamp) &&
        Objects.equals(this.transactionId, listUnconfirmedOmniTransactionsByAddressRI.transactionId) &&
        Objects.equals(this.type, listUnconfirmedOmniTransactionsByAddressRI.type) &&
        Objects.equals(this.typeInt, listUnconfirmedOmniTransactionsByAddressRI.typeInt) &&
        Objects.equals(this.version, listUnconfirmedOmniTransactionsByAddressRI.version) &&
        Objects.equals(this.fee, listUnconfirmedOmniTransactionsByAddressRI.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, divisible, mined, propertyId, recipients, senders, sent, timestamp, transactionId, type, typeInt, version, fee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUnconfirmedOmniTransactionsByAddressRI {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    divisible: ").append(toIndentedString(divisible)).append("\n");
    sb.append("    mined: ").append(toIndentedString(mined)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeInt: ").append(toIndentedString(typeInt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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

