# Spring Boot CRUD with H2 Database & Swagger

This is a simple **Spring Boot application** that demonstrates how to perform **CRUD operations** on a `User` entity using **Spring Data JPA** with an **H2 in-memory database**.  
It also includes a REST API endpoint to fetch the **second highest salary expectation** among users.  

The project is fully documented with **Swagger UI** and can be tested using **Postman** or the **H2 Console**.  

---

##  Features
- Create, Read, Update, Delete Users
- Fetch the second highest salary
- In-memory **H2 Database** for testing
- API documentation with **Swagger** 

---

##  Dependencies (Spring Initializr)
- Spring Web
- Spring Data JPA
- H2 Database
- Springdoc OpenAPI (Swagger UI) 
- **Lombok** (optional)  

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | `/users` | Create a new user |
| GET    | `/users` | Fetch all users |
| GET    | `/users/{id}` | Fetch user by ID |
| PUT    | `/users/{id}` | Update user details |
| DELETE | `/users/{id}` | Delete user |
| GET    | `/users/second-highest-salary` | Get the second highest salary |

---

##  How to Run

###  Sample Data
The app initializes with some default users (via `src/main/resources/data.sql`):

```sql
INSERT INTO USER (id, name, salary) VALUES (1, 'Alice', 50000);
INSERT INTO USER (id, name, salary) VALUES (2, 'Bob', 60000);
INSERT INTO USER (id, name, salary) VALUES (3, 'Charlie', 70000);
INSERT INTO USER (id, name, salary) VALUES (4, 'David', 55000);
```
## 1. Swagger UI
After running the application, open:
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## 2. H2 Database Console
Open:
[http://localhost:8080/h2-console](http://localhost:8080/h2-console)

- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** (leave blank)

### Test Queries: 

SHOW TABLES;

SELECT * FROM USERS;

SELECT DISTINCT SALARY FROM USERS ORDER BY SALARY DESC LIMIT 1 OFFSET 1;

## 3. Testing with Postman

**Create User (POST)**
**URL:** `http://localhost:8080/users`  
**Body (JSON):**

{
  "name": "Eve",
  
  "salary": 65000
}

**Get All Users (GET)**
`http://localhost:8080/users`

**Second Highest Salary (GET)**
`http://localhost:8080/users/second-highest-salary`

---
## **GitHub Repository**

Repository URL:
https://github.com/Sanjana1279/Spring-CRUD-H2-with-Second-Highest-Salary

