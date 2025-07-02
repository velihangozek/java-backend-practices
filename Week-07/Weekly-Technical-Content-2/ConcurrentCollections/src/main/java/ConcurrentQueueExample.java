import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueueExample {

    public static void main(String[] args) {

        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        queue.add("Task1");
        queue.add("Task2");

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }

}