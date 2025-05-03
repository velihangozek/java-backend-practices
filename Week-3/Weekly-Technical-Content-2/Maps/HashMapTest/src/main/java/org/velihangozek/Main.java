package org.velihangozek;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Velihan", 100);
        students.put("Petek", 95);
        students.put("Tara", 87);

        System.out.println("Students => " + students);

        System.out.println("Velihan's grade => " + students.get("Velihan"));

        System.out.println("Keys => " + students.keySet());

        System.out.println("Values => " + students.values());

        students.remove("Ecem");

        System.out.println("Students after deletion (non-existing) Ecem => " + students);

        students.put("Ecem", 87);

        System.out.println("Students after adding Ecem => " + students);

        students.remove("Ecem");

        System.out.println("Students after deletion (existing) Ecem => " + students);

        System.out.println("\n--------------------------------------------------\n");

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println("Capital Cities => " + capitalCities);

        System.out.println("Capital of England => " + capitalCities.get("England"));
        capitalCities.remove("England");
        System.out.println("Removing England...");

        System.out.println("Capital Cities without England => " + capitalCities);

        // capitalCities.clear();
        System.out.println("Size of Capital Cities => " + capitalCities.size());

        System.out.println("Key Set of Capital Cities => ");

        for (String i : capitalCities.keySet()) {
			System.out.println(i);
			}

        System.out.println("Values of Capital Cities => ");

        for (String i : capitalCities.values()) {
			System.out.println(i);
			}

        System.out.println("Key - Value pairs of Capital Cities => ");

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
			}
    }
}