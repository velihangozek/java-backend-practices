package org.velihangozek;

public class AnonymousExample {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("It's an anonymous class.");
            }
        };

        greeting.sayHello();

        Greeting greeting1 = new GreetingImpl();
        greeting1.sayHello();

        Animal dog = new Animal() {
            @Override
            void makeSound() {
                super.makeSound();
                System.out.println("Dog makes sound!");
            }
        };

        dog.makeSound();

        Animal animal = new Animal();
        animal.makeSound();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class run method");
            }
        };
        runnable.run();
        new Thread(runnable).start();
    }
}
