package com.example.demo.dao.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BOOK")
@SequenceGenerator(name = "bookSeq", allocationSize = 1)
public class Book implements Serializable {

    private static final long serialVersionUID = 2272265610279894551L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "isbn", nullable = false, length = 13)
    private int isbn;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Column(name = "author", nullable = false, length = 200)
    private String author;

    @Column(name = "description", nullable = false, length = 200)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
