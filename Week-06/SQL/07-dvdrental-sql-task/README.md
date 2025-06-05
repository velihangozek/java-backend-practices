# dvdrental‑sql‑task‑7

A set of SQL queries against the **dvdrental** sample database, implemented as part of the SQL exercises in the `java-backend-practices` repo.

---

## 📁 Project Structure

```plain
java-backend-practices/
└── Week-6/
    └── SQL/
        └── dvdrental-sql-task-7/
            ├── dvdrental-sql-task-7.sql   # All queries in one script
            └── README.md                  # This file
```

---

## 🎯 Overview

This task covers four grouping and aggregation scenarios:

1. **Group films by rating**
2. **Identify replacement\_cost values** with more than 50 films
3. **Count customers per store**
4. **Find the country** (by `country_id`) that has the most cities

All results are ordered and/or limited according to the requirements.

---

## 🔧 Prerequisites

* PostgreSQL installed (v17+ recommended)
* The `dvdrental` sample database loaded
* psql or another SQL client (pgAdmin, DBeaver, etc.)

---

## 🚀 How to Run

1. **Clone the repo** (if you haven’t already):

   ```bash
   git clone https://github.com/velihangozek/java-backend-practices.git
   ```
2. **Navigate** to this task folder:

   ```bash
   cd java-backend-practices/Week-6/SQL/dvdrental-sql-task-7
   ```
3. **Execute** the SQL script against your `dvdrental` database:

   ```bash
   psql -d dvdrental -f dvdrental-sql-task-7.sql
   ```

   Or paste individual queries into your SQL client and run them one by one.

---

## 📝 Queries Defined

Below is a summary of each query. Full definitions live in `dvdrental-sql-task-7.sql`.

### 1. Group films by rating

```sql
SELECT
  rating,
  COUNT(*) AS film_count
FROM film
GROUP BY rating
ORDER BY film_count ASC;
```

### 2. Replacement cost buckets with > 50 films

```sql
SELECT
  replacement_cost,
  COUNT(*) AS film_count
FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY replacement_cost ASC;
```

### 3. Customer counts per store

```sql
SELECT
  store_id,
  COUNT(*) AS customer_count
FROM customer
GROUP BY store_id
ORDER BY store_id ASC;
```

### 4. Country with the most cities

```sql
SELECT
  country_id,
  COUNT(*) AS city_count
FROM city
GROUP BY country_id
ORDER BY city_count DESC
LIMIT 1;
```

---

## 📖 Further Improvements

* **Join** to `country` or `store` tables for human‑readable names.
* Add more **indexes** if performance becomes an issue.
* Parameterize the script for different thresholds (e.g., film count > 50).

---

✨ **Happy querying!** ✨