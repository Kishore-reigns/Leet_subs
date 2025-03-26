class Solution {
public:
    long long coloredCells(int n) {
        if (n == 1) return 1 ; 
        long long result = 1 ; 
        for(int i = 0 ; i < n-1 ; i++){
            //cout<<result;
            result += 4*(i+1);
        }
        return result ;
    }
};