public class SheepManager {

    private int sheepCount = 0;

    public void increment() {

        synchronized (this) {

            System.out.print(++sheepCount + " ");

        }

    }

}