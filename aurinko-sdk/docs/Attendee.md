

# Attendee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] [readonly] |
|**emailAddress** | [**EmailAddress**](EmailAddress.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**response** | [**ResponseEnum**](#ResponseEnum) |  |  [optional] [readonly] |
|**comment** | **String** |  |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REQUIRED | &quot;required&quot; |
| OPTIONAL | &quot;optional&quot; |
| RESOURCE | &quot;resource&quot; |



## Enum: ResponseEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| TENTITIVE | &quot;tentitive&quot; |
| DECLINED | &quot;declined&quot; |



