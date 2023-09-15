

# DripRequestDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**ruleId** | **Long** |  |  [optional] |
|**dripAfter** | **OffsetDateTime** |  |  [optional] |
|**targets** | **List&lt;String&gt;** |  |  [optional] |
|**actionVars** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| ACTIVE | &quot;active&quot; |



