/*
CREATE TABLE <table_name> (
	<column_name> <data_type> <constraint>,
	...
	<column_name> <data_type> <constraint>;
)
*/

/*
CREATE TABLE author (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	email VARCHAR(100),
	birthday DATE
);
*/

SELECT *
FROM author;

INSERT INTO author 
	(first_name, last_name, email, birthday) 
		values
			('Velihan', 'Gözek', 'velihangozek@hotmail.com', '1998-03-08'),
			('Haruki', 'Murakami', 'haruki@murakami.com', '1948-11-07'),
			('Sabahattin', 'Ali', 'sabahattin@ali.com', '1914-07-11'),
			('Orhan', 'Pamuk', 'orhan@pamuk.com', '1950-04-14'),
			('Halide Edip', 'Adıvar', 'halide@edip.com', '1884-07-11'),
			('Zygmunt', 'Bauman', 'zygmunt@bauman.com', '1911-07-12');

SELECT *
FROM author;

CREATE TABLE author2 (LIKE author);

SELECT *
FROM author2;

INSERT INTO author2
SELECT *
FROM author
WHERE id = 3;

SELECT *
FROM author2;

CREATE TABLE author3
AS
SELECT *
FROM author;

SELECT *
FROM author3;

DROP TABLE author4;

DROP TABLE IF EXISTS author4;

DROP TABLE author3;

DROP TABLE IF EXISTS author2;