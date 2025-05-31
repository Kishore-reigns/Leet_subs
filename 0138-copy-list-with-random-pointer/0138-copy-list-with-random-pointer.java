/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>() ; 
        map.put(null,null);
        Node temp = head , temp2 = head;
        Node copy = null , tempcopy = copy; 
        while(temp != null){
            map.put(temp,new Node(temp.val));
            temp = temp.next;
        }
    
        while(temp2 != null){
             Node node = map.get(temp2);
             node.next = map.get(temp2.next);
             node.random = map.get(temp2.random);
             temp2 = temp2.next;
        }
        return map.get(head); 

        
    }

   
}