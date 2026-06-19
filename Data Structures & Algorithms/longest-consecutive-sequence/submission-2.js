class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutiveN1(nums) {
        var map = new Map();
        var max = 0;
        for (var i = 0; i < nums.length; i++){
            var num = nums[i];
            var count = 0;
            if (!map.has(num)){
                var countBefore = map.get(num-1) ?? 0;
                var countAfter = map.get(num+1) ?? 0;
                count = countBefore + countAfter + 1;
                map.set(num, count);

                //update low and high
                if(countBefore > 0){
                    var beforeInd = num-countBefore;
                    map.set(beforeInd, count);
                }
                if (countAfter > 0){
                    var afterInd = num+countAfter;
                    map.set(afterInd, count);
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }

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
