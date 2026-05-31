# Incident Analysis Backend

A Spring Boot REST API backend for the Incident Analysis Tool, designed to support incident management, data entry tracking, category management, file uploads, and crisis intelligence workflows.

Built as part of an MSc research project in incident analysis, emergency response intelligence, and crisis data management.

---

# Features

## Incident Management API

- Create incidents
- Retrieve incidents
- Update incidents
- Delete incidents
- Incident category assignment
- Incident status management

## Category Management API

- Create categories
- Retrieve categories
- Update categories
- Delete categories
- Category usage tracking

## Data Entry Management API

- Create incident-related records
- Manage event sources
- Store timestamps and location information
- Associate records with incidents

## File Upload System

- Upload attachments
- Store supporting evidence files
- Link uploaded files to incidents
- Multipart file handling

## Data Persistence

- MySQL database integration
- JPA/Hibernate ORM
- Repository-based data access
- Entity relationship management

## REST API Layer

- JSON request/response handling
- CORS configuration
- Frontend integration support
- Structured service architecture

---

# Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST APIs

---

# Project Structure

```text
src/
│
├── main/
│   ├── java/
│   │   └── com.incidentanalysis.backend/
│   │
│   │       ├── controller/
│   │       │   ├── IncidentController.java
│   │       │   ├── CategoryController.java
│   │       │   ├── DataEntryController.java
│   │       │   └── AttachmentController.java
│   │       │
│   │       ├── service/
│   │       │   ├── IncidentService.java
│   │       │   ├── CategoryService.java
│   │       │   ├── DataEntryService.java
│   │       │   └── AttachmentService.java
│   │       │
│   │       ├── repository/
│   │       │   ├── IncidentRepository.java
│   │       │   ├── CategoryRepository.java
│   │       │   ├── DataEntryRepository.java
│   │       │   └── AttachmentRepository.java
│   │       │
│   │       ├── model/
│   │       │   ├── Incident.java
│   │       │   ├── Category.java
│   │       │   ├── DataEntry.java
│   │       │   └── Attachment.java
│   │       │
│   │       ├── config/
│   │       │   └── WebConfig.java
│   │       │
│   │       └── BackendApplication.java
│   │
│   └── resources/
│       └── application.properties
│
└── test/
```

---

# Current Functionality

## Implemented

- Full REST API architecture
- Incident CRUD operations
- Category CRUD operations
- Data entry management
- File upload support
- MySQL persistence
- JPA entity relationships
- Service and repository layers
- Frontend API integration
- Category normalization before persistence

## Planned Future Improvements

- User authentication and authorization
- JWT security implementation
- Role-based access control
- Audit logging
- Advanced search functionality
- Real-time incident updates
- AI-assisted incident classification
- Geospatial analytics support
- Cloud deployment

---

# Database Configuration

Create a local configuration using environment variables:

```env
DB_URL=jdbc:mysql://localhost:3306/incident_analysis
DB_USERNAME=incident_user
DB_PASSWORD=your_password_here
```

Application properties use:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

---

# Installation

Clone the repository:

```bash
git clone https://github.com/mahleek416/incident-analysis-backend.git
```

Navigate to the project:

```bash
cd incident-analysis-backend
```

Run the application:

```bash
./mvnw spring-boot:run
```

For Windows:

```bash
mvnw.cmd spring-boot:run
```

---

# API Architecture

```text
Client
   │
Controller Layer
   │
Service Layer
   │
Repository Layer
   │
MySQL Database
```

This layered architecture separates API handling, business logic, and data access, improving maintainability and scalability.

---

# Research Purpose

This backend was developed as part of MSc research focused on:

- Incident analysis
- Crisis informatics
- Emergency response intelligence
- Multi-source incident data integration
- Situational awareness systems
- Decision-support technologies

---

# Author

**Abdumaliq Oluwapelumi Onifade**

MSc Project — Incident Analysis Tool Backend

---

# License

This project is intended for academic and research purposes.
