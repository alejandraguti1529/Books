package com.microservices.books.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.books.model.Book;

@Repository
public interface BookRepo extends MongoRepository<Book, String>{
	
}