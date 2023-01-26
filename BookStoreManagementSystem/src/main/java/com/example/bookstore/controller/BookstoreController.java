package com.example.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.entity.BookstoreEntity;
import com.example.bookstore.services.BookstoreServices;

@RestController
public class BookstoreController {

	@Autowired
	BookstoreServices ss;

	@PostMapping("/insert")
	public BookstoreEntity insertRecord(@RequestBody BookstoreEntity book) {
		return ss.insert(book);
	}

	@GetMapping("/details/{id}")
	public BookstoreEntity details(@PathVariable int id) {
		return ss.display(id);
	}

	@GetMapping("/alldetails")
	public List<BookstoreEntity> alldetails() {
		return ss.displayall();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteRecord(@PathVariable int id) {
		return ss.delete(id);
	}

	@PutMapping("/update/{id}")
	public BookstoreEntity updaterecord(@PathVariable int id, BookstoreEntity book) {
		return ss.update(book, id);
	}
}
