class Pair{
    int index , value ; 
    public Pair(int index , int value){
        this.index = index ; this.value = value ; 
    }
}

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length ; 
        PriorityQueue<Pair> queue = new PriorityQueue<>( (x,y)-> {
            if(x.value == y.value)return x.index - y.index ; 
            return x.value - y.value ; 
            }
        );

        for(int i = 0 ; i < n ; i++){
            queue.offer(new Pair(i,nums[i]));
        }

        for(int i = 0 ; i < k ; i++){
            Pair pair = queue.poll() ; 
            queue.offer(new Pair(pair.index,pair.value * multiplier));
        }

        for(int i = 0 ; i < n ; i++){
            Pair pair = queue.poll() ; 
            nums[pair.index] = pair.value ; 
        }
        return nums ; 
    }
}