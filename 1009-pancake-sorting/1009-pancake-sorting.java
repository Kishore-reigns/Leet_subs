class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        int n = arr.length ; 
        List<Integer>res = new ArrayList<>();

        while(n > 1){
            int index = maxIndex(arr,n);

            reverse(arr,index);
            res.add(index+1);
            reverse(arr,n-1);
            res.add(n);

            n-- ; 
        }

        return res ; 
    }

    public int maxIndex(int[] arr, int n){
        int in = -1 , max = Integer.MIN_VALUE ;  
        for(int i = 0 ;i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
                in = i ; 
            }
        }
        return in ; 
    }

    public void reverse(int[] arr, int end){
        int start = 0 ; 
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ; 
            start++ ; end-- ;
        }
    }
}