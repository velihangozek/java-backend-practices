public class RaceConditionExample {

    private int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        RaceConditionExample raceConditionExample = new RaceConditionExample();

        Thread thread1 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {

                raceConditionExample.incrementCounter();

            }

        });

        Thread thread2 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {

                raceConditionExample.incrementCounter();

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(raceConditionExample.getCounter());

    }

    private int getCounter() {

        return counter;

    }

    private void incrementCounter() {

        counter++; // Not Atomic.

    }

}