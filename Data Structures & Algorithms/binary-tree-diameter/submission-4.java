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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int[] ans = new int[1]; //so that pass by reference
        maxDepth(root, ans);

        return ans[0];
    }
    public int maxDepth(TreeNode root, int[] ans){
        if(root == null){
            return 0;
        }
        int maxRight = maxDepth(root.right, ans);
        int maxLeft = maxDepth(root.left, ans);
        ans[0] = Math.max(ans[0], maxRight+maxLeft);
        System.out.printf("%d %d %d %d\n", root.val, maxRight, maxLeft, ans[0]);

        return Math.max(1+maxRight, 1+maxLeft);
    }
    
}
