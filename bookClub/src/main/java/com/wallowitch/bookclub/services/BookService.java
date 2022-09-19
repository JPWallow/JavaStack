package com.wallowitch.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallowitch.bookclub.models.Book;
import com.wallowitch.bookclub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repo;
	
	public Book findById(Long id) {
		
		Optional<Book> result = repo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		
		return null;
	}
	
	public List<Book> all() {
		return repo.findAll();
	}
	
	public Book create(Book book) {
		return repo.save(book);
	}
	
	public Book update(Book book) {
		return repo.save(book);
	}
		
	public void delete(Book book) {
		repo.delete(book);
	}
}