# dvdrental-sql-task-4

## Project Overview

This repository contains SQL queries against the **dvdrental** sample database. The goal is to demonstrate basic data retrieval techniques including listing distinct values, counting unique entries, string-pattern matching, and character-length filters.

**Project structure**:

```
java-backend-practices/
└── Week-6/
    └── SQL/
        └── dvdrental-sql-task-4/
            ├── dvdrental-sql-task-4.sql
            └── README.md
```

## Prerequisites

* PostgreSQL installed and running (or any compatible RDBMS hosting the `dvdrental` sample database).
* Access to the `dvdrental` database.
* A SQL client or VSCode with a SQL extension configured.

## Getting Started

1. **Clone the repository**:

   ```bash
   git clone https://github.com/velihangozek/java-backend-practices.git
   cd java-backend-practices/Week-6/SQL/dvdrental-sql-task-4
   ```

2. **Open in VSCode**:

   ```bash
   code .
   ```

3. **Review & run the SQL script**:

   * Open `dvdrental-sql-task-4.sql`.
   * Execute each section in your SQL client against the `dvdrental` database.

## SQL Queries Explained

The SQL file contains the following sections:

1. **List distinct `replacement_cost` values**

   ```sql
   SELECT DISTINCT replacement_cost
   FROM film;
   ```

   * Retrieves all unique replacement costs.

2. **Count of distinct `replacement_cost` values**

   ```sql
    SELECT COUNT(DISTINCT replacement_cost) AS distinct_replacement_cost_count
    FROM film;
   ```

   * Wraps the results to count how many unique costs exist.

3. **Count of films starting with 'T' and rated 'G'**

   ```sql
   SELECT COUNT(*) AS film_count_T_and_G
   FROM film
   WHERE title LIKE 'T%'
     AND rating = 'G';
   ```

   * Filters titles by leading 'T' and rating by 'G', then counts matches.

4. **Count of countries with exactly 5-character names**

   ```sql
    SELECT COUNT(country) AS country_count_length_5
    FROM country
    WHERE country LIKE '_____';
   ```

   * Uses LIKE with underscore wildcard (_) to filter names of length 5.

5. **Count of cities ending with 'R' or 'r'**

   ```sql
    SELECT COUNT(*) AS city_count_ending_with_r
    FROM city
    WHERE city ILIKE '%R';

    -- Alternative to the above
    SELECT COUNT(*) AS city_count_ending_with_r
    FROM city
    WHERE LOWER(city) LIKE '%r';
   ```

   * Applies case-insensitive match by converting names to lower case or via using ILIKE.

## Running Individual Queries

* You can select and execute each query block separately or run the entire script at once.
* Ensure you commit your changes in `dvdrental-sql-task-4.sql` before pushing.

## Contributing

If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.