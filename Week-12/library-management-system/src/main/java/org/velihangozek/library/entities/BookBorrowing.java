package org.velihangozek.library.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Locale;

@Entity
@Table(name = "bookborrowings")
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_borrowing_id", columnDefinition = "serial")
    private int id;

    @Column(name = "book_borrowing_borrower_name", nullable = false)
    private String borrowerName;

    @Temporal(TemporalType.DATE)
    @Column(name = "book_borrowing_borrowing_date", nullable = false)
    private LocalDate borrowingDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "book_borrowing_return_date")
    private LocalDate returnDate = null;




}
