class Node{
    Node[] links = new Node[26] ; 
    boolean flag ;  
}

class Trie {

    Node root ; 

    public Trie() {
        root = new Node() ; 
    }

    public boolean containsKey(char c , Node node){
        return node.links[ c - 'a'] != null ; 
    }

    public void setKey(char c , Node node , Node newnode){
        node.links[c - 'a'] = newnode ; 
    }

    public Node get(char c , Node temp){
        return temp.links[ c - 'a'] ; 
    }

    public void setEnd(Node temp){
        temp.flag = true ; 
    }

    
    public void insert(String word) {
        Node temp = root ; 
        for(char c : word.toCharArray()){
            if(!containsKey(c,temp)){
                setKey(c,temp , new Node());
            }
            temp = get(c,temp);
        }
        
        setEnd(temp);
    }
    
    public boolean search(String word) {
        Node temp = root ; 
        for(char c : word.toCharArray()){
            if(!containsKey(c,temp))return false ; 
            temp = get(c,temp);
        }
        return temp.flag ; 
    }
    
    public boolean startsWith(String prefix) {
        Node temp = root ; 
        for(char c : prefix.toCharArray()){
            if(!containsKey(c,temp))return false ; 
            temp = get(c,temp);
        }
        return true ; 
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */