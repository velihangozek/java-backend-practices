# WorkHoursEnumExample

A simple Java console application that demonstrates how to use enums to model and retrieve working hours for each day of the week. Includes both an original implementation and a refactored version with improved mapping logic.

---

## Table of Contents

1. [Project Overview](#project-overview)
2. [Prerequisites](#prerequisites)
3. [Project Structure](#project-structure)
4. [Getting Started](#getting-started)
   * [Clone the Repository](#clone-the-repository)
   * [Compile the Code](#compile-the-code)
   * [Run the Application](#run-the-application)
5. [Usage Examples](#usage-examples)
6. [Code Highlights](#code-highlights)
7. [Contributing](#contributing)

---

## Project Overview

`WorkHoursEnumExample` showcases how to leverage Java enums to encapsulate data (working hours) and expose factory methods for converting user input (names or numbers) into enum constants. The project contains two implementations:

* **Original**: `WorkDay` enum + `WorkDayMain` with a `switch`-based lookup.
* **Refactored**: `WorkDayRefactored` enum with `fromInt()`/`fromString()` factory methods + `WorkDayMainRefactored` for streamlined input handling.

---

## Prerequisites

* Java Development Kit (JDK) 21 or higher
* A command-line shell (Bash, PowerShell, CMD, etc.)

---

## Project Structure

```plaintext
WorkHoursEnumExample/
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── velihangozek/
│                   ├── WorkDay.java                 # Original enum
│                   ├── WorkDayMain.java             # Original console app
│                   ├── WorkDayRefactored.java      # Refactored enum with factories
│                   └── WorkDayMainRefactored.java  # Refactored console app
└── README.md                                     # This file
```

---

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/velihangozek/java-backend-practices.git
cd java-backend-practices/Week-5/WorkHoursEnumExample
```

### Compile the Code

```bash
# Compile all classes to the 'out' directory
javac -d out src/main/java/org/velihangozek/*.java
```

### Run the Application

#### Original Implementation

```bash
# Navigate to output folder
cd out
# Run with day number input (1=MONDAY … 7=SUNDAY)
java org.velihangozek.WorkDayMain
```

#### Refactored Implementation

```bash
java org.velihangozek.WorkDayMainRefactored
```

---

## Usage Examples

1. **Original**

   ```text
   Enter a day number in a week to display the work hours:
   3
   9:00 - 17:00
   ```

2. **Refactored**

   ```text
   Enter day name or number:
   friday
   9:00 - 17:00
   ```

---

## Code Highlights

* **Enum encapsulation**: Both `WorkDay` and `WorkDayRefactored` store hours per constant.
* **Factory methods**: `WorkDayRefactored.fromInt(int)` and `.fromString(String)` eliminate switch statements and centralize validation.
* **Error handling**: User-friendly messages for invalid input (out-of-range numbers or unknown names).

---

## Contributing

Contributions are welcome! Feel free to open issues or pull requests to suggest improvements, add features, or fix bugs.

1. Fork the repository
2. Create a new branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m "Add YourFeature"`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

---