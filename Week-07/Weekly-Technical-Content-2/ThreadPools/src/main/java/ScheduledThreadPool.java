import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);

        Runnable task = () -> System.out.println("Scheduled Task is running.... - " + System.currentTimeMillis() + " - " + Thread.currentThread().getName());

        executor.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);

        // executor.shutdown(); // Thread Pool must be closed. -> But here if we close it like this, it will start and stop the app immediately.

    }

}