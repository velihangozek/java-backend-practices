public class VolatileFlag {

    private static volatile boolean flag = false;

    public static void main(String[] args) {

        new Thread(() -> {

            while (!flag) {

                // Waiting...

            }
            System.out.println("Flag is true!");

        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        flag = true;
    }

}