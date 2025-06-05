SELECT * FROM film WHERE replacement_cost = 12.99;

SELECT * 
FROM film 
WHERE replacement_cost = 14.99;

SELECT * FROM film 
WHERE rental_rate = 0.99;

SELECT title, length
FROM film 
WHERE rental_rate = 0.99;

SELECT *
FROM actor
WHERE first_name = 'Penelope';

SELECT *
FROM film
WHERE length > 90 ORDER BY length ASC;

SELECT *
FROM film
WHERE rental_rate <> 2.99 ORDER BY rental_rate ASC;

SELECT *
FROM film
WHERE rental_rate != 2.99 ORDER BY rental_rate ASC;