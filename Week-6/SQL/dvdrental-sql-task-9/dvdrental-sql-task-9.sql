-- 1. Show each city with its country
SELECT 
	ci.city, 
	co.country
FROM city AS ci
INNER JOIN country AS co 
	ON ci.country_id = co.country_id
ORDER BY 
	co.country ASC, -- sort first by country
	ci.city ASC; -- then by city within each country

-- 2. Show each payment ID alongside the customer’s name
SELECT 
	p.payment_id, 
	c.first_name, 
	c.last_name
FROM payment AS p
INNER JOIN customer AS c 
	ON p.customer_id = c.customer_id
ORDER BY 
	p.payment_id ASC; -- unambiguous ordering by payment_id

-- 3. Show each rental ID alongside the customer’s name
SELECT 
	r.rental_id, 
	c.first_name, 
	c.last_name
FROM rental AS r
INNER JOIN customer AS c 
	ON r.customer_id = c.customer_id
ORDER BY 
	r.rental_id; -- unambiguous ordering by rental_id