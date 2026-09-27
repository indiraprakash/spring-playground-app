# Web App Module

Spring Boot web application that provides REST API endpoints for customer management.

## Dependencies

- **customer-service**: Reusable library for customer business logic
- **spring-boot-starter-web**: Spring Web support

## Running

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`.

## API Endpoints

### Get Customer Info
```bash
GET /api/customers/{id}
curl http://localhost:8080/api/customers/1
```

### Validate Customer Email
```bash
POST /api/customers/validate?email=user@example.com
curl -X POST "http://localhost:8080/api/customers/validate?email=john@example.com"
```