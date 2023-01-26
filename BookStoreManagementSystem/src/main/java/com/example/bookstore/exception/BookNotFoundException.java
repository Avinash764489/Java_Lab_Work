package com.example.bookstore.exception;

public class BookNotFoundException extends RuntimeException {
	private String message = "Not found";

	public BookNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	public BookNotFoundException() {
	}

	public BookNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
