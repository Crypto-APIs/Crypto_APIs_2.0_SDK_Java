

# ListTransactionsByAddressRIBS


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locktime** | **Integer** | Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid. | 
**size** | **Integer** | Represents the total size of this transaction. | 
**vSize** | **Integer** | Represents the virtual size of this transaction. | 
**version** | **Integer** | Represents the transaction&#39;s version number. | 
**vin** | [**List&lt;ListTransactionsByAddressRIBSD2Vin&gt;**](ListTransactionsByAddressRIBSD2Vin.md) | Represents the transaction inputs. | 
**vout** | [**List&lt;ListTransactionsByAddressRIBSD2Vout&gt;**](ListTransactionsByAddressRIBSD2Vout.md) | Represents the transaction outputs. | 
**contract** | **String** | Numeric representation of the transaction contract | 
**gasLimit** | **String** | String representation of the transaction gas | 
**gasPrice** | [**GetTransactionDetailsByTransactionIDRIBSBSCGasPrice**](GetTransactionDetailsByTransactionIDRIBSBSCGasPrice.md) |  | 
**gasUsed** | **String** | Numeric representation of the transaction gas used | 
**inputData** | **String** | Numeric representation of the transaction input | 
**nonce** | **Integer** | Numeric representation of the transaction nonce | 
**transactionStatus** | **String** | String representation of the transaction status | 



