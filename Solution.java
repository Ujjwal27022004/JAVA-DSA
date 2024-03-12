import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> A = new Stack<>();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                A.push(currentChar);
            } else {
                if (A.isEmpty()) {
                    return false; // No matching opening bracket for the current closing bracket
                }

                char top = A.peek();
                if ((top == '(' && currentChar != ')') ||
                    (top == '{' && currentChar != '}') ||
                    (top == '[' && currentChar != ']')) {
                    return false; // Mismatched opening and closing brackets
                }

                A.pop(); // Remove the matching opening bracket from the stack
            }
        }

        return A.isEmpty(); // Check if there are any remaining unmatched opening brackets
    }
}
