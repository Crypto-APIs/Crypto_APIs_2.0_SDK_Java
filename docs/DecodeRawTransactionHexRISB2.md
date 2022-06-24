

# DecodeRawTransactionHexRISB2

Bitcoin Cash

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locktime** | **Integer** | Represents the time at which a particular transaction can be added to the blockchain. |  |
|**transactionHash** | **String** | Represents the same as transactionId for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols hash is different from transactionId for SegWit transactions. |  |
|**vSize** | **Integer** | Represents the virtual size of this transaction. |  |
|**version** | **Integer** | Represents transaction version number. |  |
|**vin** | [**List&lt;DecodeRawTransactionHexRISB2VinInner&gt;**](DecodeRawTransactionHexRISB2VinInner.md) | Represents the transaction inputs. |  |
|**vout** | [**List&lt;DecodeRawTransactionHexRISB2VoutInner&gt;**](DecodeRawTransactionHexRISB2VoutInner.md) | Represents the transaction outputs. |  |
|**weight** | **Integer** | Represents the size of a block, measured in weight units and including the segwit discount. |  [optional] |



