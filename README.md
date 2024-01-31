Student Details REST API (Spring Boot)

This Spring Boot application provides a RESTful API for managing student details, offering Create, Read, Update, and Delete (CRUD) functionality. 
The API allows developers to interact with student data seamlessly, making it easy to integrate student information management into various applications.

Features:

- Create: Add new student records to the database.
- Read: Retrieve student details based on various criteria.
- Update: Modify existing student information.
- Delete: Remove student records from the database.

Getting Started:

1. Clone the Repository:
   ```bash
   git clone https://github.com/your-username/student-details-api.git
   cd student-details-api
   ```

2. Build and Run:
   ```bash
   ./mvnw spring-boot:run
   ```

3. API Endpoints:
   - Create a new student: `POST localhost:8080/addstudent`
   - Retrieve all students: `GET localhost:8080/students`
   - Retrieve a specific student: `GET localhost:8080/students/{id}`
   - Update a student's information: `PUT localhost:8080/students/{id}`
   - Delete a student: `DELETE /api/students/{studentId}`

Technologies Used:
- Spring Boot
- Java
- JPA, MySQL
