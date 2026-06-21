class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        var max = 0;
        var Lmin = prices[0];
        for (var i = 1; i < prices.length; i++){
            var val = prices[i];
            max = Math.max(max, val-Lmin);
            Lmin = Math.min(val, Lmin);
        }
        return max;
    }
}
