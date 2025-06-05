SELECT *
FROM author;

-- Mock Data
/*
insert into author (first_name, last_name, email, birthday) values ('Fleming', 'Coultar', null, null);
insert into author (first_name, last_name, email, birthday) values ('Dolli', 'McTague', 'dmctague1@patch.com', null);
insert into author (first_name, last_name, email, birthday) values ('Chrotoem', 'Ioannidis', 'cioannidis2@wp.com', null);
insert into author (first_name, last_name, email, birthday) values ('Yolande', 'Treen', 'ytreen3@wikia.com', '1914-10-24');
insert into author (first_name, last_name, email, birthday) values ('Rahal', 'Corcoran', 'rcorcoran4@diigo.com', '1902-11-28');
insert into author (first_name, last_name, email, birthday) values ('Jori', 'Domb', 'jdomb5@cnbc.com', null);
insert into author (first_name, last_name, email, birthday) values ('Felicity', 'Crathern', 'fcrathern6@dedecms.com', '1928-06-28');
insert into author (first_name, last_name, email, birthday) values ('Rakel', 'Canet', 'rcanet7@squidoo.com', '1906-01-29');
insert into author (first_name, last_name, email, birthday) values ('Jessy', 'Scemp', 'jscemp8@businessweek.com', '1933-12-04');
insert into author (first_name, last_name, email, birthday) values ('Torre', 'Schofield', 'tschofield9@patch.com', null);
insert into author (first_name, last_name, email, birthday) values ('Clyve', 'Paxton', 'cpaxtona@amazonaws.com', '1945-03-01');
insert into author (first_name, last_name, email, birthday) values ('Filbert', 'Dadd', 'fdaddb@bbc.co.uk', '1956-07-31');
insert into author (first_name, last_name, email, birthday) values ('Georgi', 'Downton', 'gdowntonc@census.gov', '1965-04-26');
insert into author (first_name, last_name, email, birthday) values ('Della', 'Elloit', 'delloitd@yellowbook.com', '1968-08-31');
insert into author (first_name, last_name, email, birthday) values ('Scarlett', 'Melmar', 'smelmare@bloomberg.com', '1956-10-29');
insert into author (first_name, last_name, email, birthday) values ('Daren', 'Digle', null, '1992-02-25');
insert into author (first_name, last_name, email, birthday) values ('Kevan', 'Dwelley', 'kdwelleyg@youku.com', '1915-01-23');
insert into author (first_name, last_name, email, birthday) values ('Vivyanne', 'Albany', 'valbanyh@blogs.com', '1979-06-03');
insert into author (first_name, last_name, email, birthday) values ('Guilbert', 'Zwicker', 'gzwickeri@europa.eu', '1989-11-18');
insert into author (first_name, last_name, email, birthday) values ('Roosevelt', 'Rosson', 'rrossonj@hibu.com', '1938-05-31');
insert into author (first_name, last_name, email, birthday) values ('Cele', 'Cowern', 'ccowernk@discuz.net', '1954-04-23');
insert into author (first_name, last_name, email, birthday) values ('Aldridge', 'Cantua', 'acantual@howstuffworks.com', null);
insert into author (first_name, last_name, email, birthday) values ('Rhianna', 'Galvin', 'rgalvinm@com.com', '1965-08-16');
insert into author (first_name, last_name, email, birthday) values ('Larissa', 'Kinnane', 'lkinnanen@dagondesign.com', '1965-08-24');
insert into author (first_name, last_name, email, birthday) values ('Sabine', 'Malinson', 'smalinsono@bizjournals.com', null);
insert into author (first_name, last_name, email, birthday) values ('Bryant', 'Sawkin', 'bsawkinp@nature.com', '1985-04-24');
insert into author (first_name, last_name, email, birthday) values ('Lizbeth', 'Dulanty', 'ldulantyq@jiathis.com', '1965-02-19');
insert into author (first_name, last_name, email, birthday) values ('Jania', 'Landers', 'jlandersr@wikia.com', '1915-03-12');
insert into author (first_name, last_name, email, birthday) values ('Dud', 'Rego', 'dregos@utexas.edu', '1977-02-26');
insert into author (first_name, last_name, email, birthday) values ('Raynard', 'Gavrielli', 'rgavriellit@altervista.org', '1969-03-13');
insert into author (first_name, last_name, email, birthday) values ('Donetta', 'Baudin', 'dbaudinu@usgs.gov', '1960-04-29');
insert into author (first_name, last_name, email, birthday) values ('Isa', 'Dennis', 'idennisv@mediafire.com', '1903-12-26');
insert into author (first_name, last_name, email, birthday) values ('Denny', 'Dinsmore', 'ddinsmorew@webeden.co.uk', '1972-09-28');
insert into author (first_name, last_name, email, birthday) values ('Brittan', 'Britto', 'bbrittox@godaddy.com', '1995-11-28');
insert into author (first_name, last_name, email, birthday) values ('Dominik', 'Duchenne', 'dduchenney@gizmodo.com', '1965-01-07');
insert into author (first_name, last_name, email, birthday) values ('Erhart', 'Warratt', null, '1990-10-28');
insert into author (first_name, last_name, email, birthday) values ('Dolli', 'Altamirano', 'daltamirano10@netvibes.com', '1913-09-29');
insert into author (first_name, last_name, email, birthday) values ('Rozamond', 'Judson', 'rjudson11@noaa.gov', '1941-04-16');
insert into author (first_name, last_name, email, birthday) values ('Leonidas', 'Bigley', 'lbigley12@redcross.org', '1949-12-28');
insert into author (first_name, last_name, email, birthday) values ('Mortie', 'Trueman', 'mtrueman13@stanford.edu', '1959-11-20');
insert into author (first_name, last_name, email, birthday) values ('Royce', 'Flahive', 'rflahive14@cafepress.com', '1999-03-16');
insert into author (first_name, last_name, email, birthday) values ('Janice', 'Soule', 'jsoule15@admin.ch', '1997-12-03');
insert into author (first_name, last_name, email, birthday) values ('Celeste', 'Eversfield', 'ceversfield16@squidoo.com', '1906-08-21');
insert into author (first_name, last_name, email, birthday) values ('Dorella', 'Shelmerdine', 'dshelmerdine17@plala.or.jp', null);
insert into author (first_name, last_name, email, birthday) values ('Ewart', 'McCritichie', 'emccritichie18@dailymotion.com', '1981-11-26');
insert into author (first_name, last_name, email, birthday) values ('Becka', 'Winnard', 'bwinnard19@com.com', '1906-01-20');
insert into author (first_name, last_name, email, birthday) values ('Skipper', 'Cupitt', 'scupitt1a@blogspot.com', null);
insert into author (first_name, last_name, email, birthday) values ('Rozalie', 'McIlharga', 'rmcilharga1b@blogs.com', '1974-09-14');
insert into author (first_name, last_name, email, birthday) values ('Noel', 'Edney', 'nedney1c@miibeian.gov.cn', '1989-02-10');
insert into author (first_name, last_name, email, birthday) values ('Gerry', 'Dumberrill', 'gdumberrill1d@columbia.edu', '1969-10-23');
insert into author (first_name, last_name, email, birthday) values ('Chaddie', 'Ferrone', 'cferrone1e@nsw.gov.au', '1995-03-07');
insert into author (first_name, last_name, email, birthday) values ('Lesli', 'Lyster', 'llyster1f@marketwatch.com', '1909-02-24');
insert into author (first_name, last_name, email, birthday) values ('Clementine', 'Dawks', 'cdawks1g@howstuffworks.com', '1901-11-19');
insert into author (first_name, last_name, email, birthday) values ('Adina', 'Purvess', 'apurvess1h@livejournal.com', '1989-12-28');
insert into author (first_name, last_name, email, birthday) values ('Marsh', 'Crosham', 'mcrosham1i@toplist.cz', '1986-02-12');
insert into author (first_name, last_name, email, birthday) values ('Kaitlynn', 'Westmarland', 'kwestmarland1j@stanford.edu', '1974-04-21');
insert into author (first_name, last_name, email, birthday) values ('Gisela', 'Vlach', null, '1976-10-07');
insert into author (first_name, last_name, email, birthday) values ('Clotilda', 'Carnock', 'ccarnock1l@usgs.gov', '1942-11-30');
insert into author (first_name, last_name, email, birthday) values ('Audra', 'Benitez', 'abenitez1m@twitpic.com', '1939-08-06');
insert into author (first_name, last_name, email, birthday) values ('Nydia', 'Sissland', null, '1904-01-14');
insert into author (first_name, last_name, email, birthday) values ('Melicent', 'Mounch', 'mmounch1o@csmonitor.com', '1962-05-07');
insert into author (first_name, last_name, email, birthday) values ('Drucill', 'Chetwynd', 'dchetwynd1p@wordpress.com', '1937-04-02');
insert into author (first_name, last_name, email, birthday) values ('Murielle', 'Guerola', 'mguerola1q@ucsd.edu', null);
insert into author (first_name, last_name, email, birthday) values ('Fidelity', 'Olwen', 'folwen1r@a8.net', '1988-10-19');
insert into author (first_name, last_name, email, birthday) values ('Kaspar', 'Reucastle', 'kreucastle1s@msu.edu', null);
insert into author (first_name, last_name, email, birthday) values ('Cara', 'MacKereth', 'cmackereth1t@google.cn', '1957-08-16');
insert into author (first_name, last_name, email, birthday) values ('Elinore', 'Grzelak', 'egrzelak1u@state.gov', '1992-08-01');
insert into author (first_name, last_name, email, birthday) values ('Kore', 'Tugman', 'ktugman1v@yelp.com', '1928-05-26');
insert into author (first_name, last_name, email, birthday) values ('Gayla', 'Rickis', null, null);
insert into author (first_name, last_name, email, birthday) values ('Sibyl', 'Sandhill', null, '1966-01-30');
insert into author (first_name, last_name, email, birthday) values ('Krisha', 'Lamblot', 'klamblot1y@mysql.com', '1920-10-08');
insert into author (first_name, last_name, email, birthday) values ('Brigham', 'Pawlett', 'bpawlett1z@who.int', '1909-01-22');
insert into author (first_name, last_name, email, birthday) values ('Tabatha', 'Wais', null, '1950-05-13');
insert into author (first_name, last_name, email, birthday) values ('Andrus', 'Olivas', null, null);
insert into author (first_name, last_name, email, birthday) values ('Katrina', 'Hawksley', 'khawksley22@github.com', null);
insert into author (first_name, last_name, email, birthday) values ('Nero', 'Palfrie', 'npalfrie23@berkeley.edu', '1921-10-28');
insert into author (first_name, last_name, email, birthday) values ('Arthur', 'Ekins', 'aekins24@qq.com', '1997-09-05');
insert into author (first_name, last_name, email, birthday) values ('Evonne', 'Karolowski', 'ekarolowski25@merriam-webster.com', '1908-11-06');
insert into author (first_name, last_name, email, birthday) values ('Kori', 'Orrah', 'korrah26@sina.com.cn', null);
insert into author (first_name, last_name, email, birthday) values ('Irene', 'Tivers', 'itivers27@hostgator.com', '1939-10-06');
insert into author (first_name, last_name, email, birthday) values ('Aggie', 'Ruslin', null, '1912-11-22');
insert into author (first_name, last_name, email, birthday) values ('Alfie', 'Garmon', 'agarmon29@columbia.edu', '1945-11-16');
insert into author (first_name, last_name, email, birthday) values ('Noellyn', 'Spyby', 'nspyby2a@wikipedia.org', '1938-12-12');
insert into author (first_name, last_name, email, birthday) values ('Reilly', 'Ferruzzi', 'rferruzzi2b@icq.com', '1966-06-19');
insert into author (first_name, last_name, email, birthday) values ('Maxie', 'Hooke', 'mhooke2c@forbes.com', '1939-02-27');
insert into author (first_name, last_name, email, birthday) values ('Koenraad', 'Elks', 'kelks2d@irs.gov', '1977-04-08');
insert into author (first_name, last_name, email, birthday) values ('Sande', 'Goulston', 'sgoulston2e@edublogs.org', '1963-03-08');
insert into author (first_name, last_name, email, birthday) values ('Diana', 'Binham', 'dbinham2f@constantcontact.com', '1924-05-11');
insert into author (first_name, last_name, email, birthday) values ('Gabi', 'Blanket', 'gblanket2g@icio.us', '1919-07-18');
insert into author (first_name, last_name, email, birthday) values ('Parker', 'Filtness', 'pfiltness2h@github.com', null);
insert into author (first_name, last_name, email, birthday) values ('Bart', 'Haynes', 'bhaynes2i@princeton.edu', '1917-04-24');
insert into author (first_name, last_name, email, birthday) values ('Sephira', 'Pawlicki', 'spawlicki2j@weebly.com', '1996-12-23');
insert into author (first_name, last_name, email, birthday) values ('Sheffield', 'Tibbs', 'stibbs2k@github.io', '1960-12-20');
insert into author (first_name, last_name, email, birthday) values ('Valentine', 'Carding', 'vcarding2l@360.cn', '1955-09-23');
insert into author (first_name, last_name, email, birthday) values ('Carmen', 'Castane', 'ccastane2m@taobao.com', '1988-03-19');
insert into author (first_name, last_name, email, birthday) values ('Reina', 'Finlow', 'rfinlow2n@walmart.com', '1965-02-23');
insert into author (first_name, last_name, email, birthday) values ('Annalise', 'Peake', 'apeake2o@ucoz.com', '1934-10-23');
insert into author (first_name, last_name, email, birthday) values ('Talbert', 'Braybrooke', 'tbraybrooke2p@mysql.com', null);
insert into author (first_name, last_name, email, birthday) values ('Alene', 'Cressy', 'acressy2q@state.tx.us', '1985-11-26');
insert into author (first_name, last_name, email, birthday) values ('Lucilia', 'Gater', 'lgater2r@cbslocal.com', null);
*/

/*
UPDATE <table_name>
	SET <column_name1> = <value1>,
		<column_name2> = <value2>
		...
WHERE condition;
*/

UPDATE author
	SET first_name = 'Velo',
		last_name = "Gözek",
		email = "velo@gozek.com",
		birthday = "1998-08-03"
WHERE id = 10;

SELECT *
FROM author;

UPDATE author
	SET first_name = 'XXXX',
		last_name = 'YYYY'
WHERE first_name LIKE 'F%';

SELECT *
FROM author;

UPDATE author
	SET last_name = 'UPDATE'
WHERE id = 8
RETURNING *;

-- DELETE FROM <table_name>
-- WHERE condition;

DELETE FROM author
WHERE id = 11;

SELECT *
FROM author;

DELETE FROM author
WHERE id > 66
RETURNING *;

SELECT *
FROM author;