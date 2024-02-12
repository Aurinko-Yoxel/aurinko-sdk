

# BookingUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Profile name used in the link to the list of available meeting slots. |  [optional] |
|**durationMinutes** | **Integer** | Duration of the meeting in minutes. |  [optional] |
|**availabilityStep** | **Integer** | Determines the interval at which new meeting slots are made available throughout the working hours. |  [optional] |
|**startTime** | **OffsetDateTime** | The beginning of the formation of intervals. Must be in the future, otherwise the current time will be used. |  [optional] |
|**timeAvailableFor** | **String** | Period to search for available meetings. Format is ISO-8601. For example P3M (3 months), P4W (4 weeks), P5D (5 days). |  [optional] |
|**subject** | **String** | Subject for creating an event about a meeting in the calendar. |  [optional] |
|**description** | **String** | Description of the meeting event on the calendar. |  [optional] |
|**location** | **String** | Location of the meeting event on the calendar. |  [optional] |
|**workHours** | [**WeekWorkSchedule**](WeekWorkSchedule.md) |  |  [optional] |
|**context** | **String** | The field for storing any information is available only within the profile. |  [optional] |
|**startConference** | **Boolean** | Whether to create a conference (hangoutsMeet, teamsForBusiness, etc.) in addition to a calendar event, not all providers support creating conferences. |  [optional] |
|**openMeetingUrl** | **String** | The value is used in the variable to be substituted into the description or topic of the meeting event. |  [optional] |



