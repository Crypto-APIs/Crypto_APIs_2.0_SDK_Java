

# CreateTokensTransactionRequestFromAddressRI


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feePriority** | [**FeePriorityEnum**](#FeePriorityEnum) | Represents the fee priority of the automation, whether it is \&quot;slow\&quot;, \&quot;standard\&quot; or \&quot;fast\&quot;. | 
**recipients** | [**List&lt;CreateTokensTransactionRequestFromAddressRIRecipients&gt;**](CreateTokensTransactionRequestFromAddressRIRecipients.md) | Defines the destination for the transaction, i.e. the recipient(s). | 
**senders** | [**CreateTokensTransactionRequestFromAddressRISenders**](CreateTokensTransactionRequestFromAddressRISenders.md) |  | 
**tokenTypeSpecificData** | [**CreateTokensTransactionRequestFromAddressRITokenTypeSpecificData**](CreateTokensTransactionRequestFromAddressRITokenTypeSpecificData.md) |  | 



## Enum: FeePriorityEnum

Name | Value
---- | -----
SLOW | &quot;slow&quot;
STANDARD | &quot;standard&quot;
FAST | &quot;fast&quot;



