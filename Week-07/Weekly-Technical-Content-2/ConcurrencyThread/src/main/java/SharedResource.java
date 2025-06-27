public class SharedResource {

   synchronized void method() {

        System.out.println(Thread.currentThread().getName() + " is running...");

        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}