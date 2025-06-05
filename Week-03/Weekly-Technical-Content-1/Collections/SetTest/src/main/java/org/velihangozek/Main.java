package org.velihangozek;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add(null);

        System.out.println("Fruits => " + fruits);

        System.out.println("Apple's Hash Code => " + "Apple".hashCode());
        System.out.println("Banana's Hash Code => " + "Banana".hashCode());
        System.out.println("Orange's Hash Code => " + "Orange".hashCode());
        System.out.println("Banana's Hash Code => " + "Banana".hashCode());

        // LinkedHashSet

        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("İzmir");
        cities.add("İstanbul");

        System.out.println("Cities => " + cities);

        // TreeSet

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(30);
        numbers.add(3);
        numbers.add(7);
        numbers.add(-4);
        numbers.add(90);
        numbers.add(-19);

        System.out.println("Numbers => " + numbers);

        Set<String> animals = new TreeSet<>();

        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Snake");
        animals.add("Bear");
        animals.add("Zebra");

        System.out.println("Animals => " + animals);

        animals.remove("Snake");

        System.out.println("Animals without Snake => " + animals);

        System.out.println("Animals Size => " + animals.size());

        System.out.println("Do animals contain 'Bat' ? => " + animals.contains("Bat"));
        System.out.println("Do animals contain 'Zebra' ? => " + animals.contains("Zebra"));

        System.out.println("Are animals empty? => " + animals.isEmpty());

        animals.clear();

        System.out.println("Animals after clear() => " + animals);
        System.out.println("Animals Size after clear() => " + animals.size());
        System.out.println("Are animals empty after clear() ? => " + animals.isEmpty());

        System.out.println("---------------------------------");

        HashSet<String> h = new HashSet<>();
        h.add("a");
        h.add("b");
        h.add("z");
        h.add(null);

        System.out.println("h => " + h);

        h.remove("b");

        System.out.println("Size after removing b => " + h.size());

        System.out.println("Contains b? => " + h.contains("b"));

        System.out.println("\nForeach => ");

        for (String s : h) {
            System.out.println(s);
        }

        System.out.println("\nIterator => ");

        // Iterating using Iterator.
        Iterator<String> itr = h.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}