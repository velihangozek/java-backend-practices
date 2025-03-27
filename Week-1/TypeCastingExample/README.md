# 📚 Type Casting Demo

> A simple Java console program that demonstrates type‑casting between integers and decimals — complete with robust input validation and clear, user‑friendly prompts.

---

## 📝 Table of Contents

1. [Project Description](#🚀-Project-Description)  
2. [Features & Improvements](#features--improvements)  
3. [Requirements](#requirements)  
4. [Getting Started](#getting-started)  
5. [Usage Example](#usage-example)  
6. [Code Structure](#code-structure)  
7. [License](#license)

---

## 🚀 Project Description

This small Java application asks the user for an integer and a decimal number, then converts (casts) the integer → double and the double → integer, displaying each result. It includes continuous input validation to ensure only relevant valid numeric input is accepted.

---

## ✨ Features & Improvements

| Feature | Description | Improvement Benefit |
|----------|-------------|---------------------|
| **Input Validation Loop** | Re‑prompts until a valid integer/decimal is entered | Prevents crashes from invalid input |
| **`scanner.nextLine()` Consumption** | Clears invalid tokens from buffer | Avoids infinite loops on bad input |
| **Clear & Consistent Prompts** | Uniform user messaging style | Better UX readability |
| **Try‑with‑Resources** | Auto‑closes the Scanner | Cleaner resource management |
| **Formatted Output** | Displays casting results clearly | Easier to read conversion results |

---

## 🛠 Requirements

- Java 21+  
- Any IDE or text editor (IntelliJ recommended)  
- JDK installed and added to your `PATH`

---

## 📦 Getting Started

1. Clone or download this repository  
2. Open the project folder in IntelliJ  

---

## ▶️ How to Run

1. Open the terminal
2. Compile the code:

   ```bash
   javac -d bin src/org/velihangozek/Main.java
    ```

3. Run the program:

```bash
java -cp bin org.velihangozek.Main
🖥 Usage Example
text
Copy
Please enter an integer : 
fsa
Invalid input - Please enter a valid integer! =>
7
Please enter a decimal number : 
gfdh
Invalid input - Please enter a valid decimal number! =>
9.7
Integer = 7 to Decimal number = 7.0
Decimal number = 9.7 to Integer = 9

Process finished with exit code 0
```