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

    @Override
    public Book addBook(com.example.demo.dao.model.Book newBook) {
        com.example.demo.dao.model.Book dbBook = bookRepository.save(newBook);
        Book ret = new Book();
        ret.setId(dbBook.getId());
        ret.setTitle(dbBook.getTitle());
        ret.setIsbn(dbBook.getIsbn());
        ret.setDescription(dbBook.getDescription());
        ret.setAuthor(dbBook.getAuthor());
        return ret;
    }

    @Override
    public Book updateBook(int bookId, com.example.demo.dao.model.Book newBook) {

        com.example.demo.dao.model.Book dbBook = bookRepository.fetchBookById(bookId);

        dbBook = bookRepository.save(newBook);

        Book ret = new Book();
        ret.setId(dbBook.getId());
        ret.setTitle(dbBook.getTitle());
        ret.setIsbn(dbBook.getIsbn());
        ret.setDescription(dbBook.getDescription());
        ret.setAuthor(dbBook.getAuthor());
        return ret;
    }

    @Override
    public String deleteBook(long bookId) {
        bookRepository.deleteById(bookId);
        return "Deleted succsesfully!";
    }
}
