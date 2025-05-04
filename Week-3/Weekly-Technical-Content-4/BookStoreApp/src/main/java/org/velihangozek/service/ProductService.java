package org.velihangozek.service;

import org.velihangozek.model.Author;
import org.velihangozek.model.Book;
import org.velihangozek.model.Product;

import javax.swing.plaf.ProgressBarUI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private static List<Product> products = new ArrayList<>();

    public void create(String name, double price, Author author, LocalDate publishedDate) {
        Product product = new Book(name, price, author, publishedDate);
        products.add(product);
    }

    public void list() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
