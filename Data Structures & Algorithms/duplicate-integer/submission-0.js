class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        var set = new Set();
        for (var i = 0; i < nums.length; i++){
            var val = nums[i];
            if (set.has(val)){
                return true;
            }
            set.add(val);
        }
        return false;
    }
}
