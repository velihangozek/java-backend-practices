# StudentRecordManager

> A simple immutable student record system using Java Records.

---

## 📋 Table of Contents

1. [Description](#description)
2. [Features](#features)
3. [Technology Stack](#technology-stack)
4. [Prerequisites](#prerequisites)
5. [Project Structure](#project-structure)
6. [Getting Started](#getting-started)
   * [Clone the Repository](#clone-the-repository)
   * [Build](#build)
   * [Run](#run)
7. [Usage & Sample Output](#usage--sample-output)

---

## 📝 Description

`StudentRecordManager` is a lightweight Java application demonstrating the power of **Java Records** to represent immutable data. It provides a `Student` record for storing first name, last name, and student number, and includes a demo class to create, print, and verify record behavior.

---

## ⭐ Features

* **Immutable Records**: Uses Java Records to automatically generate final fields, constructor, `equals()`, `hashCode()`, and `toString()`.
* **Validation**: Ensures non-null names and positive student numbers via a compact canonical constructor.
* **Demo Application**: Creates sample `Student` instances, prints them, and checks equality and hash code consistency.

---

## 🚀 Technology Stack

* **Language**: Java 21+
* **Build Tool**: Maven (or Gradle)
* **Structure**: `org.velihangozek` package

---

## 🛠️ Prerequisites

* Java Development Kit (JDK) 21 or higher
* Maven 3.6+ (or Gradle 6+)
* Git

---

## 📂 Project Structure

```bash
Week-5/StudentRecordManager/
├── pom.xml                                    # Maven configuration (or build.gradle)
└── src
    └── main
        └── java
            └── org
                └── velihangozek
                    ├── Student.java           # Immutable record definition
                    └── StudentRecordDemo.java # Demo application
```

---

## 🏁 Getting Started

### Clone the Repository

```bash
git clone https://github.com/velihangozek/java-backend-practices.git
cd java-backend-practices/Week-5/StudentRecordManager
```

### Build

Using Maven:

```bash
mvn clean compile
```

*or* using Gradle:

```bash
gradle build
```

### Run

Using Maven:

```bash
mvn exec:java -Dexec.mainClass="org.velihangozek.StudentRecordDemo"
```

*or* using the JAR:

```bash
java -cp target/StudentRecordManager-1.0-SNAPSHOT.jar org.velihangozek.StudentRecordDemo
```

---

## 🎯 Usage & Sample Output

Once you run the demo, you should see output similar to:

```text
=== Registered Students ===
Student[firstName=Ali, lastName=Yılmaz, studentNumber=1001]
Student[firstName=Ayşe, lastName=Demir, studentNumber=1002]
Student[firstName=Mehmet, lastName=Kara, studentNumber=1003]

=== Equality & HashCode Check ===
s1.equals(s2): true
s1.hashCode() == s2.hashCode(): true
```

---