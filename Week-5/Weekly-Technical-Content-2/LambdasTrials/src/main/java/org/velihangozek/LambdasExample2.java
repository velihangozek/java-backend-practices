package org.velihangozek;

import java.util.ArrayList;
import java.util.List;

public class LambdasExample2 {
    public static void main(String[] args) {

        var animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Kangaroo", true, false));
        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Turtle", false, true));

        System.out.println("\n--------------- BEFORE JAVA 8 ---------------");

        System.out.println("\n--------------- Swimmers ---------------\n");
        print(animals, new CheckIfSwimmer());
        System.out.println("\n--------------- Jumpers ---------------\n");
        print(animals, new CheckIfJumper());

        System.out.println("\n--------------- AFTER JAVA 8 -> LAMBDAS ---------------\n");

        System.out.println("--------------- Swimmers - Lambda ---------------\n");
        print(animals, animalLambda -> animalLambda.canSwim());
        System.out.println("\n--------------- Jumpers - Lambda ---------------\n");
        print(animals, animalLambda -> animalLambda.canJump());
        System.out.println("\n--------------- Not Swimmers - Lambda ---------------\n");
        print(animals, animalLambda -> !animalLambda.canSwim());
        System.out.println("\n--------------- Not Jumpers - Lambda ---------------\n");
        print(animals, (animalLambda) -> {
            return !animalLambda.canJump();
        });

        // var invalid = (Animal animal) -> animal.canJump();
        // boolean invalid2 = (Animal animal2) -> animal2.canJump();

    }

    private static void print(List<Animal> animals, CheckTrait checkTrait) {
        for (Animal animal : animals) {
            if (checkTrait.test(animal)) {
                System.out.println(animal + " ");
            }
        }
    }
}
