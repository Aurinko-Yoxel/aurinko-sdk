

# MeetingAttendee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** |  |  [optional] |
|**timezone** | **String** |  |  [optional] |
|**workHours** | [**WeekWorkSchedule**](WeekWorkSchedule.md) |  |  [optional] |
|**error** | **String** |  |  [optional] [readonly] |
|**busyIntervals** | [**List&lt;TimeInterval&gt;**](TimeInterval.md) | Busy intervals for the attendee. If set, these intervals will be excluded when searching for available meeting times. Can be combined with &#x60;freeIntervals&#x60;. |  [optional] |
|**freeIntervals** | [**List&lt;TimeInterval&gt;**](TimeInterval.md) | Free time intervals for the attendee. If set, this parameter will limit the search for available meeting times. Can be combined with &#x60;busyIntervals&#x60;. |  [optional] |



