class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        if(s.length === 0) return 0;
        var map = new Map();
        var max = 0;
        var start = 0;

        for (var i = 0; i < s.length; i++) {
            var c = s.charAt(i);
            if (map.has(c) && map.get(c) >= start) {
                var ind = map.get(c);
                max = Math.max(max, i-start);
                start = ind+1;
            }
            map.set(c, i);
        }
        return Math.max(max,s.length-start);
    }
}
