-- 1. film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
SELECT COUNT(*) "Ortalamadan Uzun Film Sayısı" FROM film
WHERE length > (SELECT AVG (length) FROM film);


-- 2. film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
SELECT COUNT(*) "En Yüksek Kira Bedeline Sahip Film Sayısı" FROM film
WHERE rental_rate = (SELECT MAX (rental_rate) FROM film);


-- 3. film tablosunda en düşük rental_rate ve en düşük replacement_cost değerlerine sahip filmleri sıralayınız.
SELECT title, rental_rate, replacement_cost FROM film
WHERE rental_rate = (SELECT MIN (rental_rate) FROM film) AND replacement_cost = (SELECT MIN (replacement_cost) FROM film);


-- 4. payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız
SELECT (c.first_name || ' ' || c.last_name) "Ad ve Soyad", COUNT(*) "Alışveriş Sayısı" FROM payment P
INNER JOIN customer c ON c.customer_id = p.customer_id
GROUP BY c.customer_id
ORDER BY "Alışveriş Sayısı" DESC;
