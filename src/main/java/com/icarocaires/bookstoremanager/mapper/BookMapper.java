package com.icarocaires.bookstoremanager.mapper;

import com.icarocaires.bookstoremanager.entity.Book;
import com.icarocaires.bookstoremanager.entity.BookDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
