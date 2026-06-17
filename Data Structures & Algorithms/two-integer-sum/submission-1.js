class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        var first = 0;
        var second = 1;

        for (var i = first; i < nums.length-1; i++){
            var firstval = nums[i];
            for (var j = i+1; j < nums.length; j++){
                var secval = nums[j];
                if (firstval + secval === target){
                    return [i, j];
                }
            }
        }
    }
}
