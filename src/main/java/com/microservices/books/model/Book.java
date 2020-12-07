package com.microservices.books.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Book")
public class Book{
	@Id
	private String id;
	private String name;
	private String author;
	
	public Book() {}

	public Book(String id,String name,String author) {
		this.id = id;
		this.name = name;
		this.author= author;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getId() {
		return id;
	}
}