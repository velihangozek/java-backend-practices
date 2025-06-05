package org.velihangozek;

public class ArrayTest {
    public static void main(String[] args) {

        // before
        int number = 5;
        int number2 = 10;
        int number3 = 15;

        int[] numbers = new int[5]; // number of elements

        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;
        numbers[4] = 25;

        System.out.println("\nforeach loop: \n");

        for (int j : numbers) {
            System.out.println("number " + j);
        }

        System.out.println("\nfor loop: \n");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number[" + i + "] --> " + numbers[i]);
        }

        System.out.println("\nDifferent array declaration: \n");

        int[] numbers2 = {1, 2, 3, 4, 5};

        for (int number4 : numbers2) {
            System.out.println(number4);
        }

        System.out.println("\nString array : \n");

        String cities[] = {"istanbul", "ankara", "izmir"};
        String[] cities1 = {"istanbul", "ankara", "izmir"};

        for (String city : cities) {
            System.out.println(city);
        }
        
    }
}