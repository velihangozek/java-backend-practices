package org.velihangozek;

public class Main {
    public static void main(String[] args) {

        // Recursive Exponentiation
        // 2^3 = 2 * 2 * 2

        int base = 3;
        int power = 2;

        int result = exponentiate(base, power);
        System.out.println(result);

    }

    private static int exponentiate(int base, int power) {
        power--;
        if (power == -1) {
            return 1;
        }
        return base * exponentiate(base, power);
    }

}