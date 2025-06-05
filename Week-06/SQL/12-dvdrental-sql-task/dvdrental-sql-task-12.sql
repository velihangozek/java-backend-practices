-- 1. Count of films longer than the average length
SELECT 
  COUNT(*) AS length_greater_than_avg_film_count
FROM film
WHERE length > (
  SELECT AVG(length)
  FROM film
);

-- 2. Count of films at the maximum rental_rate
SELECT 
  COUNT(*) AS max_rental_rate_film_count
FROM film
WHERE rental_rate = (
  SELECT MAX(rental_rate)
  FROM film
);

-- 3. Films with both the lowest rental_rate and the lowest replacement_cost
SELECT *
FROM film
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film) 
  AND replacement_cost = (SELECT MIN(replacement_cost) FROM film);

-- 3.1. (Optional) Count of films with both the lowest rental_rate and the lowest replacement_cost
SELECT 
  COUNT(*) AS min_rental_rate_and_min_replacement_cost_film_count
FROM film
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film) 
  AND replacement_cost = (SELECT MIN(replacement_cost) FROM film);

-- 4. Customers with the most payments
SELECT 
  c.first_name, 
  c.last_name 
FROM customer AS c
WHERE c.customer_id = ANY (
  SELECT customer_id
  FROM payment
  GROUP BY customer_id
  HAVING COUNT(*) = (
    SELECT MAX(payment_count) 
	FROM (
	  SELECT COUNT(*) as payment_count
	  FROM payment
	  GROUP BY customer_id
	) AS customer_payment_count
  )
);