class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        var front = 0;
        var back = s.length - 1;
        while (front < back) {
            console.log(front, back);
            var frontChar = s.charAt(front);
            if(!this.isAlphanumeric(frontChar)){
                front++;
                continue;
            } else {
                frontChar = frontChar.toLowerCase();
            }
            var backChar = s.charAt(back);
            if(!this.isAlphanumeric(backChar)){
                back--;
                continue;
            } else {
                backChar = backChar.toLowerCase();

            }
            if (frontChar !== backChar){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    isAlphanumeric(char) {
        return (
            (char >= 'a' && char <= 'z') ||
            (char >= 'A' && char <= 'Z') ||
            (char >= '0' && char <= '9')
        );
        // const pattern = /^[a-z0-9]+$/i; // i flag for case-insensitive
        // return pattern.test(input);
    }

}
