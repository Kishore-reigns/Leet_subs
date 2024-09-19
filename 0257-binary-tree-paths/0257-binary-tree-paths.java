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

    public List<String> helper(TreeNode root ,StringBuilder string, List<String>list){
        if(root == null){
            return list ; 
        }
             string.append(root.val);
        if(root.left == null && root.right == null){
            list.add(string.toString());
        }else{
            string.append("->");
            int len = string.length() ;
            helper(root.left,string,list);
            string.setLength(len);
             helper(root.right,string,list);
             
        }
        return list ; 
    }

    public List<String> binaryTreePaths(TreeNode root) {
        return helper(root,new StringBuilder(""),new ArrayList<>());
    }
}