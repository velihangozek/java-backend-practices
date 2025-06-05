-- 1. How many films have at least four occurrences of “e” or “E” in their title?
SELECT title,(SELECT COUNT(*) FROM film WHERE title ILIKE '%e%e%e%e%') AS count_of_film_titles_has_E_or_e
FROM film
WHERE title ILIKE '%e%e%e%e%';

-- 2. List each category name together with the number of films in that category.
SELECT 
  c.name, 
  COUNT(*) AS number_of_films
FROM category AS c
JOIN film_category AS fc
  ON c.category_id = fc.category_id
JOIN film AS f
  ON fc.film_id = f.film_id
GROUP BY c.name;

-- 3. Which rating category contains the most films?
SELECT 
  rating, 
  COUNT(*)
FROM film
GROUP BY rating
ORDER BY COUNT(*) DESC
LIMIT 1;

-- 4. In the film table, list the three films whose titles start with “K”, 
--    ordered by longest length (descending) and then lowest replacement_cost (ascending).
SELECT 
  title, 
  length, 
  replacement_cost
FROM film
WHERE title LIKE 'K%'
ORDER BY 
  length DESC, 
  replacement_cost ASC
LIMIT 3;

-- 5. What is the name of the customer who has made the most purchases?
SELECT
  c.first_name,
  c.last_name,
  SUM(p.amount)
FROM customer AS c
JOIN payment AS p
	ON c.customer_id = p.customer_id
GROUP BY c.first_name, c.last_name
ORDER BY SUM(p.amount) DESC
LIMIT 1;