package org.velihangozek;

import java.util.List;

public class WildcardExample {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<String> stringList = List.of("Velo", "Java");

        print(integerList);
        System.out.println("\n-----------------\n");
        print(stringList);

    }
    private static void print(List<?> list) {

        for (Object object : list) {
            System.out.println(object);
        }

    }
}
