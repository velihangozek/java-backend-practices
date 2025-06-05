# dvdrental-sql-task-10

## Project Overview

This project demonstrates how to perform various JOIN operations on the `dvdrental` sample database.

## Table of Contents

* [Prerequisites](#prerequisites)
* [Project Structure](#project-structure)
* [JOIN Query Tasks](#join-query-tasks)
* [SQL File](#sql-file)
* [How to Run](#how-to-run)
* [Results](#results)
* [Contributing](#contributing)

## Prerequisites

* **PostgreSQL** (v17+ recommended)
* The **dvdrental** sample database loaded in your PostgreSQL instance
* An SQL client such as **pgAdmin 4**, **psql**, or **VSCode** with a SQL extension

## Project Structure

```plaintext
java-backend-practices/
└── Week-6/
    └── SQL/
        └── 10-dvdrental-sql-task/
            ├── dvdrental-sql-task-10.sql  ← All JOIN queries
            └── README.md                  ← This file
```

## JOIN Query Tasks

1. **LEFT JOIN**: Combine **city** and **country** tables to list city names alongside their country names.
2. **RIGHT JOIN**: Combine **payment** and **customer** tables to list payment IDs with each customer’s first and last name.
3. **FULL OUTER JOIN**: Combine **customer** and **rental** tables to list rental IDs alongside customer names, including unmatched rows on either side.

## SQL File

Open [`dvdrental-sql-task-10.sql`](./dvdrental-sql-task-10.sql) to review all queries. Each section is commented to indicate which JOIN operation it corresponds to.

## How to Run

1. **Clone the repository**

   ```bash
   git clone https://github.com/velihangozek/java-backend-practices.git
   cd java-backend-practices/Week-6/SQL/10-dvdrental-sql-task
   ```
2. **Open in VSCode**

   * Launch VSCode in this folder:

     ```bash
     code .
     ```
   * Ensure you have a SQL extension installed (e.g., *SQL Server (mssql)* or *PostgreSQL*).
3. **Execute the queries**

   * Connect to your PostgreSQL instance.
   * Select the `dvdrental` database.
   * Run the queries in `dvdrental-sql-task-10.sql`.

## Results

Each query returns a result set ordered by the key columns:

* **LEFT JOIN**: Ordered by `country`, then `city`
* **RIGHT JOIN**: Ordered by `payment_id`, then `first_name`
* **FULL OUTER JOIN**: Ordered by `first_name`, then `rental_id`

> **Tip:** If you see `NULL` values, it indicates no matching row existed on one side of the join.

## Contributing

Contributions and suggestions are welcome! Feel free to:

* Open an issue to report bugs or request enhancements
* Submit a pull request with improvements or additional examples