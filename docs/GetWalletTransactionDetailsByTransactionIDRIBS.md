

# GetWalletTransactionDetailsByTransactionIDRIBS


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locktime** | **Long** | Represents the time at which a particular transaction can be added to the blockchain. |  |
|**size** | **Integer** | Represents the total size of this transaction. |  |
|**vSize** | **Integer** | Represents the virtual size of this transaction. |  |
|**version** | **Integer** | Represents the transaction version number. |  |
|**vin** | [**List&lt;GetWalletTransactionDetailsByTransactionIDRIBSZVinInner&gt;**](GetWalletTransactionDetailsByTransactionIDRIBSZVinInner.md) | Object Array representation of transaction inputs |  |
|**vout** | [**List&lt;ListTransactionsByBlockHeightRIBSZVoutInner&gt;**](ListTransactionsByBlockHeightRIBSZVoutInner.md) | Object Array representation of transaction outputs |  |
|**contract** | **String** | Represents the specific transaction contract |  |
|**gasLimit** | **String** | Represents the amount of gas used by this specific transaction alone. |  |
|**gasPrice** | [**GetTransactionDetailsByTransactionIDRIBSBSCGasPrice**](GetTransactionDetailsByTransactionIDRIBSBSCGasPrice.md) |  |  |
|**gasUsed** | **String** | Defines the unit of the gas price amount, e.g. BTC, ETH, XRP. |  |
|**inputData** | **String** | Represents additional information that is required for the transaction. |  |
|**nonce** | **Integer** | Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender&#39;s address. |  |
|**transactionStatus** | **String** | String representation of the transaction status |  |
|**bindingSig** | **String** | It is used to enforce balance of Spend and Output transfers, in order to prevent their replay across transactions. |  |
|**expiryHeight** | **Integer** | Represents a block height after which the transaction will expire. |  |
|**joinSplitPubKey** | **String** | Represents an encoding of a JoinSplitSig public validating key. |  |
|**joinSplitSig** | **String** | Is used to sign transactions that contain at least one JoinSplit description. |  |
|**overwintered** | **Boolean** | \&quot;Overwinter\&quot; is the network upgrade for the Zcash blockchain. |  |
|**vJoinSplit** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner.md) | Represents a sequence of JoinSplit descriptions using BCTV14 proofs. |  [optional] |
|**vShieldedOutput** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner.md) | Object Array representation of transaction output descriptions |  [optional] |
|**vShieldedSpend** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner&gt;**](GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner.md) | Object Array representation of transaction spend descriptions |  [optional] |
|**valueBalance** | **String** | String representation of the transaction value balance |  |
|**versionGroupId** | **String** | Represents the transaction version group ID. |  |



