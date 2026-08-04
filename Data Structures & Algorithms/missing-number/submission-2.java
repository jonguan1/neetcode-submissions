class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum ^= num;
        }
        // System.out.println(sum);
        for (int i = 0; i <= nums.length; i++){
            sum ^= i;
        }
        return sum;
    }
}
