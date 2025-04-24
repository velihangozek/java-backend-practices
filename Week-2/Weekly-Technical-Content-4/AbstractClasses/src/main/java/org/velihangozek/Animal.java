package org.velihangozek;

public abstract class Animal {
    public abstract void makeSound(); // Abstract => No Body => No implementation

    public void sleep() {
        System.out.println("Sleeping");
    }
}
