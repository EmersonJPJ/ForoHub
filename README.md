# 🗨️ ForoHub  

ForoHub is a secure, feature-rich REST API built with **Spring Boot** to manage discussion topics efficiently. It offers JWT-based authentication, robust error handling, and modern development practices. With built-in Swagger documentation, you can easily explore and test the API endpoints.

---

## 🛠️ Features  

✅ **JWT Authentication**: Secure access to all endpoints.  
✅ **CRUD Operations**: Create, read, update, and delete topics.  
✅ **Flyway Migrations**: Manage database schema changes effortlessly.  
✅ **DTO Implementation**: Ensures clean and structured API responses.  
✅ **Swagger UI**: Integrated API documentation with `springdoc-openapi`.  
✅ **Error Handling**: Comprehensive HTTP error management.  
✅ **Modular Design**: Built with scalability and maintainability in mind.  

---

## 📖 API Documentation  

ForoHub includes detailed, interactive API documentation via **Swagger UI**.  

- **Access the Swagger UI**:  
  After starting the application, navigate to:
  ```
  http://localhost:8080/swagger-ui.html

  ```
Use it to explore and test all available endpoints.  

---

## 🔧 Tech Stack  

- **Framework**: Spring Boot (v3.4.1)  
- **Database**: MySQL with Flyway for version control  
- **Authentication**: JWT via `java-jwt`  
- **Validation**: Spring Boot Starter Validation  
- **Testing**: Spring Security Test, Spring Boot Starter Test  
- **Documentation**: `springdoc-openapi` for Swagger integration  

---

## ⚙️ How It Works  

1. **Authentication**:  
 - Users must log in to receive a JWT.  
 - All endpoints are protected and require a valid token.  

2. **Topic Management**:  
 - Submit JSON payloads to manage topics.  
 - Operations supported: Create, Read, Update, Delete.  

3. **Database Migrations**:  
 - Flyway ensures consistent schema updates.  

---

## 📂 Endpoints  

| Method | Endpoint          | Description                | Auth Required |
|--------|-------------------|----------------------------|---------------|
| POST   | `/api/login`      | User login, receive JWT    | ❌ No         |
| GET    | `/api/topics`     | List all topics            | ✅ Yes        |
| POST   | `/api/topics`     | Create a new topic         | ✅ Yes        |
| PUT    | `/api/topics/{id}`| Update an existing topic   | ✅ Yes        |
| DELETE | `/api/topics/{id}`| Delete a topic             | ✅ Yes        |

---

## 🚀 Getting Started  

### Prerequisites  

- **Java**: Version 21  
- **Maven**: Version 3.6+  
- **MySQL**: Version 8.0+  
- **API Testing Tool**: [Insomnia](https://insomnia.rest/) or Postman  

### Setup  

1. Clone the repository:  
 ```bash
 git clone https://github.com/EmersonJPJ/ForoHub.git
 cd ForoHub
```
### ⚙️ Configure the Database  

1. **Set up a MySQL database**:  
   Update your connection details in the `application.properties` file.  

2. **Run Flyway migrations**:  
   ```bash
   mvn flyway:migrate
  ```

### 🚀 Start the Application  

1. Use the following command to start the application:  
   ```bash
   mvn spring-boot:run
  ```
### 📘 Access the API Documentation  

Access the **Swagger UI** to explore and test the API:  
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)  

---


## 🤝 Contributing

Contributions are always welcome! If you have suggestions, improvements, or bug fixes, feel free to open an issue or create a pull request. 

---

## ✨ Contact  

Feel free to reach out for any questions or suggestions!  

- 📧 **Email**: emerson04vade@gmail.com  
- 💻 **GitHub**: EmersonJPJ

