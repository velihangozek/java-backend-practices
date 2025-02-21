package org.velihangozek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            for (int i=1; i<=25; i++) {
                if (i%2 == 0) {
                    System.out.println("even numbers are doubled : " + i*2);
                } else {
                    System.out.println("odd numbers are tripled : " + i*3);
                }
            }
        }
    }