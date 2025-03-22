class Solution {
public:
    vector<vector<int>> mergeArrays(vector<vector<int>>& nums1, vector<vector<int>>& nums2) {
        vector<vector<int>> result ; 
        int n1 = nums1.size() , n2 = nums2.size() ;
        int a = 0 , b = 0 , n = 0;
        
        while(a < n1 && b < n2){
            if(nums1[a][0] == nums2[b][0]){
                result.push_back({nums1[a][0],nums1[a][1] + nums2[b][1]});
                a++ ; b++ ; 
            }else if (nums1[a][0] < nums2[b][0]){
                result.push_back({nums1[a][0],nums1[a][1]});
                a++ ; 
            }else{
                result.push_back({nums2[b][0],nums2[b][1]});
                b++ ; 
            }
         
        }
        cout << a << n1 << b << n2 ;
        while( a < n1){
            result.push_back({nums1[a][0],nums1[a][1]});
            a++;
        }

        while( b < n2){
            result.push_back({nums2[b][0],nums2[b][1]});
            b++;
        }

        return result ;

    }
};