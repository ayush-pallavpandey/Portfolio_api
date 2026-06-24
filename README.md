# Portfolio API

A Spring Boot REST API project demonstrating backend development concepts.

## Features

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

## Tech Stack

- Java 17
- Spring Boot
- Maven
- Swagger OpenAPI
- Git
- GitHub

## Run Locally

```bash
mvn clean package
java -jar target/portfolio-api-0.0.1-SNAPSHOT.jar
# Portfolio API

Spring Boot REST API deployed on AWS EC2.

## Live URL

http://15.134.216.16:8080/hello

## Swagger

http://15.134.216.16:8080/swagger-ui/index.html

## Features

- REST APIs
- Service Layer
- Global Exception Handling
- Swagger Documentation
- AWS Deployment
- Maven Build

## Tech Stack Badges 
![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5-green)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![AWS](https://img.shields.io/badge/AWS-EC2-yellow)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-brightgreen)
![Git](https://img.shields.io/badge/Git-Version_Control-red)
- Java 17
- Spring Boot
- Maven
- AWS EC2
- Swagger
- GitHub


## Architecture Diagram
                Internet
                    │
                    ▼
        AWS EC2 Ubuntu Server
                    │
                    ▼
             Spring Boot API
                    │
        ┌───────────┼───────────┐
        ▼           ▼           ▼

    Controller   Service    Exception
      Layer       Layer      Handler

                    │
                    ▼

             Swagger/OpenAPI


