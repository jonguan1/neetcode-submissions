class Solution {
    public int evalRPN(String[] tokens) {
        int ans = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            String c = tokens[i];
            try {
                Integer n = Integer.parseInt(c);
                stack.push(n);
            } catch (NumberFormatException nfe) {
                int b = stack.pop();
                int a = stack.pop();

                switch (c) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                    default:
                        break;
                }
            }
        }
        return stack.pop();
    }
}
