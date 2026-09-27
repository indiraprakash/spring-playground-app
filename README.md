# Spring Playground App

Maven multi-module Spring project with centralized Spring Boot BOM management.

## Modules

- `customer-service`: reusable library packaged as a JAR.
- `web-app`: Spring Web executable application that depends on `customer-service`.

## Build

```bash
mvn clean verify
```

## Run

```bash
mvn -pl web-app spring-boot:run
```

The application starts on `http://localhost:8080`.

Example endpoint:

```bash
curl http://localhost:8080/api/customers/1
```
