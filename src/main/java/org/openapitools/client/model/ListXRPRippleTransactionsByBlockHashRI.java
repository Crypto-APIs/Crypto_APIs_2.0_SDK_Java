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
import org.openapitools.client.model.ListXRPRippleTransactionsByBlockHashRIFee;
import org.openapitools.client.model.ListXRPRippleTransactionsByBlockHashRIOffer;
import org.openapitools.client.model.ListXRPRippleTransactionsByBlockHashRIReceive;
import org.openapitools.client.model.ListXRPRippleTransactionsByBlockHashRIRecipients;
import org.openapitools.client.model.ListXRPRippleTransactionsByBlockHashRISenders;
import org.openapitools.client.model.ListXRPRippleTransactionsByBlockHashRIValue;

/**
 * ListXRPRippleTransactionsByBlockHashRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class ListXRPRippleTransactionsByBlockHashRI {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private String additionalData;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT = "minedInBlockHeight";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT)
  private Integer minedInBlockHeight;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<ListXRPRippleTransactionsByBlockHashRIRecipients> recipients = new ArrayList<ListXRPRippleTransactionsByBlockHashRIRecipients>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private List<ListXRPRippleTransactionsByBlockHashRISenders> senders = new ArrayList<ListXRPRippleTransactionsByBlockHashRISenders>();

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transactionHash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private ListXRPRippleTransactionsByBlockHashRIFee fee;

  public static final String SERIALIZED_NAME_OFFER = "offer";
  @SerializedName(SERIALIZED_NAME_OFFER)
  private ListXRPRippleTransactionsByBlockHashRIOffer offer;

  public static final String SERIALIZED_NAME_RECEIVE = "receive";
  @SerializedName(SERIALIZED_NAME_RECEIVE)
  private ListXRPRippleTransactionsByBlockHashRIReceive receive;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private ListXRPRippleTransactionsByBlockHashRIValue value;


  public ListXRPRippleTransactionsByBlockHashRI additionalData(String additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Represents any additional data that may be needed.
   * @return additionalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "r4CmvbkDWGt9AZmkfuubmiSdsxGZFxAKBY", value = "Represents any additional data that may be needed.")

  public String getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(String additionalData) {
    this.additionalData = additionalData;
  }


  public ListXRPRippleTransactionsByBlockHashRI index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Represents the index position of the transaction in the specific block.
   * @return index
  **/
  @ApiModelProperty(example = "3", required = true, value = "Represents the index position of the transaction in the specific block.")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public ListXRPRippleTransactionsByBlockHashRI minedInBlockHeight(Integer minedInBlockHeight) {
    
    this.minedInBlockHeight = minedInBlockHeight;
    return this;
  }

   /**
   * Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.
   * @return minedInBlockHeight
  **/
  @ApiModelProperty(example = "15971358", required = true, value = "Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.")

  public Integer getMinedInBlockHeight() {
    return minedInBlockHeight;
  }


  public void setMinedInBlockHeight(Integer minedInBlockHeight) {
    this.minedInBlockHeight = minedInBlockHeight;
  }


  public ListXRPRippleTransactionsByBlockHashRI recipients(List<ListXRPRippleTransactionsByBlockHashRIRecipients> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public ListXRPRippleTransactionsByBlockHashRI addRecipientsItem(ListXRPRippleTransactionsByBlockHashRIRecipients recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Represents an object of addresses that receive the transactions.
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "Represents an object of addresses that receive the transactions.")

  public List<ListXRPRippleTransactionsByBlockHashRIRecipients> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<ListXRPRippleTransactionsByBlockHashRIRecipients> recipients) {
    this.recipients = recipients;
  }


  public ListXRPRippleTransactionsByBlockHashRI senders(List<ListXRPRippleTransactionsByBlockHashRISenders> senders) {
    
    this.senders = senders;
    return this;
  }

  public ListXRPRippleTransactionsByBlockHashRI addSendersItem(ListXRPRippleTransactionsByBlockHashRISenders sendersItem) {
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Represents an object of addresses that provide the funds.
   * @return senders
  **/
  @ApiModelProperty(required = true, value = "Represents an object of addresses that provide the funds.")

  public List<ListXRPRippleTransactionsByBlockHashRISenders> getSenders() {
    return senders;
  }


  public void setSenders(List<ListXRPRippleTransactionsByBlockHashRISenders> senders) {
    this.senders = senders;
  }


  public ListXRPRippleTransactionsByBlockHashRI sequence(Integer sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Defines the transaction input&#39;s sequence as an integer, which is is used when transactions are replaced with newer versions before LockTime.
   * @return sequence
  **/
  @ApiModelProperty(example = "32568", required = true, value = "Defines the transaction input's sequence as an integer, which is is used when transactions are replaced with newer versions before LockTime.")

  public Integer getSequence() {
    return sequence;
  }


  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  public ListXRPRippleTransactionsByBlockHashRI status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Defines the status of the transaction.
   * @return status
  **/
  @ApiModelProperty(example = "tesSUCCESS", required = true, value = "Defines the status of the transaction.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ListXRPRippleTransactionsByBlockHashRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.
   * @return timestamp
  **/
  @ApiModelProperty(example = "236589", required = true, value = "Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public ListXRPRippleTransactionsByBlockHashRI transactionHash(String transactionHash) {
    
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Represents the same as &#x60;transactionId&#x60; for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols &#x60;hash&#x60; is different from &#x60;transactionId&#x60; for SegWit transactions.
   * @return transactionHash
  **/
  @ApiModelProperty(example = "ba3bc1337071c8e73b441fe12a1911f4365d7ea82cace7c8ecba3ee9f364978b", required = true, value = "Represents the same as `transactionId` for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols `hash` is different from `transactionId` for SegWit transactions.")

  public String getTransactionHash() {
    return transactionHash;
  }


  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  public ListXRPRippleTransactionsByBlockHashRI type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the type of the transaction.
   * @return type
  **/
  @ApiModelProperty(example = "Payment", required = true, value = "Defines the type of the transaction.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ListXRPRippleTransactionsByBlockHashRI fee(ListXRPRippleTransactionsByBlockHashRIFee fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "")

  public ListXRPRippleTransactionsByBlockHashRIFee getFee() {
    return fee;
  }


  public void setFee(ListXRPRippleTransactionsByBlockHashRIFee fee) {
    this.fee = fee;
  }


  public ListXRPRippleTransactionsByBlockHashRI offer(ListXRPRippleTransactionsByBlockHashRIOffer offer) {
    
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  @ApiModelProperty(required = true, value = "")

  public ListXRPRippleTransactionsByBlockHashRIOffer getOffer() {
    return offer;
  }


  public void setOffer(ListXRPRippleTransactionsByBlockHashRIOffer offer) {
    this.offer = offer;
  }


  public ListXRPRippleTransactionsByBlockHashRI receive(ListXRPRippleTransactionsByBlockHashRIReceive receive) {
    
    this.receive = receive;
    return this;
  }

   /**
   * Get receive
   * @return receive
  **/
  @ApiModelProperty(required = true, value = "")

  public ListXRPRippleTransactionsByBlockHashRIReceive getReceive() {
    return receive;
  }


  public void setReceive(ListXRPRippleTransactionsByBlockHashRIReceive receive) {
    this.receive = receive;
  }


  public ListXRPRippleTransactionsByBlockHashRI value(ListXRPRippleTransactionsByBlockHashRIValue value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")

  public ListXRPRippleTransactionsByBlockHashRIValue getValue() {
    return value;
  }


  public void setValue(ListXRPRippleTransactionsByBlockHashRIValue value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListXRPRippleTransactionsByBlockHashRI listXRPRippleTransactionsByBlockHashRI = (ListXRPRippleTransactionsByBlockHashRI) o;
    return Objects.equals(this.additionalData, listXRPRippleTransactionsByBlockHashRI.additionalData) &&
        Objects.equals(this.index, listXRPRippleTransactionsByBlockHashRI.index) &&
        Objects.equals(this.minedInBlockHeight, listXRPRippleTransactionsByBlockHashRI.minedInBlockHeight) &&
        Objects.equals(this.recipients, listXRPRippleTransactionsByBlockHashRI.recipients) &&
        Objects.equals(this.senders, listXRPRippleTransactionsByBlockHashRI.senders) &&
        Objects.equals(this.sequence, listXRPRippleTransactionsByBlockHashRI.sequence) &&
        Objects.equals(this.status, listXRPRippleTransactionsByBlockHashRI.status) &&
        Objects.equals(this.timestamp, listXRPRippleTransactionsByBlockHashRI.timestamp) &&
        Objects.equals(this.transactionHash, listXRPRippleTransactionsByBlockHashRI.transactionHash) &&
        Objects.equals(this.type, listXRPRippleTransactionsByBlockHashRI.type) &&
        Objects.equals(this.fee, listXRPRippleTransactionsByBlockHashRI.fee) &&
        Objects.equals(this.offer, listXRPRippleTransactionsByBlockHashRI.offer) &&
        Objects.equals(this.receive, listXRPRippleTransactionsByBlockHashRI.receive) &&
        Objects.equals(this.value, listXRPRippleTransactionsByBlockHashRI.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, index, minedInBlockHeight, recipients, senders, sequence, status, timestamp, transactionHash, type, fee, offer, receive, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListXRPRippleTransactionsByBlockHashRI {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    minedInBlockHeight: ").append(toIndentedString(minedInBlockHeight)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    receive: ").append(toIndentedString(receive)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

