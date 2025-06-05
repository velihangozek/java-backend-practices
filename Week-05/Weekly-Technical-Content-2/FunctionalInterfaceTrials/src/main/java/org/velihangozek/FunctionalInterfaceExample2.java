package org.velihangozek;

public class FunctionalInterfaceExample2 {
    public static void main(String[] args) {
        NumberChecker isEvenChecker = number -> number % 2 == 0;
        boolean evenResult = isEvenChecker.check(2);
        System.out.println("Is 2 an even number?: " + evenResult);

        NumberChecker isOddChecker = number -> number % 2 == 1;
        boolean oddResult = isOddChecker.check(3);
        System.out.println("Is 3 an odd number?: " + oddResult);

        System.out.println("Is 7 an even number?: " + isEvenChecker.check(7));
        System.out.println("Is 10 an odd number?: " + isOddChecker.check(10));
    }
}