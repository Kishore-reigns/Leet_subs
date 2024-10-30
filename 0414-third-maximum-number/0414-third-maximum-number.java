class Solution {
    public int thirdMax(int[] nums) {
        //PriorityQueue<Integer>queue = new PriorityQueue<>();
        HashSet<Integer>set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        List<Integer>list = new ArrayList<>() ; 
        for(int n : set){
            list.add(n);
        }
       
        Collections.sort(list,Collections.reverseOrder());
         System.out.print(list);
        if(list.size() >= 3){
            return list.get(2);
        }
        return list.get(0);
        
    }
}