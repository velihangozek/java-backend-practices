import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager2 {

    private AtomicInteger sheepCount = new AtomicInteger(0);

    public void increment() {

        System.out.print(sheepCount.incrementAndGet() + " ");

    }

}