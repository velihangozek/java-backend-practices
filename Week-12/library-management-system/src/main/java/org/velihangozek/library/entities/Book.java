package org.velihangozek.library.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", columnDefinition = "serial")
    private int id;

    @Column(name = "book_name", nullable = false)
    private String name;

    @Column(name = "book_publication_year", nullable = false)
    private int publicationYear;

    @Column(name = "book_stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "book_author_id", referencedColumnName = "author_id")
    private Author author;

    @ManyToMany
    @JoinTable(
            name = "books2categories",
            joinColumns = {@JoinColumn(name = "books2categories_book_id")},
            inverseJoinColumns = {@JoinColumn(name = "books2categories_category_id")}
    )
    private List<Category> categoryList;

}
