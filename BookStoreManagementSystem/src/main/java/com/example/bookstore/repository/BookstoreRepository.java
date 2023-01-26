package com.example.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.entity.BookstoreEntity;

public interface BookstoreRepository extends JpaRepository<BookstoreEntity, Integer> {

}
