class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>map1 = new HashSet<>();
        Set<Integer>map2 = new HashSet<>();
        List<List<Integer>>res = new ArrayList<>();
        for(int n : nums1){
           map1.add(n);
        }
        for(int m : map1)System.out.print(m);
        for(int n : nums2){
           map2.add(n);
        }
        List<Integer>list = new ArrayList<>();
        for(int n : map1){
            if(!map2.contains(n))list.add(n);
        }
        res.add(list);
        list = new ArrayList<>();
        for(int n : map2){
            if(!map1.contains(n))list.add(n);
        }
        res.add(list);
        
        return res ; 
    }
}