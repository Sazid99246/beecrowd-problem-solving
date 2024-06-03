SELECT products.name AS name,
    providers.name AS name
FROM products
    JOIN providers ON providers.id = products.id_providers
WHERE providers.name = 'Ajax SA'