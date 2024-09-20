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
    public int sumNumbers(TreeNode root) {
        List<String>list = new ArrayList<>();
        list = helper(root , new StringBuilder() , list);
        int sum = 0 ; 
        for(String s : list){
            sum+= Integer.parseInt(s) ; 
        }
        return sum;  
    }

    public List<String> helper(TreeNode root , StringBuilder string ,List<String> list){

        if(root == null)return list ; 

        string.append(root.val);

        if(root.left == null && root.right == null){
            System.out.println(string);
            list.add(string.toString());
            return list ; 
        }else{
            int len = string.length() ; 
        helper(root.left , string , list);
        string.setLength(len);
        helper(root.right , string, list);

        }

        
        

        return list ; 
    }
}