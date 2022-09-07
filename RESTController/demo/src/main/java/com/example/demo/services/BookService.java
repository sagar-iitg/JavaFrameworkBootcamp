package com.example.demo.services;

import java.util.*;

import org.springframework.stereotype.Component;


import com.example.demo.entities.Book;

@Component
//interacting with dao layer
public class BookService {

    private static List<Book> list=new ArrayList<>();
    
    static {
    	
    	list.add(new Book(1,"python"));
    	list.add(new Book(2,"java"));
    	list.add(new Book(3,"javascript"));
    	list.add(new Book(4,"C++"));
    }
    
    public List<Book> getAllBooks(){
    	return list;
    }
    
    public Book getSingleBookByID(int id){
    	
    	//reference variable
    	Book b=null;
    	for (Book book : list) {
    		if(book.getId()==id)
    			b=book;
			
		}
    	return b;
    	
    	
    }
    

    
    
}
