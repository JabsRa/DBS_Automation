Selenium WebDriver Login Test Project
This project is an automated test suite for the login functionality on The Internet website, using Selenium WebDriver and JUnit. The project follows the Page Object Model (POM) pattern to separate the test logic from the interaction logic with the webpage.

Project Structure
The project consists of the following components:

LoginTest.java: Contains the test cases for successful and failed login scenarios.
LoginPage.java: A Page Object Model class that abstracts interactions with the login page.
Files and Folders
runners/: Contains the test runner LoginTest.java, which includes the JUnit tests.
pages/: Contains LoginPage.java, which represents the login page and provides methods to interact with it.
src/test/resources/: Contains the chromedriver.exe for running the tests on Chrome.
Technologies Used
Selenium WebDriver: For browser automation.
JUnit: For running the test cases and asserting the results.
ChromeDriver: For controlling Google Chrome.
Pre-requisites
Java Development Kit (JDK): Make sure JDK is installed and properly configured in your environment.
Selenium WebDriver: Installed via Maven or manually added to the project.
ChromeDriver: Ensure chromedriver.exe matches the version of Chrome installed on your machine. The driver is located in the src/test/resources/ directory.
JUnit: Installed via Maven or manually added to the project.
Setup
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/selenium-login-test.git
Install dependencies:

If you're using Maven, add the following dependencies in your pom.xml file:

xml
Copy code
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
If you're not using Maven, download the JAR files for JUnit and Selenium WebDriver and add them to your project's build path.

Configure ChromeDriver:

Make sure the correct path to chromedriver.exe is set in your LoginTest.java file:

java
Copy code
System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
If you're on a different operating system (e.g., macOS or Linux), download the appropriate version of ChromeDriver and update the path.

Running the Tests
Using IntelliJ IDEA or Eclipse:
Open the project in your IDE.
Navigate to the LoginTest.java file.
Run individual test methods (e.g., testLoginSuccess) or run all tests at once.
Using Maven:
Open a terminal in the project's root directory.

Run the following command to execute all tests:

bash
Copy code
mvn test
Running a Specific Test:
You can run a specific test method (e.g., testLoginSuccess) in your IDE by right-clicking on the method and selecting Run.

Test Scenarios
Successful Login Test: Verifies that the user can log in successfully with valid credentials.
Failed Login Test: Verifies that an error message is shown when attempting to log in with invalid credentials.
Project Workflow
Setup:
@Before method opens the browser and navigates to the login page.
Tests:
testLoginSuccess(): Validates login with valid credentials (tomsmith / SuperSecretPassword!).
testLoginFailure(): Validates login with invalid credentials.
Tear Down:
@After method closes the browser after each test.
Contribution
Feel free to contribute by submitting a pull request. Before submitting a PR, please ensure:

Your code follows the existing coding standards.
All tests are passing.
You provide appropriate documentation for new features or test cases.
License
This project is licensed under the MIT License. See the LICENSE file for details.
