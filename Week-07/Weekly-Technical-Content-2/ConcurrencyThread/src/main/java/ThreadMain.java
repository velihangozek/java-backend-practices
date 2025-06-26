public class ThreadMain {

    public static void main(String[] args) {

        System.out.println("0");

        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("1");

        MyThread myThread2 = new MyThread();
        myThread2.start();

        System.out.println("2");

        MyThread myThread3 = new MyThread();
        myThread3.start();

        System.out.println("3");

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

        System.out.println("4");

        Thread myRunnable2 = new Thread(new MyRunnable());
        myRunnable2.start();

        System.out.println("5");

        Thread myRunnable3 = new Thread(new MyRunnable());
        myRunnable3.start();

        System.out.println("6");

    }

}