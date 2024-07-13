package Collections;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(12);
        pq.offer(41);
        pq.offer(1);
        pq.offer(32);
        System.out.println(pq);

    }
}

