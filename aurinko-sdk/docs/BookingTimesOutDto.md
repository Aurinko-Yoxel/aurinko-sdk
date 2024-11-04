

# BookingTimesOutDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;BookingMeetingInterval&gt;**](BookingMeetingInterval.md) | List of available meeting slots. |  [optional] |
|**startTime** | **OffsetDateTime** | Start time of available meeting slots. |  [optional] |
|**endTime** | **OffsetDateTime** | End time of available meeting slots. |  [optional] |
|**timeAvailableFor** | **String** | Time period (in ISO-8601 format) the profile is covering. For example, P3M (3 months), P4W (4 weeks), P5D (5 days). |  [optional] |
|**durationMinutes** | **Integer** | Length of meeting in minutes |  [optional] |
|**availabilityStep** | **Integer** | Determines the interval at which new meeting slots are made available throughout the working hours. Allowed values are 5, 10, 15, 20, 30, 60. |  [optional] |
|**subject** | **String** | Subject for events booked using this profile. |  [optional] |
|**primaryColor** | **String** | Primary Color, taken from the application settings. |  [optional] |
|**secondaryColor** | **String** | The second Color, taken from the application settings. |  [optional] |
|**additionalFields** | [**List&lt;AdditionalField&gt;**](AdditionalField.md) | List of substitution variables like {{name}}, {{openMeetingUrl}},... |  [optional] |
|**nextPageToken** | **String** | Next page token |  [optional] |
|**nextFromDate** | **LocalDate** | Next fromDate to iterate a big time intervals |  [optional] |



