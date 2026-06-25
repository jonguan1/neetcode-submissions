class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if(stack.empty()) return false;
                Character d = stack.pop();
                if ((c == '}' && d != '{') || (c == ']' && d != '[') || (c == ')' && d != '('))
                    return false;
            }
        }
        return stack.empty();
    }
}
