SELECT movies.id AS id,
    movies.name AS name
FROM movies
    JOIN prices ON prices.id = movies.id_prices
WHERE prices.value < 2.00