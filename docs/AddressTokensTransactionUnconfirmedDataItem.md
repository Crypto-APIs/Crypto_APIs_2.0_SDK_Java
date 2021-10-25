

# AddressTokensTransactionUnconfirmedDataItem

Defines an `item` as one result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockchain** | **String** | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | 
**network** | **String** | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | 
**address** | **String** | Defines the specific address to which the token transaction has been sent and is pending confirmation. | 
**transactionId** | **String** | Defines the unique ID of the specific transaction, i.e. its identification number. | 
**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | Defines the type of token sent with the transaction, e.g. ERC 20. | 
**token** | [**AddressTokensTransactionUnconfirmedToken**](AddressTokensTransactionUnconfirmedToken.md) |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) | Defines whether the transaction is \&quot;incoming\&quot; or \&quot;outgoing\&quot;. | 
**firstSeenInMempoolTimestamp** | **Integer** | Defines the exact time the transaction has been first accepted into the mempool to await confirmation as timestamp. | 



## Enum: TokenTypeEnum

Name | Value
---- | -----
ERC_20 | &quot;ERC-20&quot;
ERC_721 | &quot;ERC-721&quot;
OMNI | &quot;OMNI&quot;



## Enum: DirectionEnum

Name | Value
---- | -----
INCOMING | &quot;incoming&quot;
OUTGOING | &quot;outgoing&quot;



