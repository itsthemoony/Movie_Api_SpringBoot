# 🎬 Movie RESTful API - Spring Boot

A robust and scalable Movie REST API developed with Spring Boot. This API allows users to manage movies with full CRUD capabilities, including:

- 📁 File Uploads (e.g., movie posters)
- 🔐 JWT Authentication & Authorization
- ⚠️ Global Exception Handling
- 📄 Pagination & Sorting
- ✅ Input Validation
- 🧪 Integration-ready JSON APIs

---

## 🚀 Features

### 🔐 Authentication
- JWT-based login & signup system
- Role-based authorization (e.g., ADMIN, USER)
- Secure password hashing with BCrypt

### 📁 File Handling
- Upload and store images (e.g., posters)
- Associate uploaded files with movie records
- Serve uploaded files via secure endpoints

### 🎞️ Movie Management
- Create, update, delete, and retrieve movies
- Filter movies by genre, title, release year, etc.
- Support for uploading and linking poster images

### 🔄 Pagination & Sorting
- Endpoint support for pageable results
- Sort movies by title, rating, or release date

### ⚠️ Exception Handling
- Centralized global exception handling with custom responses
- Input validation using `@Valid` and `@ControllerAdvice`

---

## 📦 Technologies Used

| Tech      | Description                       |
|-----------|-----------------------------------|
| Spring Boot | Java-based framework              |
| Spring Web | RESTful APIs                      |
| Spring Security | JWT authentication & auth     |
| Spring Data JPA | ORM with Hibernate             |
| MySQL | Database (configurable)     |
| Lombok    | Boilerplate reduction             |
| MapStruct | DTO mapping               |

---

## 🔧 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/movie-api-springboot.git
cd movie-api-springboot
