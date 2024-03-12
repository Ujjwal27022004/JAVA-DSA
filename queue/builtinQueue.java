package queue;

import java.util.LinkedList;
import java.util.Queue;

public class builtinQueue {
    public static void main(String[] args) {
        Queue<Integer> A = new LinkedList<>();

        A.add(5);
        A.add(6);
        A.add(7);
        A.add(8);
        A.add(10);
        A.add(2);

        System.out.println(A.remove());
    }
}
