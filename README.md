# BookREST
REST API - SPRING BOOT JAVA - MYSQL
## 1. Create MySQL DB
- **BookRestdb.csv**  
--root password: 12345678
--cols: Barcode(int|PK|Unique|NN) 
		Title(varchar)
		Author(varchar)
		noOfPages(int)
		readStatus(Boolean-Y|N)
## 2. Create Maven Project
- **pom.xml**  
-start.spring.io  
-maven project  
-Spring boot : 2.6.0  
-Project metadata  
	-Group - net.codejava  
	-Artifact - BookREST  
	-Name - BookREST  
	-Description - REST API PROJECT: My Book Inventory  
	-Package name - net.codejava.BOOKREST  
	-Dependencies - Spring Web -- builds RESTful webs -- Apache Tomcat -- embedded container  
				  - MySQL Driver -- MySQL JDBC and R2DBC driver  
				  - Spring Data JPA -- Persist data in SQL stores with Java Persistence API using Spring Data and HibernatE  
Open the project in eclipse ide
	- delete test dependency from the xml code
	- Application main code -- BookRestApplication.java
## 3. Configure Data source properties
- **application.properties**  
- resources   
--spring.jpa.hibernate.ddl-auto=none  
--spring.datasource.url=jdbc:mysql://localhost:3306/myd  
--spring.datasource.username=root  
--spring.datasource.password=12345678
## 4. Code Domain Model class
- **Book.java**
-- Getters and setters  
-- Constructor with fields  
-- entity and entity imports  
## 5. Code Repository interface
- **BookRepository.java**  
-- Set save get delete list methods in service.java code
## 6. Code Service Class  
- **BookService.java**  
-- middle layer between repository and controller layer
## 7. Code Spring boot application class
- **BookRestApplication.java**  
-- Main application class - This class will start embedded Tomcat server hosting our Spring Boot web application on http://localhost:8080/books  
## 8. Implement RESTful API for CRUD Operation 
on localhost://8080/books/{barcode}
- **BookController.java**  
