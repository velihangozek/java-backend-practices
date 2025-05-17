# dvdrental-sql-task-3

## Description

This directory contains SQL queries written against the **dvdrental** sample database. The four scenarios addressed are:

1. List all countries whose names start with **‘A’** and end with **‘a’**.
2. List all countries with names of at least **6** characters that end with **‘n’**.
3. List all film titles containing **at least four** occurrences of **‘T’** (case‑insensitive).
4. Return every column from **film** where the title starts with **‘C’**, the **length** column is **> 90**, and **rental\_rate = 2.99**.

## Repository Structure

```text
java-backend-practices/
└── Week-6/
    └── SQL/
        └── dvdrental-sql-task-3/
            ├── dvdrental-sql-task-3.sql
            └── README.md
```

## Prerequisites

* **PostgreSQL** installed and running.
* The **dvdrental** sample database restored (e.g., via `pg_restore`).
* A SQL client (psql, pgAdmin, or VSCode with SQL extension).

## Usage

1. Open your terminal or VSCode and navigate to the task directory:

   ```bash
   cd java-backend-practices/Week-6/SQL/dvdrental-sql-task-3
   ```
2. Open **dvdrental-sql-task-3.sql** in your SQL client.
3. Execute the queries one by one and review the output.

## SQL Queries Overview

```sql
-- 1. Countries starting with 'A' and ending with 'a'
SELECT country
FROM country
WHERE country ILIKE 'A%a';

-- 2. Countries with at least 6 characters ending with 'n'
SELECT country
FROM country
WHERE country LIKE '_____%n';

-- Alternative to the above
SELECT country
FROM country
WHERE LENGTH(country) >= 6
  AND country LIKE '%n';

-- 3. Films containing at least four 'T' letters (case‑insensitive)
SELECT title
FROM film
WHERE title ILIKE '%t%t%t%t%';

-- Alternative to the above
SELECT title
FROM film
WHERE (LENGTH(LOWER(title))
       - LENGTH(REPLACE(LOWER(title), 't', ''))
      ) >= 4;

-- 4. Films starting with 'C', length > 90, and rental_rate = 2.99
SELECT *
FROM film
WHERE title ILIKE 'C%'
  AND "length" > 90
  AND rental_rate = 2.99;
```

## Author

**Velihan Gözek**