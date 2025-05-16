**dvdrental-sQL-Task-9**

# dvdrental-sql-task-9

## Description

This project contains SQL scripts to perform **INNER JOIN** queries on the PostgreSQL `dvdrental` sample database. The tasks include:

1. Joining the `city` and `country` tables to list each city with its corresponding country.
2. Joining the `payment` and `customer` tables to list payment IDs alongside customer first and last names.
3. Joining the `rental` and `customer` tables to list rental IDs alongside customer first and last names.

## Table of Contents

* [Prerequisites](#prerequisites)
* [Project Structure](#project-structure)
* [Usage](#usage)
* [SQL Script Overview](#sql-script-overview)
* [Contributing](#contributing)

## Prerequisites

* PostgreSQL (v17 or later) installed and running
* The `dvdrental` sample database restored in your PostgreSQL server
* `psql` CLI or any SQL client (PGAdmin, DBeaver, etc.)
* Visual Studio Code (VSCode) for editing and reviewing scripts (Optional)

## Project Structure

```
java-backend-practices/
└── Week-6/
    └── SQL/
        └── dvdrental-sql-task-9/
            ├── dvdrental-sql-task-9.sql    # SQL script with INNER JOIN queries
            └── README.md                   # Project documentation (This file)
```

## Usage

1. **Open the project folder in VSCode**

   ```bash
   code Week-6/SQL/dvdrental-sql-task-9
   ```

2. **Connect to the `dvdrental` database**

   ```bash
   psql -h localhost -U <your_username> -d dvdrental
   ```

3. **Execute the SQL script**

   ```sql
   \i dvdrental-sql-task-9.sql
   ```

4. **Review the results** in your SQL client or terminal.

## SQL Script Overview

The file `dvdrental-sql-task-9.sql` contains the following queries:

```sql
-- 1. City & Country INNER JOIN
SELECT
  ci.city,
  co.country
FROM city AS ci
INNER JOIN country AS co
  ON ci.country_id = co.country_id
ORDER BY
  co.country,
  ci.city;

-- 2. Payment & Customer INNER JOIN
SELECT
  p.payment_id,
  c.first_name,
  c.last_name
FROM payment AS p
INNER JOIN customer AS c
  ON p.customer_id = c.customer_id
ORDER BY
  p.payment_id;

-- 3. Rental & Customer INNER JOIN
SELECT
  r.rental_id,
  c.first_name,
  c.last_name
FROM rental AS r
INNER JOIN customer AS c
  ON r.customer_id = c.customer_id
ORDER BY
  r.rental_id;
```

## Contributing

1. Fork this repository.
2. Create a new branch (`git checkout -b feature/<your-feature>`).
3. Commit your changes (`git commit -m "Add new SQL query"`).
4. Push to the branch (`git push origin feature/<your-feature>`).
5. Open a Pull Request and describe your changes.