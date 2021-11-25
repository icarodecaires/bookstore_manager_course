package com.icarocaires.bookstoremanager.controller;

import com.icarocaires.bookstoremanager.dto.MessageResponseDTO;
import com.icarocaires.bookstoremanager.entity.Book;
import com.icarocaires.bookstoremanager.entity.BookDTO;
import com.icarocaires.bookstoremanager.repository.BookRepository;
import com.icarocaires.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
        return bookService.create(bookDTO);
    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id){
        return bookService.findById(id);
    }

}
