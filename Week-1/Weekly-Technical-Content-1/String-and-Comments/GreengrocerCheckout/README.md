# Greengrocer Checkout

A simple Java application that calculates the total price of fruits purchased by a user at a greengrocer. The application uses precise monetary calculations with `BigDecimal` and robust input validation to ensure correct input from the user.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Requirements](#requirements)
- [Usage](#usage)
- [License](#license)
- [Contact](#contact)

## Overview

This project simulates a checkout system at a greengrocer. The user is prompted to input the weight in kilograms for each fruit (Pear, Apple, Tomato, Banana, Eggplant), and the application calculates the total cost. It uses `BigDecimal` for precise calculations and handles invalid inputs by re-prompting the user until a valid number is entered.

## Features

- **Precise Monetary Calculations:** Uses `BigDecimal` to avoid floating-point inaccuracies.
- **Input Validation:** Continuously prompts for correct input until a valid number is provided.
- **Modular Design:** The code is organized into separate classes (`Main`, `GreengrocerCheckout`, `Fruit`) to separate concerns and make the project easy to maintain.
- **User-Friendly:** Clear error messages guide the user to input the correct data.

## Project Structure

/org/velihangozek ├── Main.java ├── GreengrocerCheckout.java └── Fruit.java

markdown
Copy
- **Main.java:** Contains the `main` method, which is the entry point of the application.
- **GreengrocerCheckout.java:** Manages a collection of `Fruit` objects, handles user input, and calculates the total price.
- **Fruit.java:** Represents a fruit with its name, price per kilogram, and purchased amount. It also provides functionality for calculating the total price for that fruit.

## Requirements

- Java 21 or later
- A Java IDE (such as IntelliJ) or a terminal with the JDK installed

## Usage

When you run the application, you will be prompted to enter the weight (in kilograms) for each fruit:

yaml
Copy
Pear in KG: 1.5
Apple in KG: 2.0
Tomato in KG: 0.8
Banana in KG: 1.2
Eggplant in KG: 0.5

If you enter an invalid value (e.g., text), the application will display an error message and prompt you again for that fruit until a valid number is provided. After all valid inputs are received, the application calculates and displays the total price in TL (Turkish Lira).

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Contact

For questions, suggestions, or feedback, feel free to reach out:

Email: velihangozek@hotmail.com

GitHub: [github.com/velihangozek](https://github.com/velihangozek)