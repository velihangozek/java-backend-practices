-- 1. Average rental_rate (rounded to 3 decimals)
SELECT ROUND(AVG(rental_rate), 3) AS avg_rental_rate
FROM film;

-- Alternative
SELECT ROUND(AVG(rental_rate)::numeric, 3) AS avg_rental_rate
FROM film;

-- 2. Number of films with titles starting with ‘C’
SELECT COUNT(*) AS films_starting_with_C
FROM film
WHERE title LIKE 'C%';

-- 3. Longest film length where rental_rate = 0.99
SELECT MAX(length) AS longest_length_for_rate_0_99
FROM film
WHERE rental_rate = 0.99;

-- 4. Distinct replacement_cost values for films longer than 150 min
SELECT COUNT(DISTINCT replacement_cost) AS distinct_replacement_costs
FROM film
WHERE length > 150;