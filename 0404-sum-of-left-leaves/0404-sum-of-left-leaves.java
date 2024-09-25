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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0 ; 
        sum = helper(root,sum);
        return sum ; 
    }
    public int helper(TreeNode root , int sum){
        if(root == null)return sum ; 

        if((root.left != null) &&  (root.left.left == null && root.left.right == null) ) sum += root.left.val ; 
        sum = helper(root.left,sum);
        sum = helper(root.right,sum);

        return sum ; 
    }
}