

# ListUnconfirmedOmniTransactionsByAddressRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** | Defines the amount of the sent tokens. |  |
|**divisible** | **Boolean** | Defines whether the attribute can be divisible or not, as boolean. E.g., if it is \&quot;true\&quot;, the attribute is divisible. |  |
|**mined** | **Boolean** | Defines whether the transaction has been mined or not, as boolean. E.g. if set to \&quot;true\&quot;, it means the transaction is mined. |  |
|**propertyId** | **Integer** | Represents the identifier of the tokens to send. |  |
|**recipients** | [**List&lt;ListOmniTransactionsByAddressRIRecipientsInner&gt;**](ListOmniTransactionsByAddressRIRecipientsInner.md) | Represents an object of addresses that receive the transactions. |  |
|**senders** | [**List&lt;ListUnconfirmedOmniTransactionsByAddressRISendersInner&gt;**](ListUnconfirmedOmniTransactionsByAddressRISendersInner.md) | Represents an object of addresses that provide the funds. |  |
|**sent** | **Boolean** | Defines whether the transaction has been sent or not, as boolean. E.g. if set to \&quot;true\&quot;, it means the transaction is sent. |  |
|**timestamp** | **Integer** | Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed. |  |
|**transactionId** | **String** | Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain. |  |
|**type** | **String** | Defines the type of the transaction as a string. |  |
|**typeInt** | **Integer** | Defines the type of the transaction as a number. |  |
|**version** | **Integer** | Defines the specific version. |  |
|**fee** | [**ListUnconfirmedOmniTransactionsByAddressRIFee**](ListUnconfirmedOmniTransactionsByAddressRIFee.md) |  |  |



