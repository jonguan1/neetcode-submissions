class Solution {
    int[]cache;
    public int minCostClimbingStairs(int[] cost) {
        cache = new int[cost.length];
        for (int i = 0; i < cost.length; i++) {
            cache[i] = -1;
        }
        return Math.min(minCost(cost, 0), minCost(cost,1));
    }
    public int minCost(int[]cost, int index){
        if (index == cost.length-1 || index == cost.length-2){
            return cost[index];
        }
        if (cache[index] != -1){
            return cache[index];
        }
        cache[index] = cost[index] + Math.min(minCost(cost, index+1), minCost(cost, index+2));
        return cache[index];
    }
}
