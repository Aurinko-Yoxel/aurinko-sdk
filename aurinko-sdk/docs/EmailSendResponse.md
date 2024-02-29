

# EmailSendResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**threadId** | **String** |  |  [optional] |
|**processingStatus** | [**ProcessingStatusEnum**](#ProcessingStatusEnum) |  |  [optional] |
|**processingError** | [**EmailSendError**](EmailSendError.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OK | &quot;Ok&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ProcessingStatusEnum

| Name | Value |
|---- | -----|
| OK | &quot;Ok&quot; |
| INCOMPLETE | &quot;Incomplete&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



