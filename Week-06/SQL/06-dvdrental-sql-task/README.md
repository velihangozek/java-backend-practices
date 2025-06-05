# dvdrental-sql-task-6

This repository contains the SQL solutions for **Task 6** against the PostgreSQL `dvdrental` sample database. All queries are stored in the file:

```
Week-6/SQL/dvdrental-sql-task-6/dvdrental-sql-task-6.sql
```

---

## 🔍 Overview

You will find four SQL scripts that compute the following metrics on the `film` table:

1. **Average Rental Rate**:  
   Calculate the average value of the `rental_rate` column (rounded to three decimal places).
2. **Count of Films Starting with ‘C’**:  
   Count how many film titles begin with the character **C**.
3. **Longest Film at Rate 0.99**:  
   Find the maximum `length` (in minutes) among films whose `rental_rate` equals **0.99**.
4. **Distinct Replacement Costs for Long Films**:  
   Count how many unique `replacement_cost` values exist for films longer than **150** minutes.

---

## ⚙️ Prerequisites

- PostgreSQL installed (v17+ recommended)
- The `dvdrental` sample database loaded locally
- `psql` CLI or any SQL client (e.g., pgAdmin, DBeaver)

---

## 🚀 Usage

1. **Clone the repository**

   ```bash
   git clone https://github.com/velihangozek/java-backend-practices.git
   cd java-backend-practices/Week-6/SQL/dvdrental-sql-task-6
   ```

2. **Run the SQL file in psql**

   ```bash
   psql -d dvdrental -f dvdrental-sql-task-6.sql
   ```

   Or load the `dvdrental-sql-task-6.sql` file into your GUI client and execute.

3. **Inspect the results**

   Each query outputs a single value with a descriptive column name.

---

## 📄 Queries

```sql
-- 1. Average rental_rate (rounded to 3 decimals)
SELECT ROUND(AVG(rental_rate), 3) AS avg_rental_rate
FROM film;

-- Alternative
SELECT ROUND(AVG(rental_rate)::numeric, 3) AS avg_rental_rate
FROM film;

-- 2. Number of films with titles starting with ‘C’
SELECT COUNT(*) AS films_starting_with_C
FROM film
WHERE title ILIKE 'C%';

-- 3. Longest film length where rental_rate = 0.99
SELECT MAX(length) AS longest_length_for_rate_0_99
FROM film
WHERE rental_rate = 0.99;

-- 4. Distinct replacement_cost values for films longer than 150 min
SELECT COUNT(DISTINCT replacement_cost) AS distinct_replacement_costs
FROM film
WHERE length > 150;
```

---

## 🎓 Notes

- We can use `ILIKE 'C%'` for case-insensitive matching. Change to `LIKE 'C%'` if you only want uppercase **C**.
- Casting to `numeric` ensures correct rounding behavior.

---

Happy querying! 🎉