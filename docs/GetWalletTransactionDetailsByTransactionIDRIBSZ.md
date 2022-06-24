

# GetWalletTransactionDetailsByTransactionIDRIBSZ

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
|**vJoinSplit** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner.md) | Represents a sequence of JoinSplit descriptions using BCTV14 proofs. |  [optional] |
|**vShieldedOutput** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner.md) | Object Array representation of transaction output descriptions |  [optional] |
|**vShieldedSpend** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner.md) | Object Array representation of transaction spend descriptions |  [optional] |
|**valueBalance** | **String** | String representation of the transaction value balance |  |
|**version** | **Integer** | Represents the transaction version number. |  |
|**versionGroupId** | **String** | Represents the transaction version group ID. |  |
|**vin** | [**List&lt;GetWalletTransactionDetailsByTransactionIDRIBSZVinInner&gt;**](GetWalletTransactionDetailsByTransactionIDRIBSZVinInner.md) | Object Array representation of transaction inputs |  |
|**vout** | [**List&lt;ListTransactionsByBlockHeightRIBSZVoutInner&gt;**](ListTransactionsByBlockHeightRIBSZVoutInner.md) | Object Array representation of transaction outputs |  |



