package org.velihangozek;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceDemo {
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
            Thread.sleep(1000); // Give GC some time
            if (refQueue.poll() != null) {
                System.out.println("Phantom Object is being garbage collected!");
            } else {
                System.out.println("Garbage Collector has not yet processed the object.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program.");
    }
}