package org.velihangozek;

import java.util.Scanner;

public class AnotherApproach {
    public static void main(String[] args) {

        // Recursive Exponentiation
        // 2^3 = 2 * 2 * 2

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a base value = ");
        int base = scanner.nextInt();

        System.out.print("Enter a power value = ");
        int power = scanner.nextInt();

        int result = power(base, power);
        System.out.println(base + "^" + power + " = " + result);

    }

    private static int power(int base, int power) {
        if (power == 0) return 1;

        return base * power(base, power - 1); // 2^3 = 8 => 2 * 2 * 2 * power(0)
    }
}
