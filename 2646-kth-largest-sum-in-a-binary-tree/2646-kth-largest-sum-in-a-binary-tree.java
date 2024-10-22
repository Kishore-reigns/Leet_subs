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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> list = new ArrayList<>();
        list = traverse(root,0,list);
        Collections.sort(list);
         if (k > list.size()) {
            return -1; 
        }

        return list.get(list.size()-k);
    }  

    public List<Long> traverse(TreeNode root , int lvl , List<Long> list){
        
        if(root == null)return list  ;
        if(list.size() <= lvl ){
            list.add(0L);
        }
            list.set(lvl,list.get(lvl)+root.val);
        

        traverse(root.left,lvl+1 , list);
        traverse(root.right,lvl+1,list);

        return list ; 
    } 
}