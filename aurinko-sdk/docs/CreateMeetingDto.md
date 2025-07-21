

# CreateMeetingDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**time** | [**SelectedMeetingTime**](SelectedMeetingTime.md) |  |  [optional] |
|**groupXids** | **List&lt;String&gt;** |  |  [optional] |
|**accountIds** | **List&lt;Long&gt;** |  |  [optional] |
|**name** | **String** | Username of the person requesting the meeting (please, use schedulerInfo.name instead) |  [optional] |
|**email** | **String** | Email of the person requesting the meeting (please, use schedulerInfo.email instead) |  [optional] |
|**substitutionData** | **Map&lt;String, String&gt;** | Data for substitution instead of templates, key - value |  [optional] |
|**schedulerInfo** | [**SchedulerInfo**](SchedulerInfo.md) |  |  [optional] |



