package org.velihangozek;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreengrocerCheckout {

    private final List<Fruit> fruits;

    public GreengrocerCheckout() {
        fruits = new ArrayList<>();
        fruits.add(new Fruit("Pear", "2.14"));
        fruits.add(new Fruit("Apple", "3.67"));
        fruits.add(new Fruit("Tomato", "1.11"));
        fruits.add(new Fruit("Banana", "0.95"));
        fruits.add(new Fruit("Eggplant", "5.00"));
    }

    public void inputQuantities(Scanner scanner) {
        for (Fruit fruit : fruits) {
            boolean validInput = false;
            while (!validInput) {
                System.out.printf("\n%s in KG: %n", fruit.getName());
                try {
                    double amount = scanner.nextDouble();
                    fruit.setAmountInKg(BigDecimal.valueOf(amount));
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input for " + fruit.getName() + ". Please enter a valid number.");
                    scanner.nextLine(); // Clear invalid input.
                }
            }
        }
    }

    public BigDecimal getTotalPrice() {
        BigDecimal total = BigDecimal.ZERO;
        for (Fruit fruit : fruits) {
            total = total.add(fruit.getTotalPrice());
        }
        return total;
    }
}