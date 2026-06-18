class Solution {
    /**
     * @param {character[][]} board
     * @return {boolean}
     */
    isValidSudoku(board) {
        var rowMap = new Map();
        var colMap = new Map();
        var boxMap = new Map();

        for (var r = 0; r < board.length; r++) {
            for (var c = 0; c < board.length; c++) {
                if (board[r][c] !== ".") {
                    var val = board[r][c];
                    var row = rowMap.get(r) ?? new Set();
                    if (row.has(val)) {
                        return false;
                    } else {
                        row.add(val);
                        rowMap.set(r, row);
                    }
                    var col = colMap.get(c) ?? new Set();
                    if (col.has(val)){
                        return false;
                    } else {
                        col.add(val);
                        colMap.set(c, col);
                    }
                    var boxind = Math.floor(r/3)*3 + Math.floor(c/3);
                    var box = boxMap.get(boxind) ?? new Set();
                    if(box.has(val)){
                        return false;
                    } else {
                        box.add(val);
                        boxMap.set(boxind, box);
                    }
                }
            }
        }
        return true;
    }
    
   
}
