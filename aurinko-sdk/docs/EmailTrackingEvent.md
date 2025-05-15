

# EmailTrackingEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional] |
|**location** | **String** |  |  [optional] |
|**userAgent** | **String** |  |  [optional] |
|**referrer** | **String** |  |  [optional] |
|**remoteAddr** | **String** |  |  [optional] |
|**openNumber** | **Integer** |  |  [optional] |
|**threadId** | **String** |  |  [optional] |
|**messageId** | **String** |  |  [optional] |
|**internetMessageId** | **String** |  |  [optional] |
|**trackingId** | **Long** |  |  [optional] |
|**trackingThreadId** | **String** | Thread id where tracking begins |  [optional] |
|**trackingMessageId** | **String** | Message id where tracking begins |  [optional] |
|**trackingInternetMessageId** | **String** | Rfc822 message id where tracking begins |  [optional] |
|**context** | **String** |  |  [optional] |
|**trackingCode** | **String** |  |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLICK | &quot;click&quot; |
| INITIAL | &quot;initial&quot; |
| REPLY | &quot;reply&quot; |
| REPLY_BOUNCE | &quot;replyBounce&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



