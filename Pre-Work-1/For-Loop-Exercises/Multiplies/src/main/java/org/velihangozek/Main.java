package org.velihangozek;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i + " is a multiple of both 3 and 4");
            } else if (i % 3 == 0) {
                System.out.println(i + " is a multiple of 3");
            } else if (i % 4 == 0) {
                System.out.println(i + " is a multiple of 4");
            }
        }
        }
    }