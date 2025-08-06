

# ConversationDripStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**convoId** | **String** |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**rule** | [**FollowupRuleAggregateOut**](FollowupRuleAggregateOut.md) |  |  [optional] |
|**dripStartedAt** | **OffsetDateTime** |  |  [optional] |
|**dripLastNum** | **Integer** |  |  [optional] |
|**dripError** | **String** |  |  [optional] |
|**dripEndedAt** | **OffsetDateTime** |  |  [optional] |
|**actionVars** | **Map&lt;String, String&gt;** |  |  [optional] |
|**targets** | **List&lt;String&gt;** |  |  [optional] |
|**dripResponder** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| ACTIVE | &quot;active&quot; |
| FAILED | &quot;failed&quot; |
| FINISHED | &quot;finished&quot; |
| RULE_INCOMPLETE | &quot;ruleIncomplete&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



