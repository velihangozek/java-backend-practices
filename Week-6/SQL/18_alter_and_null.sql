CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username VARCHAR(20),
	email VARCHAR(50),
	age INTEGER
);

SELECT *
FROM users;

INSERT INTO users(username, email, age)
	VALUES 
		('tester', 'tester@gmail.com', 23);

SELECT *
FROM users;

-- Null username can be inserted.
INSERT INTO users(email, age)
	VALUES 
		('gamer@gmail.com', 35);

SELECT *
FROM users;

-- ERROR:  relation "users" already exists
CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username VARCHAR(20) NOT NULL,
	email VARCHAR(50),
	age INTEGER
);

-- ERROR:  column "username" of relation "users" contains null values 
ALTER TABLE users
ALTER COLUMN username
SET NOT NULL;

-- DELETE 0
DELETE
FROM users
WHERE username = NULL;

-- Proper Delete Statement Using => IS
DELETE
FROM users
WHERE username IS NULL
RETURNING *;

SELECT *
FROM users;

-- No null values exist anymore.
ALTER TABLE users
ALTER COLUMN username
SET NOT NULL;

SELECT *
FROM users;

-- Null username cannot be inserted anymore (username now has NOT NULL constraint).
INSERT INTO users(email, age)
	VALUES 
		('gamer@gmail.com', 35);

INSERT INTO users(username, email, age)
	VALUES 
		('', 'gamer@gmail.com', 35);

SELECT *
FROM users;