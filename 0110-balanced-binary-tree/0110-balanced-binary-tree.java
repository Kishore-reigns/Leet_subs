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
    boolean flag = true ; 
    public boolean isBalanced(TreeNode root) {
         traverse(root);
         return flag ; 
    }
    public int traverse(TreeNode root){
        if(root == null)return 0 ;

        int left = traverse(root.left);
        int right = traverse(root.right);

        if(Math.abs(left-right) > 1)flag = false ; 

        return 1 + Math.max(left,right);
    }
}