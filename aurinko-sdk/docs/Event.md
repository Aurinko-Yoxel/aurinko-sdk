

# Event


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] [readonly] |
|**etag** | **String** |  |  [optional] [readonly] |
|**calendarId** | **String** |  |  [optional] [readonly] |
|**createdTime** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastModifiedTime** | **OffsetDateTime** |  |  [optional] [readonly] |
|**subject** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**location** | **String** |  |  [optional] |
|**start** | [**EventDateTime**](EventDateTime.md) |  |  [optional] |
|**end** | [**EventDateTime**](EventDateTime.md) |  |  [optional] |
|**organizer** | [**Organizer**](Organizer.md) |  |  [optional] |
|**meetingInfo** | [**MeetingInfo**](MeetingInfo.md) |  |  [optional] |
|**recurrenceType** | [**RecurrenceTypeEnum**](#RecurrenceTypeEnum) |  |  [optional] [readonly] |
|**recurrence** | [**Recurrence**](Recurrence.md) |  |  [optional] |
|**reminder** | [**Reminder**](Reminder.md) |  |  [optional] |
|**occurrenceInfo** | [**OccurrenceInfo**](OccurrenceInfo.md) |  |  [optional] |
|**iCalUid** | **String** |  |  [optional] [readonly] |
|**globalId** | **String** |  |  [optional] [readonly] |
|**showAs** | **ShowAs** |  |  [optional] |
|**sensitivity** | **Sensitivity** |  |  [optional] |
|**categories** | **List&lt;String&gt;** |  |  [optional] [readonly] |
|**htmlLink** | **String** |  |  [optional] [readonly] |
|**hasAttachments** | **Boolean** |  |  [optional] [readonly] |
|**attachments** | [**List&lt;EmailAttachment&gt;**](EmailAttachment.md) |  |  [optional] |
|**omitted** | [**List&lt;OmittedEnum&gt;**](#List&lt;OmittedEnum&gt;) |  |  [optional] [readonly] |



## Enum: RecurrenceTypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| MASTER | &quot;master&quot; |
| OCCURRENCE | &quot;occurrence&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: List&lt;OmittedEnum&gt;

| Name | Value |
|---- | -----|
| DESCRIPTION | &quot;description&quot; |
| ATTENDEES | &quot;attendees&quot; |
| ATTACHMENTS | &quot;attachments&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



