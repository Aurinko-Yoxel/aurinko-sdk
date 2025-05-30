

# EmailMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] [readonly] |
|**threadId** | **String** |  |  [optional] [readonly] |
|**createdTime** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastModifiedTime** | **OffsetDateTime** |  |  [optional] [readonly] |
|**sentAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**receivedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**internetMessageId** | **String** |  |  [optional] [readonly] |
|**subject** | **String** |  |  [optional] [readonly] |
|**sysLabels** | **List&lt;SysLabel&gt;** |  |  [optional] [readonly] |
|**keywords** | **List&lt;String&gt;** |  |  [optional] |
|**sysClassifications** | [**List&lt;SysClassificationsEnum&gt;**](#List&lt;SysClassificationsEnum&gt;) |  |  [optional] [readonly] |
|**sensitivity** | **Sensitivity** |  |  [optional] |
|**meetingMessageMethod** | [**MeetingMessageMethodEnum**](#MeetingMessageMethodEnum) |  |  [optional] |
|**from** | [**EmailAddress**](EmailAddress.md) |  |  [optional] |
|**to** | [**List&lt;EmailAddress&gt;**](EmailAddress.md) |  |  [optional] |
|**cc** | [**List&lt;EmailAddress&gt;**](EmailAddress.md) |  |  [optional] |
|**bcc** | [**List&lt;EmailAddress&gt;**](EmailAddress.md) |  |  [optional] |
|**replyTo** | [**List&lt;EmailAddress&gt;**](EmailAddress.md) |  |  [optional] |
|**hasAttachments** | **Boolean** |  |  [optional] [readonly] |
|**body** | **String** |  |  [optional] [readonly] |
|**bodySnippet** | **String** |  |  [optional] [readonly] |
|**attachments** | [**List&lt;EmailAttachment&gt;**](EmailAttachment.md) |  |  [optional] |
|**inReplyTo** | **String** |  |  [optional] [readonly] |
|**references** | **String** |  |  [optional] [readonly] |
|**threadIndex** | **String** |  |  [optional] [readonly] |
|**internetHeaders** | [**List&lt;EmailHeader&gt;**](EmailHeader.md) |  |  [optional] |
|**nativeProperties** | **Map&lt;String, String&gt;** |  |  [optional] |
|**folderId** | **String** |  |  [optional] [readonly] |
|**webLink** | **String** |  |  [optional] [readonly] |
|**omitted** | [**List&lt;OmittedEnum&gt;**](#List&lt;OmittedEnum&gt;) |  |  [optional] [readonly] |



## Enum: List&lt;SysClassificationsEnum&gt;

| Name | Value |
|---- | -----|
| PERSONAL | &quot;personal&quot; |
| SOCIAL | &quot;social&quot; |
| PROMOTIONS | &quot;promotions&quot; |
| UPDATES | &quot;updates&quot; |
| FORUMS | &quot;forums&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: MeetingMessageMethodEnum

| Name | Value |
|---- | -----|
| REQUEST | &quot;request&quot; |
| REPLY | &quot;reply&quot; |
| CANCEL | &quot;cancel&quot; |
| COUNTER | &quot;counter&quot; |
| OTHER | &quot;other&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: List&lt;OmittedEnum&gt;

| Name | Value |
|---- | -----|
| THREAD_ID | &quot;threadId&quot; |
| BODY | &quot;body&quot; |
| ATTACHMENTS | &quot;attachments&quot; |
| RECIPIENTS | &quot;recipients&quot; |
| INTERNET_HEADERS | &quot;internetHeaders&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



