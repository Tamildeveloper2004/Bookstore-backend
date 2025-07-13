 Book Store Backend

This is a RESTful backend application for managing a Book Store. It allows admins to manage book inventory and users to browse or purchase books.

---

## 📌 Table of Contents
1. [About the Project](#about-the-project)  
2. [Features](#features)  
3. [Tech Stack](#tech-stack)  
4. [Getting Started](#getting-started)  
5. [Installation](#installation)  
6. [API Endpoints](#api-endpoints)  
7. [Contributing](#contributing)  
8. [License](#license)  
9. [Author](#author)

---

##  About the Project

This backend application is built using Java and Spring Boot. It provides CRUD operations for managing books, user registration, and supports RESTful APIs for easy integration with a frontend or Postman.

---

##  Features

- Admin login and authentication  
- Add, update, delete book records  
- View books by category, author, or title  
- User registration and book purchase functionality  
- Secure endpoints using Spring Security (optional)  
- API-level validations and exception handling  

---

##  Tech Stack

- *Java 17*  
- *Spring Boot*  
- *Spring Data JPA*  
- *MySQL*  
- *Maven*  
- *Postman*  
- *Git & GitHub*

---

##  Getting Started

bash
# Clone the repository
git clone https://github.com/your-username/book-store-backend.git

# Navigate to the project directory
cd book-store-backend

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run


---

##  Installation

1. Install Java and Maven  
2. Install MySQL and create a database bookstore  
3. Configure your application.properties:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update


4. Import SQL schema if provided  
5. Run the app using terminal or your IDE

---

##  API Endpoints

| Method | Endpoint            | Description            |
|--------|---------------------|------------------------|
| GET    | /api/books          | Get all books          |
| GET    | /api/books/{id}     | Get book by ID         |
| POST   | /api/books          | Add a new book         |
| PUT    | /api/books/{id}     | Update a book          |
| DELETE | /api/books/{id}     | Delete a book          |
| POST   | /api/users/register | User registration      |

---

##  Contributing

Pull requests are welcome. For major changes, open an issue first to discuss what you'd like to change.

---

##  License

This project is open-source and available under the [MIT License](LICENSE).

---

##  Author

- 👤 Tamil Selvan  
- 🔗 [GitHub](https://github.com/your-github)  
- 🔗 [LinkedIn](https://linkedin.com/in/tamil-selvan-developer)

---
