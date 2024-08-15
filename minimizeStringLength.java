class Solution {
    public int minimizedStringLength(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();  // Remove the closest occurrence to the left
            } else {
                stack.push(c);
            }
        }
        
        return stack.size();
    }
}
