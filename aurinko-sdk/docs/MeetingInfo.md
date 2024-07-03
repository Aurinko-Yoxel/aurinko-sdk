

# MeetingInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canceled** | **Boolean** |  |  [optional] [readonly] |
|**attendees** | [**List&lt;Attendee&gt;**](Attendee.md) |  |  [optional] |
|**response** | **MeetingResponseType** |  |  [optional] |
|**attendeePermissions** | [**List&lt;AttendeePermissionsEnum&gt;**](#List&lt;AttendeePermissionsEnum&gt;) |  |  [optional] |
|**onlineMeeting** | **Boolean** | Assumes default onlineMeetingProvider (&#39;hangoutsMeet&#39; or &#39;teamsForBusiness&#39;) |  [optional] |
|**onlineMeetingProvider** | **String** | Value of provider, for example hangoutsMeet, teamsForBusiness, skypeForBusiness, skypeForConsumer |  [optional] |
|**onlineMeetingDetails** | [**OnlineMeetingDetails**](OnlineMeetingDetails.md) |  |  [optional] |



## Enum: List&lt;AttendeePermissionsEnum&gt;

| Name | Value |
|---- | -----|
| INVITEOTHERS | &quot;inviteOthers&quot; |
| MODIFY | &quot;modify&quot; |
| SEEOTHERS | &quot;seeOthers&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



