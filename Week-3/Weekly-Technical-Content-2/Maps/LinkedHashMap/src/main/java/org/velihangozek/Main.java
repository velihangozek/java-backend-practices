package org.velihangozek;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countries = new LinkedHashMap<>();

        countries.put("TR", "Türkiye");
        countries.put("USA", "United States of America");
        countries.put("JPN", "Japan");
        countries.put("DE", "German");

        System.out.println("Countries => " + countries);

        countries.remove("DE", "German");
        countries.remove("JPN");

        countries.put("FR", "France");

        System.out.println("Countries => " + countries);

        System.out.println("\n--------------------------------\n");

        LinkedHashMap<Integer, String> numbers = new LinkedHashMap<>();

        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");

        System.out.println("Numbers => " + numbers + "\n");

        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}