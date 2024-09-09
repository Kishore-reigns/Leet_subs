class Tuple{
    String value ;
    int path ; 
    public Tuple(String value , int path){
        this.value = value ;
        this.path = path ; 
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
    
        
        Set<String>set = new HashSet<>();
        for (String str : wordList){
            set.add(str);
        }
        if(!set.contains(endWord))return 0 ; 
        //if(set.contains(beginWord) && set.size())return 0 ; 
       
        Queue<Tuple>queue = new LinkedList<>();
        queue.offer(new Tuple(beginWord,1));
        set.remove(beginWord);

        while(!queue.isEmpty()){
            Tuple tup = queue.poll();
            String word = new String(tup.value) ;
            if(word.equals(endWord)){
                //if(tup.path == 2)return 0  ; 
                return tup.path ; 
            }
            char[] arr = word.toCharArray() ; 
            for(int i = 0 ; i < word.length() ; i++){
                char orrCh = word.charAt(i) ; 
                for(char j = 'a' ; j <= 'z' ; j++){
                    if (arr[i] == j) continue;
                    arr[i] = j ; 
                    String temp = new String(arr);
                    if(set.contains(temp)){
                        queue.offer(new Tuple(temp,tup.path + 1));
                        //res = Math.max(res,tup.path+1);
                        set.remove(temp);
                    }
                }
                arr[i] = orrCh ;
            } 
        }

        return 0 ;
    }

}