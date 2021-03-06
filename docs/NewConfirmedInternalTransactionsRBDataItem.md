

# NewConfirmedInternalTransactionsRBDataItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | Defines the specific address of the internal transaction. |  |
|**allowDuplicates** | **Boolean** | Flag that permits or denies creation of duplicates |  |
|**callbackSecretKey** | **String** | Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security). |  |
|**callbackUrl** | **String** | Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs. &#x60;We support ONLY httpS type of protocol&#x60;. |  |
|**receiveCallbackOn** | **Integer** | Represents the exact confirmation, on which the user wants to receive callback. |  [optional] |



