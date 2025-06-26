public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable thread running: " + Thread.currentThread().getName());
    }

}