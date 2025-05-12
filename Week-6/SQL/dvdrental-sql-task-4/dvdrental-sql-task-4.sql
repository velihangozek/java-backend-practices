SELECT DISTINCT replacement_cost
FROM film;

SELECT COUNT(DISTINCT replacement_cost) AS distinct_replacement_cost_count
FROM film;

-- Hint for the below query
SELECT title, rating
FROM film
WHERE title LIKE 'T%'
  AND rating = 'G';

SELECT COUNT(*) AS film_count_T_and_G
FROM film
WHERE title LIKE 'T%'
 AND rating = 'G';

-- Hint for the below query
SELECT country
FROM country
WHERE country LIKE '_____';

SELECT COUNT(country) AS country_count_length_5
FROM country
WHERE country LIKE '_____';

-- Hint for the below query
SELECT city
FROM city
WHERE city ILIKE '%R';

SELECT COUNT(*) AS city_count_ending_with_r
FROM city
WHERE city ILIKE '%R';

-- Alternative to the above
SELECT COUNT(*) AS city_count_ending_with_r
FROM city
WHERE LOWER(city) LIKE '%r';