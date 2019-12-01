package com.example.demo.service.impl;

import com.example.demo.api.domain.Book;
import com.example.demo.dao.repository.BookRepository;
import com.example.demo.service.api.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements LibraryService {

    private BookRepository bookRepository;

    @Autowired
    public LibraryServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getBookById(long bookId) {
        com.example.demo.dao.model.Book dbBook = bookRepository.fetchBookById(bookId);
        Book ret = new Book();
        ret.setAuthor(dbBook.getAuthor());
        ret.setDescription(dbBook.getDescription());
        ret.setId(dbBook.getId());
        ret.setIsbn(dbBook.getIsbn());
        ret.setTitle(dbBook.getTitle());
        return ret;
    }
}
