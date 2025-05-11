SELECT DISTINCT replacement_cost
FROM film;

SELECT COUNT(DISTINCT replacement_cost)
FROM film;

SELECT title, rating
FROM film
WHERE title LIKE 'T%'
  AND rating = 'G';

-- Hint for the below query
SELECT country
FROM country
WHERE country LIKE '_____';

SELECT COUNT(country)
FROM country
WHERE country LIKE '_____';

-- Hint for the below query
SELECT city
FROM city
WHERE city ILIKE '%R';

SELECT COUNT(city)
FROM city
WHERE city ILIKE '%R';