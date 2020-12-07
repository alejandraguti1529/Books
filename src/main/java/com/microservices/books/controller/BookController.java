package com.microservices.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.books.model.Book;
import com.microservices.books.repository.BookRepo;

@RestController
public class BookController {
	@Autowired
	BookRepo bookRepo;
	
	@GetMapping("/getAll")
	public List listDepts(){
	    return bookRepo.findAll();
	 }

	@PostMapping("/add")
	public String saveBook(@RequestBody Book book) {
		bookRepo.save(book);
		return "Added book with id : "+book.getId();
	}
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable String id) {
		bookRepo.deleteById(id);
		return "Bood deleted with id : " +id;
	}
}