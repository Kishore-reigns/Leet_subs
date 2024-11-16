class Solution {
    public int[] resultsArray(int[] nums, int k) {
        List<Integer>res = new ArrayList<>() ; 
        int n = nums.length; 
        for(int i = 0 ; i < n-k+1 ; i++){
            int[]arr = Arrays.copyOfRange(nums,i,i+k);
            if(isConsecutive(arr) && isSorted(arr)){
                res.add(Arrays.stream(arr).max().getAsInt());
            }else{
                res.add(-1);
            }
          
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean isConsecutive(int[] arr){
        HashSet<Integer>set = new HashSet<>() ; 
        int maxi = Integer.MIN_VALUE , mini = Integer.MAX_VALUE ; 
        for(int n : arr){
            if(set.contains(n))return false ; 
            set.add(n);
            maxi  = Math.max(maxi,n);
            mini = Math.min(mini,n);
        }
        if(maxi - mini+1 != arr.length)return false ;  
        return true ; 
    }

    public boolean isSorted(int[] arr){
        int[] dup = Arrays.copyOf(arr,arr.length);
        Arrays.sort(dup);
        return Arrays.equals(arr,dup) ; 
    }
}