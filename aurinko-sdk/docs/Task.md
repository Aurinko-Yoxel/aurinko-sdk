

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
|**status** | **TaskStatus** |  |  [optional] |
|**importance** | **TaskImportance** |  |  [optional] |
|**due** | **OffsetDateTime** |  |  [optional] |
|**completed** | **OffsetDateTime** |  |  [optional] |
|**links** | [**List&lt;TaskLink&gt;**](TaskLink.md) |  |  [optional] |
|**startDateTime** | **OffsetDateTime** |  |  [optional] |
|**categories** | **List&lt;String&gt;** |  |  [optional] |
|**owner** | **String** |  |  [optional] |
|**omitted** | [**List&lt;OmittedEnum&gt;**](#List&lt;OmittedEnum&gt;) |  |  [optional] [readonly] |



## Enum: List&lt;OmittedEnum&gt;

| Name | Value |
|---- | -----|
| NOTES | &quot;notes&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



