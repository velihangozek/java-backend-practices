package org.velihangozek;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n------------ Initial Approach ------------\n");

        int a = 5;
        int b = 10;
        System.out.println("a:" + a + " - " + "b:" + b);

        int aTemporary = a;
        int bTemporary = b;
        b = aTemporary;
        a = bTemporary;

        System.out.println("a:" + bTemporary + " - " + "b:" + aTemporary);

        System.out.println("\n------------ Best Practice ------------\n");

        int a1 = 5;
        int b1 = 10;
        System.out.println("Before swap: a1 = " + a1 + ", b1 = " + b1);

        int originalValue = a1;
        a1 = b1;
        b1 = originalValue;

        System.out.println("After swap: a1 = " + a1 + ", b1 = " + b1);

        System.out.println("\n------------ Without Temp Value - With Arithmetic Operations ------------\n");

        int a2 = 5;
        int b2 = 10;
        System.out.println("Before swap: a2 = " + a2 + ", b2 = " + b2);

        a2 = a2 + b2;
        b2 = a2 - b2;
        a2 = a2 - b2;

        System.out.println("After swap: a2 = " + a2 + ", b2 = " + b2);

        System.out.println("\n------------ Overflow Example ------------\n");

        int a3 = Integer.MAX_VALUE; // 2,147,483,647
        int b3 = 0;
        int result = a3 + b3;
        System.out.println("Integer max value: " + result);
        System.out.println("Integer max value + 1: " + ++result);
        System.out.println("Integer max value + 2: " + ++result);
        System.out.println("Integer max value + 3: " + ++result);

        System.out.println("\n------------ Without Temp Value - With XOR ------------\n");

        int a_original = 5;
        int b_original = 10;

        System.out.println("Before swap: a = " + a_original + ", b = " + b_original);

        a_original = a_original ^ b_original;
        b_original = a_original ^ b_original;

        // -> b_original = a_original ^ b_original ^ b_original
        // -> b_original = a_original ^ 0
        // -> b_original = a_original

        a_original = a_original ^ b_original;

        // -> a_original = a_original ^ b_original ^ a_original
        // -> a_original = a_original ^ a_original ^ b_original
        // -> a_original = 0 ^ b_original
        // -> a_original = b_original

        System.out.println("After swap: a = " + a_original + ", b = " + b_original);

    }
}