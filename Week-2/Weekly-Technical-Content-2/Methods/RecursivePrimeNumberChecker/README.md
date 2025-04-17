# Recursive Prime Number Checker

A Java console application that determines whether an integer input by the user is a prime number, using recursion.

---

## 📂 Project Structure

```
RecursivePrimeNumberChecker
└── src
    └── main
        └── java
            └── org
                └── velihangozek
                    └── Main.java
```

---

## 🚀 How to Run the Project

### Clone the Project

Clone the project from GitHub using:

```bash
git clone https://github.com/velihangozek/java-backend-practices.git
```

Then, navigate to the project directory:

```bash
cd java-backend-practices/Week-2/Weekly-Technical-Content-2/Methods/RecursivePrimeNumberChecker
```

### Compile and Execute

Compile the Java program:

```bash
javac src/main/java/org/velihangozek/Main.java -d ./out
```

Execute the compiled program:

```bash
java -cp ./out org.velihangozek.Main
```

---

## 🛠️ Implementation Details

- **Input Validation**: Ensures the user enters a valid integer.
- **Recursion**: Checks divisibility by recursively testing all integers down to 2.
- **Efficiency**: Uses basic recursive logic to illustrate recursion clearly.

---

## 📌 Example Usage

```
Enter an integer to check primeness: 17
17 is a Prime Number :)

Enter an integer to check primeness: 22
22 is NOT a Prime Number :(
```

---

## 📝 Key Methods

| Method | Description |
|--------|-------------|
| `isPrimeNumber(int number)` | Entry method to validate numbers ≤ 1 and initiate recursion. |
| `isPrimeRecursive(int number, int divisor)` | Recursively checks if the number is prime. |
| `readValidInt(Scanner scanner, String prompt)` | Handles user input and validation. |

---

## 🧑‍💻 Author

- **Velihan Gözek**
- [GitHub Profile](https://github.com/velihangozek)

---

