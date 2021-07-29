

# CreateTokensTransactionRequestFromAddressRI


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callbackSecretKey** | **String** | Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. | 
**callbackUrl** | **String** | Verified URL for sending callbacks | 
**feePriority** | [**FeePriorityEnum**](#FeePriorityEnum) | Represents the fee priority of the automation, whether it is \&quot;slow\&quot;, \&quot;standard\&quot; or \&quot;fast\&quot;. | 
**recipients** | [**List&lt;CreateTokensTransactionRequestFromAddressRIRecipients&gt;**](CreateTokensTransactionRequestFromAddressRIRecipients.md) | Defines the destination for the transaction, i.e. the recipient(s). | 
**senders** | [**CreateTokensTransactionRequestFromAddressRISenders**](CreateTokensTransactionRequestFromAddressRISenders.md) |  | 
**tokenTypeSpecificData** | [**CreateTokensTransactionRequestFromAddressRIS**](CreateTokensTransactionRequestFromAddressRIS.md) |  | 



## Enum: FeePriorityEnum

Name | Value
---- | -----
SLOW | &quot;slow&quot;
STANDARD | &quot;standard&quot;
FAST | &quot;fast&quot;



