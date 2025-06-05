SELECT rating, COUNT(*) AS film_count
FROM film
GROUP BY rating
ORDER BY film_count ASC;

SELECT replacement_cost, COUNT(*) AS film_count
FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50 -- film_count
ORDER BY replacement_cost ASC;

SELECT store_id, COUNT(*) AS customer_count
FROM customer
GROUP BY store_id
ORDER BY store_id ASC;

SELECT country_id, COUNT(*) AS city_count
FROM city
GROUP BY country_id
ORDER BY city_count DESC
LIMIT 1;