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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>list = new ArrayList<>();
         List<Integer>list2 = new ArrayList<>();
        traverse(root1,list);
        System.out.println(list);
        traverse(root2,list2);
        System.out.println(list2);
        return list.toString().equals(list2.toString())  ; 
    }
    public void traverse(TreeNode root , List<Integer>list){
        if(root == null)return ; 
    
        if(root.left == null && root.right == null)list.add(root.val);
        traverse(root.left,list);
        traverse(root.right,list);
    }

    public void traverse2(TreeNode root , List<Integer>list){
        if(root == null)return ; 

        if(root.left == null && root.right == null && list.get(0) == root.val)list.remove(0);

        traverse2(root.left,list);
        traverse(root.right,list);
    }
}