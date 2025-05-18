# dvdrental-sql-task-11

## Description

This project contains SQL scripts for querying the `dvdrental` sample database. The tasks demonstrate how to retrieve and manipulate the `first_name` data from the `actor` and `customer` tables, covering:

* All values (with and without duplicates)
* Unique values
* Common values (intersection)
* Values exclusive to one table (difference)
* Versions of the above that include duplicates using `ALL`

## Table of Contents

* [Prerequisites](#prerequisites)
* [File Structure](#file-structure)
* [Usage](#usage)
* [Queries](#queries)
* [Repository](#repository)

## Prerequisites

* PostgreSQL installed (preferably v17+) with the `dvdrental` sample database loaded
* VSCode with an SQL extension (e.g., SQLTools)

## File Structure

```
Week-6/SQL/11-dvdrental-sql-task/
├── dvdrental-sql-task-11.sql    # SQL scripts for Task 11
└── README.md                    # This documentation
```

## Usage

1. Open `dvdrental-sql-task-11.sql` in VSCode.
2. Connect to your local PostgreSQL `dvdrental` database using your SQL extension.
3. Execute each query section individually or run the entire script:

   ```sql
   \i Week-6/SQL/11-dvdrental-sql-task/dvdrental-sql-task-11.sql
   ```

## Queries

1. **All first names including duplicates**

   ```sql
   (SELECT first_name FROM actor)
   UNION ALL
   (SELECT first_name FROM customer)
   ORDER BY first_name;
   ```

2. **All unique first names**

   ```sql
   (SELECT first_name FROM actor)
   UNION
   (SELECT first_name FROM customer)
   ORDER BY first_name;
   ```

3. **Common first names**

   ```sql
   (SELECT first_name FROM actor)
   INTERSECT
   (SELECT first_name FROM customer)
   ORDER BY first_name;
   ```

4. **Names in actor not in customer**

   ```sql
   (SELECT first_name FROM actor)
   EXCEPT
   (SELECT first_name FROM customer)
   ORDER BY first_name;
   ```

5. **Including duplicates with `ALL`**

   ```sql
   (SELECT first_name FROM actor)
   INTERSECT ALL
   (SELECT first_name FROM customer)
   ORDER BY first_name;

   (SELECT first_name FROM actor)
   EXCEPT ALL
   (SELECT first_name FROM customer)
   ORDER BY first_name;
   ```

## Repository

Find this project in the `java-backend-practices` repo by Velihan Gözek:

[github.com/velihangozek/java-backend-practices](https://github.com/velihangozek/java-backend-practices)
Path: `Week-6/SQL/11-dvdrental-sql-task/dvdrental-sql-task-11.sql`