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
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        return helper(root, root.val);
    }
    public int helper(TreeNode root, int max){
        if(root == null){
            return 0;
        }
        max = Math.max(root.val, max);
        if(root.val >= max){
            return 1+ helper(root.left, max) + helper(root.right, max);
        }
        else{
            return helper(root.left, max) + helper(root.right, max);
        }
    }
}