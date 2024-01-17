

# TaskUpdate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  [optional] |
|**parentId** | **String** |  |  [optional] |
|**previousId** | **String** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**importance** | [**ImportanceEnum**](#ImportanceEnum) |  |  [optional] |
|**due** | **OffsetDateTime** |  |  [optional] |
|**startDateTime** | **OffsetDateTime** |  |  [optional] |
|**categories** | **List&lt;String&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOTSTARTED | &quot;notStarted&quot; |
| INPROGRESS | &quot;inProgress&quot; |
| COMPLETED | &quot;completed&quot; |
| WAITINGONOTHERS | &quot;waitingOnOthers&quot; |
| DEFERRED | &quot;deferred&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ImportanceEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| NORMAL | &quot;normal&quot; |
| HIGH | &quot;high&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



