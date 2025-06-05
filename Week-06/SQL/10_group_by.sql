SELECT MAX(length)
FROM film;

SELECT MAX(length)
FROM film
WHERE rental_rate = 0.99;

SELECT MAX(length), rental_rate
FROM film
GROUP BY rental_rate;

SELECT COUNT(*), rental_rate
FROM film
GROUP BY rental_rate;

SELECT COUNT(*), rating
FROM film
GROUP BY rating;

SELECT MIN(length), replacement_cost
FROM film
GROUP BY replacement_cost;

SELECT replacement_cost, rental_rate, MIN(length)
FROM film
GROUP BY replacement_cost, rental_rate;

SELECT MIN(length), rental_rate
FROM film
GROUP BY rental_rate;

SELECT COUNT(DISTINCT replacement_cost) AS unique_replacement_cost_count, COUNT(DISTINCT rental_rate) AS unique_rental_rate_count
FROM film;

SELECT replacement_cost, rental_rate, MIN(length)
FROM film
GROUP BY replacement_cost, rental_rate
ORDER BY replacement_cost, rental_rate, MIN(length);