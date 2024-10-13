Code Style Guide
This document outlines the coding standards followed in this project to ensure readability, maintainability, and consistency.

Java Coding Style
1. Indentation
Use 4 spaces for indentation. Do not use tabs.
2. Line Length
Maximum line length is 100 characters. Break lines logically where appropriate, such as after commas or before operators.
3.Naming Conventions
Packages: Use lowercase with periods to separate words. Example: me.demo.demo1
Classes: Use PascalCase. Example: AddressBookApplication, ContactController
Methods: Use camelCase. Example: addContact(), getContacts()
Variables: Use camelCase. Example: contactRepository, updatedContact
Constants: Use UPPER_CASE_WITH_UNDERSCORES. Example: DEFAULT_PORT, MAX_SIZE
4. Comments
Write comments to explain why a specific solution was chosen, not just what the code does. Focus on providing insights into complex logic or decisions.
Use /** ... */ for class-level and method-level documentation.
Inline comments (//) can be used to explain logic inside methods, but should be concise.

Spring Boot Best Practices
1. Application Structure
Controller: Handle HTTP requests and responses. Example: ContactController.
Service: Implement business logic (optional if needed).
Repository: Handle data persistence. Example: ContactRepository.
2. REST API Conventions
Use appropriate HTTP methods:
GET for retrieving data.
POST for creating new resources.
PUT for updating existing resources.
DELETE for removing resources.
Follow RESTful principles by using meaningful URIs. Example:
/contacts for managing contacts.
Handle CORS using configuration (as in WebConfig.java), and make sure only required origins are allowed.
3. Database
Use JPA annotations (@Entity, @Id, @GeneratedValue, etc.) to map entities to database tables.
Use @Table annotation to specify table names when necessary.
For IDs, use @GeneratedValue(strategy = GenerationType.IDENTITY) for auto-incrementing primary keys.
Exception Handling
Use try-catch blocks to handle exceptions in service layers and controllers.
Provide meaningful error messages and return appropriate HTTP status codes when exceptions occur (e.g., 404 Not Found for missing resources).
Git Commit Messages
Use clear and concise commit messages in the imperative mood:
Example: Add new endpoint for contact creation instead of Added new endpoint...
