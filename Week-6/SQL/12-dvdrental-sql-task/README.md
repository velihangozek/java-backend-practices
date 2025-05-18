# dvdrental SQL Task 12

> SQL queries against the `dvdrental` sample database to:
>
> 1. Count films longer than average length
> 2. Count films at maximum `rental_rate`
> 3. List films with both lowest `rental_rate` and lowest `replacement_cost`
> 4. Identify customer(s) with the most payments

---

## 📋 Table of Contents

* [Prerequisites](#prerequisites)
* [Project Structure](#project-structure)
* [Setup](#setup)
* [Usage](#usage)
* [SQL Tasks](#sql-tasks)
* [Author](#author)

---

## ✅ Prerequisites

* **PostgreSQL** (v17 or higher) installed
* **dvdrental** sample database restored
* **Visual Studio Code** with an SQL extension (e.g., SQLTools)

---

## 🗂 Project Structure

```
java-backend-practices/
└── Week-6/
    └── SQL/
        └── 12-dvdrental-sql-task/
            ├── dvdrental-sql-task-12.sql   # SQL script containing all queries
            └── README.md                   # This documentation file
```

---

## ⚙️ Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/velihangozek/java-backend-practices.git
   ```
2. **Restore the dvdrental database**

   ```bash
   pg_restore -U <username> -d dvdrental dvdrental.tar
   ```
3. **Open in VSCode**

   ```bash
   code java-backend-practices
   ```
4. **Install & configure SQL extension**

   * Recommended: SQLTools
   * Create a connection profile pointing to your `dvdrental` database

---

## 🚀 Usage

1. Navigate to:

   ```
   Week-6/SQL/12-dvdrental-sql-task/
   ```
2. Open `dvdrental-sql-task-12.sql` in VSCode
3. Execute each query block sequentially using your SQL extension or `psql`

---

## 💡 SQL Tasks

1. **Count films longer than the average length**
   Determine how many films have a `length` value greater than the average film length.

2. **Count films at maximum `rental_rate`**
   Count how many films share the highest `rental_rate` in the table.

3. **List films with both lowest `rental_rate` and lowest `replacement_cost`**
   Select all films where `rental_rate` and `replacement_cost` are both at their minimum values.

4. **Identify customer(s) with the most payments**
   Find the `first_name` and `last_name` of customer(s) who made the highest number of entries in the `payment` table.

---

## ✍️ Author

**Velihan Gözek**
[GitHub Profile](https://github.com/velihangozek)

---