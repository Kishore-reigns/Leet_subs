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
    int sum = 0 ; 
    public int sumRootToLeaf(TreeNode root) {
        traverse(root,new StringBuilder());
        return sum ; 
    }
    public void traverse(TreeNode root , StringBuilder val){
        if(root == null){

         
            return ; 
        }

        val.append(root.val);
        if(root.left == null && root.right == null){
               sum += Integer.parseInt(val.toString(),2);
        }else{
 traverse(root.left,val); traverse(root.right,val);
        }
       
        val.delete(val.length()-1,val.length());
       
    }
}