import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 50; i++) {

            int taskId = i;

            executor.submit(() -> {

                System.out.println("Task: " + taskId + " is running... - " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });

        }

        executor.shutdown(); // Thread Pool must be closed.

    }

}