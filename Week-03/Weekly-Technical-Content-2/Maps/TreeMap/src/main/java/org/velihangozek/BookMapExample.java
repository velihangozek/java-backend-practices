package org.velihangozek;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BookMapExample {
    public static void main(String[] args) {
        Map<Book, String> books = new HashMap<>();

        Book firstBook = new Book("Great Big Beautiful Life", "Emily Henry");
        Book secondBook = new Book("The Perfect Divorce", "Jeneva Rose");

        books.put(firstBook, "ISBN1");
        books.put(secondBook, "ISBN2");

        for (Map.Entry<Book, String> entry : books.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
