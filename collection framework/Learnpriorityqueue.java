import java.util.PriorityQueue;
import java.util.Comparator;

public class Learnpriorityqueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(55);
        pq.offer(45);
        pq.offer(34);
        pq.offer(45);

        pq2.offer(55);
        pq2.offer(45);
        pq2.offer(34);
        pq2.offer(45);

        System.out.println(pq);
        System.out.println(pq2);

    }
    
}
