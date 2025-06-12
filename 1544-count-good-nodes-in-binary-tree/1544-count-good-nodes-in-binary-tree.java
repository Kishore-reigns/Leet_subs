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
    int c = 0 ;
    public int goodNodes(TreeNode root) {
        count(root,Integer.MIN_VALUE);
         return c ; 
    }

    public void count(TreeNode root  , int max){
        if(root == null)return ; 
        if(root.val >= max){
            max = root.val ; 
            c++ ; 
        }
        count(root.left,max);
        count(root.right,max);
    }
}