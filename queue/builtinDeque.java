package queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class builtinDeque {
    public static void main(String[] args) {
        Deque<Integer> A = new ArrayDeque<>();
        A.add(5);
        A.addFirst(2);
        A.addLast(5);
        A.removeFirst();
    }
}
