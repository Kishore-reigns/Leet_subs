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
    public List<Integer> rightSideView(TreeNode root) {
        return traverse(root,0,new ArrayList<>());
    }
    public List<Integer> traverse(TreeNode root , int lvl , List<Integer> list){
        if(root == null)return list ; 

        if(list.size() <= lvl){
            list.add(lvl,root.val);
        }else{
             list.set(lvl,root.val);
        }
       
        traverse(root.left,lvl+1,list);
        traverse(root.right,lvl+1,list);

        return list ; 
    }
}