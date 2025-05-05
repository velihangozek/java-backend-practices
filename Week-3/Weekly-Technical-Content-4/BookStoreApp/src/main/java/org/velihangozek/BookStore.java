package org.velihangozek;

import org.velihangozek.model.Author;
import org.velihangozek.model.Product;
import org.velihangozek.model.User;
import org.velihangozek.model.enums.Gender;
import org.velihangozek.service.AuthorService;
import org.velihangozek.service.OrderService;
import org.velihangozek.service.ProductService;
import org.velihangozek.service.UserService;

import java.time.LocalDate;
import java.util.List;

public class BookStore {
    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.create("velihan", "velihangozek@hotmail.com", "password");
        userService.create("velo", "velo@hotmail.com", "password2");
        userService.create("ceylin", "ceylin@gmail.com", "password3");
        userService.list();

        AuthorService authorService = new AuthorService();
        authorService.create("Yeşim", "Salkım", Gender.WOMAN);
        Author author = authorService.findAuthor("Yeşim");

        ProductService productService = new ProductService();
        productService.create("Java", 200, author, LocalDate.of(2020, 6, 17));
        productService.create("Java Core", 100, author, LocalDate.of(2021, 6, 17));
        productService.create("Java Advanced", 300, author, LocalDate.of(2022, 6, 17));


        productService.create("Southern Living", 90.9);
        productService.list();

        Product product = productService.findProductByName("Java Core");
        Product product2 = productService.findProductByName("Java Advanced");

        User user = userService.findUserByName("velihan");
        User user2 = userService.findUserByName("ceylin");

        OrderService orderService = new OrderService();
        orderService.create(List.of(product), user);
        orderService.create(List.of(product, product2), user2);

        orderService.list();

    }
}
