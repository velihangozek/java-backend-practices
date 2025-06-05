package org.velihangozek;

public class Main {

    public static void main(String[] args) {

        System.out.println(operation(4, 9));
        System.out.println(secondOperation(2.5, 7.5));
        System.out.println(thirdOperation("Velihan", "Gözek"));

    }

    public static int operation(int a, int b) {

        return (a + b);
    }

    public static double secondOperation(double x, double y) {
        return (x + y);
    }

    public static String thirdOperation(String name, String surname) {
        return (name + " " + surname);
    }
}