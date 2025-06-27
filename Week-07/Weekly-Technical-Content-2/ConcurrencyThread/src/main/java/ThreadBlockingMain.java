public class ThreadBlockingMain {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(resource::method, "Thread 1");
        Thread thread2 = new Thread(resource::method, "Thread 2");
        Thread thread3 = new Thread(resource::method, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}