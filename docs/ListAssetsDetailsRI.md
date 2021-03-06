

# ListAssetsDetailsRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetId** | **String** | Defines the unique ID of the specific asset. |  |
|**assetLogo** | [**ListAssetsDetailsRIAssetLogo**](ListAssetsDetailsRIAssetLogo.md) |  |  |
|**assetName** | **String** | Specifies the name of the asset in question. |  |
|**assetOriginalSymbol** | **String** | Specifies the asset&#39;s original symbol as introduced by its founders. |  |
|**assetSymbol** | **String** | Specifies the asset&#39;s unique symbol in the Crypto APIs listings. |  |
|**assetType** | [**AssetTypeEnum**](#AssetTypeEnum) | Defines the type of the supported asset. This could be either \&quot;crypto\&quot; or \&quot;fiat\&quot;. |  |
|**latestRate** | [**ListAssetsDetailsRILatestRate**](ListAssetsDetailsRILatestRate.md) |  |  |
|**slug** | **String** | Represents the asset&#x60;s unique slug string in Crypto APIs listings. |  [optional] |
|**specificData** | [**ListAssetsDetailsRIS**](ListAssetsDetailsRIS.md) |  |  |



## Enum: AssetTypeEnum

| Name | Value |
|---- | -----|
| FIAT | &quot;fiat&quot; |
| CRYPTO | &quot;crypto&quot; |



