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
│ │ ├── cucumberframework.BDD/
│ │ │ └── App.java
│ │ └── pageObjects/
│ │ ├── CheckoutPage.java
│ │ ├── LandingPage.java
│ │ ├── OffersPage.java
│ │ └── PageObjectManager.java
│ └── test/
│ └── java/
│ ├── cucumberoptions/
│ │ ├── FailedTestRunner.java
│ │ └── TestNgTestRunner.java
│ ├── features/
│ │ ├── checkout.feature
│ │ └── searchProduct.feature
│ ├── stepDefinitions/
│ │ ├── CheckoutPageStepDefinition.java
│ │ ├── Hooks.java
│ │ ├── LandingPageStepDefinition.java
│ │ └── OffersPageStepDefinition.java
│ └── utils/
│ ├── GenericUtils.java
│ ├── TestBase.java
│ └── TestContextSetup.java
├── pom.xml
├── target/
├── test-output/
└── README.md
~~~

