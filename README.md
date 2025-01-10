# Online Voting System

## Table of Contents
1. [Features](#features)
2. [Project Structure](#project-structure)
3. [Architecture Overview](#architecture-overview)
4. [Technologies Used](#technologies-used)
5. [Installation](#installation)
6. [Outcome](#outcome)

## Features
- **Secure Authentication:** Ensures only authorized voters can access the system using unique credentials.
- **User-Friendly Interface:** Simplified design for voters to easily cast their votes.
- **Real-Time Results:** Instant tallying and display of results once voting concludes.
- **Admin Panel:** Manage voter lists, candidates, and view system statistics.
- **Audit Logs:** Comprehensive logging for transparency and troubleshooting.

## Project Structure
```
OnlineVotingSystem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── onlinevoting/
│   │   │   │   │   ├── controller/      # Handles request and response logic
│   │   │   │   │   ├── model/           # Contains the data model classes
│   │   │   │   │   ├── service/         # Business logic layer
│   │   │   │   │   ├── repository/      # Data access layer
│   │   │   │   │   ├── utils/           # Utility classes
│   │   ├── resources/                   # Configuration files and templates
│   ├── test/                            # Unit and integration tests
├── docs/                                # Documentation files
├── lib/                                 # Third-party libraries
├── config/                              # Application configuration files
├── build.gradle                         # Build script for Gradle
├── pom.xml                              # Build script for Maven (if used)
└── README.md                            # Project description and guide
```

## Architecture Overview
The system is built on a **3-Tier Architecture**:
1. **Presentation Layer:** Handles user interaction through a web-based GUI.
2. **Application Layer:** Contains the core business logic of the voting system.
3. **Database Layer:** Manages data storage, retrieval, and relationships.

**Workflow:**
1. Voter logs into the system via secure authentication.
2. The system fetches voter details and validates eligibility.
3. Eligible voters cast their votes, which are securely recorded.
4. Admins can monitor progress and access results post-voting.

## Technologies Used
- **Programming Language:** Java
- **Framework:** Spring Boot
- **Database:** MySQL
- **Frontend:** HTML, CSS, JavaScript (with optional frameworks like React/Angular)
- **Authentication:** JWT (JSON Web Token)
- **Build Tool:** Maven or Gradle
- **Version Control:** Git

## Installation
### Prerequisites
- Java 8 or higher
- MySQL Server
- Apache Maven or Gradle
- Git

### Steps
1. Clone the repository:
   
2. Navigate to the project directory:
   ```bash
   
   ```
3. Configure the database:
   - Create a MySQL database (e.g., `online_voting`).
   - Update the `application.properties` or `application.yml` file with database credentials.

4. Build the project:
   ```bash
   ./mvnw clean install
   ```
   or for Gradle:
   ```bash
   ./gradlew build
   ```
 
5. Run the application:
   ```bash
   java -jar target/online-voting-system.jar
   ```

6. Access the application:
   - Open your browser and navigate to `http://localhost:8080`.

## Outcome
- **Enhanced Voting Experience:** Secure and accessible voting for users.
- **Efficient Management:** Simplified administration of elections and results.
- **Transparency and Trust:** Provides a transparent process with detailed audit logs.
-
- <img width="1440" alt="Screenshot 2025-01-10 at 7 19 44 PM" src="https://github.com/user-attachments/assets/e6e8a22c-b122-45d7-a5f2-c50bc7367432" />
<img width="1440" alt="Screenshot 2025-01-10 at 7 19 48 PM" src="https://github.com/user-attachments/assets/5a8958bd-241e-4ba5-add8-fac5d8d3068d" />
<img width="1440" alt="Screenshot 2025-01-10 at 7 20 40 PM" src="https://github.com/user-attachments/assets/3c84f62d-b6c2-4543-a1d6-25ce56fcf151" />
<img width="1440" alt="Screenshot 2025-01-10 at 7 21 09 PM" src="https://github.com/user-attachments/assets/9a08b83b-83f1-442b-bebc-3918e42804a8" />







