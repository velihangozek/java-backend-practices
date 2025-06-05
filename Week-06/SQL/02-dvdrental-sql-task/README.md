# dvdrental-sql-task-2

## Description

This project contains SQL queries against the **dvdrental** sample database. You will find three exercises that demonstrate the use of the `BETWEEN … AND` and `IN` operators.

## Prerequisites

* **PostgreSQL** (version 17 or higher)
* **dvdrental** sample database (dvdrental.tar)
* `psql` and `pg_restore` utilities in your PATH

## Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/velihangozek/java-backend-practices.git
   ```
2. **Navigate to the SQL task directory**

   ```bash
   cd java-backend-practices/Week-6/SQL/dvdrental-sql-task-2
   ```
3. **Restore the *dvdrental* database**

   ```bash
   pg_restore -U <your_username> -d dvdrental dvdrental.tar
   ```

   * Replace `<your_username>` with your PostgreSQL user.
4. **Connect to the database**

   ```bash
   psql -U <your_username> -d dvdrental
   ```

## Usage

* To execute all queries in one go, run:

  ```bash
  psql -U <your_username> -d dvdrental -f dvdrental-sql-task-2.sql
  ```

## Queries

### 1. Films by `replacement_cost` between 12.99 (inclusive) and 16.99 (exclusive)

```sql
SELECT *
  FROM film
 WHERE replacement_cost BETWEEN 12.99 AND 16.98;
```

### 2. Actors with first names Penelope, Nick, or Ed

```sql
SELECT first_name,
       last_name
  FROM actor
 WHERE first_name IN ('Penelope', 'Nick', 'Ed');
```

### 3. Films with specific `rental_rate` and `replacement_cost` values

```sql
SELECT *
  FROM film
 WHERE rental_rate      IN (0.99, 2.99, 4.99)
   AND replacement_cost IN (12.99, 15.99, 28.99);
```

## Project Structure

```
dvdrental-sql-task-2/
├── dvdrental-sql-task-2.sql   # SQL script with three exercises
└── README.md                  # This documentation
```