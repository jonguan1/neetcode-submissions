class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        var max = 0;
        var left = 0;
        var right = heights.length - 1;

        while (left < right) {
            var vol = (right - left) * Math.min(heights[right], heights[left]);
            max = Math.max(max, vol);
            if(heights[right]<heights[left]){
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
