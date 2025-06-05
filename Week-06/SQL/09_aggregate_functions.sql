SELECT COUNT(*)
FROM film;

SELECT replacement_cost
FROM film
ORDER BY replacement_cost DESC;

SELECT MAX(replacement_cost)
FROM film;

SELECT replacement_cost
FROM film
ORDER BY replacement_cost ASC;

SELECT MIN(replacement_cost)
FROM film;

SELECT rental_rate
FROM film
ORDER BY rental_rate ASC;

SELECT MIN(rental_rate)
FROM film;

SELECT rental_rate
FROM film
ORDER BY rental_rate DESC;

SELECT MAX(rental_rate)
FROM film;

SELECT AVG(length)
FROM film;

SELECT ROUND(AVG(length), 3)
FROM film;

SELECT SUM(rental_rate)
FROM film;

SELECT MAX(length), MIN(length), SUM(replacement_cost)
FROM film;

SELECT MAX(length)
FROM film
WHERE rental_rate = 0.99;

SELECT MAX(length)
FROM film
WHERE rental_rate = 2.99;

SELECT MAX(length)
FROM film
WHERE rental_rate = 4.99;

SELECT MAX(length), rental_rate
FROM film
WHERE rental_rate IN (0.99, 2.99, 4.99);