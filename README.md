# Library-spring-kafka-microservices

 Demo project for spring, microservices and asynchronous communication/messaging using kafka.Implemented using clean architecture, domain driven design and test drive development

## Getting Started
In this repository I will be implementing a simple microservices application that will allow to manage a library. The application will have the following modules:
1. **Library-service**: This service will be responsible for managing the books in the library. It will have basic CRUD  operations for books.
2. **Reservation-service**: This service will be responsible for managing users and reservations. It will have two aggregate roots: User and Reservation. 
    - The user aggregate will provide basic CRUD operations for users.
    - The reservation aggregate will provide the following operations:
        - Request a book
        - Return a book

3. **The Stack**:
    - **Spring** Boot: For creating the microservices
    - **Spring** Data JPA: For data access
    - **Kafka**: For asynchronous communication
    - **Docker**: For containerization of the services
    - **Lombok**: For reducing boilerplate code
    - **Junit**: For testing
    - **Mockito**: For mocking objects in tests
    - **Testcontainers**: For integration testing with docker containers
    - **MySQL**: For storing the data in the library service
    - **Cassandra**: For storing the use data in the reservation service
    - **MariaDB**: For storing the reservation data in the reservation service
    - **H2**: For in-memory database for testing
    - **Swagger**: For API documentation

## Implementation Overview
![Library Service](./docs/imgs/LogicalView.svg)
