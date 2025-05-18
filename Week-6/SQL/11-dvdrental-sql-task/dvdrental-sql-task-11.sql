-- All Data (Includes Duplicates) (799)
(
SELECT first_name
FROM actor
)
UNION ALL
(
SELECT first_name AS customer_first_name -- No effect
FROM customer
) ORDER BY first_name; -- Order the output once

-- Unique Data (647)
(
SELECT first_name
FROM actor
)
UNION
(
SELECT first_name AS customer_first_name
FROM customer
) ORDER BY first_name;

-- Common Data (72)
(
SELECT first_name
FROM actor
)
INTERSECT
(
SELECT first_name AS customer_first_name
FROM customer
) ORDER BY first_name;

-- Common Data - INTERSECT ALL (72)
(
SELECT first_name
FROM actor
)
INTERSECT ALL
(
SELECT first_name AS customer_first_name
FROM customer
) ORDER BY first_name;

-- Data that first query has but second query doesn't have. (56)
(
SELECT first_name
FROM actor
)
EXCEPT
(
SELECT first_name AS customer_first_name
FROM customer
) ORDER BY first_name;

-- Data that first query has but second query doesn't have. - EXCEPT ALL (128)
(
SELECT first_name
FROM actor
)
EXCEPT ALL
(
SELECT first_name AS customer_first_name
FROM customer
) ORDER BY first_name;