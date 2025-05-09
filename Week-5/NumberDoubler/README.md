# NumberDoubler

A simple Java demonstration of doubling each number in a list using modern Java 8+ features. This project shows two approaches:

* **Stream API** (`NumberDoublerWithStream.java`)
* **List.replaceAll** (`NumberDoublerWithReplaceAll.java`)

---

## 📂 Project Structure

```
Week-5/NumberDoubler
├── src
│   └── main
│       └── java
│           └── org
│               └── velihangozek
│                   ├── NumberDoublerWithStream.java
│                   └── NumberDoublerWithReplaceAll.java
└── README.md
```

---

## 🛠 Prerequisites

* Java 21 or higher
* (Optional) Maven or Gradle if you integrate into a build tool

---

## 🚀 How to Run

You can compile and run each class directly from the command line.

### 1. Using Stream API

```bash
# From project root
target_dir=out
mkdir -p $target_dir
javac -d $target_dir src/main/java/org/velihangozek/NumberDoublerWithStream.java
java -cp $target_dir org.velihangozek.NumberDoublerWithStream
```

**Expected output:**

```
2
4
6
8
10
```

### 2. Using List.replaceAll

```bash
# From project root
target_dir=out
mkdir -p $target_dir
javac -d $target_dir src/main/java/org/velihangozek/NumberDoublerWithReplaceAll.java
java -cp $target_dir org.velihangozek.NumberDoublerWithReplaceAll
```

**Expected output:**

```
2
4
6
8
10
```

---

## 🔍 Code Overview

### NumberDoublerWithStream.java

* **`numbers.stream()`**: Creates a stream from the list.
* **`.map(n -> n * 2)`**: Transforms each element by multiplying by 2.
* **`.forEach(System.out::println)`**: Prints each doubled value using a method reference.

### NumberDoublerWithReplaceAll.java

* **`new ArrayList<>(...)`**: Creates a modifiable list from fixed values.
* **`numbers.replaceAll(n -> n * 2)`**: Applies the lambda to each element in-place, updating the list.
* **`numbers.forEach(System.out::println)`**: Prints each updated element.

---

## 🎯 Why These Approaches?

* **Readability**: Lambda expressions remove boilerplate loops.
* **Conciseness**: Fewer lines of code, self-explanatory pipelines.
* **Maintainability**: Clear intent—transform then consume—makes future changes easier.

---