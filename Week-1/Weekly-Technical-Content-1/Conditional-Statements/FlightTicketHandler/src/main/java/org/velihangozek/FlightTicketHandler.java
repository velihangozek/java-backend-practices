package org.velihangozek;

// FlightTicketHandler.java
import java.util.Scanner;

public class FlightTicketHandler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Please enter the distance in kilometers: ");
        double distance = scanner.nextDouble();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Please enter the journey type (1 => One Way, 2 => Round Trip): ");
        int journeyType = scanner.nextInt();

        // Calculate the ticket price using the TicketCalculator class
        double totalPrice = TicketCalculator.calculateTicketPrice(distance, age, journeyType);

        if (totalPrice < 0) {
            System.out.println("Invalid input provided!");
        } else {
            System.out.println("Total Price = " + totalPrice + " TL");
        }

        scanner.close();
    }
}