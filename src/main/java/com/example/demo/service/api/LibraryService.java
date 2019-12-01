package com.example.demo.service.api;

import com.example.demo.api.domain.Book;

public interface LibraryService {
    Book getBookById(long bookId);

    Book addBook(com.example.demo.dao.model.Book newBook);

    Book updateBook(int bookId, com.example.demo.dao.model.Book newBook);

    String deleteBook(long bookId);
}
