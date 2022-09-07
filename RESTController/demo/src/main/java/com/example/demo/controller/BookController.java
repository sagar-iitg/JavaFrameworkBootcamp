package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.example.demo.entities.Book;
import com.example.demo.services.BookService;

@RestController
public class BookController {
	
	
	@Autowired
	private BookService bookService;


	@GetMapping("/books")
	public List<Book> getBooks() {
		
		
		return this.bookService.getAllBooks();
	}

	
	@GetMapping("/books/{id}")
	public Book getBooks(@PathVariable("id") int id) {
		
		
		return this.bookService.getSingleBookByID(id);
	}

}
