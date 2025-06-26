public class MyThread extends Thread {

    @Override
    public void run() {
        // super.run();
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}