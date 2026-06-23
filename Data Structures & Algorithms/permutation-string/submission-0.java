class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();
        if (s2.length() < len)
            return false;
        Map<Character, Integer> s1Map = new TreeMap();
        Map<Character, Integer> s2Map = new TreeMap();

        for (int i = 0; i < s1.length(); i++) {
            Character c = s1.charAt(i);
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);

            Character c2 = s2.charAt(i);
            s2Map.put(c2, s2Map.getOrDefault(c2, 0) + 1);
        }

        for (int left = 0; left < s2.length()-len; left++) {
            if (s2Map.equals(s1Map)){
                return true;
            } else {
                Character leftChar = s2.charAt(left);
                Integer leftCount = s2Map.get(leftChar)-1;
                if (leftCount == 0){
                    s2Map.remove(leftChar);
                } else {
                    s2Map.put(leftChar, leftCount);
                }
                Character rightChar = s2.charAt(left+len);
                s2Map.put(rightChar, s2Map.getOrDefault(rightChar, 0)+1);
            }
        }
        return s2Map.equals(s1Map);

    }
}
