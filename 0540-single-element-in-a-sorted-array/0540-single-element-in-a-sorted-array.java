class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length , low = 0 , high = n-1;
        if(n == 1)return arr[0] ; 
        if(arr[0] != arr[1])return arr[0] ; 
        if(arr[n-2] != arr[n-1])return arr[n-1];
        low = 1 ; high = n-2 ; 
        while(low <= high){
            int mid = (low+high)/2 ; 
            int midel = arr[mid]; 

            if(midel != arr[mid+1] && midel != arr[mid-1])return midel ; 
            
            if( (mid%2 == 0 && midel == arr[mid-1]) || (mid%2 != 0 && midel == arr[mid+1])){
                high = mid -1 ; 
            }
            else{
                low = mid + 1 ; 
            }
        } 

        return -1 ; 

    }
}