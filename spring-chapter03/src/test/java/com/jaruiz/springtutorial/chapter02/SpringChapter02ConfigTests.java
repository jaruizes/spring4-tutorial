package com.jaruiz.springtutorial.chapter02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.sql.DataSource;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jaruiz.springtutorial.chapter02.business.BookBSSrv;
import com.jaruiz.springtutorial.chapter02.config.SpringChapter02Config;
import com.jaruiz.springtutorial.chapter02.entities.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringChapter02Config.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SpringChapter02ConfigTests {

	private static final String ISBN_NEW_BOOK = "ISBN-new-Book";
	private static final String TITLE_NEW_BOOK = "Title new Book";
	private static final String DESCRIPTION_NEW_BOOK = "Description new Book";
	private static final String CATEGORY_NEW_BOOK = "Category new Book";
	private static final String AUTHOR_NEW_BOOK = "Author new book";
	
	@Autowired
	private DataSource dataSource;
	 
	@Autowired
	private BookBSSrv bookBSSrv;
	
	@Test
	public void test1() {
		final Integer idNewBook = bookBSSrv.add(buildBook());
		assertNotNull(idNewBook);
		assertTrue(idNewBook.intValue() > 0);	
		
		final Book newBook = bookBSSrv.getDetail(idNewBook);
		assertNotNull(newBook);
		assertEquals(ISBN_NEW_BOOK, newBook.getIsbn());
		assertEquals(TITLE_NEW_BOOK, newBook.getTitle());
		assertEquals(DESCRIPTION_NEW_BOOK, newBook.getDescription());
		assertEquals(CATEGORY_NEW_BOOK, newBook.getCategory());
		assertEquals(AUTHOR_NEW_BOOK, newBook.getAuthor());		
	}
	
	@Test
	public void test2() {
		assertNotNull(bookBSSrv);
		assertNotNull(bookBSSrv.getAll());
		assertEquals(1, bookBSSrv.getAll().size());
	}
	
	private Book buildBook() {
		final Book newBook = new Book();
		newBook.setAuthor(AUTHOR_NEW_BOOK);
		newBook.setCategory(CATEGORY_NEW_BOOK);
		newBook.setDescription(DESCRIPTION_NEW_BOOK);
		newBook.setTitle(TITLE_NEW_BOOK);
		newBook.setIsbn(ISBN_NEW_BOOK);
		return newBook;
	}

}
