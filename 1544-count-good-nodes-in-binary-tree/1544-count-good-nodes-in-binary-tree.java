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
    public int count = 0 ; 
    public int goodNodes(TreeNode root) {
        traverse(root,root.val);
        return count ; 
    }
    public void traverse(TreeNode root , int max){
        if(root == null)return ; 

        if(root.val >= max){
            count++ ; 
            max = root.val ; 
        }
        
        traverse(root.left,max);
        traverse(root.right,max);
    }
}