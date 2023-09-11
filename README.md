# Generate Aurinko SDK

1. Download or install latest [openapi-generator](https://github.com/OpenAPITools/openapi-generator)
```
brew install openapi-generator
```
2. Generate an sdk
```
openapi-generator generate -c config.json -i https://api.aurinko.io/assets/swagger.json -g java -o aurinko-sdk
```
3. Go to aurinko-sdk and build jar
```
cd aurinko-sdk
mvn package
cd target
```
4. Take **aurinko-api-1.0.0.jar** and use it, here are **aurinko-api-1.0.0-javadoc.jar** and **aurinko-api-1.0.0-sources.jar**. 

