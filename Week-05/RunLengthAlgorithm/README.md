# Run-Length Encoding in Java

A simple implementation of the **Run-Length Encoding (RLE)** algorithm in Java that compresses a string by counting consecutive repeating characters.

> **Example:**  
> For the input `wwwbbbw`, the output is `3w3b1w`.

---

## Table of Contents
- [Description](#description)
- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Code Explanation](#code-explanation)
- [Examples](#examples)
- [Best Practices](#best-practices)

---

## Description

The **Run-Length Encoding (RLE)** algorithm compresses a string by replacing sequences of identical characters with the count of that character followed by the character itself. This Java implementation:

- Handles edge cases (such as null or empty strings)
- Uses a `StringBuilder` for efficient string concatenation
- Clearly explains each step in the code

---

### Prerequisites

- **Java Development Kit (JDK) 21 or later**
- **IntelliJ or similar IDE**

### Usage

1. **Clone or Download the Repository:**  
   Download the project files to your local machine.

2. **Open the Project in VSCode:**  
   Open IntelliJ and select `File > Open...`, then choose the folder containing the project.

---

### Code Explanation

- The main functionality is implemented in the RunLength method of the Main class.

- Input Validation:

    Checks if the input is null or empty and returns an empty string if true.

- Efficient String Concatenation:

    Uses a StringBuilder to build the result efficiently.

- Run-Length Logic:

    Iterates through the input string, counts consecutive occurrences of characters, and appends the count and character to the result.

- Final Append:

    Ensures the last sequence of characters is processed and appended.

### Examples

- Example 1

    ```
    Input: aabbcde
    Output: 2a2b1c1d1e
    ```

- Example 2

    ```
    Input: wwwbbbw
    Output: 3w3b1w
    ```

### Best Practices

1. **Efficient String Handling:**
    
    - The use of StringBuilder avoids the performance overhead of repeated string concatenation.

2. **Edge Case Management:**

    - The code checks for null or empty strings, ensuring the program doesn't crash.

3. **Readable and Maintainable Code:**

    - Clear structure and inline comments enhance code readability and maintainability.