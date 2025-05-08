<br />
<p align="center">
  <h3 align="center">EmployeeInfoInnerClassExample</h3>
  <p align="center">
    A simple Java example demonstrating how to encapsulate an employee’s contact details using a non-static inner class.
  </p>
</p>

---

## Table of Contents

* [About](#about)
* [Project Structure](#project-structure)
* [Prerequisites](#prerequisites)
* [Installation & Usage](#installation--usage)
* [Features](#features)
* [License](#license)
* [Contact](#contact)

---

## About

This project illustrates best practices for using an inner class in Java to keep employee contact information (phone number and email) tightly bound to its enclosing `Employee` instance. It showcases:

* **Immutability** via `final` fields.
* **Null-safety** with `Objects.requireNonNull` checks.
* **Encapsulation** through a non-static inner class.

---

## Project Structure

```
Week-5/EmployeeInfoInnerClassExample
├── src
│   └── main
│       └── java
│           └── org
│               └── velihangozek
│                   └── Employee.java
└── README.md
```

---

## Prerequisites

* Java Development Kit (JDK) 21 or higher installed
* A terminal or command prompt (or an IDE such as IntelliJ)

---

## Installation & Usage

1. **Clone the repository**

   ```bash
   git clone https://github.com/velihangozek/java-backend-practices.git
   ```
2. **Navigate to the project folder**

   ```bash
   cd java-backend-practices/Week-5/EmployeeInfoInnerClassExample
   ```
3. **Compile the source**

   ```bash
   javac -d out src/main/java/org/velihangozek/Employee.java
   ```
4. **Run the demo**

   ```bash
   java -cp out org.velihangozek.Employee
   ```

---

## Features

* **`Employee` outer class:** holds basic personal data (first and last name).
* **`ContactInfo` inner class:** stores phone number and email, enforcing non-null values.
* **`printContactInfo()`** method: formats and prints the full contact details.
* **Demo `main` method:** shows example instantiation and output.

---

## Contact

**Author:** Velihan Gözek

**Email:** [velihangozek@hotmail.com](mailto:velihangozek@hotmail.com)