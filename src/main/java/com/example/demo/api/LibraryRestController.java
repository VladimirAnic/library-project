package com.example.demo.api;

import com.example.demo.api.domain.Book;
import com.example.demo.service.api.LibraryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addBook")
    public Book addBook(@RequestBody com.example.demo.dao.model.Book newBook){
        Book book = libraryService.addBook(newBook);
        return book;
    }
    @PutMapping("/updateBook/{bookId}")
    public Book updateBook(@PathVariable int bookId, @RequestBody com.example.demo.dao.model.Book newBook){
        Book book = libraryService.updateBook(bookId, newBook);
        return book;
    }

    @DeleteMapping("/{bookId}")
    public String deleteBook(@PathVariable long bookId){
        String book = libraryService.deleteBook(bookId);
        return book;
    }
}
