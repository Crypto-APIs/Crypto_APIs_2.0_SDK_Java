

# ListZilliqaTransactionsByAddressRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fee** | [**GetZilliqaTransactionDetailsByTransactionIDRIFee**](GetZilliqaTransactionDetailsByTransactionIDRIFee.md) |  |  |
|**gasLimit** | **Integer** | Represents the maximum amount of gas allowed in the block in order to determine how many transactions it can fit. |  |
|**gasPrice** | **Integer** | Defines the price of the gas. |  |
|**gasUsed** | **Integer** | Defines how much of the gas for the block has been used. |  |
|**minedInBlockHash** | **String** | Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm. |  |
|**minedInBlockHeight** | **Integer** | Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;. |  |
|**nonce** | **Integer** | Represents a random value that can be adjusted to satisfy the Proof of Work. |  |
|**recipients** | [**List&lt;ListZilliqaTransactionsByAddressRIRecipientsInner&gt;**](ListZilliqaTransactionsByAddressRIRecipientsInner.md) | Defines an object array of the transaction recipients. |  |
|**senders** | [**List&lt;ListZilliqaTransactionsByAddressRISendersInner&gt;**](ListZilliqaTransactionsByAddressRISendersInner.md) | Represents an object of addresses that provide the funds. |  |
|**timestamp** | **Integer** | Defines the exact date/time when this block was mined in Unix Timestamp. |  |
|**transactionHash** | **String** | Represents the hash of the transaction, which is its unique identifier. |  |
|**transactionIndex** | **Integer** | Defines the numeric representation of the transaction index. |  |
|**transactionStatus** | **String** | Defines the status of the transaction, whether it is e.g. pending or complete. |  |



