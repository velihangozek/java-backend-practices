SELECT title, description
FROM film;

-- Alternative to the above (sorted by name)
SELECT title, description
FROM film
ORDER BY title;

SELECT *
FROM film
WHERE length > 60
AND length < 75;

-- Alternative to the above
SELECT *
FROM film
WHERE length BETWEEN 61 AND 74;

SELECT *
FROM film
WHERE rental_rate = 0.99
AND replacement_cost = 12.99
OR replacement_cost = 28.99;

-- Alternative to the above
SELECT *
FROM film
WHERE rental_rate = 0.99
AND (replacement_cost = 12.99 OR replacement_cost = 28.99);

-- Second alternative to the above
SELECT *
FROM film
WHERE rental_rate = 0.99
AND replacement_cost IN (12.99, 28.99);

SELECT first_name, last_name
FROM customer
WHERE first_name = 'Mary';

-- Cleaner alternative to the above (With only last_name)
SELECT last_name
FROM customer
WHERE first_name = 'Mary';

SELECT *
FROM film
WHERE NOT length > 50
AND NOT (rental_rate = 2.99 OR rental_rate = 4.99);

-- Alternative to the above
SELECT *
FROM film
WHERE length <= 50
AND rental_rate NOT IN (2.99, 4.99);