SELECT *
FROM film
WHERE rental_rate = 4.99
ORDER BY length
LIMIT 100;

SELECT *
FROM film
WHERE replacement_cost = 14.99 AND rental_rate = 0.99
ORDER BY length DESC
LIMIT 10;

SELECT *
FROM country
OFFSET 5
LIMIT 10;

SELECT *
FROM actor
WHERE first_name = 'Penelope'
LIMIT 1;

SELECT *
FROM actor
WHERE first_name = 'Penelope'
ORDER BY first_name;

SELECT *
FROM actor
WHERE first_name = 'Penelope'
ORDER BY first_name
OFFSET 2
LIMIT 1;