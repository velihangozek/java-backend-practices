public class TerminatedThreadMain {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("Thread is running..."));

        thread.start();
        //System.exit(0);

        try {

            thread.join();

        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

        System.out.println("Thread state: " + thread.getState());

    }

}