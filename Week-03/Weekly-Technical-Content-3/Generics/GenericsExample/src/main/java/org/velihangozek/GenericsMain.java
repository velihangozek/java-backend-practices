package org.velihangozek;

public class GenericsMain {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Velo");

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(7);

        Box<Boolean> booleanBox = new Box<>();
        booleanBox.setContent(true);

        Animal animal = new Animal();
        Box<Animal> animalBox = new Box<>();
        animalBox.setContent(animal);

        Integer[] intArray = new Integer[]{1, 2, 3};
        String[] stringArray = new String[]{"abc", "def", "gh"};

        GenericMethodExample.printArray(intArray);
        GenericMethodExample.printArray(stringArray);

//        Compile Time Error - Primitive Types Not Allowed
//        int[] intArray2 = new int[]{4, 5, 6};
//        GenericMethodExample.printArray(intArray2);

//        BoundedGenericExample<Integer> boundedGenericExample = new BoundedGenericExample<>(); => Is Not withing Generic Bound. Should extend Animal.

        BoundedGenericExample<Animal> animalBoundedGenericExample = new BoundedGenericExample<>();
        animalBoundedGenericExample.setContent(new Animal());

    }
}