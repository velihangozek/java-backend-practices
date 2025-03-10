# FlightTicketHandler

FlightTicketHandler is a Java-based application that calculates flight ticket prices based on distance, age, and journey type. The project demonstrates the use of conditional statements and best practices in input validation, modular code design, and user interaction.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [License](#license)
- [Note](#note)

## Features

- **Dynamic Pricing:** Calculates the ticket price based on:
  - Distance (in kilometers)
  - Passenger's age (with discounts for certain age groups)
  - Journey type (One Way or Round Trip with an additional discount for round trips)
- **Input Validation:** Ensures valid inputs are provided. Displays an error message for invalid data.
- **Modular Design:** Separates the ticket price calculation logic into its own method and class.

## Prerequisites

- **Java Development Kit (JDK):** Ensure you have JDK 21 or later installed.
- **IDE/Text Editor:** Any Java-compatible IDE (e.g., VSCode, IntelliJ IDEA, Eclipse).

## Usage

1. Run the compiled Java program from the terminal:


    - java FlightTicketHandler

2. The application will prompt you for the following inputs:

  Distance in Kilometers

    Example: 1500

  Passenger's Age

    Example: 20

  Journey Type (1 for One Way, 2 for Round Trip)

    Example: 2

3. Output:

      Total Price = 216.0 TL

4. After providing valid inputs, the program will display the calculated total ticket price. If any input is invalid, it will show the error message:

    "Invalid input provided!"

## Project Structure

> FlightTicketHandler.java

> TicketCalculator.java

> README.md

## License

This project is licensed under the MIT License.

## Note

Feel free to fork and enhance this project as needed. Contributions and improvements are welcome!