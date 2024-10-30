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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(parent(root,x,null) != parent(root,y,null)){
            System.out.print("Hello");
            if(depth(root,x,0) == depth(root,y,0))return true ; 
        }return false ; 
    }

    public TreeNode parent(TreeNode root,int n,TreeNode par){
        if(root == null)return null ;

        if(root.val == n)return par ; 

        TreeNode left = parent(root.left,n,root);
        if(left != null)return left ; 
        return parent(root.right,n,root);

        
    }

    public int depth(TreeNode root , int n , int lvl){
        if(root == null)return -1 ; 
        if(root.val == n)return lvl ; 

        int left = depth(root.left,n,lvl+1);
        if(left != -1)return left ; 
        return depth(root.right,n,lvl+1);

        
    }
}