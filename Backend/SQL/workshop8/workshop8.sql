-- 1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee (
	id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);


-- 2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (name, birthday, email) values ('Garek Matussow', '1989-05-27', 'gmatussow0@com.com');
insert into employee (name, birthday, email) values ('Florina Duns', '1994-07-05', null);
insert into employee (name, birthday, email) values ('Ilse Bust', '1974-02-08', 'ibust2@weibo.com');
insert into employee (name, birthday, email) values ('Eleni Dmitr', '1984-02-21', 'edmitr3@vimeo.com');
insert into employee (name, birthday, email) values ('Eddy Hentzer', '1990-11-10', 'ehentzer4@tamu.edu');
insert into employee (name, birthday, email) values ('Bendick Renner', '1994-12-18', 'brenner5@time.com');
insert into employee (name, birthday, email) values ('Gery Engeham', null, 'gengeham6@wiley.com');
insert into employee (name, birthday, email) values ('Rubin Sketh', '1987-05-01', 'rsketh7@eventbrite.com');
insert into employee (name, birthday, email) values ('Dennison Kerne', '1997-09-10', 'dkerne8@sogou.com');
insert into employee (name, birthday, email) values ('Johnny Lampke', null, 'jlampke9@addthis.com');
insert into employee (name, birthday, email) values ('Eolanda Ornells', '1979-12-05', 'eornellsa@dailymail.co.uk');
insert into employee (name, birthday, email) values ('Agustin Milburne', '1984-07-08', 'amilburneb@spotify.com');
insert into employee (name, birthday, email) values ('Jermaine Grestye', '1974-04-18', 'jgrestyec@instagram.com');
insert into employee (name, birthday, email) values ('Woodrow Longhurst', '1984-09-18', null);
insert into employee (name, birthday, email) values ('Ethelbert Cornthwaite', '1996-11-04', 'ecornthwaitee@patch.com');
insert into employee (name, birthday, email) values ('Jo-anne Penn', '1985-04-21', 'jpennf@uol.com.br');
insert into employee (name, birthday, email) values ('Chevalier Soan', '1971-06-29', null);
insert into employee (name, birthday, email) values ('Corene Daudray', '1986-09-14', 'cdaudrayh@google.com.hk');
insert into employee (name, birthday, email) values ('Aprilette Ricca', '1993-03-25', 'ariccai@tuttocitta.it');
insert into employee (name, birthday, email) values ('Sayres Monk', '1993-03-25', 'smonkj@4shared.com');
insert into employee (name, birthday, email) values ('Kippie McKendry', '1999-02-02', 'kmckendryk@usgs.gov');
insert into employee (name, birthday, email) values ('Shelden Van Hault', '1962-01-03', 'svanl@goo.ne.jp');
insert into employee (name, birthday, email) values ('Athene Calcraft', '1964-12-23', 'acalcraftm@cloudflare.com');
insert into employee (name, birthday, email) values ('Yolanthe Cartin', '1995-02-28', 'ycartinn@ed.gov');
insert into employee (name, birthday, email) values ('Skipp McClurg', '1978-01-08', 'smcclurgo@ameblo.jp');
insert into employee (name, birthday, email) values ('Fidela Chandler', '1963-09-11', 'fchandlerp@wikispaces.com');
insert into employee (name, birthday, email) values ('Laureen Beckers', '1966-06-05', 'lbeckersq@facebook.com');
insert into employee (name, birthday, email) values ('Ximenez Colby', '1970-09-13', 'xcolbyr@google.fr');
insert into employee (name, birthday, email) values ('Barclay Aneley', '1972-05-30', 'baneleys@feedburner.com');
insert into employee (name, birthday, email) values ('Orsa Jaquin', '1975-04-22', 'ojaquint@w3.org');
insert into employee (name, birthday, email) values ('Ferrel Chesters', '1971-01-29', 'fchestersu@army.mil');
insert into employee (name, birthday, email) values ('Roth Kubecka', '1963-09-06', 'rkubeckav@google.pl');
insert into employee (name, birthday, email) values ('Thomasine Whitehair', '1980-05-01', 'twhitehairw@biglobe.ne.jp');
insert into employee (name, birthday, email) values ('Fidelio Simonson', '1980-07-31', 'fsimonsonx@paypal.com');
insert into employee (name, birthday, email) values ('Kaylyn Jindra', '1992-01-10', 'kjindray@list-manage.com');
insert into employee (name, birthday, email) values ('Charmaine Malkie', '1982-01-16', 'cmalkiez@mlb.com');
insert into employee (name, birthday, email) values ('Kylynn Schleicher', null, 'kschleicher10@nps.gov');
insert into employee (name, birthday, email) values ('Rolfe Marcu', '1989-10-18', 'rmarcu11@nsw.gov.au');
insert into employee (name, birthday, email) values ('Honor MacSwayde', '1970-07-02', 'hmacswayde12@newsvine.com');
insert into employee (name, birthday, email) values ('Janine Cossins', '1992-01-09', 'jcossins13@buzzfeed.com');
insert into employee (name, birthday, email) values ('Sunny Satcher', '1971-03-16', 'ssatcher14@typepad.com');
insert into employee (name, birthday, email) values ('Cornelia Klimek', '1992-04-29', 'cklimek15@sciencedirect.com');
insert into employee (name, birthday, email) values ('Amye Blackall', '1966-09-22', 'ablackall16@senate.gov');
insert into employee (name, birthday, email) values ('Ricky Connechy', '1984-08-23', 'rconnechy17@phoca.cz');
insert into employee (name, birthday, email) values ('Valentine Audry', null, 'vaudry18@tinypic.com');
insert into employee (name, birthday, email) values ('Clerc O''Sheilds', '1967-03-03', 'cosheilds19@i2i.jp');
insert into employee (name, birthday, email) values ('Ashly Noone', null, 'anoone1a@nytimes.com');
insert into employee (name, birthday, email) values ('Fancie Nealon', '1991-09-10', 'fnealon1b@gizmodo.com');
insert into employee (name, birthday, email) values ('Jard Tzar', '1976-12-06', 'jtzar1c@shinystat.com');
insert into employee (name, birthday, email) values ('Jeanne Giacobilio', '1980-01-01', 'jgiacobilio1d@rakuten.co.jp');


-- 3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET name = 'Bedirhan Balci',
    email = 'bedirhan@gmail.com'
WHERE id = 7;


UPDATE employee
SET birthday = '1999-01-01'
WHERE id BETWEEN 27 AND 34;


UPDATE employee
SET email = 'update@update.com'
WHERE birthday < '1999-01-01';


UPDATE employee
SET email = 'updatej@j.com'
WHERE name LIKE 'J%';


UPDATE employee
SET email = 'update@gmail.com'
WHERE email = 'update@update.com'
RETURNING *;


-- 4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE id > 38
RETURNING *;


DELETE FROM employee
WHERE email LIKE '%@gmail.com' AND id BETWEEN 1 AND 6
RETURNING *;


DELETE FROM employee
WHERE name LIKE 'J%' OR email LIKE '%@j.com'
RETURNING *;


DELETE FROM employee
WHERE name ILIKE '%y%y%'
RETURNING *;


DELETE FROM employee
WHERE birthday = '1999-01-01' AND name LIKE 'F%'
RETURNING *;

