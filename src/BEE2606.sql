SELECT products.id,
       products.name
FROM products
JOIN categories ON categories.id = products.id_categories
WHERE LOWER(categories.name) LIKE 'super%';
