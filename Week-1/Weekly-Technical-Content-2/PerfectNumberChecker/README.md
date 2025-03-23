# PerfectNumberChecker

A simple Java console application that determines whether a given positive integer is a **perfect number**. Two implementations are provided:

| Class | Description |
|-------|-------------|
| `PerfectNumberCheckerBasic` | Naïve O(n) approach (loops from 1 → n–1) |
| `PerfectNumberCheckerOptimized` | Efficient O(√n) approach using divisor‑pair logic |

---

## 📁 Project Structure

```
PerfectNumberCheckerApp/ 
├── src/ 
    │ 
    └── main/ 
        │ 
        └── java/ 
            │ 
            └── org/ 
                  │ 
                  └── velihangozek/ 
                      │ 
                      └── perfectnumberchecker/ 
                          │ 
                          ├── PerfectNumberCheckerBasic.java 
                          │ 
                          ├── PerfectNumberCheckerOptimized.java 
                          │ 
                          └── PerfectNumberUtils.java 
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

    Example

    ```bash
    Bir sayı giriniz: 28
    28 Mükemmel sayıdır.

    Bir sayı giriniz: 496
    496 Mükemmel sayıdır.

    Bir sayı giriniz: 1
    1 Mükemmel sayı değildir.
    ```

## 📚 Perfect Number Definition

    A perfect number equals the sum of its positive divisors (excluding itself).

    6, 28, 496, 8128, … are the first few perfect numbers.