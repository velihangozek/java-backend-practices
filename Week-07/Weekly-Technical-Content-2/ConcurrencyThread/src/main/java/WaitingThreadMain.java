public class WaitingThreadMain {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            synchronized (WaitingThreadMain.class) {
                try {
                    WaitingThreadMain.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        thread.start();

    }

}