package org.velihangozek;

public class LambdasExample3 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable runs...");
            }
        };
        new Thread(runnable).start();

        System.out.println("\n------ With Lambda => ------\n");

        // After Java 8
        Runnable runnable1 = () -> System.out.println("Runnable runs - with lambda");
        new Thread(runnable1).start();
    }
}
