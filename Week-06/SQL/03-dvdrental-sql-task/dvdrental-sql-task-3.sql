SELECT country
FROM country
WHERE country LIKE 'A%a';

SELECT country
FROM country
WHERE country LIKE '_____%n';

-- Alternative to the above
SELECT country
FROM country
WHERE LENGTH(country) >= 6
  AND country LIKE '%n';

SELECT title
FROM film
WHERE title ILIKE '%t%t%t%t%';

-- Alternative to the above
SELECT title
FROM film
WHERE (LENGTH(LOWER(title))
       - LENGTH(REPLACE(LOWER(title), 't', ''))
      ) >= 4;

SELECT *
FROM film
WHERE (title LIKE 'C%') 
  AND (length > 90) 
    AND	(rental_rate = 2.99);