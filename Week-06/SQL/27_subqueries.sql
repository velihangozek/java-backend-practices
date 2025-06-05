SELECT *
FROM book
WHERE page_number > 466;

SELECT page_number
FROM book
WHERE title = 'Gülün Adı';

SELECT *
FROM book
WHERE page_number >
(
SELECT page_number
FROM book
WHERE title = 'Gülün Adı'
);

SELECT title, page_number, (SELECT MAX(page_number) FROM book) AS max_page_number, ((SELECT MAX(page_number) FROM book) - page_number) AS page_difference_with_max_page
FROM book
WHERE page_number >
(
SELECT page_number
FROM book
WHERE title = 'Gülün Adı'
);