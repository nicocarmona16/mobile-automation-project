# mobile-automation-project

> ** IMPORTANT NOTE - APP SETUP:**
> Ensure the target `.apk` file is accessible by the framework. Check the `BaseTest.java` class to verify the `appium:app` capability path points correctly to the location of the application on your local machine before attempting to run the suite.

This repository contains an automated test suite for an Android mobile application, developed as a final project. The framework is built using **Java, Appium, TestNG, and Maven**, following the **Fluent Page Object Model (POM)**.

## Tech Stack & Libraries
* **Language:** Java 17
* **Automation Tool:** Appium
* **Testing Framework:** TestNG
* **Build Tool:** Maven
* **Test Data Generation:** Datafaker

## Architecture
The project is structured using the **Fluent Page Object Model**.
Methods inside the Page Objects return instances of other Page Objects, allowing method chaining in the test classes.

## 🧪 Scenarios Automated
1. **Bottom Navigation Bar Validation:** Verifies that clicking on each tab of the bottom navigation menu successfully routes the user to the corresponding screen.
2. **Successful Sign Up:** Uses `Datafaker` to generate dynamic and unique user credentials for every test run.
3. **Successful Login:** Reuses the Sign-Up flow to dynamically create a user and then successfully logs back in using the newly created credentials to ensure complete independence of the test.
4. **Swipe Cards & Scroll:** Emulates W3C Action gestures to swipe horizontally through a carousel of cards (validating that previous cards are hidden), and scroll down and find hidden text elements.

---

## Getting Started

### Prerequisites
To run this project locally, ensure you have the following installed and configured in your system's Environment Variables:
1. **Java Development Kit (JDK):** Version 17.
2. **Maven:** To manage dependencies and execute the suite.
3. **Android Studio:** With a configured Android Virtual Device (Emulator) running.
4. **Node.js & Appium Server:** Appium installed globally via npm.
5. **Appium UiAutomator2 Driver:** Installed via Appium extension CLI.
