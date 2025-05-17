SELECT 
	co.country,
	ci.city
FROM country AS co
LEFT JOIN city AS ci
	ON co.country_id = ci.country_id
ORDER BY 
	co.country ASC,
	ci.city ASC;

-- The other way around
SELECT 
	ci.city,
	co.country
FROM city AS ci
LEFT JOIN country AS co
	ON ci.country_id = co.country_id
ORDER BY 
	ci.city ASC,
	co.country ASC;

SELECT
	p.payment_id,
	c.first_name,
	c.last_name
FROM payment AS p
RIGHT JOIN customer AS c
	ON p.customer_id = c.customer_id
ORDER BY
	c.first_name ASC,
	p.payment_id ASC;

-- The other way around
SELECT
	c.first_name,
	c.last_name,
	p.payment_id
FROM customer AS c
RIGHT JOIN payment AS p
	ON c.customer_id = p.customer_id
ORDER BY
	p.payment_id ASC,
	c.first_name ASC;

SELECT
	c.first_name,
	c.last_name,
	r.rental_id
FROM 
	customer AS c
FULL OUTER JOIN rental AS r
	ON c.customer_id = r.customer_id
ORDER BY
	c.first_name ASC,
	r.rental_id ASC;


-- The other way around
SELECT
	r.rental_id,
	c.first_name,
	c.last_name
FROM 
	rental AS r
FULL OUTER JOIN customer AS c
	ON r.customer_id = c.customer_id
ORDER BY
	r.rental_id ASC,
	c.first_name ASC;