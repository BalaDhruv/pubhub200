package com.bala.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.model.Book;

public interface BookInterface extends JpaRepository<Book, Long> {

}
