package org.velihangozek;

import java.lang.ref.Cleaner;

public class GarbageCollectorModern {
    static class TestObject {
        private static final Cleaner cleaner = Cleaner.create();
        private final Cleaner.Cleanable cleanable;

        TestObject(String name) {
            this.cleanable = cleaner.register(this, () ->
                    System.out.println(name + " is being garbage collected!")
            );
        }
    }

    public static void main(String[] args) {
        {
            new TestObject("Object 1");
            new TestObject("Object 2");
        } // Objects go out of scope here

        System.gc();

        try {
            Thread.sleep(1000); // Delay to allow GC execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program.");
    }
}