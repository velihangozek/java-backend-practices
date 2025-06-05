-- All authors - even with no books
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM author AS a
LEFT JOIN book AS b
	ON a.id = b.author_id;

-- Same with above => ID switching changes nothing
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM author AS a
LEFT JOIN book AS b
	ON b.author_id = a.id;

-- All books - even with no authors
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM book AS b
LEFT JOIN author AS a
	ON a.id = b.author_id;

-- Same as above.
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM book AS b
LEFT JOIN author AS a
	ON b.author_id = a.id;

-- Inserting a book with no author (a constraint blocked insertion)
INSERT INTO book 
	(title, page_number, author_id)
		VALUES
			('Gülün Adı', 466, 67);

-- Dropping the constraint
ALTER TABLE book
DROP CONSTRAINT book_author_id_fkey;

-- Inserting the same book with no author (dropped the constraint)
INSERT INTO book 
	(title, page_number, author_id)
		VALUES
			('Gülün Adı', 466, 67);

-- All books - even with no authors
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM book AS b
LEFT JOIN author AS a
	ON b.author_id = a.id;

-- Inserting another book with no author
INSERT INTO book 
	(title, page_number, author_id)
		VALUES
			('Yapay Zeka', 108, 68);

-- All books - even with no authors
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM book AS b
LEFT JOIN author AS a
	ON b.author_id = a.id;

-- Make it an inner join via WHERE CLAUSE
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM book AS b
LEFT JOIN author AS a
	ON b.author_id = a.id
WHERE a.id IS NOT NULL;

-- Same as above
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM book AS b
INNER JOIN author AS a
	ON b.author_id = a.id;

-- Ordered
SELECT 
	b.title, 
	a.first_name, 
	a.last_name
FROM book AS b
LEFT JOIN author AS a
	ON b.author_id = a.id
WHERE a.id IS NOT NULL
ORDER BY 
	a.first_name,
	b.title;