

# Task


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**etag** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**lastModifiedTime** | **OffsetDateTime** |  |  [optional] |
|**parentId** | **String** |  |  [optional] |
|**position** | **String** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**importance** | [**ImportanceEnum**](#ImportanceEnum) |  |  [optional] |
|**due** | **OffsetDateTime** |  |  [optional] |
|**completed** | **OffsetDateTime** |  |  [optional] |
|**links** | [**List&lt;TaskLink&gt;**](TaskLink.md) |  |  [optional] |
|**startDateTime** | **OffsetDateTime** |  |  [optional] |
|**categories** | **List&lt;String&gt;** |  |  [optional] |
|**owner** | **String** |  |  [optional] |
|**omitted** | [**List&lt;OmittedEnum&gt;**](#List&lt;OmittedEnum&gt;) |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOTSTARTED | &quot;notStarted&quot; |
| INPROGRESS | &quot;inProgress&quot; |
| COMPLETED | &quot;completed&quot; |
| WAITINGONOTHERS | &quot;waitingOnOthers&quot; |
| DEFERRED | &quot;deferred&quot; |



## Enum: ImportanceEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| NORMAL | &quot;normal&quot; |
| HIGH | &quot;high&quot; |



## Enum: List&lt;OmittedEnum&gt;

| Name | Value |
|---- | -----|
| NOTES | &quot;notes&quot; |



