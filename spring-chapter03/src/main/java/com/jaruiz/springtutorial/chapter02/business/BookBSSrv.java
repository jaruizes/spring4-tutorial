package com.jaruiz.springtutorial.chapter02.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaruiz.springtutorial.chapter02.entities.Book;
import com.jaruiz.springtutorial.chapter02.repositories.BooksRepository;

@Service
public class BookBSSrv {

	private final BooksRepository booksRepository;
	
	@Autowired
	public BookBSSrv(final BooksRepository booksRepository) {
		this.booksRepository = booksRepository;
	}

	public List<Book> getAll() {
		return (ArrayList<Book>) booksRepository.findAll();
	}
	
	public Integer add(final Book book) {
		final Book bookSaved = booksRepository.save(book);
		return bookSaved.getId();
	}
	
	public Book getDetail(final Integer bookId) {
		return booksRepository.findOne(bookId);
	}
}
