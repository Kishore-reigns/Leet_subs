class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>() ; 
        int n = students.length , rem = n , count = 0 ; 
        for(int i = 0 ; i < n ; i++)queue.offer(students[i]);
        int i = 0 ; 
        while(!queue.isEmpty()){
            count = 0 ; 
            if(queue.peek() == sandwiches[i]){
                queue.poll() ; rem-- ; i++ ; 
            }else{
                while(queue.peek() != sandwiches[i]){
                    queue.offer(queue.poll());
                    count++ ; 
                    if(count == rem)return rem ; 
                }
            }
            
        }
        return 0 ; 
    }
}