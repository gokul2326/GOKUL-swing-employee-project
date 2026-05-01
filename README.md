Employee Record Management System (ERMS – Swing Version)

Project Documentation


---

1. Introduction

The Employee Record Management System (ERMS – Swing Version) is a desktop-based application developed using Core Java, Java Swing, MySQL, and JDBC. It provides a graphical user interface (GUI) to manage employee records efficiently, including adding, viewing, and deleting employee data. The system demonstrates database connectivity and real-time data interaction using JDBC.


---

2. Objectives

* To build a GUI-based application using Java Swing
* To integrate MySQL database using JDBC
* To perform CRUD operations through a user-friendly interface
* To understand event-driven programming in Java
* To implement modular design using DAO pattern

---

3. Technologies Used

* Programming Language: Core Java
* GUI Framework: Java Swing
* Database: MySQL
* Connectivity: JDBC
* IDE: IntelliJ IDEA / Eclipse / VS Code
* Platform: Windows/Linux



---

4. System Architecture

The system follows a layered architecture:

Swing UI → DAO Layer → JDBC → MySQL Database


---

5. Functional Requirements

* Add new employee
* View all employees in a table
* Delete selected employee
* Refresh employee list
* Store and retrieve data from MySQL



---

6. Non-Functional Requirements

* User-friendly graphical interface
* Fast data retrieval and update
* Data consistency and integrity
* Reliability and maintainability
* Scalable structure for future upgrades



---

7. Database Design

Database Name: swing_emp_db

Table: employees

Field	Type	Description

emp_id	INT (PK, AUTO_INCREMENT)	Employee ID


name	VARCHAR(100)	Employee Name


department	VARCHAR(50)	Department


salary	DOUBLE	Salary



---

8. Project Structure

EmployeeSwingProject/

src/

db/DBConnection.java

model/Employee.java

dao/EmployeeDAO.java

ui/EmployeeUI.java


lib/mysql-connector-j.jar



---

9. Module Description

DBConnection Module

Responsible for establishing connection between the application and MySQL database using JDBC.

Employee Model

Represents employee entity with attributes like ID, name, department, and salary.

EmployeeDAO Module

Handles all database operations such as insert, fetch, and delete.

EmployeeUI Module

Provides graphical interface using Swing components like JFrame, JTable, JButton, and JTextField. Handles user interaction and event handling.


---

10. Working Flow



* User launches the application


* GUI window is displayed


* User enters employee details and clicks Add


* Data is sent to DAO layer


* JDBC connects to MySQL database


* Record is inserted into database


* Table is refreshed and updated data is displayed


* User can select and delete records




---

11. Sample Use Case

User enters employee details in input fields

Clicks "Add" button

Employee record is saved in database

Updated list is shown in JTable



---

12. Advantages

* Easy-to-use graphical interface
* Real-time database operations
* Beginner-friendly project
* Modular and structured code
* Scalable for advanced features



---

13. Limitations

* No authentication system
* Limited features (no update/search in basic version)
* Desktop-only application
* Basic UI design



---

14. Future Enhancements

* Add update and search functionality
* Implement login authentication
* Improve UI design with layouts and styling
* Export data to Excel/PDF
* Role-based access control
* Convert to web application using Spring Boot



---

15. Conclusion

The Employee Record Management System (ERMS – Swing Version) successfully demonstrates the integration of Java Swing with MySQL using JDBC. It provides a practical understanding of GUI development, event handling, and database operations, making it suitable for academic projects and beginner-level application development.


---

16. References

* Java Swing Documentation
* MySQL Documentation
* JDBC API Documentation
