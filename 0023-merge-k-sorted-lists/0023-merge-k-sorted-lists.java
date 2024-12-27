/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer>queue = new PriorityQueue<>() ; 

        for(ListNode list : lists){
            updatequeue(list,queue);
        }
        ListNode node = createList(queue);
        return node ; 
    }

    public void updatequeue(ListNode list , PriorityQueue<Integer>queue){
        ListNode temp = list ; 
        while(temp != null){
            queue.offer(temp.val);
            temp = temp.next ; 
        }
    }

    public ListNode createList(PriorityQueue<Integer>queue){
        ListNode head = null ; 
        if(head == null && !queue.isEmpty()){
            head = new ListNode(queue.poll(), null);
        }   
        ListNode temp = head ; 
        while(!queue.isEmpty()){
            ListNode newnode = new ListNode(queue.poll(),null) ; 
            temp.next = newnode ;
            temp = newnode ;   
        }
        return head ; 
    }
}