class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        int n = nums2.length ; 
        Stack<Integer> stack = new Stack<>() ;
        for(int i = n-1 ; i >= 0 ; i--){
                while(!stack.isEmpty() && stack.peek() < nums2[i]){
                    stack.pop(); 
                }
                map.put(nums2[i],stack.isEmpty()? -1 : stack.peek());
            stack.push(nums2[i]);
        }
        System.out.println(map);
        int[] res = new int[nums1.length] ; 
        for(int i = 0 ; i < nums1.length ; i++){
             res[i] = map.getOrDefault(nums1[i],-1);
        }
        return res ; 
    }
}