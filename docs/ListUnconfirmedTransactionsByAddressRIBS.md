

# ListUnconfirmedTransactionsByAddressRIBS


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locktime** | **Long** | Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid. |  |
|**size** | **Integer** | Represents the total size of this transaction. |  |
|**vSize** | **Integer** | Represents the virtual size of this transaction. |  |
|**version** | **Integer** | Defines the version of the transaction. |  |
|**vin** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVin&gt;**](GetTransactionDetailsByTransactionIDRIBSZVin.md) | Object Array representation of transaction inputs |  |
|**vout** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVout&gt;**](GetTransactionDetailsByTransactionIDRIBSZVout.md) | Object Array representation of transaction outputs |  |
|**fee** | [**ListUnconfirmedTransactionsByAddressRIBSECFee**](ListUnconfirmedTransactionsByAddressRIBSECFee.md) |  |  |
|**gasLimit** | **String** | Represents the amount of gas used by this specific transaction alone. |  |
|**gasPrice** | [**ListConfirmedTransactionsByAddressRIBSBSCGasPrice**](ListConfirmedTransactionsByAddressRIBSBSCGasPrice.md) |  |  |
|**inputData** | **String** | Represents additional information that is required for the transaction. |  |
|**nonce** | **Integer** | Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender&#39;s address. |  |
|**transactionStatus** | **String** | String representation of the transaction status |  |
|**bindingSig** | **String** | It is used to enforce balance of Spend and Output transfers, in order to prevent their replay across transactions. |  |
|**expiryHeight** | **Integer** | Represents a block height after which the transaction will expire. |  |
|**joinSplitPubKey** | **String** | Represents an encoding of a JoinSplitSig public validating key. |  |
|**joinSplitSig** | **String** | Is used to sign transactions that contain at least one JoinSplit description. |  |
|**overwintered** | **Boolean** | \&quot;Overwinter\&quot; is the network upgrade for the Zcash blockchain. |  |
|**vJoinSplit** | [**List&lt;ListConfirmedTransactionsByAddressRIBSZVJoinSplit&gt;**](ListConfirmedTransactionsByAddressRIBSZVJoinSplit.md) | Represents a sequence of JoinSplit descriptions using BCTV14 proofs. |  |
|**vShieldedOutput** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVShieldedOutput&gt;**](GetTransactionDetailsByTransactionIDRIBSZVShieldedOutput.md) | Object Array representation of transaction output descriptions |  |
|**vShieldedSpend** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSZVShieldedSpend&gt;**](GetTransactionDetailsByTransactionIDRIBSZVShieldedSpend.md) | Object Array representation of transaction spend descriptions |  |
|**valueBalance** | **String** | Defines the transaction value balance. |  |
|**versionGroupId** | **String** | Represents the transaction version group ID. |  |


