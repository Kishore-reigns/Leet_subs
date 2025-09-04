import java.util.*;

class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        final long MOD = 1_000_000_007L;
        int n = nums.length;

     
        long[] pos = new long[n];
        for (int i = 0; i < n; i++) {
            long base = nums[i];
            pos[i] = base + (s.charAt(i) == 'L' ? -1L : 1L) * d;
        }

        Arrays.sort(pos);

       
        long prefix = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long ai = ((pos[i] % MOD) + MOD) % MOD;   
            long term = ( (long)i * ai ) % MOD;      
            term = (term - prefix + MOD) % MOD;      
            ans = (ans + term) % MOD;                 
            prefix = (prefix + ai) % MOD;             
        }

        return (int) ans;
    }
}
