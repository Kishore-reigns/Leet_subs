class Solution {
    public int[] twoSum(int[] num, int target) {
        int i = 0 , n = num.length , j = n -1 ;
        int sum = num[0] + num[1] ; 
        while(i < j){
            sum = num[i] + num[j] ; 
            if( sum == target){
                return new int[]{i+1,j+1} ; 
            }
            if(sum < target){
                i++ ;
            }else{
                j-- ; 
            }
        }
        return new int[]{};
    }
}