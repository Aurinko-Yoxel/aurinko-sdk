

# ApiAccountOutDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**parentId** | **Long** |  |  [optional] |
|**serviceType** | **ServiceType** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**tokenStatus** | [**TokenStatusEnum**](#TokenStatusEnum) |  |  [optional] |
|**tokenError** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**daemon** | **Boolean** |  |  [optional] |
|**loginString** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**mailboxAddress** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**name2** | **String** |  |  [optional] |
|**serverUrl** | **String** |  |  [optional] |
|**serverUrl2** | **String** |  |  [optional] |
|**clientOrgId** | **String** |  |  [optional] |
|**authUserId** | **String** |  |  [optional] |
|**authOrgId** | **String** |  |  [optional] |
|**timezone** | **String** |  |  [optional] |
|**tokenIssuedAt** | **OffsetDateTime** |  |  [optional] |
|**authScopes** | **List&lt;Scope&gt;** |  |  [optional] |
|**authNativeScopes** | **List&lt;String&gt;** |  |  [optional] |
|**authObtainedAt** | **OffsetDateTime** |  |  [optional] |
|**authExpiresAt** | **OffsetDateTime** |  |  [optional] |
|**userId** | **String** |  |  [optional] |



## Enum: TokenStatusEnum

| Name | Value |
|---- | -----|
| DEAD | &quot;dead&quot; |
| INVALID | &quot;invalid&quot; |
| ACTIVE | &quot;active&quot; |
| REQUIRED | &quot;required&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAEMON | &quot;daemon&quot; |
| PERSONAL | &quot;personal&quot; |
| MANAGED | &quot;managed&quot; |



