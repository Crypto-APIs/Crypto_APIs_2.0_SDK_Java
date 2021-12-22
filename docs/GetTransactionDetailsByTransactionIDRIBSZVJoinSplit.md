

# GetTransactionDetailsByTransactionIDRIBSZVJoinSplit


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchor** | **String** | Defines a Merkle tree root of a note commitment tree which uniquely identifies a note commitment tree state given the assumed security properties of the Merkle tree’s  hash function. | 
**cipherTexts** | **List&lt;String&gt;** |  | 
**commitments** | **List&lt;String&gt;** |  | 
**macs** | **List&lt;String&gt;** |  | 
**nullifiers** | **List&lt;String&gt;** |  | 
**oneTimePubKey** | **String** | Defines the one time public key. | 
**proof** | **String** | Defines the proof. | 
**randomSeed** | **String** | Represents a 256-bit seed that must be chosen independently at random for each JoinSplit description. | 
**vPubNew** | **String** | Defines the value that the joinSplit transfer will insert into the transparent transaction value pool | 
**vPubOld** | **String** | Defines the value that the joinSplit transfer will remove from the transparent transaction value pool. | 



