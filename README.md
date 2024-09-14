<h1 style="text-align: center">Task Manager API</h1>

<div style="text-align: center">

[![Developed by kvanzi](https://img.shields.io/badge/Developed%20by-kvanzi-%236DB33F)](https://github.com/kvanzi)
![JDK](https://img.shields.io/badge/JDK-21.0.2-%23E76F00)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.3-%236DB33F)
[![PostgreSQL](https://img.shields.io/badge/DBMS-PostgreSQL-%236DB33F)](https://www.postgresql.org/)

Task Manager API is a service for creating, updating, deleting, and reading notes from a database.

## Description

</div>


Task Manager API provides a RESTful interface for managing tasks. It allows you to perform the following actions:

- Create a new task
- Update an existing task
- Delete a task
- Read all tasks or a specific task

<div style="text-align: center">

## Installation
</div>


1. Clone the repository:
    ```bash
    git clone https://github.com/kvanzi/task-manager-api.git
    ```

2. Navigate to the project directory:
    ```bash
    cd task-manager-api
    ```

3. Build and run the application:
    ```bash
    ./mvnw clean package
    ./mvnw spring-boot:run
    ```
<div style="text-align: center">

## Configuration
</div>

Database connection settings and other parameters can be specified in the `database.properties` file:

```properties
db.url=jdbc:postgresql://your_url
db.username=your_username
db.password=your_password
