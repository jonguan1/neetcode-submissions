class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     * iterate through strs
     * create a map {string -> sorted chars, array}
     */
    groupAnagrams(strs) {
        var map = new Map();
        for (var i = 0; i < strs.length; i++){
            var str = strs[i];
            var sortedStr = str.split("").sort().join("");
            console.log(sortedStr);
            if (map.has(sortedStr)){
                var arr = map.get(sortedStr);
                arr.push(str);
                map.set(sortedStr, arr);
            } else {
                map.set(sortedStr, [str]);
            }
        }
        return Array.from(map.values());
    }
}
