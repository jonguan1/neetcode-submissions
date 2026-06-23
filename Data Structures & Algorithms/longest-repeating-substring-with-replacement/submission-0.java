class Solution {
    public int characterReplacement(String s, int k) {
        int maxf = 0;
        int res = 0;
        int left = 0;
        Map<Character, Integer> map = new TreeMap();
        for (int right = 0; right < s.length(); right++){
            Character c = s.charAt(right);
            int charcount = map.getOrDefault(c, 0);
            map.put(c, charcount+1);
            maxf = Math.max(maxf, charcount+1);
            int windowsize = right-left+1;
            if(windowsize-maxf > k){
                map.put(s.charAt(left), map.get(s.charAt(left))-1); 
                left++;
            }
            res = Math.max(res, right-left+1);
        }
        return res;
    }
}
