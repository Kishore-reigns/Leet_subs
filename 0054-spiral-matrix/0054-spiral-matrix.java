class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new ArrayList<>() ;
        int n = arr.length , m = arr[0].length; 
        int top = 0 , right = m-1 , down = n-1, left = 0 , i = 0; 
        while(top <= down && left <= right){

            for( i = left ; i <= right ; i++){
                list.add(arr[top][i]);
            }
            top++ ; 

            for(i = top ; i <= down ; i++){
                list.add(arr[i][right]);
            }
            right-- ; 

            if(top <= down){

            
            for(i = right ; i >= left ; i--){
                list.add(arr[down][i]);
            }
            down-- ; 

            }

            if(left <= right){
            for(i = down ; i >= top ; i-- ){
                list.add(arr[i][left]);
            }
            left++ ; 
            
            }
            
        }

        return list ; 
        
    }
}