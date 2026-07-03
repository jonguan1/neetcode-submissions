/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        boolean[] balanced = new boolean[1];
        balanced[0] = true;
        height(root, balanced);
        return balanced[0];
        
    }
    public int height(TreeNode root, boolean[] balance){
        if(root == null){
            return 0;
        }
        int heightL = height(root.left, balance);
        int heightR = height(root.right, balance);

        balance[0] = balance[0] && (Math.abs(heightL - heightR) < 2);
        return Math.max(1+heightL, 1+heightR);
    }
}
