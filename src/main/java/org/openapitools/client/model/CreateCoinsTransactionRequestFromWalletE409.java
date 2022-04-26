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
import org.openapitools.client.model.BannedIpAddressDetails;
import org.openapitools.client.model.InvalidData;
import org.openapitools.client.model.WalletAsAServiceAddressBalanceNotEnough;
import org.openapitools.client.model.WalletAsAServiceNoDepositAddressesFound;
import org.openapitools.client.model.WalletAsAServiceWalletBalanceNotEnough;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import io.cryptoapis.sdk.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class CreateCoinsTransactionRequestFromWalletE409 extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateCoinsTransactionRequestFromWalletE409.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateCoinsTransactionRequestFromWalletE409.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateCoinsTransactionRequestFromWalletE409' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<InvalidData> adapterInvalidData = gson.getDelegateAdapter(this, TypeToken.get(InvalidData.class));
            final TypeAdapter<WalletAsAServiceAddressBalanceNotEnough> adapterWalletAsAServiceAddressBalanceNotEnough = gson.getDelegateAdapter(this, TypeToken.get(WalletAsAServiceAddressBalanceNotEnough.class));
            final TypeAdapter<WalletAsAServiceNoDepositAddressesFound> adapterWalletAsAServiceNoDepositAddressesFound = gson.getDelegateAdapter(this, TypeToken.get(WalletAsAServiceNoDepositAddressesFound.class));
            final TypeAdapter<WalletAsAServiceWalletBalanceNotEnough> adapterWalletAsAServiceWalletBalanceNotEnough = gson.getDelegateAdapter(this, TypeToken.get(WalletAsAServiceWalletBalanceNotEnough.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateCoinsTransactionRequestFromWalletE409>() {
                @Override
                public void write(JsonWriter out, CreateCoinsTransactionRequestFromWalletE409 value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidData`
                    if (value.getActualInstance() instanceof InvalidData) {
                        JsonObject obj = adapterInvalidData.toJsonTree((InvalidData)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `WalletAsAServiceAddressBalanceNotEnough`
                    if (value.getActualInstance() instanceof WalletAsAServiceAddressBalanceNotEnough) {
                        JsonObject obj = adapterWalletAsAServiceAddressBalanceNotEnough.toJsonTree((WalletAsAServiceAddressBalanceNotEnough)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `WalletAsAServiceNoDepositAddressesFound`
                    if (value.getActualInstance() instanceof WalletAsAServiceNoDepositAddressesFound) {
                        JsonObject obj = adapterWalletAsAServiceNoDepositAddressesFound.toJsonTree((WalletAsAServiceNoDepositAddressesFound)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `WalletAsAServiceWalletBalanceNotEnough`
                    if (value.getActualInstance() instanceof WalletAsAServiceWalletBalanceNotEnough) {
                        JsonObject obj = adapterWalletAsAServiceWalletBalanceNotEnough.toJsonTree((WalletAsAServiceWalletBalanceNotEnough)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: InvalidData, WalletAsAServiceAddressBalanceNotEnough, WalletAsAServiceNoDepositAddressesFound, WalletAsAServiceWalletBalanceNotEnough");
                }

                @Override
                public CreateCoinsTransactionRequestFromWalletE409 read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize InvalidData
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvalidData.validateJsonObject(jsonObject);
                        actualAdapter = adapterInvalidData;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvalidData'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'InvalidData'", e);
                    }

                    // deserialize WalletAsAServiceAddressBalanceNotEnough
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WalletAsAServiceAddressBalanceNotEnough.validateJsonObject(jsonObject);
                        actualAdapter = adapterWalletAsAServiceAddressBalanceNotEnough;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WalletAsAServiceAddressBalanceNotEnough'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'WalletAsAServiceAddressBalanceNotEnough'", e);
                    }

                    // deserialize WalletAsAServiceNoDepositAddressesFound
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WalletAsAServiceNoDepositAddressesFound.validateJsonObject(jsonObject);
                        actualAdapter = adapterWalletAsAServiceNoDepositAddressesFound;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WalletAsAServiceNoDepositAddressesFound'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'WalletAsAServiceNoDepositAddressesFound'", e);
                    }

                    // deserialize WalletAsAServiceWalletBalanceNotEnough
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WalletAsAServiceWalletBalanceNotEnough.validateJsonObject(jsonObject);
                        actualAdapter = adapterWalletAsAServiceWalletBalanceNotEnough;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WalletAsAServiceWalletBalanceNotEnough'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'WalletAsAServiceWalletBalanceNotEnough'", e);
                    }

                    if (match == 1) {
                        CreateCoinsTransactionRequestFromWalletE409 ret = new CreateCoinsTransactionRequestFromWalletE409();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateCoinsTransactionRequestFromWalletE409: %d classes match result, expected 1. JSON: %s", match, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CreateCoinsTransactionRequestFromWalletE409() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateCoinsTransactionRequestFromWalletE409(InvalidData o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCoinsTransactionRequestFromWalletE409(WalletAsAServiceAddressBalanceNotEnough o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCoinsTransactionRequestFromWalletE409(WalletAsAServiceNoDepositAddressesFound o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCoinsTransactionRequestFromWalletE409(WalletAsAServiceWalletBalanceNotEnough o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("InvalidData", new GenericType<InvalidData>() {
        });
        schemas.put("WalletAsAServiceAddressBalanceNotEnough", new GenericType<WalletAsAServiceAddressBalanceNotEnough>() {
        });
        schemas.put("WalletAsAServiceNoDepositAddressesFound", new GenericType<WalletAsAServiceNoDepositAddressesFound>() {
        });
        schemas.put("WalletAsAServiceWalletBalanceNotEnough", new GenericType<WalletAsAServiceWalletBalanceNotEnough>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CreateCoinsTransactionRequestFromWalletE409.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * InvalidData, WalletAsAServiceAddressBalanceNotEnough, WalletAsAServiceNoDepositAddressesFound, WalletAsAServiceWalletBalanceNotEnough
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof InvalidData) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WalletAsAServiceAddressBalanceNotEnough) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WalletAsAServiceNoDepositAddressesFound) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WalletAsAServiceWalletBalanceNotEnough) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be InvalidData, WalletAsAServiceAddressBalanceNotEnough, WalletAsAServiceNoDepositAddressesFound, WalletAsAServiceWalletBalanceNotEnough");
    }

    /**
     * Get the actual instance, which can be the following:
     * InvalidData, WalletAsAServiceAddressBalanceNotEnough, WalletAsAServiceNoDepositAddressesFound, WalletAsAServiceWalletBalanceNotEnough
     *
     * @return The actual instance (InvalidData, WalletAsAServiceAddressBalanceNotEnough, WalletAsAServiceNoDepositAddressesFound, WalletAsAServiceWalletBalanceNotEnough)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvalidData`. If the actual instance is not `InvalidData`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvalidData`
     * @throws ClassCastException if the instance is not `InvalidData`
     */
    public InvalidData getInvalidData() throws ClassCastException {
        return (InvalidData)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WalletAsAServiceAddressBalanceNotEnough`. If the actual instance is not `WalletAsAServiceAddressBalanceNotEnough`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WalletAsAServiceAddressBalanceNotEnough`
     * @throws ClassCastException if the instance is not `WalletAsAServiceAddressBalanceNotEnough`
     */
    public WalletAsAServiceAddressBalanceNotEnough getWalletAsAServiceAddressBalanceNotEnough() throws ClassCastException {
        return (WalletAsAServiceAddressBalanceNotEnough)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WalletAsAServiceNoDepositAddressesFound`. If the actual instance is not `WalletAsAServiceNoDepositAddressesFound`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WalletAsAServiceNoDepositAddressesFound`
     * @throws ClassCastException if the instance is not `WalletAsAServiceNoDepositAddressesFound`
     */
    public WalletAsAServiceNoDepositAddressesFound getWalletAsAServiceNoDepositAddressesFound() throws ClassCastException {
        return (WalletAsAServiceNoDepositAddressesFound)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WalletAsAServiceWalletBalanceNotEnough`. If the actual instance is not `WalletAsAServiceWalletBalanceNotEnough`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WalletAsAServiceWalletBalanceNotEnough`
     * @throws ClassCastException if the instance is not `WalletAsAServiceWalletBalanceNotEnough`
     */
    public WalletAsAServiceWalletBalanceNotEnough getWalletAsAServiceWalletBalanceNotEnough() throws ClassCastException {
        return (WalletAsAServiceWalletBalanceNotEnough)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCoinsTransactionRequestFromWalletE409
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    // validate the json string with InvalidData
    try {
      InvalidData.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with WalletAsAServiceAddressBalanceNotEnough
    try {
      WalletAsAServiceAddressBalanceNotEnough.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with WalletAsAServiceNoDepositAddressesFound
    try {
      WalletAsAServiceNoDepositAddressesFound.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with WalletAsAServiceWalletBalanceNotEnough
    try {
      WalletAsAServiceWalletBalanceNotEnough.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CreateCoinsTransactionRequestFromWalletE409 with oneOf schemas: InvalidData, WalletAsAServiceAddressBalanceNotEnough, WalletAsAServiceNoDepositAddressesFound, WalletAsAServiceWalletBalanceNotEnough. %d class(es) match the result, expected 1. JSON: %s", validCount, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of CreateCoinsTransactionRequestFromWalletE409 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCoinsTransactionRequestFromWalletE409
  * @throws IOException if the JSON string is invalid with respect to CreateCoinsTransactionRequestFromWalletE409
  */
  public static CreateCoinsTransactionRequestFromWalletE409 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCoinsTransactionRequestFromWalletE409.class);
  }

 /**
  * Convert an instance of CreateCoinsTransactionRequestFromWalletE409 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

