

# AddressCoinsTransactionUnconfirmedDataItem

Defines an `item` as one result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockchain** | **String** | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. |  |
|**network** | **String** | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. |  |
|**address** | **String** | Defines the specific address to which the coin transaction has been sent and is pending confirmation. |  |
|**transactionId** | **String** | Defines the unique ID of the specific transaction, i.e. its identification number. |  |
|**amount** | **String** | Defines the amount of coins sent with the transaction that is pending confirmation. |  |
|**unit** | [**UnitEnum**](#UnitEnum) | Defines the unit of the transaction, e.g. BTC. |  |
|**direction** | [**DirectionEnum**](#DirectionEnum) | Defines whether the transaction is \&quot;incoming\&quot; or \&quot;outgoing\&quot;. |  |
|**firstSeenInMempoolTimestamp** | **Integer** | Defines the exact time the transaction has been first accepted into the mempool to await confirmation as timestamp. |  |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| BTC | &quot;btc&quot; |
| SATOSHI | &quot;satoshi&quot; |
| WEI | &quot;wei&quot; |
| GWEI | &quot;gwei&quot; |
| ETH | &quot;eth&quot; |
| DOGE | &quot;doge&quot; |
| DASH | &quot;dash&quot; |
| ETC | &quot;etc&quot; |
| XRP | &quot;xrp&quot; |
| ZIL | &quot;zil&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INCOMING | &quot;incoming&quot; |
| OUTGOING | &quot;outgoing&quot; |



