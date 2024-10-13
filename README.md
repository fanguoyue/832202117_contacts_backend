# 832202117_contacts_backend
# Address Book Application

This is a Spring Boot-based Address Book application that allows users to manage their contacts by adding, updating, deleting, and viewing contact information.

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Code Structure](#code-structure)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgements](#acknowledgements)

## Features

- Add new contacts with name, phone number, and email
- Update existing contact information
- Delete contacts
- Retrieve a list of all contacts

## Tech Stack

- **Java 11**: Programming language used for the application.
- **Spring Boot 2.5.6**: Framework for building the application.
- **Spring Data JPA**: For data access and persistence.
- **MySQL**: Database for storing contact information.

## Installation

### Clone the Repository
git clone https://github.com/yourusername/address-book.git
cd address-book
Configure the Database
Ensure you have a MySQL server running and create a database for the application. Update your application.properties file with your MySQL credentials.

Start the Back-End Service
Make sure you have Java JDK 11 and Maven installed. Then run the following command in the project directory:
mvn spring-boot:run

## Usage
Open your browser and navigate to http://localhost:8080.
Use the API endpoints to manage your contacts. You can use tools like Postman or curl for testing.
## API Endpoints
Method	Endpoint	Description
POST	/contacts	Add a new contact
GET	/contacts	Retrieve all contacts
PUT	/contacts/{id}	Update an existing contact
DELETE	/contacts/{id}	Delete a contact

## Code Structure
address-book/

├── pom.xml                     # Maven Project Object Model file

├── src/

│   └── main/

│       ├── java/

│       │   └── me/demo/demo1/

│       │       ├── AddressBookApplication.java  # Main application class

│       │       ├── Contact.java                  # Entity class for Contact

│       │       ├── ContactController.java        # REST Controller for Contact management

│       │       ├── ContactRepository.java        # Repository interface for Contact

│       │       └── WebConfig.java                # Configuration for CORS

│       └── resources/

│           └── application.properties            # Application configuration

## Contributing
Contributions are welcome! Please follow these steps:

Fork the repository.
Create a new branch (git checkout -b feature-branch).
Make your changes and commit them (git commit -m 'Add new feature').
Push to the branch (git push origin feature-branch).
Submit a pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgements
Special thanks to:

Spring Boot for the framework.
MySQL for the database.
Maven for dependency management.

### Explanation:
1. **Project Title**: Clearly states the purpose of the project.
2. **Features**: Lists the functionalities that the application provides.
3. **Tech Stack**: Describes the technologies used.
4. **Installation**: Instructions for cloning the repo and starting the application.
5. **Usage**: Provides a brief on how to use the application.
6. **API Endpoints**: Details the available endpoints for interacting with the application.
7. **Code Structure**: Illustrates the organization of the project files.
8. **Contributing**: Encourages community contributions with clear steps.
9. **License**: Mentions the licensing for the project.
10. **Acknowledgements**: Gives credit to the technologies used.

Feel free to customize any section to better fit your project's needs!
