package com.example.demo.api;

import com.example.demo.api.domain.Book;
import com.example.demo.service.api.LibraryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class LibraryRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryRestController.class);

    private LibraryService libraryService;

    @Autowired
    public LibraryRestController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable long bookId){
        Book book = libraryService.getBookById(bookId);
        return book;
    }
}
