package org.velihangozek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GreengrocerCheckout checkout = new GreengrocerCheckout();
            checkout.inputQuantities(scanner);
            System.out.printf("Total price: %.2f TL%n", checkout.getTotalPrice());
        }
    }
}