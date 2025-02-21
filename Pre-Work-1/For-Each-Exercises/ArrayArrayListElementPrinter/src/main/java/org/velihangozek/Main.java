package org.velihangozek;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nPrinting the array elements : \n");

        int array[] = {34,53,12,78,90};

        for (int element : array) {
            System.out.println(element);
        }

        System.out.println("\n-----------------------\n");

        System.out.println("Printing the even numbers only : \n");

        for (int evenNumber : array) {
            if (evenNumber %2 == 0) {
                System.out.println(evenNumber);
            }
        }

        System.out.println("\n-----------------------\n");

        System.out.println("With ArrayList : \n");

        ArrayList<String> cars = new ArrayList<>();

        cars.add("DS");
        cars.add("Pagani");
        cars.add("Dodge");
        cars.add("Maserati");
        cars.add("Mazda");

        for (String car : cars) {
            System.out.println(car);
        }
    }
}