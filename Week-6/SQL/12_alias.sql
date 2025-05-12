SELECT first_name as name, last_name as surname
FROM actor;

SELECT first_name name, last_name surname
FROM actor;

SELECT first_name AS "name test", last_name "surname test"
FROM actor;

SELECT COUNT(*) AS actor_count
FROM actor;

SELECT CONCAT(first_name, ' ', last_name) AS "name and surname or first name and last name"
FROM actor;