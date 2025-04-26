package org.velihangozek;

import java.util.Scanner;

public class ShapeAreaCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which shape do you want to calculate the area of?");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");

        int choice = scanner.nextInt();
        scanner.nextLine();

        Shape shape;

        switch (choice) {
            case 1:
                System.out.println("Enter the circle radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                double circleArea = shape.calculateArea();
                System.out.println("The area of the circle = " + circleArea);
                break;
            case 2:
                System.out.println("Enter the square side: ");
                int side = scanner.nextInt();
                shape = new Square(side);
                double squareArea = shape.calculateArea();
                System.out.println("The area of the square = " + squareArea);
                break;
            case 3:
                System.out.println("Enter the triangle base: ");
                double base = scanner.nextDouble();
                System.out.println("Enter the triangle height: ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                double triangleArea = shape.calculateArea();
                System.out.println("The area of the triangle = " + triangleArea);
                break;
            default:
                System.out.println("Invalid Choice! Valid Choices => 1, 2 or 3.");
        }

        Circle circle = new Circle(6);
        circle.calculateArea();

        Shape shape1 = new Circle(2);
        double calculatedArea = shape1.calculateArea();
        System.out.println("Area = " + calculatedArea);


        Shape shape2 = new Square(3);
        calculatedArea = shape2.calculateArea();
        System.out.println("Area = " + calculatedArea);

        Shape shape3 = new Triangle(5, 4);
        calculatedArea = shape3.calculateArea();
        System.out.println("Area = " + calculatedArea);

    }

}
