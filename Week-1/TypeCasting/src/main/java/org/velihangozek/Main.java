package org.velihangozek;

public class Main {
    public static void main(String[] args) {
        byte byteNumber = 15;
        int intNumber = byteNumber;

        double doubleNumber = 3.9; // Auto widening
        short shortNumber = (short) doubleNumber; // Explicit narrowing
    }
}