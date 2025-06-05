DROP TABLE products;
DROP TABLE users;

SELECT title, first_name, last_name
FROM book
INNER JOIN author ON book.author_id = author.id;

SELECT *
FROM book
INNER JOIN author ON book.author_id = author.id; -- DEFAULT JOIN

SELECT *
FROM book
JOIN author ON book.author_id = author.id;

-- Same with the below - Symmetrical
SELECT book.title, author.first_name, author.last_name
FROM book
INNER JOIN author ON book.author_id = author.id;

-- Same with the above - Symmetrical
SELECT book.title, author.first_name, author.last_name
FROM author
INNER JOIN book ON author.id = book.author_id;