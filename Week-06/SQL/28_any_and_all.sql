SELECT first_name, last_name
FROM author
WHERE id = ANY
(
	SELECT id 
	FROM book 
	WHERE title = 'Abe Lincoln in Illinois' OR title = 'Saving Shiloh'
);

SELECT first_name, last_name
FROM author
WHERE id = ALL
(
	SELECT id 
	FROM book 
	WHERE title = 'Abe Lincoln in Illinois' OR title = 'Saving Shiloh'
);

SELECT first_name, last_name
FROM author
WHERE id > ANY
(
	SELECT id 
	FROM book 
	WHERE title = 'Abe Lincoln in Illinois' OR title = 'Saving Shiloh'
);

SELECT first_name, last_name
FROM author
WHERE id > ALL
(
	SELECT id 
	FROM book 
	WHERE title = 'Abe Lincoln in Illinois' OR title = 'Saving Shiloh'
);