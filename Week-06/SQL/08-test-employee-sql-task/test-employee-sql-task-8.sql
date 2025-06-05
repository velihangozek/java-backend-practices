CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50),
	birthday DATE,
	email VARCHAR(100)
);

SELECT *
FROM employee;

-- Mock Data
insert into employee (name, birthday, email) values ('Brodie', '2016-04-22', 'bpawelke0@wikia.com');
insert into employee (name, birthday, email) values ('Phyllis', '2005-02-18', 'ppresser1@soup.io');
insert into employee (name, birthday, email) values ('Sophi', '1996-09-10', 'srehn2@blogs.com');
insert into employee (name, birthday, email) values ('Alleen', '2021-09-30', 'agratland3@washington.edu');
insert into employee (name, birthday, email) values ('Madel', '1962-03-31', 'mclougher4@theguardian.com');
insert into employee (name, birthday, email) values ('Gorden', '1962-11-26', 'gjeffcock5@vkontakte.ru');
insert into employee (name, birthday, email) values ('Monro', '1955-11-12', 'mmatous6@infoseek.co.jp');
insert into employee (name, birthday, email) values ('Gabriel', '1965-02-04', 'gspelwood7@webnode.com');
insert into employee (name, birthday, email) values ('Kirsten', '1991-12-06', 'kcorre8@sciencedirect.com');
insert into employee (name, birthday, email) values ('Olivier', '1988-08-18', 'oetchell9@eepurl.com');
insert into employee (name, birthday, email) values ('Marco', '1968-07-08', 'mmcgrorya@cafepress.com');
insert into employee (name, birthday, email) values ('Thaine', '2006-01-20', 'tdysertb@google.ru');
insert into employee (name, birthday, email) values ('Asa', '1975-07-01', 'asaxbyc@wp.com');
insert into employee (name, birthday, email) values ('Hewie', '1979-05-29', 'hasplend@state.tx.us');
insert into employee (name, birthday, email) values ('Tierney', '1951-03-02', 'tstatone@lycos.com');
insert into employee (name, birthday, email) values ('Yevette', '2019-06-28', 'ygryglewskif@theguardian.com');
insert into employee (name, birthday, email) values ('Lemmie', '1983-05-05', 'lchildsg@phoca.cz');
insert into employee (name, birthday, email) values ('Raff', '1953-11-24', 'rclashh@example.com');
insert into employee (name, birthday, email) values ('Llywellyn', '1996-08-28', 'llengleti@spotify.com');
insert into employee (name, birthday, email) values ('Juliane', '2005-07-18', 'jtarneyj@theatlantic.com');
insert into employee (name, birthday, email) values ('Jerri', '1988-11-04', 'jkiljank@sina.com.cn');
insert into employee (name, birthday, email) values ('Klement', '2025-02-22', 'kmooganl@samsung.com');
insert into employee (name, birthday, email) values ('Diane', '2017-03-10', 'drobbenm@1und1.de');
insert into employee (name, birthday, email) values ('Abagail', '2004-10-14', 'amillern@sohu.com');
insert into employee (name, birthday, email) values ('Dur', '1987-12-15', 'drismano@nih.gov');
insert into employee (name, birthday, email) values ('Suellen', '1953-04-12', 'sduckwithp@hibu.com');
insert into employee (name, birthday, email) values ('Yvon', '1967-11-05', 'ylambertq@narod.ru');
insert into employee (name, birthday, email) values ('Liza', '1977-05-06', 'lkopfenr@liveinternet.ru');
insert into employee (name, birthday, email) values ('Torrey', '1995-08-07', 'tbeckensalls@discuz.net');
insert into employee (name, birthday, email) values ('Ellene', '1963-04-02', 'eshukert@home.pl');
insert into employee (name, birthday, email) values ('Devon', '1956-11-28', 'ddraysayu@zdnet.com');
insert into employee (name, birthday, email) values ('Law', '1974-02-03', 'lpatridgev@microsoft.com');
insert into employee (name, birthday, email) values ('Dylan', '2001-01-17', 'dlaugaw@cyberchimps.com');
insert into employee (name, birthday, email) values ('Vito', '1997-05-21', 'vbernardeschix@thetimes.co.uk');
insert into employee (name, birthday, email) values ('Maisie', '1984-09-25', 'mseydlitzy@qq.com');
insert into employee (name, birthday, email) values ('Angel', '1966-02-17', 'agregoracez@digg.com');
insert into employee (name, birthday, email) values ('Patti', '1973-11-23', 'paverill10@yahoo.com');
insert into employee (name, birthday, email) values ('Maud', '1993-09-12', 'mturbat11@flavors.me');
insert into employee (name, birthday, email) values ('Miles', '2005-08-01', 'mollington12@desdev.cn');
insert into employee (name, birthday, email) values ('Natala', '2014-06-30', 'nshugg13@theguardian.com');
insert into employee (name, birthday, email) values ('Jordon', '1978-05-21', 'jsturgis14@marriott.com');
insert into employee (name, birthday, email) values ('Kay', '1996-08-26', 'kphillis15@flickr.com');
insert into employee (name, birthday, email) values ('Bert', '1951-06-19', 'bhiggoe16@typepad.com');
insert into employee (name, birthday, email) values ('Jeromy', '1991-05-04', 'jnewbury17@hao123.com');
insert into employee (name, birthday, email) values ('Denys', '2022-07-19', 'dwann18@miibeian.gov.cn');
insert into employee (name, birthday, email) values ('Khalil', '1970-07-22', 'kmeddick19@delicious.com');
insert into employee (name, birthday, email) values ('Marsha', '1980-11-27', 'mperryn1a@marriott.com');
insert into employee (name, birthday, email) values ('Weylin', '1967-09-30', 'wreader1b@abc.net.au');
insert into employee (name, birthday, email) values ('Burg', '2020-11-24', 'bradsdale1c@hostgator.com');
insert into employee (name, birthday, email) values ('Brendon', '2012-03-17', 'bhaddinton1d@yahoo.com');

SELECT *
FROM employee;

UPDATE employee
	SET name = 'velo',
		birthday = '1998-08-03',
		email = 'velihangozek@hotmail.com'
WHERE id IN (2, 3, 4, 5, 6);

SELECT *
FROM employee;

DELETE 
FROM employee
WHERE id IN (2, 3, 4, 5, 6)
RETURNING *;

SELECT *
FROM employee;

-- 1) Based on name: prepend 'Dr. ' to anyone whose name starts with 'D'
UPDATE employee
SET name = 'Dr. ' || name
WHERE name LIKE 'D%'
RETURNING *;

-- 2) Based on birthday: for anyone born before 1970, update their email domain
UPDATE employee
SET email = regexp_replace(email, '@.*$', '@veteran.example.com')
WHERE birthday < '1970-01-01'
RETURNING *;

-- 3) Based on email: for all gmail addresses, set birthday to Jan 1 1990
UPDATE employee
SET birthday = '1990-01-01'
WHERE email LIKE '%@%m%.com'
RETURNING *;

-- 4) Based on id: for the first 10 records, change their names to UPPERCASE
UPDATE employee
SET name = UPPER(name)
WHERE id BETWEEN 1 AND 10
RETURNING *;

-- 5) Based on a computed age: bump the year of birth by 1 for employees under 5
UPDATE employee
SET birthday = birthday + INTERVAL '1 year'
WHERE birthday > CURRENT_DATE - INTERVAL '5 years'
RETURNING *;

-- 1) Remove anyone younger than 6 years old.
DELETE FROM employee
WHERE birthday > CURRENT_DATE - INTERVAL '6 years'
RETURNING *;

-- 2) Remove all entries whose name contains 's'
DELETE FROM employee
WHERE name LIKE '%s%'
RETURNING *;

-- 3) Remove anyone whose email domain is like '...ex...com'
DELETE FROM employee
WHERE email LIKE '%ex%'
RETURNING *;

-- 4) Remove records with id multiples of 7
DELETE FROM employee
WHERE id % 7 = 0
RETURNING *;

-- 5) Remove anyone older than 40 years
DELETE FROM employee
WHERE birthday < CURRENT_DATE - INTERVAL '40 years'
RETURNING *;

SELECT *
FROM employee
ORDER BY id ASC;