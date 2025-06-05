-- All authors and all books
SELECT 
	a.first_name, 
	a.last_name, 
	b.title
FROM book AS b
FULL JOIN author AS a
	ON b.author_id = a.id;

-- Same as above ('OUTER' keyword added)
SELECT 
	a.first_name, 
	a.last_name, 
	b.title
FROM book AS b
FULL OUTER JOIN author AS a
	ON b.author_id = a.id;

-- All columns
SELECT *
FROM book AS b
FULL OUTER JOIN author AS a
	ON b.author_id = a.id;

-- Switching tables
SELECT *
FROM author AS a
FULL OUTER JOIN book AS b
	ON b.author_id = a.id;

-- Turning it into an inner join via WHERE Clause
SELECT *
FROM author AS a
FULL OUTER JOIN book AS b
	ON b.author_id = a.id
WHERE (a.id IS NOT NULL AND b.id IS NOT NULL);

-- Same as the above
SELECT *
FROM author AS a
INNER JOIN book AS b
	ON b.author_id = a.id;

-- Not matching data
SELECT *
FROM author AS a
FULL OUTER JOIN book AS b
	ON b.author_id = a.id
WHERE (a.id IS NULL OR b.id IS NULL);