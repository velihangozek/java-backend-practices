# NamesPrinter

A simple Java program that prints a list of names using method references for concise and readable code.

---

## Table of Contents

* [Overview](#overview)
* [Project Structure](#project-structure)
* [Prerequisites](#prerequisites)
* [Building and Running](#building-and-running)
* [Usage](#usage)
* [Author](#author)

---

## Overview

**NamesPrinter** demonstrates how to replace a traditional `for` loop with a Java 8+ method reference to print list elements:

```java
List<String> names = List.of("Ahmet", "Ayşe", "Mehmet", "Zeynep");
names.forEach(System.out::println);
```

This approach improves readability and leverages modern Java features.

## Project Structure

```
java-backend-practices/
└── Week-5/
    └── NamesPrinter/
        └── src/
            └── main/
                └── java/
                    └── org/
                        └── velihangozek/
                            └── NamesPrinter.java
```

## Prerequisites

* **Java Development Kit (JDK) 21+**
* (Optional) **Maven** or **Gradle** if you prefer a build tool

## Building and Running

### Command-Line

```bash
# Navigate to the project folder
cd java-backend-practices/Week-5/NamesPrinter

# Compile sources into an output directory
javac -d out src/main/java/org/velihangozek/NamesPrinter.java

# Run the program
java -cp out org.velihangozek.NamesPrinter
```

### Using Maven (Optional)

```bash
# From the project root
mvn compile
mvn exec:java -Dexec.mainClass="org.velihangozek.NamesPrinter"
```

## Usage

When you run the program, you should see the following output in the console:

```
Ahmet
Ayşe
Mehmet
Zeynep
```

## Author

**Velihan Gözek** – [GitHub Profile](https://github.com/velihangozek)
