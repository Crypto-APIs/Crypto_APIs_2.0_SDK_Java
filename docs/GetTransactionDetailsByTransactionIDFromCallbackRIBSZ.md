

# GetTransactionDetailsByTransactionIDFromCallbackRIBSZ

Zcash

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bindingSig** | **String** | It is used to enforce balance of Spend and Output transfers, in order to prevent their replay across transactions. |  |
|**expiryHeight** | **Integer** | Represents a block height after which the transaction will expire. |  |
|**joinSplitPubKey** | **String** | Represents an encoding of a JoinSplitSig public validating key. |  |
|**joinSplitSig** | **String** | Is used to sign transactions that contain at least one JoinSplit description. |  |
|**locktime** | **Long** | Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid. |  |
|**overwintered** | **Boolean** | \&quot;Overwinter\&quot; is the network upgrade for the Zcash blockchain. |  |
|**size** | **Integer** | Represents the total size of this transaction. |  |
|**vJoinSplit** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner.md) | Represents a sequence of JoinSplit descriptions using BCTV14 proofs. |  |
|**vShieldedOutput** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner.md) | Object Array representation of transaction output descriptions |  |
|**vShieldedSpend** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner.md) | Object Array representation of transaction spend descriptions |  |
|**valueBalance** | **String** | String representation of the transaction value balance |  |
|**version** | **Integer** | Defines the version of the transaction. |  |
|**versionGroupId** | **String** | Represents the transaction version group ID |  |
|**vin** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVinInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVinInner.md) | Object Array representation of transaction inputs |  |
|**vout** | [**List&lt;GetTransactionDetailsByTransactionIDFromCallbackRIBSZVoutInner&gt;**](GetTransactionDetailsByTransactionIDFromCallbackRIBSZVoutInner.md) | Object Array representation of transaction outputs |  |



