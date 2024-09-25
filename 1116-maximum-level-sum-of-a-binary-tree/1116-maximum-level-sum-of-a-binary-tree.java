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
    public int maxLevelSum(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        map = helper(root,0,map);
        int min = Integer.MIN_VALUE ; 
        int level = 0 ; 
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > min){
                level = entry.getKey();
                min = entry.getValue() ; 
                }
        }
        return level+1 ;
     
        
   }
   public HashMap<Integer,Integer> helper(TreeNode root , int lvl , HashMap<Integer,Integer> map){

    if(root == null)return map ; 

    if(!map.containsKey(lvl))map.put(lvl,0);
    map.put(lvl,map.get(lvl)+root.val); 
    helper(root.left,lvl+1,map);
    helper(root.right,lvl+1,map);
    
   

    return map ; 
   }
}