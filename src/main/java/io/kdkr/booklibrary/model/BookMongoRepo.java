package io.kdkr.booklibrary.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookMongoRepo extends MongoRepository<Book, String> {
}
