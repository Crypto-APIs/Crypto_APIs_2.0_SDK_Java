

# ListCoinsForwardingAutomationsRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callbackUrl** | **String** | Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs. &#x60;We support ONLY httpS type of protocol&#x60;. |  |
|**confirmationsCountTrigger** | **Integer** | Represents the total count of the transaction confirmations before triggering the event. |  |
|**createdTimestamp** | **Integer** | Defines the specific time/date when the automatic forwarding was created in Unix Timestamp. |  |
|**feePriority** | [**FeePriorityEnum**](#FeePriorityEnum) | Represents the fee priority of the automation, whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; OR \&quot;FAST\&quot;. |  |
|**fromAddress** | **String** | Represents the hash of the address that forwards the currency. |  |
|**minimumTransferAmount** | **String** | Represents the minimum transfer amount of the currency in the &#x60;fromAddress&#x60; that can be allowed for an automatic forwarding. |  |
|**referenceId** | **String** | Represents a unique ID used to reference the specific forwarding automation. |  |
|**toAddress** | **String** | Represents the hash of the address the currency is forwarded to. |  |



## Enum: FeePriorityEnum

| Name | Value |
|---- | -----|
| SLOW | &quot;slow&quot; |
| STANDARD | &quot;standard&quot; |
| FAST | &quot;fast&quot; |



