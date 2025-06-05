package org.velihangozek;

public class LambdasExample {
    public static void main(String[] args) {
        // Before Java 8
        Greeting greeting = new Greeting() {
            @Override
            public void method(String string) {
                System.out.println("Hello " + string);
            }
        };

        greeting.method("Velo");

        // After Java 8
        // String name;
        Greeting greeting1 = name -> System.out.println("Hello " + name);
        Greeting greeting2 = (name) -> {
            System.out.println("Hello " + name);
            System.out.println("Lambda Method!");
        };
        greeting1.method("velo - lambda");
        greeting2.method("velo - lambda");

        // Lambdas
        // (parameter) -> {methodBody}
        // If there is 1 parameter =>
        // parameter -> methodBody
    }
}
