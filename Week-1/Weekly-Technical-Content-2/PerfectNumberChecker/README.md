# PerfectNumberChecker

A simple Java console application that determines whether a given positive integer is a **perfect number**. Two implementations are provided:

| Class | Description |
|-------|-------------|
| `PerfectNumberCheckerBasic` | Naïve O(n) approach (loops from 1 → n–1) |
| `PerfectNumberCheckerOptimized` | Efficient O(√n) approach using divisor‑pair logic |

---

## 📁 Project Structure

PerfectNumberCheckerApp/ ├── src/ │ └── main/ │ └── java/ │ └── org/ │ └── velihangozek/ │ └── perfectnumberchecker/ │ ├── PerfectNumberCheckerBasic.java │ ├── PerfectNumberCheckerOptimized.java │ └── PerfectNumberUtils.java └── README.md

yaml
Copy

---

## ⚙️ Prerequisites

- Java JDK 11 or newer  
- VSCode (with Java Extension Pack)  

---

## 🚀 How to Compile & Run

Open a terminal at the project root and execute:

```bash
# Compile all classes
javac -d out src/main/java/org/velihangozek/perfectnumberchecker/*.java

# Run Basic implementation
java -cp out org.velihangozek.perfectnumberchecker.PerfectNumberCheckerBasic

# Run Optimized implementation
java -cp out org.velihangozek.perfectnumberchecker.PerfectNumberCheckerOptimized
🎯 Usage
When prompted, enter a positive integer.

The program outputs whether the number is or is not perfect.

Example
text
Copy
Bir sayı giriniz: 28
28 Mükemmel sayıdır.

Bir sayı giriniz: 496
496 Mükemmel sayıdır.

Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
📚 Perfect Number Definition
A perfect number equals the sum of its positive divisors (excluding itself).

6, 28, 496, 8128, … are the first few perfect numbers.

🔧 Contributing
Feel free to open issues or pull requests for:

Additional optimizations

New features (e.g., GUI, web API)

Unit tests

📄 License
MIT © 2025 Velihangozek