package String;
import java.util.*;

class removepar {
    public String removeOuterParentheses(String s) {
        List<String> list = new ArrayList<>();
        split(s, list);
        String str = new String();

        for (int i = 0; i < list.size(); i++) {
            str = str + list.get(i);
        }

        return str;
    }

    public static void split(String s, List<String> list) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                stack.pop();
            }

            if (stack.isEmpty()) {
                // Debugging: Print the current value of i and stack state
                System.out.println("Current index i: " + i);
                System.out.println("Current stack: " + stack);

                String A = s.substring(1, i);
                System.out.println("Substring A: " + A); // Debugging: Print the substring A
                list.add(A);
                String B = s.substring(i + 1, s.length());

                System.out.println("Substring B: " + B); // Debugging: Print the substring B
                if (B.equals("")) {
                    return;
                }
                split(B, list);
                break; // Add break to prevent further processing
            }
        }
    }

    public static void main(String[] args) {
        removepar sol = new removepar();
        String result = sol.removeOuterParentheses("(()())(())");
        System.out.println("Result: " + result); // Debugging: Print the result
    }
}
