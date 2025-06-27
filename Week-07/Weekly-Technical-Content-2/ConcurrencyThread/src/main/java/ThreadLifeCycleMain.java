public class ThreadLifeCycleMain {

    public static void main(String[] args) {

        MyCustomThread myCustomThread = new MyCustomThread(); // 1. New State
        myCustomThread.start(); // 2. Runnable State
        // 3. The CPU will run this myCustomThread at the appropriate time, and the state of this thread will be the Running state.

    }

}