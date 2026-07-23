class Solution {
    public int hammingWeight(int n) {
        int weight = 0;
        int mask = 0x01;

        for (int i = 0; i < 32; i++) {
            int value = n >> i;
            if (0x01 == (mask & value)){
                weight++;
                // System.out.printf("%d, %d", weight, value);
            }
        }
        return weight;
    }
}
