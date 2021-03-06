

# CoinsForwardingSuccessDataItem

Defines an `item` as one result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockchain** | **String** | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. |  |
|**network** | **String** | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. |  |
|**fromAddress** | **String** | Represents the hash of the address that provides the coins. |  |
|**toAddress** | **String** | Represents the hash of the address to forward the coins to. |  |
|**forwardedAmount** | **String** | Represents the amount of coins that have been forwarded. |  |
|**forwardedUnit** | **String** | Represents the unit of coins that have been forwarded, e.g. BTC. |  |
|**spentFeesAmount** | **String** | Represents the amount of the fee spent for the coins to be forwarded. |  |
|**spentFeesUnit** | **String** | Represents the unit of the fee spent for the coins to be forwarded, e.g. BTC. |  |
|**triggerTransactionId** | **String** | Defines the unique Transaction ID that triggered the coin forwarding. |  |
|**forwardingTransactionId** | **String** | Defines the unique Transaction ID that forwarded the coins. |  |



