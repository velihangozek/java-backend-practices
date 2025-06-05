package org.velihangozek;

public class Book extends Product{

    private String author;

    /*
    public Book() {
        super();
    }
     */

    public Book(String name) {
        super(name);
    }

    public Book(String name, double price) {
        super(name, price);
    }
}
