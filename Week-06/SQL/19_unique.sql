SELECT *
FROM users;

INSERT INTO users (username, email, age)
	VALUES 
		('tester2', 'tester@gmail.com', 44);

SELECT *
FROM users;

ALTER TABLE users
ADD UNIQUE(email);

SELECT *
FROM users;

INSERT INTO users (username, email, age)
	VALUES 
		('tester2', 'tester@gmail.com', 44);

INSERT INTO users (username, email, age)
	VALUES 
		('tester3', 'tester3@gmail.com', 55);

SELECT *
FROM users;