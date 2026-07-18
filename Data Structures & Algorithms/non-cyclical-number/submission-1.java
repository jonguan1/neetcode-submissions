class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<Integer>();
        while (n != 1){
            int sum = 0;
            // System.out.printf("start %d \n", n);

            while (n / 10.0 > 0){
                sum += Math.pow(n%10, 2);
                n /= 10;
            }
            // System.out.printf("sum %d \n", sum);
            if (sum == 1) return true;
            else if(seen.contains(sum)) return false;
            seen.add(sum);
            n = sum;
        }
        return true;
    }
}
