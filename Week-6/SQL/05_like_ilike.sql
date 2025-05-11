SELECT *
FROM customer
WHERE first_name = 'Mary';

SELECT *
FROM customer
WHERE first_name LIKE 'M%';

SELECT *
FROM customer
WHERE first_name LIKE 'Ma%';

SELECT *
FROM customer
WHERE first_name LIKE 'Mary%';

SELECT *
FROM customer
WHERE first_name LIKE '%y';

SELECT *
FROM customer
WHERE first_name LIKE 'A%y';

SELECT *
FROM customer
WHERE first_name LIKE 'A%' AND last_name LIKE 'A%';

SELECT *
FROM customer
WHERE first_name LIKE 'A%';

SELECT *
FROM customer
WHERE first_name LIKE 'a%';

SELECT *
FROM customer
WHERE first_name ILIKE 'a%';

SELECT *
FROM customer
WHERE first_name LIKE 'D%n';

SELECT *
FROM customer
WHERE first_name NOT LIKE 'D%n';

SELECT *
FROM customer
WHERE first_name NOT LIKE 'A%';

SELECT *
FROM customer
WHERE first_name LIKE 'J_an';

SELECT *
FROM customer
WHERE first_name LIKE 'J_';

SELECT *
FROM customer
WHERE first_name LIKE 'J%n';

SELECT *
FROM customer
WHERE first_name LIKE 'J_n';

SELECT *
FROM actor
WHERE first_name = 'Penelope';

SELECT *
FROM actor
WHERE first_name LIKE 'P%';

SELECT *
FROM actor
WHERE first_name LIKE 'T%';

SELECT *
FROM actor
WHERE first_name LIKE 'T__';

SELECT *
FROM actor
WHERE first_name LIKE 'T_m';

SELECT *
FROM actor
WHERE first_name LIKE 'T%m';

SELECT *
FROM actor
WHERE first_name LIKE 'A%';

SELECT *
FROM actor
WHERE first_name NOT LIKE 'A%';

SELECT *
FROM actor
WHERE first_name !~~ 'A%'; -- NOT LIKE = !~~

SELECT *
FROM actor
WHERE first_name ~~ 'A%'; -- LIKE = ~~

SELECT *
FROM actor
WHERE first_name ~~ 'B%'; -- LIKE = ~~

SELECT *
FROM actor
WHERE first_name ~~ 'b%'; -- LIKE = ~~

SELECT *
FROM actor
WHERE first_name ~~* 'b%'; -- ILIKE = ~~*

SELECT *
FROM actor
WHERE first_name !~~* 'b%'; -- NOT ILIKE = !~~*