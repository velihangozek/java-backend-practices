SELECT *
FROM film;

SELECT DISTINCT rental_rate
FROM film;

SELECT DISTINCT replacement_cost
FROM film;

SELECT DISTINCT *
FROM film;

SELECT DISTINCT rental_rate, replacement_cost
FROM film;

SELECT *
FROM actor
WHERE first_name = 'Penelope';

SELECT COUNT(*)
FROM actor
WHERE first_name = 'Penelope';

SELECT *
FROM actor
WHERE first_name LIKE 'A%';

SELECT COUNT(*)
FROM actor
WHERE first_name LIKE 'A%';

SELECT COUNT(first_name)
FROM actor
WHERE first_name LIKE 'A%';

SELECT *
FROM actor;

SELECT COUNT(*)
FROM actor;

SELECT DISTINCT first_name
FROM actor;

SELECT COUNT(DISTINCT first_name)
FROM actor;

SELECT COUNT(*)
FROM film;

SELECT DISTINCT length
FROM film;

SELECT COUNT(DISTINCT length)
FROM film;