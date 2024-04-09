import java.util.ArrayDeque;

public class LearnArraydequeu {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(5);
        adq.offerFirst(6);
        adq.offerLast(7);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        adq.poll();
        adq.pollFirst();
        adq.pollLast();
    }
    
}
