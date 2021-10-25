

# GetTransactionRequestDetailsRI


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalDetails** | **String** | Defines an optional note for additional details. | 
**blockchain** | [**BlockchainEnum**](#BlockchainEnum) | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | 
**feePriority** | [**FeePriorityEnum**](#FeePriorityEnum) | Defines the priority for the fee, if it is \&quot;slow\&quot;, \&quot;standard\&quot; or \&quot;fast\&quot;. | 
**network** | [**NetworkEnum**](#NetworkEnum) | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | 
**recipients** | [**List&lt;GetTransactionRequestDetailsRIRecipients&gt;**](GetTransactionRequestDetailsRIRecipients.md) | Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list. | 
**totalTransactionAmount** | **String** | Defines the total transaction amount. | 
**transactionRequestStatus** | [**TransactionRequestStatusEnum**](#TransactionRequestStatusEnum) | Defines the status of the transaction request, e.g. pending. | 
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Defines the transaction type, if it is for coins or tokens. | 
**unit** | **String** | Defines the unit of the amount. | 
**walletId** | **String** | Defines the unique ID of the Wallet. | 



## Enum: BlockchainEnum

Name | Value
---- | -----
BITCOIN | &quot;bitcoin&quot;
BITCOIN_CASH | &quot;bitcoin-cash&quot;
LITECOIN | &quot;litecoin&quot;
DOGECOIN | &quot;dogecoin&quot;
DASH | &quot;dash&quot;
ETHEREUM | &quot;ethereum&quot;
ZCASH | &quot;zcash&quot;



## Enum: FeePriorityEnum

Name | Value
---- | -----
SLOW | &quot;slow&quot;
STANDARD | &quot;standard&quot;
FAST | &quot;fast&quot;



## Enum: NetworkEnum

Name | Value
---- | -----
MAINNET | &quot;mainnet&quot;
TESTNET | &quot;testnet&quot;
ROPSTEN | &quot;ropsten&quot;



## Enum: TransactionRequestStatusEnum

Name | Value
---- | -----
CREATED | &quot;created&quot;
AWAIT_APPROVAL | &quot;await-approval&quot;
PENDING | &quot;pending&quot;
PREPARED | &quot;prepared&quot;
SIGNED | &quot;signed&quot;
BROADCASTED | &quot;broadcasted&quot;
SUCCESS | &quot;success&quot;
FAILED | &quot;failed&quot;
REJECTED | &quot;rejected&quot;
MINED | &quot;mined&quot;



## Enum: TransactionTypeEnum

Name | Value
---- | -----
COIN | &quot;coin&quot;
TOKEN | &quot;token&quot;



