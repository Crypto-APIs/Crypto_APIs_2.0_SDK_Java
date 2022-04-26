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
import org.openapitools.client.model.AlreadyExists;
import org.openapitools.client.model.BannedIpAddressDetails;
import org.openapitools.client.model.InvalidData;

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
public class NewConfirmedTokensTransactionsAndEachConfirmationE409 extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(NewConfirmedTokensTransactionsAndEachConfirmationE409.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!NewConfirmedTokensTransactionsAndEachConfirmationE409.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'NewConfirmedTokensTransactionsAndEachConfirmationE409' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AlreadyExists> adapterAlreadyExists = gson.getDelegateAdapter(this, TypeToken.get(AlreadyExists.class));
            final TypeAdapter<InvalidData> adapterInvalidData = gson.getDelegateAdapter(this, TypeToken.get(InvalidData.class));

            return (TypeAdapter<T>) new TypeAdapter<NewConfirmedTokensTransactionsAndEachConfirmationE409>() {
                @Override
                public void write(JsonWriter out, NewConfirmedTokensTransactionsAndEachConfirmationE409 value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AlreadyExists`
                    if (value.getActualInstance() instanceof AlreadyExists) {
                        JsonObject obj = adapterAlreadyExists.toJsonTree((AlreadyExists)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidData`
                    if (value.getActualInstance() instanceof InvalidData) {
                        JsonObject obj = adapterInvalidData.toJsonTree((InvalidData)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AlreadyExists, InvalidData");
                }

                @Override
                public NewConfirmedTokensTransactionsAndEachConfirmationE409 read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AlreadyExists
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AlreadyExists.validateJsonObject(jsonObject);
                        actualAdapter = adapterAlreadyExists;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AlreadyExists'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'AlreadyExists'", e);
                    }

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

                    if (match == 1) {
                        NewConfirmedTokensTransactionsAndEachConfirmationE409 ret = new NewConfirmedTokensTransactionsAndEachConfirmationE409();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for NewConfirmedTokensTransactionsAndEachConfirmationE409: %d classes match result, expected 1. JSON: %s", match, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public NewConfirmedTokensTransactionsAndEachConfirmationE409() {
        super("oneOf", Boolean.FALSE);
    }

    public NewConfirmedTokensTransactionsAndEachConfirmationE409(AlreadyExists o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NewConfirmedTokensTransactionsAndEachConfirmationE409(InvalidData o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AlreadyExists", new GenericType<AlreadyExists>() {
        });
        schemas.put("InvalidData", new GenericType<InvalidData>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return NewConfirmedTokensTransactionsAndEachConfirmationE409.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AlreadyExists, InvalidData
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AlreadyExists) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InvalidData) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AlreadyExists, InvalidData");
    }

    /**
     * Get the actual instance, which can be the following:
     * AlreadyExists, InvalidData
     *
     * @return The actual instance (AlreadyExists, InvalidData)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AlreadyExists`. If the actual instance is not `AlreadyExists`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AlreadyExists`
     * @throws ClassCastException if the instance is not `AlreadyExists`
     */
    public AlreadyExists getAlreadyExists() throws ClassCastException {
        return (AlreadyExists)super.getActualInstance();
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewConfirmedTokensTransactionsAndEachConfirmationE409
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    // validate the json string with AlreadyExists
    try {
      AlreadyExists.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with InvalidData
    try {
      InvalidData.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for NewConfirmedTokensTransactionsAndEachConfirmationE409 with oneOf schemas: AlreadyExists, InvalidData. %d class(es) match the result, expected 1. JSON: %s", validCount, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of NewConfirmedTokensTransactionsAndEachConfirmationE409 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewConfirmedTokensTransactionsAndEachConfirmationE409
  * @throws IOException if the JSON string is invalid with respect to NewConfirmedTokensTransactionsAndEachConfirmationE409
  */
  public static NewConfirmedTokensTransactionsAndEachConfirmationE409 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewConfirmedTokensTransactionsAndEachConfirmationE409.class);
  }

 /**
  * Convert an instance of NewConfirmedTokensTransactionsAndEachConfirmationE409 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

