package com.example.bookstore.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.bookstore.entity.BookstoreEntity;
import com.example.bookstore.exception.BookAlreadyExist;
import com.example.bookstore.exception.BookNotFoundException;

@Component
public interface BookstoreServices {

	BookstoreEntity insert(BookstoreEntity book) throws BookAlreadyExist;

	BookstoreEntity display(int id) throws BookNotFoundException;

	List<BookstoreEntity> displayall() throws BookNotFoundException;

	String delete(int id) throws BookNotFoundException;

	BookstoreEntity update(BookstoreEntity book, int id);
}
