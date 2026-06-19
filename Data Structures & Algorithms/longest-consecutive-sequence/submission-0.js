class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        var set = new Set(nums);
        var max = 0;
        for (const num of set.entries()){
            var count = 1;
            var next = parseInt(num)+1;
            if (!set.has(num-1)){
                //valid start
                while(set.has(next)){
                    // console.log(next);
                    next++;
                    count++;
                }
            }
            if (count > max){
                max = count;
            }
        }
        return max;
    }
}
