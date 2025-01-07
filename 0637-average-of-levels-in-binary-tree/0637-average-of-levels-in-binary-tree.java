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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>>list = new ArrayList<>();
        traverse(root,list,0); 
        List<Double> result = new ArrayList<>();
        for(List<Integer> l : list){
            double sum = 0 ; 
            for(int i = 0 ; i < l.size() ; i++)sum += l.get(i);
            result.add(sum/l.size());
        }
        return result ; 
    }

    public void traverse(TreeNode root,List<List<Integer>> list , int level){
        if(root == null)return ; 

        if(list.size() <= level)list.add(new ArrayList<>());

        list.get(level).add(root.val);

        traverse(root.left,list,level+1);
        traverse(root.right,list,level+1);
    }
}