
class Node{
    int key , value ;
    Node left , right ;  
    public Node(int key , int value){
        this.key = key ; 
        this.value = value ; 
        this.left = null ; 
        this.right = null ; 
    }
}

class LRUCache {
    int capacity; 
    HashMap<Integer,Node> map ; 
    Node lru , mru  , prev = null ;

    public LRUCache(int capacity) {
        this.capacity = capacity ; 
        this.map = new HashMap<>() ;
        this.mru = new Node(0,0) ; 
        this.lru = new Node(0,0) ; 
        this.lru.right = mru ; 
        this.mru.left = lru ; 
    }

    public void remove(Node node){
        Node prev = node.left ; 
        prev.right = node.right ; 
        node.right.left = prev ; 


    }

    public void insert(Node node){
        Node prev = mru.left ; 
        prev.right = node ; 
        node.left = prev ; 
        node.right = mru ; 
        mru.left = node ; 
     
    }
    
    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value ; 
        }
        return -1 ; 
        
    }
    
    public void put(int key, int value) {
            if(map.containsKey(key)){
              remove(map.get(key));
            }
            Node node = new Node(key,value);
            insert(node);
            map.put(key,node);

            if(map.size() > capacity){
                map.remove(lru.right.key);
                remove(lru.right);
                
            }
            
            
           

        }
        
  
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */