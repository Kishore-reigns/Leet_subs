class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        set<int> myset ; 
        for(auto it : arr){
            if( myset.find(it*2) != myset.end() || (it%2 == 0 && myset.find(it/2) != myset.end()))return true ; 
            myset.insert(it);
        }
        return false ; 
    }
};