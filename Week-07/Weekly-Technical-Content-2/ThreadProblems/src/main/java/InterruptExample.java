public class InterruptExample implements Runnable {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new InterruptExample());

        thread.start();

        Thread.sleep(5000);

        thread.interrupt();

    }

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {

            System.out.println(Thread.currentThread().getName() + " keeps running...");
            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
                Thread.currentThread().interrupt();
            }

        }

    }
}