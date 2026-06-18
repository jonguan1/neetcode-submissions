class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        var prefix = new Array(nums.length).fill(1);
        var suffix = new Array(nums.length).fill(1);
        var result = new Array();
        const len = nums.length;
        for(var i = 1; i < len; i++){
            prefix[i]=nums[i-1]*prefix[i-1];
            suffix[len-i-1] = nums[len-i] * suffix[len-i];
        }

        for (var i=0; i < len; i++){
            result.push(prefix[i]*suffix[i]);
        }
        return result;
    }
}
