# CustomArrayList

> A custom, generic, dynamically resizing array-backed list implementation in Java.

![Java](https://img.shields.io/badge/Java-21-blue.svg) ![License](https://img.shields.io/badge/License-MIT-green.svg)

---

## 🗂️ Table of Contents

1. [Project Overview](#project-overview)
2. [Features](#features)
3. [Getting Started](#getting-started)
   * [Prerequisites](#prerequisites)
   * [Clone Repository](#clone-repository)
   * [Compile & Run](#compile--run)
4. [Usage Examples](#usage-examples)
5. [Project Structure](#project-structure)
6. [API Reference](#api-reference)
7. [Contributing](#contributing)

---

## Project Overview

`CustomArrayList` (also known as `MyList<T>`) is a simple, generic list class that mimics Java's `ArrayList<T>` behavior:

* Internally backed by an array
* Automatically doubles capacity when full
* Supports basic CRUD and utility operations without using any built-in collection classes

This project is organized under:

```
java-backend-practices/
  └── Week-3/
      └── CustomArrayList/
          ├── src/main/java/org/velihangozek/MyList.java
          └── README.md
```

---

## Features

* Generic class supporting any reference type (`T`)
* Default and parameterized constructors:

  * `MyList()` → initial capacity = 10
  * `MyList(int capacity)` → initial capacity = `capacity`
* Automatic resizing (×2) when capacity is reached
* Methods:

  * `int size()`
  * `int getCapacity()`
  * `void add(T data)`
  * `T get(int index)`
  * `T remove(int index)`
  * `T set(int index, T data)`
  * `boolean isEmpty()`
  * `int indexOf(T data)` / `int lastIndexOf(T data)`
  * `boolean contains(T data)`
  * `T[] toArray()`
  * `MyList<T> subList(int start, int finish)`
  * `void clear()`
  * `String toString()` override

---

## Getting Started

### Prerequisites

* Java 21 or later
* (Optional) Maven or Gradle if you wish to integrate into a larger project

### Clone Repository

```bash
git clone https://github.com/velihangozekk/java-backend-practices.git
cd java-backend-practices/Week-3/CustomArrayList
```

### Compile & Run

1. **Compile**

   ```bash
   javac -d out \
     src/main/java/org/velihangozek/MyList.java
   ```
2. **Execute Main Method**

   ```bash
   java -cp out org.velihangozek.MyList
   ```

> You should see console output demonstrating capacity growth, CRUD operations, and utility method results.

---

## Usage Examples

```java
// Instantiate with default capacity
MyList<Integer> list = new MyList<>();

// Add elements
list.add(10);
list.add(20);

// Access by index
System.out.println(list.get(1)); // 20

// Remove, set, and check size/capacity
list.remove(0);
list.set(0, 30);
System.out.println(list.size());       // 1
System.out.println(list.getCapacity()); // 10 (or 20 if resized)

// Convert to array
Integer[] array = list.toArray();

// Create a sublist
MyList<Integer> sub = list.subList(0, 0);

// Clear list
list.clear();
```

---

## Project Structure

```
Week-3/CustomArrayList
├── src
│   └── main
│       └── java
│           └── org
│               └── velihangozek
│                   └── MyList.java   # Generic list implementation
└── README.md                       # Project documentation
```

---

## API Reference

| Method Signature              | Description                                   |
| ----------------------------- | --------------------------------------------- |
| `MyList()`                    | Default constructor (capacity = 10)           |
| `MyList(int capacity)`        | Param constructor (custom capacity)           |
| `int size()`                  | Returns number of elements                    |
| `int getCapacity()`           | Returns current array capacity                |
| `void add(T data)`            | Appends element (resizes if needed)           |
| `T get(int index)`            | Returns element at index or `null` if invalid |
| `T remove(int index)`         | Removes/shifts element at index               |
| `T set(int index, T data)`    | Replaces element at index                     |
| `boolean isEmpty()`           | `true` if `size() == 0`                       |
| `int indexOf(T data)`         | First occurrence index or `-1`                |
| `int lastIndexOf(T data)`     | Last occurrence index or `-1`                 |
| `boolean contains(T data)`    | `true` if element exists                      |
| `T[] toArray()`               | Returns array of current elements             |
| `MyList<T> subList(int, int)` | Returns new `MyList` for given index range    |
| `void clear()`                | Clears all elements and resets capacity       |
| `String toString()`           | Returns elements in `[a,b,c]` format          |

---

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m "feat: describe feature"`)
4. Push to branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

---