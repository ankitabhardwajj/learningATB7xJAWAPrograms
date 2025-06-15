package ex_14062025;

import java.util.PriorityQueue;

public class lab190 {
    public static void main(String[] args) {
        // Queue -> used less than 1% is automation
        PriorityQueue pq = new PriorityQueue<>();
        pq.offer("1");
        pq.offer("8");
        pq.offer("4");
        pq.offer("0");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
