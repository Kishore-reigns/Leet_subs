class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int n = a.length ; 
        int[] c = new int[n] ; 
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        if(a[0] == b[0]){
            c[0] = 1 ; 
        }
        c[n-1] = n ;
        set1.add(a[0]);
        set2.add(b[0]);
        int count = 0 ; 
        for(int i = 1 ; i < n-1 ; i++){
            count = 0 ; 
            if(set2.contains(a[i]))count++ ; 
            if(set1.contains(b[i]))count++ ;
            if(count == 0){
                if(a[i]==b[i])c[i] = c[i-1] + 1 ;
                else c[i] = c[i-1]; 
            }
            else c[i] = c[i-1] + count ; 
            set1.add(a[i]);
            set2.add(b[i]);
        }
        return c ; 
    }
}