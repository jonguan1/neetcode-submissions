class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        var map = new Map();
        if(s.length !== t.length){
            return false;
        }

        for (var i = 0; i < s.length; i++){
            var ch = s.charAt(i);
            var mapVal = map[ch] ?? 0;
            mapVal += 1;
            map[ch] = mapVal;
        }

        for (var j = 0; j < t.length; j++){
            var ch = t.charAt(j);
            var mapVal = map[ch] ?? 0;
            mapVal -= 1;
            console.log(mapVal, ch);
            if (mapVal < 0){
                return false;
            }
            map[ch] = mapVal;
        }
        return true;
    }
}
