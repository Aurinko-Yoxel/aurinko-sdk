

# ScheduledDraft


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **Long** |  |  [optional] [readonly] |
|**sendTime** | **OffsetDateTime** |  |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**errorMessage** | **String** |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;scheduled&quot; |
| SENT | &quot;sent&quot; |
| FAILED | &quot;failed&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



