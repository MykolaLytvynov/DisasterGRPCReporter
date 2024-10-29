# DisasterGRPCReporter
A Spring Boot web client application for reporting emergency situations via gRPC. This application allows users to notify a central service of disaster events by providing details such as city, disaster code, and a description.

## gRPC Service
- [EmergencyGRPCApp](https://github.com/MykolaLytvynov/EmergencyGRPCApp)

## Features
- Report emergencies with city name, disaster code, and description.
- REST API for submitting disaster reports.
- Integrates with a gRPC service to handle emergency reports.

## API Endpoints
- **POST /disaster:** Add a new disaster.

## Example JSON Request to add disaster
```json
{
  "city": "City",
  "code": 101,
  "description": "Severe flood in downtown area"
}
```

## Generate gRPC code
Generate Code from the .proto File
To generate the Java classes required for gRPC from the .proto file, use the following Maven command:
   ```
   mvn clean compile
   ```

## Configuration
- Host for the gRPC service (default: localhost)
- Port for the gRPC service (default: 8090)

## Dependencies
- Spring Boot Web.
- gRPC.
