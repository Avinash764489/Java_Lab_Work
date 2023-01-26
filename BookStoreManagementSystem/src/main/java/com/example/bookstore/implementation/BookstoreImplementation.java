package com.example.bookstore.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.entity.BookstoreEntity;
import com.example.bookstore.repository.BookstoreRepository;
import com.example.bookstore.services.BookstoreServices;

@Service
public class BookstoreImplementation implements BookstoreServices {

	@Autowired
	private BookstoreRepository rpo;

	public BookstoreEntity insert(BookstoreEntity book) {
		return rpo.save(book);
	}

	public BookstoreEntity display(int id) {
		return rpo.findById(id).get();
	}

	public String delete(int id) {
		rpo.deleteById(id);
		return "Id : " + id + " is deleted......";
	}

	public BookstoreEntity update(BookstoreEntity book, int id) {
		BookstoreEntity bs = rpo.findById(id).get();
		bs.setTitle(bs.getTitle());
		bs.setAuthor(bs.getAuthor());
		bs.setPages(bs.getPages());
		bs.setPrice(bs.getPrice());
		return rpo.save(bs);

	}

	@Override
	public List<BookstoreEntity> displayall() {
		// TODO Auto-generated method stub
		return rpo.findAll();
	}

}
