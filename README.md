# ToDo Microservice System

A modern, fullstack ToDo management application with microservice architecture using Angular, Spring Boot, and PostgreSQL.

## System Overview

This project consists of several containerized services:

- **Angular Frontend:** Delivers a rich single-page experience using the latest Angular features (Signals, Standalone Components) for responsive and reactive UI.
- **API Gateway:** Acts as an entry point for all client requests and distributes them among backend microservices using Spring Boot.
- **User Service:** Handles user registration, authentication, and management.
- **ToDo Service:** Manages ToDo-related business logic and persistence.
- **PostgreSQL Databases:** Store users and ToDo data for their respective services.
- **Communication:** 
  - Frontend interacts with the backend via REST/HTTPS.
  - Internal service communication is handled via gRPC/TLS.

## Architecture Diagram
![Container Architecture](todo_container_diagram.jpg)

## License
This project is licensed under the MIT License.
