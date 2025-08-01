class Solution {
    public int findMin(int[] arr) {
        int left = 0 , right = arr.length -1 ; 
        int res = Integer.MAX_VALUE ; 
        while(left <= right){
            int mid = (left+right)/2;

            if(arr[left] <= arr[right]){
                res = arr[left];break ;
            }
            
            res = Math.min(res,arr[mid]);

            if(arr[left] <= arr[mid])left = mid + 1 ; 
            else right = mid ; 
        }
        return res;
    }
}