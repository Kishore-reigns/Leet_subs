class Pair{
    int index , val ; 
    public Pair(int index , int val){
        this.val = val ; this.index = index ; 
    }
}

class Solution {
    public long findScore(int[] nums) {
        int n = nums.length ; long score = 0; 
        PriorityQueue<Pair> queue = new PriorityQueue<>( (x,y) -> {
            if(x.val == y.val)return x.index - y.index ; 
            return x.val - y.val ; 
        } );
        Set<Integer>set = new HashSet<>();
        for(int i = 0 ; i < n ; i++ ){
            queue.offer(new Pair(i,nums[i]));
        }

        while(!queue.isEmpty()){
            Pair tuple = queue.poll() ; 
            int index = tuple.index ; 
            if(!set.contains(index)){
                score += tuple.val ; 
                set.add(index);
                set.add(index+1);
                set.add(index-1);
            }
        }
        return score ; 


    }
}