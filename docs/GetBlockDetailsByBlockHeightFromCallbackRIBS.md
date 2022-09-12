

# GetBlockDetailsByBlockHeightFromCallbackRIBS


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bits** | **String** | Represents a specific sub-unit of Zcash. Bits have two-decimal precision |  |
|**chainwork** | **String** | Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes. |  |
|**difficulty** | **String** | Represents a mathematical value of how hard it is to find a valid hash for this block. |  |
|**merkleRoot** | **String** | Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions&#39; hashes that are part of a blockchain block. |  |
|**nonce** | **String** | Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender&#39;s address. |  |
|**size** | **Integer** | Represents the total size of the block in Bytes. |  |
|**strippedSize** | **Integer** | Defines the numeric representation of the block size excluding the witness data. |  |
|**version** | **Integer** | Represents the transaction version number. |  |
|**versionHex** | **String** | Is the hexadecimal string representation of the block&#39;s version. |  |
|**weight** | **Integer** | Represents a measurement to compare the size of different transactions to each other in proportion to the block size limit. |  |
|**strippedsize** | **Integer** | Defines the numeric representation of the block size excluding the witness data. |  |
|**extraData** | **String** | Represents any data that can be included by the miner in the block. |  |
|**gasLimit** | **String** | Represents the amount of gas used by this specific transaction alone. |  |
|**gasUsed** | **String** | Represents the exact unit of gas that was used for the transaction. |  |
|**minedInSeconds** | **Integer** | Specifies the amount of time required for the block to be mined in seconds. |  |
|**sha3Uncles** | **String** | Defines the combined hash of all uncles for a given parent. |  |
|**totalDifficulty** | **String** | Defines the total difficulty of the chain until this block, i.e. how difficult it is for a specific miner to mine a new block. |  |
|**uncles** | **List&lt;String&gt;** |  |  |
|**dsBlock** | **Integer** | Represents the Directory Service block which contains metadata about the miners who participate in the consensus protocol. |  |
|**dsDifficulty** | **String** | Defines how difficult it is to mine the dsBlocks. |  |
|**dsLeader** | **String** | Represents a part of the DS Committee which leads the consensus protocol for the epoch. |  |
|**microBlocks** | **List&lt;String&gt;** |  |  |
|**totalCoins** | [**GetLatestMinedXRPRippleBlockRITotalCoins**](GetLatestMinedXRPRippleBlockRITotalCoins.md) |  |  |
|**totalFees** | [**GetLatestMinedXRPRippleBlockRITotalFees**](GetLatestMinedXRPRippleBlockRITotalFees.md) |  |  |
|**bandwidthUsed** | **String** | Represents the bandwidth used for the transaction. |  |
|**burnedTrx** | **String** | Represents the block burned TRX. |  |
|**energyUsed** | **String** | Representats the used energy for the transaction. |  |



