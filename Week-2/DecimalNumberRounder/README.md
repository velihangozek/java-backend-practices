# 📌 Decimal Number Rounder

This Java console application rounds decimal numbers entered by the user in three ways: upwards, downwards, and to the nearest integer.

---

## 🛠️ Project Structure

```
DecimalNumberRounder
└── src
    └── main
        └── java
            └── org
                └── velihangozek
                    └── Main.java
```

---

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/velihangozek/java-backend-practices.git
```

Navigate to the project directory:

```bash
cd java-backend-practices/Week-2/DecimalNumberRounder
```

### 2. Compile the Project

```bash
javac -d out src/main/java/org/velihangozek/Main.java
```

### 3. Run the Application

```bash
java -cp out org.velihangozek.Main
```

---

## 🎯 Example Usage

```bash
Please enter a decimal number: 5.7

Rounding up => 6.0
Rounding down => 5.0
Rounding to the closest integer => 6.0
```

---

## 🧩 Functionalities

- **Round Up**: Rounds the number up (`Math.ceil`).
- **Round Down**: Rounds the number down (`Math.floor`).
- **Round to Nearest**: Rounds the number to the nearest integer (`Math.round`).
- **Robust Input Validation**: Continuously prompts until the user provides valid decimal input.

---

## 📚 Technologies Used

- Java 21+
- Scanner Class (for console input handling)

---

## 📝 Author

- **Velihan Gözek**
- GitHub: [velihangozek](https://github.com/velihangozek)

---