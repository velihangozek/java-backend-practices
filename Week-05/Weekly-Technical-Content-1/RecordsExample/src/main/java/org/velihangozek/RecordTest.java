package org.velihangozek;

import java.util.Arrays;

public class RecordTest {
    public static void main(String[] args) {

        System.out.println("\n-------------------- POINT RECORD --------------------\n");

        Point point = new Point(3, 5);
        System.out.println(point);

        Point secondPoint = new Point(3, 3);
        System.out.println(secondPoint);

        System.out.println("\n-------------------- RECTANGLE RECORD --------------------\n");

        Rectangle rectangle = new Rectangle(4, 8);
        System.out.println("Area of the rectangle => " + rectangle.area());

        System.out.println("\n-------------------- BIRD RECORD --------------------\n");

        var bird = new Bird(6, "Eagle");
        System.out.println("Name: " + bird.name());
        System.out.println("Eggs: " + bird.numberOfEggs());

        var child = new Bird(0, "eagle jr.");
        // child.name = "eagle jr. updated";
        System.out.println("Name: " + child.name());
        System.out.println("Eggs: " + child.numberOfEggs());

        System.out.println("\n-------------------- BIRD RECORD METHODS --------------------\n");

        Arrays.stream(child.getClass().getDeclaredMethods()).toList().forEach(System.out::println);

        System.out.println("\n-------------------- BIRD RECORD CONSTRUCTORS --------------------\n");

        Arrays.stream(child.getClass().getDeclaredConstructors()).toList().forEach(System.out::println);

        System.out.println("\n-------------------- BIRD RECORD CONSTRUCTOR OVERLOAD --------------------\n");

        var secondChild = new Bird(3, "Hawk", "HX");
        System.out.println(secondChild);

    }
}
