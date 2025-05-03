package org.velihangozek;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcardExample {
    public static void add(List<? super Integer> list) {
        list.add(1);
        list.add(2);
    }

    public static void main(String[] args) {
//        List<Number> numberList = List.of(1, 3.3, 4, -9.4); => IMMUTABLE
//        System.out.println(numberList);
//        add(numberList);

        List<Number> numberList = new ArrayList<>();

        System.out.println(numberList);

        numberList.add(3.2);

        System.out.println(numberList);

        add(numberList);

        System.out.println(numberList);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(9.8);

        // add(doubleList); must be an Integer derivative or super class of Integer.

    }
}