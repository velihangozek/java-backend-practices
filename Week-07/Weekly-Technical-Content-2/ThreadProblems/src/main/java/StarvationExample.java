public class StarvationExample {
    public static void main(String[] args) {
        Runnable lowPriorityTask = () -> {
            while (true) {
                System.out.println("Low priority thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable highPriorityTask = () -> {
            while (true) {
                System.out.println("High priority thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread low = new Thread(lowPriorityTask);
        Thread high = new Thread(highPriorityTask);

        low.setPriority(Thread.MIN_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        high.start();
    }
}