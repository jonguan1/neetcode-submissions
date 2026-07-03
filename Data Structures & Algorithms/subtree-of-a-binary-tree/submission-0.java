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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if ((root == null && subRoot != null) || (root != null && subRoot == null)) {
            return false;
        }

        if ((root.val != subRoot.val) || checkSubtree(root, subRoot) == false) {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        return true;
    }

    public boolean checkSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if ((root == null && subRoot != null) || (root != null && subRoot == null)
            || (root.val != subRoot.val)) {
            return false;
        } else {
            return checkSubtree(root.left, subRoot.left) && checkSubtree(root.right, subRoot.right);
        }
    }
}
