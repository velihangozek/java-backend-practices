package org.velihangozek;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(30);
        ArrayList<Integer> integersNoInitialCapacity = new ArrayList<>();

        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("Banana");
        shoppingList.add("Apple");
        shoppingList.add("Pear");
        shoppingList.add("Pear");
        shoppingList.add("Watermelon");
        shoppingList.add(1, "Mango");
        shoppingList.add("Grapes");
        shoppingList.add("Grapes");

        for (String fruit : shoppingList) {
            System.out.println(fruit);
        }

        boolean isRemovedIfExists = shoppingList.remove("Watermelon");

        System.out.println("isRemovedIfExists => " + isRemovedIfExists);

        boolean isRemovedIfMissing = shoppingList.remove("X");

        System.out.println("isRemovedIfMissing => " + isRemovedIfMissing);

        System.out.println(shoppingList);

        ArrayList<String> secondShoppingList = new ArrayList<>();
        shoppingList.add("Milk");

        shoppingList.addAll(secondShoppingList);

        System.out.println(secondShoppingList);
        System.out.println(shoppingList);

        System.out.println(shoppingList.contains("Pear"));
        System.out.println(shoppingList.contains("Watermelon"));

        System.out.println("Number of items => " + shoppingList.size());
        System.out.println("Number of items => " + secondShoppingList.size());

        System.out.println("Last item => " + shoppingList.getLast());
        System.out.println("First item => " + shoppingList.getFirst());
    }
}