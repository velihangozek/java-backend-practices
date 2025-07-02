import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) throws InterruptedException {

        Map<String, Integer> map = new ConcurrentHashMap<>();

        Thread thread1 = new Thread(() -> {

            map.put("Elma", 10);
            map.put("Muz", 30);
            map.compute("Elma", (key, val) -> val + 5);

        });

        Thread thread2 = new Thread(() -> {

            map.putIfAbsent("Karpuz", 25);

        });

        thread1.start();
        thread2.start();

        // Wait for threads to finish
        thread1.join();
        thread2.join();

        System.out.println(map);

    }

}