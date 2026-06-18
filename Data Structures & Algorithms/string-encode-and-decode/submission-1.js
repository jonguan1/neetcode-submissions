class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        var arr = new Array();
        for (const str of strs) {
            arr.push(str.length);
            arr.push(".");
            arr.push(str);
        }
        return arr.join("");
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        var arr = new Array();
        var ptr = 0;
        var indArr = new Array();
        while (ptr < str.length) {
            var ind = str[ptr];
            while (ind !== ".") {
                indArr.push(ind);
                ptr++;
                ind = str[ptr];
            }
            ptr++;
            var ind = parseInt(indArr.join(""), 10);
            indArr = new Array();
            var substr = str.slice(ptr, ptr + ind);
            arr.push(substr);
            console.log(substr);
            ptr = ptr + ind;
        }
        return arr;
    }
}
