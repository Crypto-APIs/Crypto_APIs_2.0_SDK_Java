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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinScriptPubKey;

/**
 * GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T16:59:17.199745Z[Etc/UTC]")
public class GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout {
  public static final String SERIALIZED_NAME_IS_SPENT = "isSpent";
  @SerializedName(SERIALIZED_NAME_IS_SPENT)
  private Boolean isSpent;

  public static final String SERIALIZED_NAME_SCRIPT_PUB_KEY = "scriptPubKey";
  @SerializedName(SERIALIZED_NAME_SCRIPT_PUB_KEY)
  private GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinScriptPubKey scriptPubKey;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout isSpent(Boolean isSpent) {
    
    this.isSpent = isSpent;
    return this;
  }

   /**
   * Defines whether the output is spent or not.
   * @return isSpent
  **/
  @ApiModelProperty(example = "true", required = true, value = "Defines whether the output is spent or not.")

  public Boolean getIsSpent() {
    return isSpent;
  }


  public void setIsSpent(Boolean isSpent) {
    this.isSpent = isSpent;
  }


  public GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout scriptPubKey(GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinScriptPubKey scriptPubKey) {
    
    this.scriptPubKey = scriptPubKey;
    return this;
  }

   /**
   * Get scriptPubKey
   * @return scriptPubKey
  **/
  @ApiModelProperty(required = true, value = "")

  public GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinScriptPubKey getScriptPubKey() {
    return scriptPubKey;
  }


  public void setScriptPubKey(GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinScriptPubKey scriptPubKey) {
    this.scriptPubKey = scriptPubKey;
  }


  public GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Represents the sent/received amount.
   * @return value
  **/
  @ApiModelProperty(example = "0.000144", required = true, value = "Represents the sent/received amount.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
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
    GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout getTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout = (GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout) o;
    return Objects.equals(this.isSpent, getTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout.isSpent) &&
        Objects.equals(this.scriptPubKey, getTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout.scriptPubKey) &&
        Objects.equals(this.value, getTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSpent, scriptPubKey, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout {\n");
    sb.append("    isSpent: ").append(toIndentedString(isSpent)).append("\n");
    sb.append("    scriptPubKey: ").append(toIndentedString(scriptPubKey)).append("\n");
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

