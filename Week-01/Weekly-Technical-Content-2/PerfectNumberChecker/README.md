# PerfectNumberChecker

A simple Java console application that determines whether a given positive integer is a **perfect number**. Two implementations are provided:

| Class | Description |
|-------|-------------|
| `PerfectNumberCheckerBasic` | Naïve O(n) approach (loops from 1 → n–1) |
| `PerfectNumberCheckerOptimized` | Efficient O(√n) approach using divisor‑pair logic |

---

## 📁 Project Structure

```
PerfectNumberChecker/ 
├── src/main/java/org/velihangozek/ 
│                     ├── PerfectNumberCheckerBasic.java 
│                     ├── PerfectNumberCheckerOptimized.java 
└── README.md
```

---

## ⚙️ Prerequisites

- Java JDK 21 or newer  
- IntelliJ or similar IDE

---

## 🎯 Usage

- When prompted, enter a positive integer.

- The program outputs whether the number is or is not perfect.

    >Example

    ```bash
    "Please enter a positive integer to determine if it is a perfect number: "
    28
    28 is Perfect!

    "Please enter a positive integer to determine if it is a perfect number: "
    496
    496 is Perfect!

    "Please enter a positive integer to determine if it is a perfect number: "
    1
    1 is NOT Perfect!
    ```

## 📚 Perfect Number Definition

    A perfect number equals the sum of its positive divisors (excluding itself).

    6, 28, 496, 8128, … are the first few perfect numbers.