# test-employee-sql-task-8

## Description

This project contains an SQL script to:

1. Create an `employee` table in the `test` database with columns:

   * `id` (SERIAL PRIMARY KEY)
   * `name` (VARCHAR(50))
   * `birthday` (DATE)
   * `email` (VARCHAR(100))
2. Insert **50** mock records into the table using data generated from Mockaroo.
3. Perform **5** UPDATE operations, each based on a different column or condition.
4. Perform **5** DELETE operations, each targeting rows by varying criteria.

All DML statements use `RETURNING *` to display affected rows for verification.

---

## Table of Contents

* [Prerequisites](#prerequisites)
* [Project Structure](#project-structure)
* [Setup](#setup)
* [Running the SQL Script](#running-the-sql-script)
* [Features](#features)
* [SQL Script Path](#sql-script-path)
* [Contributing](#contributing)

---

## Prerequisites

* **PostgreSQL** (v17 or later)
* **psql** CLI or **pgAdmin 4**
* **Git**
* **VSCode** (with the [SQLTools](https://marketplace.visualstudio.com/items?itemName=mtxr.sqltools) extension recommended)

---

## Project Structure

```text
java-backend-practices/
└── Week-6/
    └── SQL/
        └── test-employee-sql-task-8/
            ├── README.md            ← (this file)
            └── test-employee-sql-task-8.sql
```

---

## Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/velihangozek/java-backend-practices.git
   cd java-backend-practices/Week-6/SQL/test-employee-sql-task-8
   ```

2. **Create the `test` database** (if not existing):

   ```sql
   CREATE DATABASE test;
   ```

---

## Running the SQL Script

You can execute the SQL file using either the `psql` CLI or pgAdmin:

* **Using psql**

  ```bash
  psql -U <your_username> -d test -f test-employee-sql-task-8.sql
  ```

* **Using pgAdmin 4**

  1. Open **Query Tool** on the `test` database.
  2. Load `test-employee-sql-task-8.sql`.
  3. Click **Execute**.

After running, you should see the creation of the table, insertion of 50 rows, followed by the 5 UPDATEs and 5 DELETEs with their results.

---

## Features

* **Table Definition**: Defines `employee` with sensible column types.
* **Mock Data**: Inserts 50 realistic-looking rows.
* **UPDATE Operations**:

  1. Prepend `Dr. ` to names starting with `D`.
  2. Change email domains for employees born before 1970.
  3. Reset birthdays for Gmail addresses to `1990-01-01`.
  4. Convert first 10 names to uppercase.
  5. Increment birthdays by 1 year for employees under 5.
* **DELETE Operations**:

  1. Remove employees younger than 6 years.
  2. Delete rows where `name` contains an `s`.
  3. Remove entries with email domains matching `%ex%`.
  4. Delete records with `id` multiples of 7.
  5. Remove employees older than 40 years.

---

## SQL Script Path

```text
Week-6/SQL/test-employee-sql-task-8/test-employee-sql-task-8.sql
```

---

## Contributing

Feel free to open issues or submit pull requests for:

* Additional test cases
* Optimization suggestions
* Documentation improvements

---

*Happy querying!*
 