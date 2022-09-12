

# DeriveAndSyncNewReceivingAddressesRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | Represents the public address, which is a compressed and shortened form of a public key. |  |
|**addressFormat** | **String** | Represents the format of the address. |  |
|**addressType** | [**AddressTypeEnum**](#AddressTypeEnum) | Defines the address type. |  |
|**derivationType** | [**DerivationTypeEnum**](#DerivationTypeEnum) | Represents the derivation type |  |
|**index** | **String** | Represents the output index. It refers to the UTXO sequence in the transaction outputs (vout). |  |



## Enum: AddressTypeEnum

| Name | Value |
|---- | -----|
| CHANGE | &quot;change&quot; |



## Enum: DerivationTypeEnum

| Name | Value |
|---- | -----|
| ACCOUNT | &quot;account&quot; |
| BIP32 | &quot;bip32&quot; |



