

# PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalData** | **String** | Representation of the additional data. |  [optional] |
|**fee** | [**PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee**](PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee.md) |  |  |
|**locktime** | **Integer** | Represents the time at which a particular transaction can be added to the blockchain. |  [optional] |
|**prepareStrategy** | [**PrepareStrategyEnum**](#PrepareStrategyEnum) | Representation of the transaction&#39;s strategy type |  [optional] |
|**recipients** | [**List&lt;PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemRecipientsInner&gt;**](PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemRecipientsInner.md) | Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list. |  |
|**replaceable** | **Boolean** | Representation of whether the transaction is replaceable |  [optional] |
|**xpub** | **String** | Defines the account extended publicly known key which is used to derive all child public keys. |  |



## Enum: PrepareStrategyEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| MINIMIZE_DUST | &quot;minimize-dust&quot; |
| OPTIMIZE_SIZE | &quot;optimize-size&quot; |



