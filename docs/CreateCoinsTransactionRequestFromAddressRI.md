

# CreateCoinsTransactionRequestFromAddressRI


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callbackSecretKey** | **String** | Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. |  [optional]
**callbackUrl** | **String** | Verified URL for sending callbacks |  [optional]
**feePriority** | [**FeePriorityEnum**](#FeePriorityEnum) | Represents the fee priority of the automation, whether it is \&quot;slow\&quot;, \&quot;standard\&quot; or \&quot;fast\&quot;. | 
**recipients** | [**List&lt;CreateCoinsTransactionRequestFromAddressRIRecipients&gt;**](CreateCoinsTransactionRequestFromAddressRIRecipients.md) | Defines the destination for the transaction, i.e. the recipient(s). | 
**senders** | [**CreateCoinsTransactionRequestFromAddressRISenders**](CreateCoinsTransactionRequestFromAddressRISenders.md) |  | 
**transactionRequestStatus** | [**TransactionRequestStatusEnum**](#TransactionRequestStatusEnum) | Defines the status of the transaction request, e.g. \&quot;created, \&quot;await_approval\&quot;, \&quot;pending\&quot;, \&quot;prepared\&quot;, \&quot;signed\&quot;, \&quot;broadcasted\&quot;, \&quot;success\&quot;, \&quot;failed\&quot;, \&quot;rejected\&quot;, mined\&quot;. | 



## Enum: FeePriorityEnum

Name | Value
---- | -----
SLOW | &quot;slow&quot;
STANDARD | &quot;standard&quot;
FAST | &quot;fast&quot;



## Enum: TransactionRequestStatusEnum

Name | Value
---- | -----
CREATED | &quot;created&quot;
AWAIT_APPROVAL | &quot;await-approval&quot;
PENDING | &quot;pending&quot;
PREPARED | &quot;prepared&quot;
SIGNED | &quot;signed&quot;
BROADCASTED | &quot;broadcasted&quot;
SUCCESS | &quot;success&quot;
FAILED | &quot;failed&quot;
REJECTED | &quot;rejected&quot;
MINED | &quot;mined&quot;



