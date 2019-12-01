package com.example.demo.dao.repository;

import com.example.demo.dao.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT book FROM Book book WHERE book.id = :bookId")
    Book fetchBookById(@Param("bookId") final long bookId);
}
