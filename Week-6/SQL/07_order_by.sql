SELECT *
FROM film
ORDER BY title;

SELECT *
FROM film
ORDER BY title ASC; -- Default

SELECT *
FROM film
ORDER BY title DESC;

SELECT *
FROM film
ORDER BY length;

SELECT *
FROM film
ORDER BY length DESC;

SELECT title, length
FROM film
ORDER BY length DESC;

SELECT title, rental_rate, length
FROM film
ORDER BY length ASC, rental_rate DESC;

SELECT title, rental_rate, length
FROM film
ORDER BY rental_rate ASC, length DESC;

SELECT title, rental_rate, length
FROM film
WHERE title LIKE 'A%'
ORDER BY rental_rate ASC, length DESC;

SELECT title, length, rating
FROM film
WHERE rating = 'G'
ORDER BY length ASC;

SELECT title, length, rating
FROM film
WHERE rating = 'G'
ORDER BY length; -- ASC by default

SELECT title, length, rating
FROM film
WHERE rating = 'G'
ORDER BY length DESC;