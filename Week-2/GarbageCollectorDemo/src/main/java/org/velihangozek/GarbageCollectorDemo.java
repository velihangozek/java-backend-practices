package org.velihangozek;

public class GarbageCollectorDemo {
        // Object with a finalize() method to track garbage collection
        static class TestObject {
            private String name;

            TestObject(String name) {
                this.name = name;
            }

            @Override
            protected void finalize() throws Throwable {
                System.out.println(name + " is being garbage collected!");
            }
        }

        public static void main(String[] args) {
            // Creating objects inside a block
            {
                TestObject obj1 = new TestObject("Object 1");
                TestObject obj2 = new TestObject("Object 2");

                // Nullifying references, making objects eligible for GC
                obj1 = null;
                obj2 = null;
            } // Objects go out of scope here

            // Suggesting JVM to run Garbage Collector
            System.gc();

            // Adding a delay to see the GC message
            try {
                Thread.sleep(1000); // Sleep for a second to allow GC execution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End of program.");
        }
}