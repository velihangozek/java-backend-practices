(
-- UNION (Same table)
SELECT * 
FROM book
ORDER BY page_number DESC
LIMIT 5
)
UNION
(
SELECT *
FROM book
ORDER BY title
LIMIT 5
);

-- UNION ALL (Same table)
(
SELECT * 
FROM book
ORDER BY page_number DESC
LIMIT 5
)
UNION ALL
(
SELECT *
FROM book
ORDER BY title
LIMIT 5
);

-- UNION (Different Tables)
(
SELECT 
	id,
	email
FROM author
)
UNION
(
SELECT
	id,
	title
FROM book
);

-- ERROR:  each UNION query must have the same number of columns
(
SELECT 
	id,
	email,
	first_name
FROM author
)
UNION
(
SELECT
	id,
	title
FROM book
);

-- ERROR:  UNION types character varying and integer cannot be matched
(
SELECT 
	id,
	email
FROM author
)
UNION
(
SELECT
	id,
	page_number
FROM book
);