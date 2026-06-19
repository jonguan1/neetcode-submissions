class Solution {
    /**
     * @param {number[]} numbers
     * @param {number} target
     * @return {number[]}
     */
    twoSum(numbers, target) {
        var left = 0;
        var right = numbers.length - 1;
        while (left < right) {
            var sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target){
                left++;
            } else {
                break;
            }
        }
        return [left+1, right+1];
    }

    twoSumN2(numbers, target) {
        for (var i = 0; i < numbers.length - 1; i++) {
            for (var j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] === target) {
                    return [i + 1, j + 1];
                }
            }
        }
    }
}
