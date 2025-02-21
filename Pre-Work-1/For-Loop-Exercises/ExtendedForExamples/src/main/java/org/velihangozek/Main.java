package org.velihangozek;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nPrint the double of even numbers and the triple of odd numbers from 1 to 25 : \n");

            for (int i=1; i<=25; i++) {
                if (i%2 == 0) {
                    System.out.println("even numbers are doubled : " + i*2);
                } else {
                    System.out.println("odd numbers are tripled : " + i*3);
                }
            }

        System.out.println("\n-----------------------------------\n");

        System.out.println("Separately sum the numbers between 1 and 50 that are divisible by 3, 5, and 15 : \n");
        System.out.println("Method 1 : Separate if's : \n");

            int mod3Counter = 0;
            int mod5Counter = 0;
            int mod15Counter = 0;

                for (int j = 1; j <= 50; j++) {
                    if (j % 3 == 0 && j % 15 != 0) {
                    System.out.println("Multiple of 3 : " + j);
                    mod3Counter += j;
                    }
                    if (j % 5 == 0 && j % 15 != 0) {
                    System.out.println("Multiple of 5 : " + j);
                    mod5Counter += j;
                    }
                    if (j % 15 == 0) {
                    System.out.println("Multiple of 15 : " + j);
                    mod15Counter += j;
                    }
                }

        System.out.println("\nSum of 3's multiples : " + mod3Counter);
        System.out.println("Sum of 5's multiples : " + mod5Counter);
        System.out.println("Sum of 15's multiples : " + mod15Counter);

        System.out.println("\nMethod 2 : Exclusive Handling with an if-else Chain : \n");

        int mod3CounterB = 0;
        int mod5CounterB = 0;
        int mod15CounterB = 0;

            for (int j = 1; j <= 50; j++) {
                if (j % 15 == 0) {
                System.out.println("Multiple of 15 : " + j);
                mod15CounterB += j;
                } else if (j % 3 == 0) {
                System.out.println("Multiple of 3 : " + j);
                mod3CounterB += j;
                } else if (j % 5 == 0) {
                System.out.println("Multiple of 5 : " + j);
                mod5CounterB += j;
                }
            }

        System.out.println("\nSum of 3's multiples : " + mod3CounterB);
        System.out.println("Sum of 5's multiples : " + mod5CounterB);
        System.out.println("Sum of 15's multiples : " + mod15CounterB);

        }
    }