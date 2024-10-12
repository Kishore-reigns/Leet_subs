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
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        list = trav(root,0,list);
        return list.get(list.size()-1).get(0);

    }

    public List<List<Integer>> trav(TreeNode root , int lvl , List<List<Integer>>list){

        if(root == null)return list ; 

        if(list.size() <= lvl)list.add(new ArrayList<>());
        list.get(lvl).add(root.val);
        trav(root.left,lvl+1,list);
        trav(root.right,lvl+1,list);

        return list ; 
    }
}