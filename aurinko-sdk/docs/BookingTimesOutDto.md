

# BookingTimesOutDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;MeetingTime&gt;**](MeetingTime.md) | List of available meeting slots. |  [optional] |
|**startTime** | **OffsetDateTime** | Start time of available meeting slots. |  [optional] |
|**endTime** | **OffsetDateTime** | End time of available meeting slots. |  [optional] |
|**durationMinutes** | **Integer** | Length of meeting in minutes |  [optional] |
|**availabilityStep** | **Integer** | Determines the interval at which new meeting slots are made available throughout the working hours. |  [optional] |
|**subject** | **String** | Subject for creating an event about a meeting in the calendar. |  [optional] |
|**primaryColor** | **String** | Primary Color, taken from the application settings. |  [optional] |
|**secondaryColor** | **String** | The second Color, taken from the application settings. |  [optional] |
|**additionalFields** | [**List&lt;AdditionalField&gt;**](AdditionalField.md) | List of templates for value substitution |  [optional] |



