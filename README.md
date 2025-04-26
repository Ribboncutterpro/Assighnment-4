# TestNG Parallel Runner

This project demonstrates how to execute multiple TestNG test classes in parallel. It is designed to run a TestNG suite with parallel execution configured through the `testng.xml` file.

## Project Setup

### Requirements
- Java 17 or above
- Apache Maven

### Getting Started

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/Ribboncutterpro/Assighnment-4.git
2. Navigate to the project directory:
    ```bash
    cd Assighnment-4

3. Build the project and run the tests with Maven:
    ```bash
    mvn clean test -Dtestng.suiteXmlFile=src/main/resources/testng.xml

This will clean the project, compile it, and execute the tests defined in the testng.xml suite file.

4. Project Structure
- src/main/resources/testng.xml: The TestNG configuration file where parallel execution is set up.

- src/test/java/com/kavyaraj/Test1.java: Example test class 1.

- src/test/java/com/kavyaraj/Test2.java: Example test class 2.

TestNG Parallel Configuration

- The parallel execution is configured in the testng.xml file as follows:

- The parallel="tests" attribute is used to execute multiple test classes in parallel.

- The thread-count attribute controls how many threads to use for parallel execution.
