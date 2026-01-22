# AutomationExercise Login Automation (Java)

## Overview
This project automates the login flow for:
https://www.automationexercise.com

Features:
- Opens the website
- Navigates to Signup / Login
- Logs in with valid credentials
- Verifies successful login
- Captures screenshot on failure

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model

## Setup
1. Install Java 11+, Maven, Chrome, and ChromeDriver
2. Clone or unzip project
3. Update credentials in `LoginTest.java` (EMAIL & PASSWORD)
4. Install dependencies:
```
mvn clean install
```

## Execute Tests
```
mvn test
```

## Screenshots
Screenshots are saved under `screenshots/` if test fails.
