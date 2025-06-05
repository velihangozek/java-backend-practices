package org.velihangozek;

public class Main {
    public static void main(String[] args) {

        int number = 9;
        int result = fibonacci(number);
        System.out.println("Fibonacci series of " + number + " => " + result);

    }

    // 0, 1, 1, 2, 3, 5, 8...
    private static int fibonacci(int number) {
        if (number == 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}