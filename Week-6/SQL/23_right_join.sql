-- All authors - even with no books
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM book AS b
RIGHT JOIN author as A
	ON b.author_id = a.id;

-- With OUTER Keyword -> Same as above
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM book AS b
RIGHT OUTER JOIN author as a
	ON b.author_id = a.id;

-- Same with above
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM author AS a
LEFT JOIN book as b
	ON b.author_id = a.id;

-- All books - even with no authors
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM author AS a
RIGHT OUTER JOIN book as b
	ON b.author_id = a.id;