

# GetZilliqaBlockDetailsByBlockHeightRI


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockHash** | **String** | Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm. | 
**difficulty** | **String** | Defines how difficult it is for a specific miner to mine the block. | 
**dsBlock** | **Integer** | Represents the Directory Service block which contains metadata about the miners who participate in the consensus protocol. | 
**dsDifficulty** | **String** | Defines how difficult it is to mine the dsBlocks. | 
**dsLeader** | **String** | Represents a part of the DS Committee which leads the consensus protocol for the epoch. | 
**gasLimit** | **Integer** | Represents the maximum amount of gas allowed in the block in order to determine how many transactions it can fit. | 
**gasUsed** | **Integer** | Defines how much of the gas for the block has been used. | 
**microBlocks** | **List&lt;String&gt;** |  | 
**nextBlockHash** | **String** | Defines the hash of the next block from the specific blockchain. | 
**previousBlockHash** | **String** | Represents the hash of the previous block, also known as the parent block. | 
**timestamp** | **Integer** | Defines the exact date/time when this block was mined in Unix Timestamp. | 
**transactionsCount** | **Integer** | Represents the total number of all transactions as part of this block. | 



