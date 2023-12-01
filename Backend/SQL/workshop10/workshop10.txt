-- 1. city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
SELECT ci.city, co.country FROM city ci
LEFT JOIN country co ON co.country_id = ci.country_id;


-- 2. customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.
SELECT p.payment_id, c.customer_id, (c.first_name || ' ' || c.last_name) "İsim ve Soyisim" FROM payment p
RIGHT JOIN customer c ON c.customer_id = p.customer_id;


-- 3. customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.
SELECT r.rental_id, c.customer_id, (c.first_name || ' ' || c.last_name) "İsim ve Soyisim" FROM rental r
FULL JOIN customer c ON c.customer_id = r.customer_id;

