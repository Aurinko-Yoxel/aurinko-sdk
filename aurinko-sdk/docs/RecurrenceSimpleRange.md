

# RecurrenceSimpleRange


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**recurrenceStart** | [**EventDateTime**](EventDateTime.md) |  |  [optional] |
|**recurrenceEnd** | **LocalDate** |  |  [optional] |
|**count** | **Integer** |  |  [optional] |
|**patternExclusions** | [**List&lt;EventDateTime&gt;**](EventDateTime.md) |  |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BYDATE | &quot;byDate&quot; |
| BYCOUNT | &quot;byCount&quot; |
| UNBOUNDED | &quot;unbounded&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



