# 🚀 Portfolio API

> A production-ready Spring Boot REST API demonstrating modern Java backend development practices, clean architecture, RESTful design, and cloud deployment on AWS EC2.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5-green)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![AWS](https://img.shields.io/badge/AWS-EC2-yellow)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-brightgreen)
![Git](https://img.shields.io/badge/Git-Version_Control-red)
![License](https://img.shields.io/badge/License-MIT-blue)


![Status](https://img.shields.io/badge/Status-Active-success)
![Version](https://img.shields.io/badge/version-v1.0.0-blue)
![Build](https://img.shields.io/badge/Build-Passing-brightgreen)
![Maintained](https://img.shields.io/badge/Maintained-Yes-success)

---

# 📖 Overview

Portfolio API is a lightweight Spring Boot REST application created to demonstrate backend engineering skills using industry-standard development practices.

The project showcases how to design RESTful APIs, organize business logic using a layered architecture, document APIs with Swagger/OpenAPI, and deploy a Java application on an AWS EC2 instance.

It serves as a foundation for larger enterprise backend systems.

---

## 📌 Project Information

| Property | Value |
|----------|-------|
| Language | Java 17 |
| Framework | Spring Boot 3.5 |
| Build Tool | Maven |
| Architecture | Layered Architecture |
| API Style | REST |
| Documentation | Swagger/OpenAPI |
| Deployment | AWS EC2 |
| Status | Active Development |

---

# ❓ What Problem Does This Solve?

Developers and recruiters often need a simple but production-style project that demonstrates backend fundamentals beyond basic CRUD examples.

This project provides:

- REST API development using Spring Boot
- Clean separation of concerns
- Structured service layer
- Global exception handling
- API documentation
- AWS deployment
- Maven build automation

Instead of being just another demo application, this repository demonstrates the workflow followed in professional backend development.

---

# 💡 Why Did I Build It?

I built this project to strengthen my understanding of Java backend development and to showcase practical skills expected from a Java Backend Developer.

The objectives were:

- Learn Spring Boot fundamentals
- Build RESTful APIs
- Understand layered architecture
- Practice exception handling
- Generate interactive API documentation
- Deploy applications on AWS EC2
- Follow clean project organization
- Create a project suitable for recruiters and technical interviews

---

# ✨ Features

- RESTful API Development
- GET APIs
- POST APIs
- PUT APIs
- DELETE APIs
- RequestBody
- PathVariable
- RequestParam
- Service Layer Architecture
- Global Exception Handling
- Swagger/OpenAPI Documentation
- Maven Build & Packaging
- AWS EC2 Deployment
- Clean Project Structure
- Production-ready Configuration

---

# 🛠 Technologies Used

| Category | Technology |
|----------|------------|
| Language | Java 17 |
| Framework | Spring Boot 3.5 |
| Build Tool | Maven |
| Documentation | Swagger / OpenAPI |
| Cloud | AWS EC2 (Ubuntu) |
| Version Control | Git |
| Repository | GitHub |

---

# 🏗 Architecture

The project follows a layered architecture to ensure maintainability, scalability, and separation of responsibilities.

```
   Internet
      │
      ▼
AWS EC2 Ubuntu
      │
      ▼
Spring Boot
      │
 ┌────┼────┐
 ▼    ▼    ▼
Controller
Service
Exception
      │
      ▼
Swagger UI
```

### Layers

### Controller

Handles HTTP requests and responses.

### Service

Contains business logic.

### Exception Handler

Provides centralized exception management.

This architecture follows Spring Boot best practices and keeps responsibilities well separated.

---

# 📂 Project Structure

```
portfolio-api
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── controller
│   │   │   ├── service
│   │   │   ├── exception
│   │   │   └── PortfolioApiApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
├── README.md
└── target
```

---

# 🚀 Run Locally

### Clone Repository

```bash
git clone https://github.com/yourusername/portfolio-api.git
```

---

### Navigate to Project

```bash
cd portfolio-api
```

---

### Build

```bash
mvn clean package
```

---

### Run

```bash
java -jar target/portfolio-api-0.0.1-SNAPSHOT.jar
```

The application will start on:

```
http://localhost:8080
```

---

# ☁ AWS Deployment

This application is deployed on an AWS EC2 Ubuntu instance.

### Live API

```
http://15.134.216.16:8080/hello
```

---

### Swagger Documentation

```
http://15.134.216.16:8080/swagger-ui/index.html
```

---

# 📚 API Documentation

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /hello | Returns welcome message |

Future endpoints will include:

- User APIs
- Authentication APIs
- CRUD APIs
- Validation APIs

---

# 🧪 Example Response

```
GET /hello

Response

Hello from Spring Boot deployed on AWS!
```

---

# 🔥 Highlights

✔ RESTful API Development

✔ Clean Layered Architecture

✔ Swagger Integration

✔ AWS EC2 Deployment

✔ Maven Packaging

✔ Git Version Control

✔ Production-ready Structure

---

# 🔮 Future Improvements

The project is continuously evolving.

Planned enhancements include:

- Spring Security
- JWT Authentication
- Hibernate & JPA
- MySQL Database Integration
- Docker Support
- GitHub Actions CI/CD
- Unit Testing with JUnit
- Mockito Testing
- Logging with SLF4J
- Health Checks using Spring Boot Actuator
- Docker Compose
- Nginx Reverse Proxy
- HTTPS Support
- AWS RDS Integration
- Microservices Migration
- Kubernetes Deployment

---

# 📈 Learning Outcomes

Through this project I gained practical experience in:

- Spring Boot Fundamentals
- REST API Development
- Layered Architecture
- API Documentation
- Maven Project Management
- Cloud Deployment
- Git Workflow
- Backend Project Organization

---

# 🤝 Contributing

Contributions, suggestions, and feedback are always welcome.

Feel free to fork the repository and submit a Pull Request.

---
.
