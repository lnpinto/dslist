# DSList API

## Overview

DSList is a RESTful API built using Java and the Spring Framework. This API provides functionalities to manage and interact with a list of items, which could be games, movies, or any other type of data. The project is designed to be scalable, maintainable, and easy to integrate with other systems.

## Features

- **CRUD Operations**: Create, Read, Update, and Delete items in the list.
- **RESTful Endpoints**: Standardized endpoints for interacting with the API.
- **Spring Boot**: Leverages the power of Spring Boot for rapid development and deployment.
- **Database Integration**: Uses a relational database (e.g., MySQL, PostgreSQL) for persistent storage.
- **Swagger Documentation**: API documentation is automatically generated using Swagger.

## Technologies Used

- **Java**: The core programming language used for development.
- **Spring Boot**: Framework for building the API.
- **Spring Data JPA**: For database interactions.
- **Hibernate**: ORM (Object-Relational Mapping) tool.
- **Maven**: Build automation and dependency management.
- **Swagger**: API documentation and testing.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher.
- Maven 3.x.
- A relational database (e.g., MySQL, PostgreSQL).
- Git (optional, for cloning the repository).

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/lnpinto/dslist.git
   cd dslist
   ```

2. **Configure the Database**:
   - Update the `application.properties` file with your database credentials.
   - Example for MySQL:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/dslist
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Build the Project**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the API**:
   - The API will be available at `http://localhost:8080`.
   - Swagger UI can be accessed at `http://localhost:8080/swagger-ui.html`.

## API Endpoints

### Items

- **GET /items**: Retrieve all items.
- **GET /items/{id}**: Retrieve a specific item by ID.
- **POST /items**: Create a new item.
- **PUT /items/{id}**: Update an existing item.
- **DELETE /items/{id}**: Delete an item.

### Example Requests

- **Get All Items**:
  ```bash
  curl -X GET http://localhost:8080/items
  ```

- **Create a New Item**:
  ```bash
  curl -X POST http://localhost:8080/items -H "Content-Type: application/json" -d '{"name": "New Item", "description": "This is a new item"}'
  ```

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeatureName`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeatureName`).
5. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, please contact the repository owner:

- **Name**: Lucas Pinto
- **GitHub**: [lnpinto](https://github.com/lnpinto)
- **Email**: [lnptrados@gmail.com]

---

This is a provisional README file. More details will be added as the project evolves.
