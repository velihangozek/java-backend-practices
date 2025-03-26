# Matrix Transpose Utility (Java)

A simple command-line Java application that reads a user-defined matrix, prints it, and outputs its transpose. This project demonstrates use of multi-dimensional arrays, input validation, and utility classes in idiomatic Java.

---

## 📂 Project Structure

```
src/main/java/org.velihangozek/
├── Main.java           # Entry point, user I/O, and printing
└── MatrixUtils.java    # Static utility class containing transpose logic
```

---

## 🚀 Features

- Reads row and column sizes (positive integers only)
- Validates all user inputs (handles invalid or non-numeric input)
- Displays the original matrix in a neatly formatted grid
- Computes and prints the transpose (rows ↔ columns swap)
- Uses try-with-resources for safe Scanner closure
- Pure static utility class (`MatrixUtils`)—no instantiation needed

---

## 🔧 Requirements

- Java SE 21 or later
- Any IDE (VS Code, IntelliJ IDEA, Eclipse) or command-line with `javac`/`java`

---

## 💻 Installation & Usage

1️⃣ Clone or download this repository.

2️⃣ Compile:
```bash
javac -d out src/main/java/org/velihangozek/*.java
```

3️⃣ Run:
```bash
java -cp out org.velihangozek.Main
```

4️⃣ Follow prompts to enter matrix dimensions and elements.

---

## 🎯 Example Session

```

Please enter the desired matrix sizes.

Please enter the row size => fdhg
Please enter a valid positive integer!
-2
Must be > 0
0
Must be > 0
3

Please enter the column size => fdg
Please enter a valid positive integer!
-1
Must be > 0
0
Must be > 0
2

For the desired matrix => [3][2] , please enter the [0][0]. element => gfh
Please enter a valid integer!
gfh
Please enter a valid integer!
-1

For the desired matrix => [3][2] , please enter the [0][1]. element => gfh
Please enter a valid integer!
0

For the desired matrix => [3][2] , please enter the [1][0]. element => gh
Please enter a valid integer!
1

For the desired matrix => [3][2] , please enter the [1][1]. element => gfh
Please enter a valid integer!
2

For the desired matrix => [3][2] , please enter the [2][0]. element => fgfh
Please enter a valid integer!
-3

For the desired matrix => [3][2] , please enter the [2][1]. element => gfdg
Please enter a valid integer!
-4

The desired matrix => 

  -1   0
   1   2
  -3  -4

The transpose of the matrix => 

  -1   1  -3
   0   2  -4

Process finished with exit code 0
```

---

## 📖 Explanation

- **`Main.java`** handles user input validation and printing via helper methods (`readPositiveValidInt`, `readValidInt`, `printMatrix`).
- **`MatrixUtils.transpose(int[][] matrix)`** returns a new 2D array with swapped dimensions (`[columns][rows]`).

---