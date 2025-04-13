# 🔑 Valid Password Checker

A simple Java console application that validates a user-inputted password based on predefined security rules.

---

## 📜 Password Validation Rules

Your password must satisfy **ALL** of the following criteria:

1. ✅ Must contain at least **8 characters**.
2. ✅ **Cannot** contain any space characters (`' '`).
3. ✅ If the **first character is a letter**, it **must** be an uppercase letter.
4. ✅ Must end with a **question mark** (`?`).

---

## 🚀 How to Run

### 1️⃣ Clone or download the project:

```bash
git clone https://github.com/velihangozek/java-backend-practices.git
cd java-backend-practices/Week-2/ValidPasswordChecker
```

### 2️⃣ Compile the source files:

```bash
javac -d out src/main/java/org/velihangozek/Main.java
```

### 3️⃣ Run the application:

```bash
java -cp out org.velihangozek.Main
```

### 4️⃣ Follow the on-screen instructions:

```
Valid Password Requirements:

1. At least 8 characters
2. Does NOT include any space
3. If the first character is a letter, it must be UPPERCASE
4. Last character must be a question mark (?)

Please enter a password: YourPassword?

YourPassword? is a Valid Password :)
```

---

## 🛠 Project Structure

```
ValidPasswordChecker
├── src
│   └── main
│       └── java
│           └── org
│               └── velihangozek
│                   └── Main.java
└── README.md
```

---

## 📌 Technologies

- **Java SE** (Standard Edition)
- **Java Scanner Class** for input handling

---

## 🧑‍💻 Author

- [Velihan Gözek](https://github.com/velihangozek)

---

⭐ **Feel free to star the project if you found it useful!**