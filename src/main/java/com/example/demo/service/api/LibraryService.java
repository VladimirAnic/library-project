package com.example.demo.service.api;

import com.example.demo.api.domain.Book;

public interface LibraryService {
    Book getBookById(long bookId);
}
