# EmployeeSalaryCalculator

A simple Java console application that models factory employees and calculates their salaries, taking into account taxes, bonuses, and raises based on years of service.

---

## 📋 Table of Contents

- [Features](#-features)
- [Prerequisites](#-prerequisites)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [Usage](#-usage)
- [Example Output](#-example-output)
- [Contributing](#-contributing)

---

## 🛠️ Features

- **Tax Calculation**: Applies 3% tax on salaries above 1000.
- **Bonus Calculation**: Awards 30 TL per hour for every hour worked above 40 in a week.
- **Salary Raise**: Grants a salary increase based on tenure:
  - \< 10 years: 5%
  - 10–19 years: 10%
  - ≥ 20 years: 15%
- **Input Validation**: Ensures salary ≥ 0, work hours ≥ 0, and hire year ≤ 2021.
- **Clean Output**: Nicely formatted summary of calculations.

---

## 📦 Project Structure

```
java-backend-practices
└── Week-2
    └── Weekly-Technical-Content-4
        └── EmployeeSalaryCalculator
            └── src
                └── main
                    └── java
                        └── org
                            └── velihangozek
                                ├── Employee.java
                                └── EmployeeTest.java
```

---

## ⚙️ Prerequisites

- Java Development Kit (JDK) 21 or later
- A terminal or command prompt
- (Optional) IntelliJ or another Java-friendly IDE

---

## 🚀 Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/velihangozek/java-backend-practices.git
   ```
2. **Navigate to the project folder**
   ```bash
   cd java-backend-practices/Week-2/Weekly-Technical-Content-4/EmployeeSalaryCalculator
   ```

---

## ▶️ Usage

1. **Compile the sources**
   ```bash
   javac -d out src/main/java/org/velihangozek/*.java
   ```

2. **Run the application**
   ```bash
   java -cp out org.velihangozek.EmployeeTest
   ```

---

## 📋 Example Output

```
Name                : kemal
Salary              : 2000.00
Work Hours (weekly) : 45.0
Hire Year           : 1985
Tax                 : 60.00
Bonus               : 150.00
Salary Increase     : 300.00
Salary w/ Tax+Bonus : 2090.00
Total Salary        : 2390.00
```

---

## 🤝 Contributing

Contributions are welcome! Feel free to open issues or submit pull requests for bug fixes and improvements.

---