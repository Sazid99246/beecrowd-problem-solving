SELECT movies.id AS id,
    movies.name AS name
FROM movies
    JOIN genres ON genres.id = movies.id_genres
WHERE genres.description = 'Action'