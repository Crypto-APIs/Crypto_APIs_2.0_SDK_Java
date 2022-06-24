

# ListTransactionsByBlockHashRIBSZ

Zcash

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bindingSig** | **String** | It is used to enforce balance of Spend and Output transfers, in order to prevent their replay across transactions. |  |
|**expiryHeight** | **Integer** | Represents a block height after which the transaction will expire. |  |
|**joinSplitPubKey** | **String** | Represents an encoding of a JoinSplitSig public validating key. |  |
|**joinSplitSig** | **String** | Is used to sign transactions that contain at least one JoinSplit description. |  |
|**locktime** | **Long** | Represents the time at which a particular transaction can be added to the blockchain. |  |
|**overwintered** | **Boolean** | \&quot;Overwinter\&quot; is the network upgrade for the Zcash blockchain. |  |
|**size** | **Integer** | Represents the total size of this transaction. |  |
|**vJoinSplit** | [**List&lt;ListTransactionsByBlockHashRIBSZVJoinSplitInner&gt;**](ListTransactionsByBlockHashRIBSZVJoinSplitInner.md) | Represents a sequence of JoinSplit descriptions using BCTV14 proofs. |  |
|**vShieldedOutput** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner.md) | Object Array representation of transaction output descriptions |  |
|**vShieldedSpend** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner.md) | Object Array representation of transaction spend descriptions |  |
|**valueBalance** | **String** | Defines the transaction value balance. |  |
|**version** | **Integer** | Numeric representation of the transaction Represents the transaction version number. |  |
|**versionGroupId** | **String** | Represents the transaction version group ID. |  |
|**vin** | [**List&lt;ListTransactionsByBlockHashRIBSZVinInner&gt;**](ListTransactionsByBlockHashRIBSZVinInner.md) | Object Array representation of transaction inputs |  |
|**vout** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVoutInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVoutInner.md) | Object Array representation of transaction outputs |  |



