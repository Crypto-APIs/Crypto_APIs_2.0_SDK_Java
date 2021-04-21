/*
 * Crypto APIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: bizdev@cryptoapis.io
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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDResponseItemRecipients;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDResponseItemSenders;
import org.openapitools.client.model.ListTransactionsByBlockHeightResponseItemBlockchainSpecific;
import org.openapitools.client.model.ListTransactionsByBlockHeightResponseItemFee;

/**
 * ListTransactionsByBlockHeightResponseItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T16:59:17.199745Z[Etc/UTC]")
public class ListTransactionsByBlockHeightResponseItem {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HASH = "minedInBlockHash";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HASH)
  private String minedInBlockHash;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT = "minedInBlockHeight";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT)
  private Integer minedInBlockHeight;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<GetTransactionDetailsByTransactionIDResponseItemRecipients> recipients = new ArrayList<GetTransactionDetailsByTransactionIDResponseItemRecipients>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private List<GetTransactionDetailsByTransactionIDResponseItemSenders> senders = new ArrayList<GetTransactionDetailsByTransactionIDResponseItemSenders>();

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transactionHash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private ListTransactionsByBlockHeightResponseItemFee fee;

  public static final String SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC = "blockchainSpecific";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC)
  private ListTransactionsByBlockHeightResponseItemBlockchainSpecific blockchainSpecific;


  public ListTransactionsByBlockHeightResponseItem index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Represents the index position of the transaction in the specific block.
   * @return index
  **/
  @ApiModelProperty(example = "2", required = true, value = "Represents the index position of the transaction in the specific block.")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public ListTransactionsByBlockHeightResponseItem minedInBlockHash(String minedInBlockHash) {
    
    this.minedInBlockHash = minedInBlockHash;
    return this;
  }

   /**
   * Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return minedInBlockHash
  **/
  @ApiModelProperty(example = "00000000407f119ecb74b44229228910400aaeb9f4e3b9869955b85a53e9b7db", required = true, value = "Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getMinedInBlockHash() {
    return minedInBlockHash;
  }


  public void setMinedInBlockHash(String minedInBlockHash) {
    this.minedInBlockHash = minedInBlockHash;
  }


  public ListTransactionsByBlockHeightResponseItem minedInBlockHeight(Integer minedInBlockHeight) {
    
    this.minedInBlockHeight = minedInBlockHeight;
    return this;
  }

   /**
   * Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.
   * @return minedInBlockHeight
  **/
  @ApiModelProperty(example = "1939750", required = true, value = "Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.")

  public Integer getMinedInBlockHeight() {
    return minedInBlockHeight;
  }


  public void setMinedInBlockHeight(Integer minedInBlockHeight) {
    this.minedInBlockHeight = minedInBlockHeight;
  }


  public ListTransactionsByBlockHeightResponseItem recipients(List<GetTransactionDetailsByTransactionIDResponseItemRecipients> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public ListTransactionsByBlockHeightResponseItem addRecipientsItem(GetTransactionDetailsByTransactionIDResponseItemRecipients recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.")

  public List<GetTransactionDetailsByTransactionIDResponseItemRecipients> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<GetTransactionDetailsByTransactionIDResponseItemRecipients> recipients) {
    this.recipients = recipients;
  }


  public ListTransactionsByBlockHeightResponseItem senders(List<GetTransactionDetailsByTransactionIDResponseItemSenders> senders) {
    
    this.senders = senders;
    return this;
  }

  public ListTransactionsByBlockHeightResponseItem addSendersItem(GetTransactionDetailsByTransactionIDResponseItemSenders sendersItem) {
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Represents a list of sender addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.
   * @return senders
  **/
  @ApiModelProperty(required = true, value = "Represents a list of sender addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.")

  public List<GetTransactionDetailsByTransactionIDResponseItemSenders> getSenders() {
    return senders;
  }


  public void setSenders(List<GetTransactionDetailsByTransactionIDResponseItemSenders> senders) {
    this.senders = senders;
  }


  public ListTransactionsByBlockHeightResponseItem timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.
   * @return timestamp
  **/
  @ApiModelProperty(example = "1582202940", required = true, value = "Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public ListTransactionsByBlockHeightResponseItem transactionHash(String transactionHash) {
    
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Represents the same as &#x60;transactionId&#x60; for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols &#x60;hash&#x60; is different from &#x60;transactionId&#x60; for SegWit transactions.
   * @return transactionHash
  **/
  @ApiModelProperty(example = "1ec73b0f61359927d02376b35993b756b1097cb9a857bec23da4c98c4977d2b2", required = true, value = "Represents the same as `transactionId` for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols `hash` is different from `transactionId` for SegWit transactions.")

  public String getTransactionHash() {
    return transactionHash;
  }


  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  public ListTransactionsByBlockHeightResponseItem transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain.
   * @return transactionId
  **/
  @ApiModelProperty(example = "4b66461bf88b61e1e4326356534c135129defb504c7acb2fd6c92697d79eb250", required = true, value = "Represents the unique identifier of a transaction, i.e. it could be `transactionId` in UTXO-based protocols like Bitcoin, and transaction `hash` in Ethereum blockchain.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public ListTransactionsByBlockHeightResponseItem fee(ListTransactionsByBlockHeightResponseItemFee fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "")

  public ListTransactionsByBlockHeightResponseItemFee getFee() {
    return fee;
  }


  public void setFee(ListTransactionsByBlockHeightResponseItemFee fee) {
    this.fee = fee;
  }


  public ListTransactionsByBlockHeightResponseItem blockchainSpecific(ListTransactionsByBlockHeightResponseItemBlockchainSpecific blockchainSpecific) {
    
    this.blockchainSpecific = blockchainSpecific;
    return this;
  }

   /**
   * Get blockchainSpecific
   * @return blockchainSpecific
  **/
  @ApiModelProperty(required = true, value = "")

  public ListTransactionsByBlockHeightResponseItemBlockchainSpecific getBlockchainSpecific() {
    return blockchainSpecific;
  }


  public void setBlockchainSpecific(ListTransactionsByBlockHeightResponseItemBlockchainSpecific blockchainSpecific) {
    this.blockchainSpecific = blockchainSpecific;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionsByBlockHeightResponseItem listTransactionsByBlockHeightResponseItem = (ListTransactionsByBlockHeightResponseItem) o;
    return Objects.equals(this.index, listTransactionsByBlockHeightResponseItem.index) &&
        Objects.equals(this.minedInBlockHash, listTransactionsByBlockHeightResponseItem.minedInBlockHash) &&
        Objects.equals(this.minedInBlockHeight, listTransactionsByBlockHeightResponseItem.minedInBlockHeight) &&
        Objects.equals(this.recipients, listTransactionsByBlockHeightResponseItem.recipients) &&
        Objects.equals(this.senders, listTransactionsByBlockHeightResponseItem.senders) &&
        Objects.equals(this.timestamp, listTransactionsByBlockHeightResponseItem.timestamp) &&
        Objects.equals(this.transactionHash, listTransactionsByBlockHeightResponseItem.transactionHash) &&
        Objects.equals(this.transactionId, listTransactionsByBlockHeightResponseItem.transactionId) &&
        Objects.equals(this.fee, listTransactionsByBlockHeightResponseItem.fee) &&
        Objects.equals(this.blockchainSpecific, listTransactionsByBlockHeightResponseItem.blockchainSpecific);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, minedInBlockHash, minedInBlockHeight, recipients, senders, timestamp, transactionHash, transactionId, fee, blockchainSpecific);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByBlockHeightResponseItem {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    minedInBlockHash: ").append(toIndentedString(minedInBlockHash)).append("\n");
    sb.append("    minedInBlockHeight: ").append(toIndentedString(minedInBlockHeight)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    blockchainSpecific: ").append(toIndentedString(blockchainSpecific)).append("\n");
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

