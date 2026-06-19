class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    threeSum(nums) {
        var results = new Array();
        let numsSorted = nums.sort((a, b) => a - b);
        console.log(numsSorted);
        for (var i = 0; i < nums.length - 2; i++) {
            if (numsSorted[i] > 0) break;
            if (i > 0 && numsSorted[i] === numsSorted[i - 1]) continue;
            var target = 0 - numsSorted[i];
            var left = i + 1;
            var right = numsSorted.length - 1;

            while (left < right) {
                var sum = numsSorted[left] + numsSorted[right];
                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    results.push([numsSorted[i], numsSorted[left], numsSorted[right]]);
                    left++;
                    right--;
                    while (left < right && numsSorted[left] === numsSorted[left - 1]) left++;
                }
            }
        }
        return results;
    }
}
