SELECT *
FROM users;

INSERT INTO users (username, email, age)
	VALUES
		('gamer3', 'gamer3@gmail.com', -22);

SELECT *
FROM users;

ALTER TABLE users
ADD CHECK (age > 18);

DELETE FROM users
WHERE age = -22;

SELECT *
FROM users;

ALTER TABLE users
ADD CHECK (age > 18);

SELECT *
FROM users;

INSERT INTO users (username, email, age)
	VALUES
		('gamer3', 'gamer3@gmail.com', -22);

INSERT INTO users (username, email, age)
	VALUES
		('gamer3', 'gamer3@gmail.com', 19);

SELECT *
FROM users;

CREATE TABLE products(
	product_no INTEGER,
	name TEXT,
	price NUMERIC CHECK (price > 0),
	discounted_price NUMERIC CHECK (discounted_price > 0),
	CHECK (price > discounted_price)
);

SELECT *
FROM products;

INSERT INTO products (product_no, name, price, discounted_price)
	VALUES
		(1,'test', 13, 12);

SELECT *
FROM products;