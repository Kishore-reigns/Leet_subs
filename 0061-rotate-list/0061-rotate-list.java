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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0 || head.next == null)return head ; 
        ListNode start = head ; 
        int len = 0 ; 
        for(len = 1; head.next != null ; len++){
            head = head.next ; 
        }
       
       
        k = k%len ; 
        if (k == 0) return start;

         head.next = start ; 
       

       for(int i = 1 ; i < len - k ; i++){
            start = start.next ; 
       }

       ListNode prev = start ; 
       start = start.next ; 
       prev.next = null ; 

        
        return start ; 
    }

    
}