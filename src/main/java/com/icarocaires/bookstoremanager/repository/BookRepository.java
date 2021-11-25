package com.icarocaires.bookstoremanager.repository;

import com.icarocaires.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Long> {

}
