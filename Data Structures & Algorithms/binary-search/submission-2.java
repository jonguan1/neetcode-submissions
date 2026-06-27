class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int half = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, half);
        int[] right = Arrays.copyOfRange(nums, half, nums.length);
        int rightval = search(right, target);
        if (rightval >= 0)
            return rightval + half;
        return search(left, target);
    }
}
