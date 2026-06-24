class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";

        Map<Character, Integer> tmap = new HashMap();
        Map<Character, Integer> smap = new HashMap();
        String answer = "";

        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }
        int need = tmap.size();

        int left = 0;
        for (int right = left; right < s.length(); right++) {
            Character c = s.charAt(right);
            if (tmap.containsKey(c)) {
                int scount = smap.getOrDefault(c, 0) + 1;
                smap.put(c, scount);
                    System.out.print(smap.entrySet());
                if (scount == tmap.get(c)){
                    need--;
                }
                while (need == 0 && left <= right) {
                    String temp = s.substring(left, right + 1);
                    System.out.println(temp);

                    if (answer.equals("") || temp.length() < answer.length()) {
                        answer = temp;
                    }
                    int leftcount = smap.getOrDefault(s.charAt(left), 0) - 1;
                    Character leftc = s.charAt(left);
                    if (leftcount == 0) {
                        smap.remove(leftc);
                    } else if (leftcount > 0) {
                        smap.put(leftc, leftcount);
                    }

                    if (tmap.containsKey(leftc) && leftcount < tmap.getOrDefault(leftc, 0)){
                        System.out.println("increment need " + leftcount);
                        need++;
                    }

                    left++;

                }
            }
        }
        return answer;
    }
}
