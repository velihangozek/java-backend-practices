import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafetyMain {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(20);

        SheepManager sheepManager = new SheepManager();

        try {

            for (int i = 1; i <= 10; i++) {

                executor.submit(sheepManager::increment);

            }

        } finally {

            executor.shutdown();

        }

    }

}