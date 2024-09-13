# Selenium Login Test Project

This project is an automated test suite for the login functionality on [The Internet](https://the-internet.herokuapp.com/login) website, using Selenium WebDriver and JUnit. The project follows the **Page Object Model (POM)** pattern to separate the test logic from the interaction logic with the webpage.

## Project Structure

The project consists of the following components:

- **`LoginTest.java`**: Contains the test cases for successful and failed login scenarios.
- **`LoginPage.java`**: A Page Object Model class that abstracts interactions with the login page.

### Files and Folders

- **`runners/`**: Contains the test runner `LoginTest.java`, which includes the JUnit tests.
- **`pages/`**: Contains `LoginPage.java`, which represents the login page and provides methods to interact with it.
- **`src/test/resources/`**: Contains the `chromedriver.exe` for running the tests on Chrome.

## Technologies Used

- **Selenium WebDriver**: For browser automation.
- **JUnit**: For running the test cases and asserting the results.
- **ChromeDriver**: For controlling Google Chrome.

## Pre-requisites

- **Java Development Kit (JDK)**: Make sure JDK is installed and properly configured in your environment.
- **Selenium WebDriver**: Installed via Maven or manually added to the project.
- **ChromeDriver**: Ensure `chromedriver.exe` matches the version of Chrome installed on your machine. The driver is located in the `src/test/resources/` directory.
- **JUnit**: Installed via Maven or manually added to the project.

## Setup

1. **Clone the repository**:

    ```bash
    git clone https://github.com/your-username/selenium-login-test.git
    ```

2. **Install dependencies**:

    If you're using **Maven**, add the following dependencies in your `pom.xml` file:

    ```xml
    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.x.x</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
        </dependency>
    </dependencies>
    ```

    If you're not using Maven, download the JAR files for **JUnit** and **Selenium WebDriver** and add them to your project's build path.

## Running the Tests

You can run the test cases using either an IDE like IntelliJ/Eclipse or via the command line using Maven.

### Using IntelliJ IDEA or Eclipse

1. Open the project in your IDE.
2. Navigate to the `LoginTest.java` file in the `runners` package.
3. Run all tests by clicking the **run** button next to the class definition, or run a specific test by clicking the **run** button next to the method definition.

### Running Tests via Maven

1. Open a terminal and navigate to the root directory of the project.
2. Run the following command to execute all tests:

    ```bash
    mvn test
    ```

### Running a Specific Test

#### In IntelliJ/Eclipse:

1. Right-click on the test method `testLoginSuccess()` inside `LoginTest.java`.
2. Select **Run** to execute the individual test.

#### Using Maven:

You can specify the test class or even a specific test method using the following command:

```bash
mvn -Dtest=LoginTest#testLoginSuccess test
```

