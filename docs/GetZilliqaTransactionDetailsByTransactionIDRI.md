

# GetZilliqaTransactionDetailsByTransactionIDRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fee** | [**GetZilliqaTransactionDetailsByTransactionIDRIFee**](GetZilliqaTransactionDetailsByTransactionIDRIFee.md) |  |  |
|**gasLimit** | **Integer** | Represents the maximum amount of gas allowed in the block in order to determine how many transactions it can fit. |  |
|**gasPrice** | **Integer** | Defines the price of the gas. |  |
|**gasUsed** | **Integer** | Defines how much of the gas for the block has been used. |  |
|**minedInBlockHash** | **String** | Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm. |  |
|**minedInBlockHeight** | **Integer** | Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;. |  |
|**nonce** | **Integer** | Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender&#39;s address. |  |
|**recipients** | [**List&lt;GetZilliqaTransactionDetailsByTransactionIDRIRecipients&gt;**](GetZilliqaTransactionDetailsByTransactionIDRIRecipients.md) | Represents an object of addresses that receive the transactions. |  |
|**senders** | [**List&lt;GetZilliqaTransactionDetailsByTransactionIDRISenders&gt;**](GetZilliqaTransactionDetailsByTransactionIDRISenders.md) | Represents an object of addresses that provide the funds. |  |
|**timestamp** | **Integer** | Defines the exact date/time when this block was mined in Unix Timestamp. |  |
|**transactionIndex** | **Integer** | Defines the numeric representation of the transaction index. |  |
|**transactionStatus** | **String** | Defines the status of the transaction, whether it is e.g. pending or complete. |  |



