# dvdrental-sql-task-5

A set of SQL query solutions against the **dvdrental** sample database for Task Set 5.

---

## 📂 Project Structure

```plaintext
java-backend-practices/
└── Week-6/
    └── SQL/
        └── dvdrental-sql-task-5/
            ├── dvdrental-sql-task-5.sql  # SQL script with all queries
            └── README.md                 # This file
```

---

## 🛠 Prerequisites

* **PostgreSQL** (tested on 17+)
* **dvdrental** sample database installed
* SQL client of your choice (psql, pgAdmin, DBeaver, etc.)

---

## ▶️ How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/velihangozek/java-backend-practices.git
   ```
2. Navigate to the task folder:

   ```bash
   cd java-backend-practices/Week-6/SQL/dvdrental-sql-task-5
   ```
3. Open `dvdrental-sql-task-5.sql` in your SQL client and execute.

---

## 📋 Queries Overview

### 1. Top 5 longest films ending with **'n'**

```sql
SELECT title, length
FROM film
WHERE title LIKE '%n'
ORDER BY length DESC, title ASC
LIMIT 5;
```

### 2. Films ranked 6–10 by ascending length (titles ending with **'n'**)

**Option A: `OFFSET` / `LIMIT`**

```sql
SELECT title, length
FROM film
WHERE title LIKE '%n'
ORDER BY length ASC, title ASC
OFFSET 5
LIMIT 5;
```

**Option B: CTE + Window Function**

```sql
WITH ranked_films AS (
  SELECT
    title,
    length,
    ROW_NUMBER() OVER (ORDER BY length ASC, title ASC) AS rn
  FROM film
  WHERE title LIKE '%n'
)
SELECT title, length
FROM ranked_films
WHERE rn BETWEEN 6 AND 10
ORDER BY rn;
```

### 3. First 4 customers (store\_id = 1) ordered by **last\_name** descending

```sql
SELECT last_name, store_id
FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4;
```

---

## 📖 Notes

* Redundant `ORDER BY` clauses have been removed for clarity.
* Window functions provide a more explicit ranking approach for Query 2.

---