class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> ans = new ArrayList<Integer>();
        boolean carry = false;

        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            if ((i == digits.length - 1) || carry == true) {
                // System.out.println("adding one");
                digit = digit + 1;
            }
            carry = (digit == 10);
            digit %= 10;
            // System.out.printf("%d, %d\n",i, digit);
            ans.add(digit);
        }
        if (carry == true) {
            ans.add(1);
        }
        // System.out.println(ans);
        return ans.reversed().stream().mapToInt(i -> i).toArray();
    }
}
