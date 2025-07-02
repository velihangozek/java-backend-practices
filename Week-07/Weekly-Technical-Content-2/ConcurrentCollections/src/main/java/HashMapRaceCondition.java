import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapRaceCondition {

    public static void main(String[] args) throws InterruptedException {

        Map<String, Integer> map = new ConcurrentHashMap<>();

        Runnable writer = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put("Key" + i % 10, i);  // Overwriting same keys repeatedly
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(writer);
        Thread t3 = new Thread(writer);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Map size: " + map.size());
        System.out.println("Contents: " + map);

    }

}