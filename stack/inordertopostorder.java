import java.util.Stack;

class Solution {
    
    // Function to define the priority of operators
    public static int priority(char c) {
        if (c == '^') {
            return 4;
        } else if (c == '*' || c == '/') {
            return 3;
        } else if (c == '-' || c == '+') {
            return 2;
        }
        return 1;
    }

    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        
        String ans = "";
        Stack<Character> st = new Stack<>();
        int i = 0;
        
        while (i < exp.length()) {
            char current = exp.charAt(i);
            
            // If it's an operand, add it to the result.
            if ((current >= 'A' && current <= 'Z') || (current >= 'a' && current <= 'z') || (current >= '0' && current <= '9')) {
                ans = ans + current;
            } 
            // If it's '(', push it to the stack.
            else if (current == '(') {
                st.push(current);
            } 
            // If it's ')', pop from the stack until '(' is found.
            else if (current == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans = ans + st.pop();
                }
                if (!st.isEmpty()) {
                    st.pop(); // Pop the '(' from the stack
                }
            } 
            // If the current character is an operator
            else {
                // Pop from the stack while the precedence of the current operator is less than or equal to the precedence of the operator on top of the stack.
                while (!st.isEmpty() && priority(st.peek()) >= priority(current)) {
                    ans = ans + st.pop();
                }
                st.push(current); // Push the current operator to the stack
            }
            i++; // Move to the next character
        }

        // Pop all remaining operators from the stack.
        while (!st.isEmpty()) {
            ans = ans + st.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        String exp = "A*(B+C)/D";
        System.out.println(infixToPostfix(exp)); // Example usage
    }
}
