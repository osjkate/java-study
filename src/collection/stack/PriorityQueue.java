package collection.stack;


import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue pq = new java.util.PriorityQueue();
        pq.offer(3);
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);  // heap에 저장되는 방식 때문에 다르게 출력됨
        Object obj = null;

        while ((obj = pq.poll()) != null) {
            System.out.println(obj);
        }
    }
}
