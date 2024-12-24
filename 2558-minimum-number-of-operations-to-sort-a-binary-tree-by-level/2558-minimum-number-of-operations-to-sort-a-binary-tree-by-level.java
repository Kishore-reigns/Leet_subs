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

    public int minimumOperations(TreeNode root) {
        int op = 0 ;
        int[] arr ;  
        Queue<TreeNode> queue = new LinkedList<>() ; 
        queue.offer(root);

        while(!queue.isEmpty()){
            int qs = queue.size();
            arr = new int[qs] ; 
            for(int i= 0 ; i < qs ; i++){
                TreeNode cur = queue.poll() ; 
                if(cur.left != null)queue.offer(cur.left);
                if(cur.right != null)queue.offer(cur.right);
                arr[i] = cur.val; 
            }
            // sort     
            op += count(arr);
           
        }
        return op ; 
    }

    public int count(int[] arr){
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int n = sorted.length , cycle = 0 , swaps  = 0 ; 
        HashMap<Integer,Integer>map = new HashMap<>() ; 
        for(int i = 0 ; i < n ; i++){
            map.put(sorted[i],i);
        }
        boolean[] visited = new boolean[n] ; 

        for(int i = 0 ; i < n ; i++){

            if(visited[i] || map.get(arr[i]) == i )continue ; 

            
            int j = map.get(arr[i]);
            cycle = 0 ; 
            while(!visited[j]){
                visited[j]= true;
                j = map.get(arr[j]);
                cycle++ ;  
            }

            if(cycle > 1){
                swaps += cycle-1 ; 
            }
            
        }

        return swaps ; 
       
    }
}

/*
    public void helper(TreeNode left , TreeNode right){

        if(left == null || right == null)return ; 

        if(left.val > right.val){
            op++ ; 
            int temp = left.val ; 
            left.val = right.val;
            right.val = temp ; 
        }
        helper(left.left,right.right);
        helper(left.right,right.left);
      
        return ; 
    }

    */
