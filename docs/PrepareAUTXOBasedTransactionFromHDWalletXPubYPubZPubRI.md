

# PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalData** | **String** | Representation of the additional data |  [optional] |
|**fee** | **String** | When isConfirmed is True - Defines the amount of the transaction fee When isConfirmed is False - For ETH-based blockchains this attribute represents the max fee value. |  |
|**feePerByte** | **String** | Defines the fee per byte value |  [optional] |
|**locktime** | **Long** | Represents the time at which a particular transaction can be added to the blockchain. |  |
|**replaceable** | **Boolean** | Representation of whether the transaction is replaceable |  |
|**size** | **Integer** | Represents the total size of this transaction. |  |
|**vin** | [**List&lt;PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner&gt;**](PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVinInner.md) | Represents the transaction inputs. |  |
|**vout** | [**List&lt;PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVoutInner&gt;**](PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRIVoutInner.md) | Represents the transaction outputs. |  |



