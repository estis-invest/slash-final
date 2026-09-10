# /FINAL
##### Pronounced: *Slash Final*

This is an anime voting tournament where characters battle it out with the help of your vote. 

## Requirements
- JDK 25
- No local Maven installation required

## Getting started

### Clone Repository
Future update when remote repository is created.

### Run /FINAL

#### Step 1 - Build, Test and Install

```shell
./mvnw clean install
```
To verify build without installing artifacts in the local Maven repository:
 ```shell
./mvnw clean verify
```

#### Step 2 - Execute /FINAL
```shell
./mvnw -f slash-final-bootstrap/pom.xml spring-boot:run   
```

#### Step 3 - Check Application Health
```shell
curl http://localhost:8080/actuator/health
```
> The expected response includes: ``"status": "UP"``.






