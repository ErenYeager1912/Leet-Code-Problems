import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        // Quick check: Odd length strings can never be valid
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // Push corresponding closing bracket for each opening bracket
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            // If stack is empty or top doesn't match current closing bracket
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        // If stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
