-- 2. List the titles of the longest films, their lengths, and the actors’ first and last names.
SELECT 
  f.title, 
  f.length, 
  a.first_name, 
  a.last_name
FROM film AS f
INNER JOIN film_actor AS fa
  ON f.film_id = fa.film_id
INNER JOIN actor AS a
  ON fa.actor_id = a.actor_id
WHERE length = (
  SELECT MAX(length)
  FROM film
);

-- Crosscheck
SELECT length
FROM film
ORDER BY length DESC;