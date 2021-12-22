

# ListUnspentTransactionOutputsByAddressRIBlockchainSpecific


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vSize** | **Integer** | Represents the virtual size of this transaction | 
**bindingSig** | **String** | It is used to enforce balance of Spend and Output transfers, in order to prevent their replay across transactions. | 
**expiryHeight** | **Integer** | Represents a block height after which the transaction will expire. | 
**joinSplitPubKey** | **String** | Represents an encoding of a JoinSplitSig public validating key. | 
**joinSplitSig** | **String** | Is used to sign transactions that contain at least one JoinSplit description. | 
**overwintered** | **Boolean** | \&quot;Overwinter\&quot; is the network upgrade for the Zcash blockchain. | 
**vJoinSplit** | [**List&lt;ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVJoinSplit&gt;**](ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVJoinSplit.md) | Represents a sequence of JoinSplit descriptions using BCTV14 proofs. |  [optional]
**vShieldedOutput** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVShieldedOutput&gt;**](GetTransactionDetailsByTransactionIDRIBSZVShieldedOutput.md) | Object Array representation of transaction output descriptions |  [optional]
**vShieldedSpend** | [**List&lt;ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend&gt;**](ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend.md) | Object Array representation of transaction spend descriptions | 
**valueBalance** | **String** | Defines the transaction value balance. | 
**versionGroupId** | **String** | Represents the transaction version group ID. | 



