public class DeadlockExample {

    static final Object LOCK_A = new Object();
    static final Object LOCK_B = new Object();

    public static void main(String[] args) {

        new Thread(() -> {

            synchronized (LOCK_A) {
                System.out.println("Thread1 LOCK_A");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK_B) {
                    System.out.println("Thread1 LOCK_B");
                }
            }

        }).start();

        new Thread(() -> {

            synchronized (LOCK_B) {
                System.out.println("Thread2 LOCK_A");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK_A) {
                    System.out.println("Thread2 LOCK_B");
                }
            }

        }).start();

    }

}