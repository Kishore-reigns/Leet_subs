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
        List<List<Integer>> list = new ArrayList<>();
        traverse(root,list,1);
        List<Integer>result = new ArrayList<>() ;
        for(List<Integer>l : list){
            result.add(l.get(l.size()-1));
        }
        return result ; 
    }
    
    public void traverse(TreeNode root, List<List<Integer>>list, int level){

        if(root == null)return ; 

        if(list.size() < level)list.add(new ArrayList<>());
        list.get(level-1).add(root.val);
        traverse(root.left,list,level+1);
        traverse(root.right,list,level+1);
        return ; 

    }
}