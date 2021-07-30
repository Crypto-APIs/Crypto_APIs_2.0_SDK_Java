

# GetTransactionDetailsByTransactionIDRIBS


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locktime** | **Integer** | Represents the time at which a particular transaction can be added to the blockchain. | 
**size** | **Integer** | Represents the total size of this transaction. | 
**vSize** | **Integer** | Represents the virtual size of this transaction. | 
**version** | **Integer** | Represents transaction version number. | 
**vin** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSD2Vin&gt;**](GetTransactionDetailsByTransactionIDRIBSD2Vin.md) | Represents the transaction inputs. | 
**vout** | [**List&lt;GetTransactionDetailsByTransactionIDRIBSD2Vout&gt;**](GetTransactionDetailsByTransactionIDRIBSD2Vout.md) | Represents the transaction outputs. | 
**vsize** | **Integer** | Represents the virtual size of this transaction. | 
**contract** | **String** | Represents the specific transaction contract. | 
**gasLimit** | **String** | Represents the amount of gas used by this specific transaction alone. | 
**gasPrice** | [**GetTransactionDetailsByTransactionIDRIBSECGasPrice**](GetTransactionDetailsByTransactionIDRIBSECGasPrice.md) |  | 
**gasUsed** | **String** | Represents the exact unit of gas that was used for the transaction. | 
**inputData** | **String** | Represents additional information that is required for the transaction. | 
**nonce** | **String** | Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender&#39;s address. | 
**transactionStatus** | **String** | Represents the status of this transaction. | 



