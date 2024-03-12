package stack;
import java.util.Stack;

public class builtinStack {

    public static void main(String[] args) {
        Stack<Integer> A = new Stack<>();
        A.push(5);
        A.push(4);
        A.push(9);
        A.push(18);
        A.push(7);
        A.push(66);
        
        System.out.println(A.pop());
        System.out.println(A.pop());
        System.out.println(A.pop());
        System.out.println(A.pop());
        System.out.println(A.pop());
        System.out.println(A.pop());

        System.out.println(A.peek());
    }


    
}
