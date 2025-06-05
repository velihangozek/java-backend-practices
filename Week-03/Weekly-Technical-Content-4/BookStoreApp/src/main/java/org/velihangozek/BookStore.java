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
import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        addProduct(productService);
        UserService userService = new UserService();
        OrderService orderService = new OrderService();

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("1 - Customer Registration");
            System.out.println("2 - Order");
            System.out.println("3 - List Orders");
            System.out.println("4 - List Products");
            System.out.println("5 - Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter customer email: ");
                    String email = scanner.nextLine();
                    System.out.println("Enter customer password: ");
                    String password = scanner.nextLine();
                    userService.create(name, email, password);
                    break;
                case 2:
                    System.out.println("Enter customer email: ");
                    String orderCaseEmail = scanner.nextLine();
                    User foundUserByEmail = userService.findUserByEmail(orderCaseEmail);
                    System.out.println("===== PRODUCTS ======\n");
                    productService.list();
                    System.out.println("\nEnter product name to order: ");
                    String productName = scanner.nextLine();
                    Product productToBeAdded = productService.findProductByName(productName);
                    orderService.create(List.of(productToBeAdded), foundUserByEmail);
                    break;
                case 3:
                    System.out.println("Enter customer email: ");
                    String listOrderCaseEmail = scanner.nextLine();
                    System.out.println("\n===== ORDER LIST =====\n");
                    User listOrderCaseUser = userService.findUserByEmail(listOrderCaseEmail);
                    orderService.findOrders(listOrderCaseUser);
                    // orderService.list();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\n===== PRODUCT LIST =====\n");
                    productService.list();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Option. Choices are => 1, 2, 3, 4, 5");
            }
        }

    }

    private static void addProduct(ProductService productService) {
        AuthorService authorService = new AuthorService();
        authorService.create("Yeşim", "Salkım", Gender.WOMAN);
        Author freida = authorService.create("Freida", "McFadden", Gender.MAN);
        Author author = authorService.findAuthor("Yeşim");


        productService.create("Java", 200, author, LocalDate.of(2020, 6, 17));
        productService.create("Java Core", 100, author, LocalDate.of(2021, 6, 17));
        productService.create("Java Advanced", 300, author, LocalDate.of(2022, 6, 17));
        productService.create("Southern Living", 90.9);
        productService.create("The Housemaid", 400, freida, LocalDate.of(2023, 6, 17));
    }
}