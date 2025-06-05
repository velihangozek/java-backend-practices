# Reverse Triangle Printer

A simple Java console application that prints a reversed triangle of stars (`*`) based on a user-provided number of steps (rows). Each row decreases by two stars, forming an inverted isosceles triangle.

---

## 📋 Table of Contents

- [Features](#-features)
- [Prerequisites](#prerequisites)
- [Usage](#-usage)
- [Example Output](#example-output)
- [Project Structure](#-project-structure)

---

## ✨ Features

- Validates user input (positive integer only)
- Uses modern Java (`String.repeat`) for clean code
- Handles invalid input gracefully

---

<a id="prerequisites"></a>
## ⚙️ Prerequisites

- Java Development Kit (JDK) 21 or higher
- A Java-compatible IDE or text editor (e.g., IntelliJ)

---

## 📖 Usage

1. Compile the Java class:
   ```bash
   javac src/org/velihangozek/ReverseTrianglePrinter.java
   ```
2. Run the program:
   ```bash
   java -cp src org.velihangozek.ReverseTrianglePrinter
   ```
3. Enter a positive integer when prompted to generate the inverted triangle.

---

<a id="example-output"></a>
## 🖥️ Example Output

```text
Please enter a number of steps to produce for reverse triangle: 
10
*******************
*****************
***************
*************
***********
*********
*******
*****
***
*
```

---

## 📂 Project Structure

```text
ReverseTriangle/
├── src/main/java/org/velihangozek/
│                     └── ReverseTrianglePrinter.java
├── README.md
└── .gitignore
```