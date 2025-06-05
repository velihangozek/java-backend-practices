package org.velihangozek;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> numbers = new TreeMap<>(Collections.reverseOrder());

        numbers.put(3, "Three");
        numbers.put(1, "One");
        numbers.put(2, "Two");

        System.out.println("Numbers => " + numbers);

        System.out.println("First Key => " + numbers.firstKey());
        System.out.println("Last Key => " + numbers.lastKey());

        System.out.println("First Entry => " + numbers.firstEntry());
        System.out.println("Last Entry => " + numbers.lastEntry());

        System.out.println("Numbers contain 4 as a key? => " + numbers.containsKey(4));

        System.out.println("Numbers contain Two as a value ? => " + numbers.containsValue("Two"));

    }
}