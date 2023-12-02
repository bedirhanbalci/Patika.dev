-- 1. film tablosunda isminde en az 4 adet 'e' veya 'E' karakteri bulunan kaç tane film vardır?
SELECT COUNT(*) FROM film
WHERE title ILIKE '%e%e%e%e%';


-- 2. category tablosundan kategori isimlerini ve kategori başına düşen film sayılarını sıralayınız.
SELECT COUNT(*), c.name FROM category c
INNER JOIN film_category fc ON fc.category_id = c.category_id
INNER JOIN film f ON f.film_id = fc.film_id
GROUP BY c.name;


-- 3. film tablosunda içerisinden en fazla sayıda film bulunduran rating kategorisi hangisidir?
SELECT COUNT(*), rating FROM film
GROUP BY rating
ORDER BY COUNT(*) DESC
LIMIT 1;


-- 4. film tablosundan 'K' karakteri ile başlayan en uzun ve replacement_cost'u en düşük 4 filmi sıralayınız.
SELECT title, length, replacement_cost from film
WHERE title LIKE 'K%'
ORDER BY length DESC, replacement_cost ASC
LIMIT 4;


-- 5. customer tablosunda en çok harcama yapan müşterinin adı nedir?
SELECT SUM(amount), c.first_name, c.last_name FROM payment p
INNER JOIN customer c ON c.customer_id = p.customer_id
GROUP BY p.customer_id, c.first_name, c.last_name
ORDER BY SUM(amount) DESC
LIMIT 1;








