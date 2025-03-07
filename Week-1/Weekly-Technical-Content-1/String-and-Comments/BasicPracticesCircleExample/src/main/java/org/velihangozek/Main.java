package org.velihangozek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n----------- Circle Example: ---------->\n");

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Please enter the desired radius: ");

            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);

            System.out.println("\n" + circle);

            System.out.println("\nThe diameter is: " + circle.getDiameter());
            System.out.println("\nThe circumference is: " + circle.getCircumference());
            System.out.println("\nThe area is: " + circle.getArea());

        } catch (Exception e) {

            System.out.println("An error occurred: " + e.getMessage());

        }
    }
}