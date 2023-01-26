package com.example.bookstore.exception;

public class BookAlreadyExist extends RuntimeException {
	private String message;

	public BookAlreadyExist(String message) {
		super(message);
		this.message = message;
	}
}
