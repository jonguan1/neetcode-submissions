class Solution {
    /**
     * @param {number[]} height
     * @return {number}
     * water at each point = min(Lmax, Rmax) - height
     */
    trap(height) {
        var sum = 0;
        var leftMax = new Array();
        var localMax = 0;
        // store array of max from left
        for (var i = 0; i < height.length; i++){
            localMax = Math.max(localMax, height[i]);
            leftMax.push(localMax);
        }
        localMax = 0;
        for (var j=height.length-1; j>=0; j--){
            localMax = Math.max(localMax, height[j]);
            var hdiff = Math.min(leftMax[j], localMax);
            var water = Math.max(0, hdiff-height[j]);
            sum+=water;
        }
        return sum;
    }
}
