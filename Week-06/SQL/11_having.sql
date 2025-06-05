SELECT rental_rate, COUNT(*)
FROM film
GROUP BY rental_rate
HAVING COUNT(*) > 330;

SELECT rental_rate, COUNT(*)
FROM film
WHERE rental_rate != 2.99
GROUP BY rental_rate;

SELECT COUNT(*)
FROM payment;

SELECT staff_id, COUNT(*)
FROM payment
GROUP BY staff_id;

SELECT staff_id, COUNT(*)
FROM payment
GROUP BY staff_id
HAVING COUNT(*) > 7300;

SELECT customer_id, COUNT(*)
FROM payment
GROUP BY customer_id;

SELECT customer_id, COUNT(*)
FROM payment
GROUP BY customer_id
ORDER BY COUNT(*) DESC;

SELECT customer_id, amount
FROM payment
GROUP BY customer_id, amount
ORDER BY customer_id ASC, amount ASC;

SELECT customer_id, SUM(amount)
FROM payment
GROUP BY customer_id
ORDER BY customer_id ASC, SUM(amount) ASC;

SELECT customer_id, SUM(amount)
FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100
ORDER BY customer_id ASC; -- SUM(amount) ASC;

SELECT customer_id, SUM(amount)
FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100
ORDER BY SUM(amount) DESC
LIMIT 1;