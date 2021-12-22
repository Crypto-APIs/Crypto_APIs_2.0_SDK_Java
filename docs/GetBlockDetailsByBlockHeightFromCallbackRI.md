

# GetBlockDetailsByBlockHeightFromCallbackRI


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hash** | **String** | Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm. | 
**height** | **Integer** | Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;. | 
**previousBlockHash** | **String** | Represents the hash of the previous block, also known as the parent block. | 
**timestamp** | **Integer** | Defines the exact date/time when this block was mined in Unix Timestamp. | 
**transactionsCount** | **Integer** | Represents the total number of all transactions as part of this block. | 
**blockchainSpecific** | [**GetBlockDetailsByBlockHeightFromCallbackRIBS**](GetBlockDetailsByBlockHeightFromCallbackRIBS.md) |  | 



