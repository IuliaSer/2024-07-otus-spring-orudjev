package ru.otus.hw.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import ru.otus.hw.entity.Genre;

@Repository
public interface GenreRepository extends ReactiveMongoRepository<Genre, String> {
}