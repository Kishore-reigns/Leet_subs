class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length , ans = 0; 
        int[] high = new int[n];
        int[] low = new int[n];
        Arrays.fill(high,1);Arrays.fill(low,1);

        for(int i = 1 ; i < n ; i++){
            if(arr[i]>arr[i-1])high[i] = high[i-1]+1 ; 
            else high[i] = 1 ; 
        }

        for(int i = n-2 ; i >= 0 ; i--){
            if(arr[i] > arr[i+1])low[i] = low[i+1]+1 ; 
            else low[i] = 1 ; 
        }

        for(int i = 0 ;i < n ; i++){
            if(high[i] > 1 && low[i] > 1)ans = Math.max(ans , high[i]+low[i]-1);
        }

        return ans ; 
    }
}