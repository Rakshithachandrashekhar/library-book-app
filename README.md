# library-book-app
For the position of Java intern in Biz Digital IT Services Pvt. Ltd.

#  Library Book Catalog API

This is a simple Java Spring Boot REST API for managing a library's book catalog.  
It allows you to add, view, update, and delete books, as well as update their availability status.

# Prerequisites

- Java 8 or above
- Maven

# Steps to run

1. Clone this repository:
git clone https://github.com/Rakshithachandrashekhar/library-book-app.git
cd library-book-app
Build and run the application:
mvn clean install
mvn spring-boot:run
The application will start on: http://localhost:8080

 API Endpoints
 # Add a new book
POST /books
Sample Request Body:
json
{
  "title": "Java Fundamentals",
  "author": "John Doe",
  "isbn": "1234-5678",
  "available": true
}
# Get all books
GET /books
 # Get book by ID
GET /books/{id}
Example:
GET /books/1
 # Update book availability
PUT /books/{id}/availability?available=false
Example:
PUT /books/1/availability?available=true
# Delete a book
DELETE /books/{id}
Example:
DELETE /books/1
# Features
Add, view, and delete books
# Update book availability
In-memory storage using HashMap

#Simple input validation
 Postman Collection
 If you have a Postman collection [ http://localhost:8080/books]
Example:
Library Book API Postman Collection

# Tech Stack
Java 8+
Spring Boot
Maven

# Author
Rakshitha Chandrashekhar
yaml

# Save the file**
 Press Ctrl + S

# Stage, commit, and push in terminal

Open terminal (inside VS Code), type these commands one by one
git add README.md
git commit -m "Add final detailed README with API instructions"
git push
# Check on GitHub
Go to your repo: https://github.com/Rakshithachandrashekhar/library-book-app
