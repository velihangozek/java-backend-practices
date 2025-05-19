-- 1. List the titles of books whose page counts exceed the average page count, 
--    along with each author’s first and last name (DB: bookstore).
SELECT 
  b.title,
  b.page_number,
  (SELECT AVG(page_number) FROM book) AS avg_page_number,
  a.first_name, 
  a.last_name
FROM book AS b
INNER JOIN author AS a
  ON b.author_id = a.id
WHERE b.page_number > (
  SELECT AVG(page_number)
  FROM book
);