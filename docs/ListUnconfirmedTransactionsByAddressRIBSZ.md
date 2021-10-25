

# ListUnconfirmedTransactionsByAddressRIBSZ

Zcash

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bindingSig** | **String** | It is used to enforce balance of Spend and Output transfers, in order to prevent their replay across transactions. | 
**expiryHeight** | **Integer** | Represents a block height after which the transaction will expire. | 
**joinSplitPubKey** | **String** | Represents an encoding of a JoinSplitSig public validating key. | 
**joinSplitSig** | **String** | Is used to sign transactions that contain at least one JoinSplit description. | 
**locktime** | **Integer** | Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid. | 
**overwintered** | **Boolean** | \&quot;Overwinter\&quot; is the network upgrade for the Zcash blockchain. | 
**size** | **Integer** | Represents the total size of this transaction. | 
**vJoinSplit** | [**List&lt;ListConfirmedTransactionsByAddressRIBSZVJoinSplit&gt;**](ListConfirmedTransactionsByAddressRIBSZVJoinSplit.md) | Represents a sequence of JoinSplit descriptions using BCTV14 proofs. | 
**vShieldedOutput** | [**List&lt;ListConfirmedTransactionsByAddressRIBSZVShieldedOutput&gt;**](ListConfirmedTransactionsByAddressRIBSZVShieldedOutput.md) | Object Array representation of transaction output descriptions | 
**vShieldedSpend** | [**List&lt;ListConfirmedTransactionsByAddressRIBSZVShieldedSpend&gt;**](ListConfirmedTransactionsByAddressRIBSZVShieldedSpend.md) | Object Array representation of transaction spend descriptions | 
**valueBalance** | **String** | Defines the transaction value balance. | 
**version** | **Integer** | Defines the version of the transaction. | 
**versionGroupId** | **String** | Represents the transaction version group ID. | 
**vin** | [**List&lt;ListUnconfirmedTransactionsByAddressRIBSZVin&gt;**](ListUnconfirmedTransactionsByAddressRIBSZVin.md) | Object Array representation of transaction inputs | 
**vout** | [**List&lt;ListConfirmedTransactionsByAddressRIBSZVout&gt;**](ListConfirmedTransactionsByAddressRIBSZVout.md) | Object Array representation of transaction outputs | 



