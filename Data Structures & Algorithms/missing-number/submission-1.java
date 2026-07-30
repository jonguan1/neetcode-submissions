class Solution {
    public int missingNumber(int[] nums) {
        Set numSet = new HashSet();
        for(int num : nums){
            numSet.add(num);
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(! numSet.contains(i)){
                return i;
            }
        }
        return nums.length;
    }
}
