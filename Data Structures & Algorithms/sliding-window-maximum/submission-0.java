class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arrlen = nums.length - k + 1;
        int[] ans = new int[arrlen];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int right = 0; right <= nums.length; right++) {
            if (right >= k) {
                ans[right - k] = pq.peek();
                pq.remove(nums[right - k]);
            }
            if (right < nums.length) {
                pq.add(nums[right]);
            }
        }
        return ans;
    }
}
