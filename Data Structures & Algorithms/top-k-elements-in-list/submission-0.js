class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        var map = new Map();
        for (var i = 0; i < nums.length; i++){
            var num = nums[i];
            if (map.has(num)){
                map.set(num, map.get(num)+1);
            } else {
                map.set(num, 1);
            }
        }
        // sort map
        var arr = Array.from(map).sort((a, b) => b[1] - a[1]);
        var sortedMap = new Map(arr);
        var sortedArr = [...sortedMap.keys()]
        return sortedArr.slice(0, k);
    }
}
