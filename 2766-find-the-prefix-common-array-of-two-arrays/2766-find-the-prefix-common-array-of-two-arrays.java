class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int n = a.length ; 
        int[] c = new int[n] ; 
        int common = 0 ; 
        HashSet<Integer>set = new HashSet<>() ; 
        for(int i = 0 ; i < n ; i++){
            if(!set.add(a[i]))common++ ; 
            if(!set.add(b[i]))common++ ; 
            c[i] = common ; 
        }
        return c ; 
    }
}