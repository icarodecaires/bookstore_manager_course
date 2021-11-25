package com.icarocaires.bookstoremanager.service;

import com.icarocaires.bookstoremanager.dto.MessageResponseDTO;
import com.icarocaires.bookstoremanager.entity.Book;
import com.icarocaires.bookstoremanager.entity.BookDTO;
import com.icarocaires.bookstoremanager.mapper.BookMapper;
import com.icarocaires.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public MessageResponseDTO create(BookDTO bookDTO){

        Book booktToSaved = bookMapper.toModel(bookDTO);

        Book sabedBook = bookRepository.save(booktToSaved);

        return MessageResponseDTO.builder()
                .message("Book Created with ID "+ sabedBook.getId())
                .build();
    }

    public BookDTO findById(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);

        return bookMapper.toDTO(optionalBook.get());
    }
}
