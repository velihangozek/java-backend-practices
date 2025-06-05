package org.velihangozek;

import java.util.List;

public class UpperBoundedWildcardExample {

    public static double sum(List<? extends Number> list) {
        double sum = 0;

        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(2.3, 6.5, 3.1, 8.7);

        System.out.println("Integer List Sum => ");
        System.out.println(sum(integerList));

        System.out.println("Double List Sum => ");
        System.out.println(sum(doubleList));

        List<String> stringList = List.of("velo", "java", "master");
        // System.out.println(sum(stringList));

    }
}
