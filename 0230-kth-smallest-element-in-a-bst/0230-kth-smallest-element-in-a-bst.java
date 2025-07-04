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
    
    public int kthSmallest(TreeNode root, int k) {
         Stack<TreeNode> stack = new Stack<>() ; 
         TreeNode cur = root ; 
         
         while(!stack.isEmpty() || cur != null){

            while(cur != null){
                stack.push(cur);
                cur = cur.left ; 
             
            }

            cur = stack.pop() ; 
            k-- ; 
            if(k==0)return cur.val ; 
            cur = cur.right ; 
         }
         return -1 ; 
    }

}