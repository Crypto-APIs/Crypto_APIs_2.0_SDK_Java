

# CreateCoinsTransactionRequestFromWalletRBDataItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callbackSecretKey** | **String** | Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. |  [optional]
**callbackUrl** | **String** | Verified URL for sending callbacks |  [optional]
**feePriority** | [**FeePriorityEnum**](#FeePriorityEnum) | Represents the fee priority of the automation, whether it is \&quot;slow\&quot;, \&quot;standard\&quot; or \&quot;fast\&quot;. | 
**recipients** | [**List&lt;CreateCoinsTransactionRequestFromWalletRBDataItemRecipients&gt;**](CreateCoinsTransactionRequestFromWalletRBDataItemRecipients.md) | Defines the destination of the transaction, whether it is incoming or outgoing. | 



## Enum: FeePriorityEnum

Name | Value
---- | -----
SLOW | &quot;slow&quot;
STANDARD | &quot;standard&quot;
FAST | &quot;fast&quot;



