package com.jaruiz.springtutorial.chapter02.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaruiz.springtutorial.chapter02.entities.Book;

public interface BooksRepository extends JpaRepository<Book, Integer> {

}
