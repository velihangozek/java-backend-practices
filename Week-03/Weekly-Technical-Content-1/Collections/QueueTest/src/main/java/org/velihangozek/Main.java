package org.velihangozek;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {

        Queue<String> breadQueue = new PriorityQueue<>();

        breadQueue.add("velihan");
        breadQueue.add("jale");
        breadQueue.add("taylan");
        breadQueue.add("burcu");

        System.out.println(breadQueue);

        breadQueue.remove();

        System.out.println(breadQueue);

        Queue<String> anotherBreadQueue = new PriorityQueue<>();

        anotherBreadQueue.add("Cem");
        anotherBreadQueue.add("Emir");
        anotherBreadQueue.add("Ahmet");
        anotherBreadQueue.add("Ayşe");

        System.out.println(anotherBreadQueue);

        anotherBreadQueue.remove();

        System.out.println(anotherBreadQueue);

        Comparator<Integer> compareForEven = new Comparator<>() {
            public int compare(Integer i, Integer j) {
                // 1. Compare parity: even (i%2==0) vs odd (i%2==1)
                int result = i % 2 - j % 2;
                if (result == 0)
                    result = i - j;
                return result;
            }
        };

        PriorityQueue<Integer> pq = new PriorityQueue<>(20, compareForEven);
        // Adding elements in reverse
        for (int i = 0; i < 20; i++) {
            pq.offer(20 - i);
        }

        // Polling (removing) in priority order
        for (int i = 0; i < 20; i++) {
            System.out.print("\t" + pq.poll());
        }

        Queue<String> q = new ArrayBlockingQueue<>(2);  // capacity = 2

        System.out.println();

        System.out.println(q.offer("A"));   // true
        System.out.println(q.offer("B"));   // true
        System.out.println(q.offer("C"));   // false, queue is full but no exception

        // contrast with add():
        q.clear();
        q.add("A");
        q.add("B");
        q.add("C");  // throws IllegalStateException: Queue full

    }
}