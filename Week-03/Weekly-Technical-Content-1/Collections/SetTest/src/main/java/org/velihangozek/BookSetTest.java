package org.velihangozek;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BookSetTest {

    public static void main(String[] args) {
        System.out.println("\n--------- With Hash Set ---------");

        Set<Book> bookSet = new HashSet<>();

        Book firstBook = new Book("Clean Code", "Robert C. Martin");
        Book secondBook = new Book("Effective Java", "Joshua Bloch");
        Book thirdBook = new Book("Clean Code", "Robert C. Martin");
        Book fourthBook = new Book("Clean Code 2", "Robert C. Martin");

        bookSet.add(firstBook);
        bookSet.add(secondBook);
        bookSet.add(thirdBook);
        bookSet.add(fourthBook);

        System.out.println("\n--------- Hashes of the books ---------\n");

        System.out.println("First Book => " + firstBook.hashCode());
        System.out.println("Second Book => " + secondBook.hashCode());
        System.out.println("Third Book => " + thirdBook.hashCode());
        System.out.println("Third Book => " + fourthBook.hashCode());

        System.out.println("My Library => " + bookSet);
        System.out.println("My Library Size => " + bookSet.size());

        System.out.println("\n--------- With Tree Set ---------\n");

//        bookTreeSet.add(firstBook);
//        bookTreeSet.add(secondBook);
//        bookTreeSet.add(thirdBook);
//        bookTreeSet.add(fourthBook);

//         Set<Book> bookTreeSet = new TreeSet<>();
//         bookTreeSet.addAll(bookSet);

        Set<Book> bookTreeSet = new TreeSet<>(bookSet);

        System.out.println("My Library (Tree Set) => " + bookTreeSet);
    }
}