package com.example.demo.api.domain;

import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = -3110820388137782523L;

    private int isbn;

    private String title;

    private String author;

    private String description;

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
