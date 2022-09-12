

# PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRBDataItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalData** | **String** | Representation of the additional data. |  [optional] |
|**amount** | **String** | Representation of the amount of the transaction |  |
|**fee** | [**PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee**](PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee.md) |  |  |
|**nonce** | **String** | Representation of the nonce value |  [optional] |
|**recipient** | **String** | Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list. |  |
|**sender** | **String** | Represents a  sender address with the respective amount. In account-based protocols like Ethereum there is only one address in this list. |  |
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Representation of the transaction type |  [optional] |
|**xpub** | **String** | Defines the account extended publicly known key which is used to derive all child public keys. |  |



## Enum: TransactionTypeEnum

| Name | Value |
|---- | -----|
| LEGACY_TRANSACTION | &quot;legacy-transaction&quot; |
| ACCESS_LIST_TRANSACTION | &quot;access-list-transaction&quot; |
| GAS_FEE_MARKET_TRANSACTION | &quot;gas-fee-market-transaction&quot; |



