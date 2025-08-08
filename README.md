# BDD Cucumber Automation Framework

This is a **BDD (Behavior-Driven Development)** framework using **Cucumber**, **Selenium WebDriver**, and **Maven** for automating web application testing.

## 📦 Tech Stack

- Java
- Selenium WebDriver
- Cucumber
- Maven
- TestNG 
- Page Object Model (POM) design pattern
- Extent reports

## 📁 Project Structure
~~~ bash
BDD/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── cucumberframework.BDD/
│ │ └── App.java
│ └── test/
│ └── java/
│ ├── cucumberoptions/
│ │ ├── FailedTestRunner.java
│ │ └── TestNgTestRunner.java
│ ├── features/
│ │ ├── checkout.feature
│ │ └── searchProduct.feature
│ ├── pageObjects/
│ │ ├── CheckoutPage.java
│ │ ├── LandingPage.java
│ │ ├── OffersPage.java
│ │ └── PageObjectManager.java
│ ├── stepDefinitions/
│ │ ├── CheckoutPageStepDefinition.java
│ │ ├── Hooks.java
│ │ ├── LandingPageStepDefinition.java
│ │ └── OffersPageStepDefinition.java
│ └── utils/
│ ├── GenericUtils.java
│ ├── TestBase.java
│ └── TestContextSetup.java
├── target/
├── test-output/
└── pom.xml
~~~

## 🧰 Key Features

- ✅ BDD using **Gherkin** syntax
- ✅ Page Object Model (POM)
- ✅ Modular & reusable step definitions
- ✅ Context sharing using `TestContextSetup`
- ✅ Parallel test execution support
- ✅ Centralized WebDriver management
- ✅ Failed test re-runs with `FailedTestRunner`
- ✅ Detailed test reports (test-output folder)

 ## 🛠️ How to Run the Tests

## 1. Clone the Repo
```bash
git clone https://github.com/Utkarsh-uh/BDD-cucumber-Framework.git
cd BDD
```
## 2. Run All Tests with Maven
```bash
mvn clean test
```

## 3.Run via TestNG Runner
### Using TestNgTestRunner.java
```bash
mvn test -Dcucumber.options="--tags @Smoke"
```

## 4.Re-run Failed Tests
### Executes only failed scenarios
```bash
mvn test -Dcucumber.options="@target/failed_scenarios.txt"
```

## 📊 Reports
After execution, test reports are available at:
/test-output/

## 🙋‍♂️ Author
- Utkarsh Haste
- Github: @utkarsh-uh






