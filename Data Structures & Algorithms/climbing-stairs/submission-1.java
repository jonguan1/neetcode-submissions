class Solution {
    int[] cache;
    public int climbStairs(int n) {
        cache = new int[n];
        for (int i = 0; i < n; i++) {
            cache[i] = -1;
        }
        return recurse(n);
    }

    public int recurse(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (cache[n - 1] != -1) {
            return cache[n - 1];
        }
        cache[n - 1] = recurse(n - 1) + recurse(n - 2);
        return cache[n - 1];
    }
}
