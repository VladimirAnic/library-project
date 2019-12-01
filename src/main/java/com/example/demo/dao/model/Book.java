package com.example.demo.dao.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BOOK")
@SequenceGenerator(name = "bookSeq", sequenceName = "BOOK_SEQ", allocationSize = 1)
public class Book implements Serializable {

    private static final long serialVersionUID = 2272265610279894551L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookSeq")
    @Column(name = "ID")
    private Long id;

    @Column(name = "ISBN", nullable = false, length = 13)
    private int isbn;

    @Column(name = "TITLE", nullable = false, length = 200)
    private String title;

    @Column(name = "AUTHOR", nullable = false, length = 200)
    private String author;

    @Column(name = "DESCRIPTION", nullable = false, length = 200)
    private String description;

}
