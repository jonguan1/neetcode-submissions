class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        //insert and check map
        var map = new Map();
        for (var i = 0; i < nums.length; i++){
            var val = nums[i];
            var complement = target - val;
            if(map.has(complement)){
                var ind = map.get(complement);
                return [ind, i];
            } else {
                map.set(val, i);
            }
        }
    }
}
