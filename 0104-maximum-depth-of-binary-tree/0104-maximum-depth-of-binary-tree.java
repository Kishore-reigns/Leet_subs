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
    int maxi = 1 ; 
    public int maxDepth(TreeNode root) {
        if(root == null)return 0 ; 
        traverse(root,1);
        return maxi ; 
    }
    public void traverse(TreeNode root ,int n){
        if(root == null)return ; 
        traverse(root.left,n+1);
        traverse(root.right,n+1);
        maxi = Math.max(maxi,n);
        return ; 
    }
}