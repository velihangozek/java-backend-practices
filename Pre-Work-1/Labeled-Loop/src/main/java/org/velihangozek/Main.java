package org.velihangozek;

public class Main {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 3; i++) {
            inner:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outer;
                }
                System.out.println("outer for value: " + i + " " + "inner for value: " + j);
            }
        }
    }
}