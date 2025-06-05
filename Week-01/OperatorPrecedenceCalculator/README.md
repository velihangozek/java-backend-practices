# Operator Precedence Calculator

A simple Java application that performs arithmetic operations with proper operator precedence. The program reads three numerical values from the user and computes a fixed arithmetic expression:

a + b * c - b

For example, if the inputs are 10, 2, and 3, the calculation will be:

```bash
10 + 2 * 3 - 2 = 14
```

## Table of Contents

- [Project Description](#project-description)
- [Features](#features)
- [Requirements](#requirements)
- [Usage](#usage)
- [Code Structure](#code-structure)

## Project Description

This project demonstrates basic arithmetic operations in Java while respecting the operator precedence rules. It is designed to:

- Prompt the user for three numerical inputs.
- Compute the result using the fixed expression -> `a + b * c - b`.
- Display the result with formatted output.

The application is ideal for learning about user input, exception handling, and formatted printing in Java.

## Features

- **Arithmetic Operation:** Calculates the result of the expression `a + b * c - b`.

- **User Input Validation:** Uses a loop with exception handling to ensure only valid numerical inputs are accepted.

- **Formatted Output:** Displays the arithmetic expression and its result using formatted strings.

- **Clean Code Structure:** Separated logic into two classes:

  - `Main` for handling input and output.
  - `OperatorPrecedenceCalculator` for computing the arithmetic operation.

## Requirements

- Java Development Kit (JDK) 21 or higher
- A code editor or IDE such as IntelliJ.

## Usage

When you run the program, you will be prompted to enter three numerical values. After entering the values, the program will compute the result of the expression a + b * c - b and display it.

Example session:

```bash
Please enter three numerical values to operate them arithmetically.

Enter the first number: 10

Enter the second number: 2

Enter the third number: 3

Result: 10.0 + 2.0 * 3.0 - 2.0 = 14.0
```

## Code Structure

- Main Class (Main.java):
    Manages user input using a Scanner, validates input, and prints the formatted result.

- OperatorPrecedenceCalculator Class (OperatorPrecedenceCalculator.java):
    Contains the logic to perform the arithmetic operation.