# LeapYearFinder 🚀

**LeapYearFinder** is a simple Java application designed to quickly determine if a given year is a leap year.

## 📚 Description

Leap years have 366 days instead of the usual 365, adding an extra day to February. This program accurately checks leap years according to the Gregorian calendar rules:

- Years divisible by **4** are generally leap years.
- Years divisible by **100** are **not** leap years unless divisible by **400**.

## ✨ Project Structure

```
LeapYearFinder/
├── src/
│   └── main/
│       └── java/
│           └── org/velihangozek/
│               ├── Main.java
│               └── LeapYearFinder.java
└── test/
    └── java/
        └── org/velihangozek/
            └── LeapYearFinderTest.java
```

## 🚩 Usage

Run the `Main.java` file and follow the prompt:

```bash
Please enter a year to identify whether it is a leap year or not:
2024
2024 IS a Leap Year! :)
```

## ✅ Features

- Clear user prompts and validations.
- Robust error handling for invalid inputs.
- Concise and readable leap year logic.
- Unit-tested using JUnit 5.

## ⚙️ Technologies Used

- Java 21
- JUnit 5

## 🧪 Running Tests

Tests are written with JUnit 5. To run tests:

- From your IDE (IntelliJ/Eclipse): Right-click `LeapYearFinderTest.java` → "Run tests".
- Command line (if using Maven):

  ```bash
  mvn test
  ```

## 🛠 Prerequisites

- JDK 21+
- Maven or Gradle

## 🚩 Contributing

Feel free to contribute by opening an issue or submitting pull requests!

## 📃 License

This project is licensed under the MIT License.