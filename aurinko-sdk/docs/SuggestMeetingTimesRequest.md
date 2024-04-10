

# SuggestMeetingTimesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeMin** | **OffsetDateTime** | The lower bound of the time interval to search for available meeting times. |  [optional] |
|**timeMax** | **OffsetDateTime** | The upper bound of the time interval to search for available meeting times. |  [optional] |
|**durationMinutes** | **Integer** | The duration of the meeting to search time for. |  [optional] |
|**availabilityStep** | **Integer** | Determines the interval at which new meeting slots are made available throughout the working hours. |  [optional] |
|**attendees** | [**List&lt;MeetingAttendee&gt;**](MeetingAttendee.md) | The attendees to consider when searching for available meeting times. |  [optional] |
|**defaultTimezone** | **String** | Timezone (IANA) to use when no timezone information is available for the attendees. |  [optional] |
|**defaultWorkHours** | [**WeekWorkSchedule**](WeekWorkSchedule.md) |  |  [optional] |
|**freeStatuses** | **List&lt;ShowAs&gt;** | The statuses from /freeBusy request to consider as free time for the attendees. |  [optional] |



