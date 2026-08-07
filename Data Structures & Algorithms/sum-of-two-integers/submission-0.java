class Solution {
    public int getSum(int a, int b) {
        int ans = a ^ b;
        int carry = 0;
        int filter = 0x01;
        for (int i = 0; i < 32; i++){
            int mask = filter << i;
            if( carry == 1){
                ans ^= (carry << i); 
                carry = ((a & mask) != 0 || (b & mask) != 0) ? 1 : 0;
            } else {
                carry = ((a & mask) != 0 && (b & mask) != 0) ? 1 : 0;    
            }
            // System.out.printf("%x, %d, %d\n", ans, carry, mask);
        }
        return ans;
    }
}
