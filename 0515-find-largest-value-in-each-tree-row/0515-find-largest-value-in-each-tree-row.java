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
    public List<Integer> largestValues(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        traverse(root,map,1);
        List<Integer>list = new ArrayList<>() ; 
        for(int i : map.values()){
            list.add(i);
        }
        return list ; 
    }
    public void traverse(TreeNode root , HashMap<Integer,Integer>map , int level){

        if(root == null)return ; 

        if(!map.containsKey(level)){
            map.put(level,Integer.MIN_VALUE);
        }
        if(map.get(level) < root.val){
            map.put(level,root.val);
        }
        
        traverse(root.left,map , level + 1 );
        traverse(root.right,map , level + 1);

    }

}