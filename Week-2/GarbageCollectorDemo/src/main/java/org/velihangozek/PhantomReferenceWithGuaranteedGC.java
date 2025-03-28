package org.velihangozek;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceWithGuaranteedGC {
    static class TestObject {
        private String name;

        TestObject(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Reference queue to hold phantom references
        ReferenceQueue<TestObject> refQueue = new ReferenceQueue<>();

        // Creating an object and a PhantomReference
        TestObject obj = new TestObject("Phantom Object");
        PhantomReference<TestObject> phantomRef = new PhantomReference<>(obj, refQueue);

        // Removing strong reference, making obj eligible for GC
        obj = null;

        // Requesting Garbage Collection
        System.gc();

        // Checking if the phantom reference has been enqueued (GC has processed it)
        try {
            refQueue.remove();  // Blocks until the object is GC'd
            System.out.println("Phantom Object is being garbage collected!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program.");
    }
}