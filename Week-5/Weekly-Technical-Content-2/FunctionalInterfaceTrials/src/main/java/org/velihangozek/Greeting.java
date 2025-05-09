package org.velihangozek;

@FunctionalInterface
public interface Greeting {
    void sayHello();

    default void sayHello2() {
        System.out.println("default method");
    }

    static void sayHello3() {
        System.out.println("static method");
    }
}