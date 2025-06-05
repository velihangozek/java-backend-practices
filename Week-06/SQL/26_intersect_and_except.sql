(
SELECT *
FROM book
ORDER BY page_number DESC
LIMIT 5
)
INTERSECT -- ALL -> useless
(
SELECT *
FROM book
ORDER BY title
LIMIT 5
);

-- Incremented the limit
(
SELECT *
FROM book
ORDER BY page_number DESC
LIMIT 10
)
INTERSECT
(
SELECT *
FROM book
ORDER BY title
LIMIT 10
);

-- (ALL DATA - INTERSECT = UNION) => 20 - 6 = 14
(
SELECT *
FROM book
ORDER BY page_number DESC
LIMIT 10
)
UNION
(
SELECT *
FROM book
ORDER BY title
LIMIT 10
);

-- UNION ALL => ALL DATA (20)
(
SELECT *
FROM book
ORDER BY page_number DESC
LIMIT 10
)
UNION ALL
(
SELECT *
FROM book
ORDER BY title
LIMIT 10
);

(
SELECT *
FROM book
ORDER BY page_number DESC
LIMIT 5
)
EXCEPT -- INTERSECT = 1, FIRST QUERY DATA = 5 => 5 - 1 = 4 => EXCEPT DATA
(
SELECT *
FROM book
ORDER BY title
LIMIT 5
);

(
SELECT *
FROM book
ORDER BY page_number DESC
LIMIT 10
)
EXCEPT -- FIRST QUERY DATA = 10 => 10 - 4 (EXCEPT DATA) = 6 => INTERSECT DATA
(
SELECT *
FROM book
ORDER BY title
LIMIT 10
);

(
SELECT *
FROM book
ORDER BY page_number DESC
LIMIT 10
)
INTERSECT -- FIRST QUERY DATA = 10 => 10 - 4 (EXCEPT DATA) = 6 => INTERSECT DATA
(
SELECT *
FROM book
ORDER BY title
LIMIT 10
);

-- Same column, similar data type
(
SELECT title
FROM book
ORDER BY page_number DESC
LIMIT 10
)
INTERSECT -- FIRST QUERY DATA = 10 => 10 - 4 (EXCEPT DATA) = 6 => INTERSECT DATA
(
SELECT title
FROM book
ORDER BY title
LIMIT 10
);

-- 1 column but different data type: ERROR:  INTERSECT types character varying and integer cannot be matched
(
SELECT title
FROM book
ORDER BY page_number DESC
LIMIT 10
)
INTERSECT -- FIRST QUERY DATA = 10 => 10 - 4 (EXCEPT DATA) = 6 => INTERSECT DATA
(
SELECT id
FROM book
ORDER BY title
LIMIT 10
);

-- Different number of columns => ERROR:  each INTERSECT query must have the same number of columns
(
SELECT title
FROM book
ORDER BY page_number DESC
LIMIT 10
)
INTERSECT -- FIRST QUERY DATA = 10 => 10 - 4 (EXCEPT DATA) = 6 => INTERSECT DATA
(
SELECT title, id
FROM book
ORDER BY title
LIMIT 10
);