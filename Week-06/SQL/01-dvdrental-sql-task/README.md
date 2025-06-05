# dvdrental-sql-task-1

A collection of SQL scripts executed against the PostgreSQL **`dvdrental`** sample database.

## 📁 File

* **`dvdrental-sql-task-1.sql`**
  Contains all five SQL queries described below.

## 📝 Queries

|  # | Description                                                                                                    |
| -: | -------------------------------------------------------------------------------------------------------------- |
|  1 | List **`title`** and **`description`** columns from the `film` table                                           |
|  2 | Select all columns from `film` where **`length`** > 60 **AND** < 75                                            |
|  3 | Select all columns from `film` where **`rental_rate`** = 0.99 **AND** **`replacement_cost`** IN (12.99, 28.99) |
|  4 | Retrieve the **`last_name`** of the customer whose **`first_name`** = 'Mary'                                   |
|  5 | Select all columns from `film` where **`length`** ≤ 50 **AND** **`rental_rate`** NOT IN (2.99, 4.99)           |

## ⚙️ Prerequisites

* PostgreSQL installed on your machine
* **`dvdrental`** sample database loaded and accessible

## 🚀 Usage

1. Open your terminal and connect to the `dvdrental` database:

   ```bash
   psql -d dvdrental -U <your_username>
   ```
2. Run the SQL script:

   ```sql
   \i dvdrental-sql-task-1.sql
   ```
3. Observe each query’s output in the psql console.

---

> *Feel free to extend or customize these queries as needed!*