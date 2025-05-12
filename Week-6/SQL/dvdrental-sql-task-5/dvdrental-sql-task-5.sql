-- HINT for the below
SELECT title, length
FROM film
WHERE title LIKE '%n'
ORDER BY length DESC, title ASC;

SELECT title, length
FROM film
WHERE title LIKE '%n'
ORDER BY length DESC, title ASC
LIMIT 5;

-- HINT for the below
SELECT title, length
FROM film
WHERE title LIKE '%n'
ORDER BY length ASC, title ASC;

SELECT title, length
FROM film
WHERE title LIKE '%n'
ORDER BY length ASC, title ASC
OFFSET 5
LIMIT 5;

-- HINT for the below
SELECT last_name, store_id
FROM customer
WHERE store_id = 1
ORDER BY last_name DESC, store_id ASC;

SELECT last_name, store_id
FROM customer
WHERE store_id = 1
ORDER BY last_name DESC, store_id ASC
LIMIT 4;