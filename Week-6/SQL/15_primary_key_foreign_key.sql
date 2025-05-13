CREATE TABLE book (
	id SERIAL PRIMARY KEY,
	title VARCHAR(50) NOT NULL,
	page_number INTEGER NOT NULL,
	author_id INTEGER REFERENCES author(id) 
);

SELECT *
FROM book;

insert into book (title, page_number, author_id) values ('White Banners', 62, 1);
insert into book (title, page_number, author_id) values ('Saving Shiloh', 580, 10);
insert into book (title, page_number, author_id) values ('Abe Lincoln in Illinois', 105, 6);
insert into book (title, page_number, author_id) values ('Apache Territory', 286, 1);
insert into book (title, page_number, author_id) values ('Out 1: Spectre', 402, 9);
insert into book (title, page_number, author_id) values ('Trials of Muhammad Ali, The', 164, 5);
insert into book (title, page_number, author_id) values ('B.U.S.T.E.D (Everybody Loves Sunshine) (Busted)', 84, 10);
insert into book (title, page_number, author_id) values ('Father Sergius (Otets Sergiy)', 265, 9);
insert into book (title, page_number, author_id) values ('It Started in Naples', 838, 8);
insert into book (title, page_number, author_id) values ('Thirty Seconds Over Tokyo', 586, 1);
insert into book (title, page_number, author_id) values ('Return to Homs, The', 580, 9);
insert into book (title, page_number, author_id) values ('Cutie Honey', 788, 8);
insert into book (title, page_number, author_id) values ('Jackass 3.5', 834, 1);
insert into book (title, page_number, author_id) values ('Baby On Board', 339, 7);
insert into book (title, page_number, author_id) values ('Making Plans for Lena (Non ma fille, tu n''iras pas danser)', 375, 7);

ALTER TABLE book
ALTER COLUMN title TYPE VARCHAR(150);

SELECT *
FROM book
ORDER BY id ASC;

SELECT * FROM book
WHERE author_id = 1;

SELECT * FROM book
JOIN author ON book.author_id = author.id;
