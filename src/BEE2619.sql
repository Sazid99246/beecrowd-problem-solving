SELECT 
    products.name AS product_name,
    providers.name AS provider_name,
    products.price AS price
FROM 
    products
JOIN 
    providers ON providers.id = products.id_providers
JOIN 
    categories ON categories.id = products.id_categories
WHERE 
    products.price > 1000
    AND categories.name = 'Super Luxury';
