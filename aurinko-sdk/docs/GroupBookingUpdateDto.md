

# GroupBookingUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Profile name used in calendar links to identify a profile. |  [optional] |
|**durationMinutes** | **Integer** | Duration of the meeting in minutes. |  [optional] |
|**availabilityStep** | **Integer** | Determines the interval at which new meeting slots are made available throughout the working hours. Allowed values are 5, 10, 15, 20, 30, 60. |  [optional] |
|**startTime** | **OffsetDateTime** | The beginning of the formation of intervals. Must be in the future, otherwise the current time will be used. |  [optional] |
|**endTime** | **OffsetDateTime** | The ending of the formation of intervals. If the time specified here is in the past, the intervals will be empty, regardless of the Start time parameter. |  [optional] |
|**timeAvailableFor** | **String** | Time period (in ISO-8601 format) the profile is covering. For example, P3M (3 months), P4W (4 weeks), P5D (5 days). |  [optional] |
|**subject** | **String** | Subject for events booked using this profile. |  [optional] |
|**description** | **String** | Description for events booked using this profile. |  [optional] |
|**location** | **String** | Location for events booked using this profile. |  [optional] |
|**workHours** | [**WeekWorkSchedule**](WeekWorkSchedule.md) |  |  [optional] |
|**context** | **String** | Custom client data stored for the profile. |  [optional] |
|**startConference** | **Boolean** | Whether to create an online conference (hangoutsMeet, teamsForBusiness, etc.) for the event. Note, not all providers support creating conferences. |  [optional] |
|**openMeetingUrl** | **String** | The value of the {{openMeetingUrl}} variable that can be used in the event description or subject. |  [optional] |
|**clientOrgId** | **String** |  |  [optional] |



