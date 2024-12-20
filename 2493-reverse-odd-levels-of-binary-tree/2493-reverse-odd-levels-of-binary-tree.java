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
    public TreeNode reverseOddLevels(TreeNode root) {
        List<List<Integer>>list = new ArrayList<>() ; 
        list = traverse(root,list,0);
        for(int i = 0 ; i< list.size() ; i++){
            if( i%2 != 0){
                Collections.reverse(list.get(i));
            }
        }
         place(root,list,0);
         return root ; 
    }

    public void place(TreeNode root , List<List<Integer>> list , int lvl){

        if(root == null)return  ; 

        root.val = list.get(lvl).remove(0); 
        place(root.left , list , lvl+1);
        place(root.right , list , lvl+1);

        
    }

    public List<List<Integer>> traverse(TreeNode root , List<List<Integer>> list , int lvl){

        if(root == null)return list ; 

        if(list.size() <= lvl ){
            list.add(new ArrayList<>());
        }

        list.get(lvl).add(root.val);
        traverse(root.left,list,lvl+1);
        traverse(root.right,list,lvl+1);

        return list ; 
    }

}