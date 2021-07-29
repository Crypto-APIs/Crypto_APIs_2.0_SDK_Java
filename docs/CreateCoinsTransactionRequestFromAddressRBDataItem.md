

# CreateCoinsTransactionRequestFromAddressRBDataItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **String** | Represents the specific amount of the transaction. | 
**callbackSecretKey** | **String** | Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. |  [optional]
**callbackUrl** | **String** | Verified URL for sending callbacks |  [optional]
**feePriority** | [**FeePriorityEnum**](#FeePriorityEnum) | Represents the fee priority of the automation, whether it is \&quot;slow\&quot;, \&quot;standard\&quot; or \&quot;fast\&quot;. | 
**recipientAddress** | **String** | Defines the specific recipient address for the transaction. | 



## Enum: FeePriorityEnum

Name | Value
---- | -----
SLOW | &quot;slow&quot;
STANDARD | &quot;standard&quot;
FAST | &quot;fast&quot;



