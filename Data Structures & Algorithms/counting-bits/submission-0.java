class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= 2){
                ans[i] = 1;
            } else {
                double base = Math.floor(Math.log(i) / Math.log(2));
                int sub = (int)Math.pow(2, base);
                // System.out.printf("base %f, int %d\n", base, sub);
                ans[i] = ans[i-sub] + 1;
            }
                
        }
        return ans;
    }
}
