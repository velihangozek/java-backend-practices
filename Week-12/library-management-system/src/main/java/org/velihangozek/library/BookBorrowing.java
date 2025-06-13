package org.velihangozek.library;

import jakarta.persistence.*;

import java.time.LocalDate;

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

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "book_borrowing_book_id", referencedColumnName = "bookBorrowingList")
    private Book book;

    public BookBorrowing() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookBorrowing{" +
                "id=" + id +
                ", borrowerName='" + borrowerName + '\'' +
                ", borrowingDate=" + borrowingDate +
                ", returnDate=" + returnDate +
                ", bookName=" + this.book.getName() +
                '}';
    }
}
