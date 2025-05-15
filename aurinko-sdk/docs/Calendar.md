

# Calendar


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  [optional] |
|**color** | **String** |  |  [optional] [readonly] |
|**description** | **String** |  |  [optional] [readonly] |
|**accessRole** | [**AccessRoleEnum**](#AccessRoleEnum) |  |  [optional] [readonly] |
|**primary** | **Boolean** |  |  [optional] [readonly] |
|**multipleRemindersSupported** | **Boolean** |  |  [optional] [readonly] |
|**defaultReminders** | [**List&lt;ReminderOverride&gt;**](ReminderOverride.md) |  |  [optional] |



## Enum: AccessRoleEnum

| Name | Value |
|---- | -----|
| OWNER | &quot;owner&quot; |
| WRITER | &quot;writer&quot; |
| READER | &quot;reader&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



