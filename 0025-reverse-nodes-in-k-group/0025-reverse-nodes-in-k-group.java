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
    public ListNode reverseKGroup(ListNode head, int k) {
     ListNode dummy = new ListNode(0,head);
     ListNode prevgrouphead = dummy ; 

     while(true){
         ListNode kth = count(prevgrouphead,k);
         if(kth == null)break ; 
       
        ListNode nextgrouphead = kth.next ;
         // reverse 
        ListNode prev = nextgrouphead , curr = prevgrouphead.next ;
        while(curr != nextgrouphead){
            ListNode next = curr.next ; 
            curr.next = prev ; 
            prev = curr ; 
            curr = next ; 
        }
        ListNode temp = prevgrouphead.next ;
        prevgrouphead.next = kth ; 
        prevgrouphead = temp ;  



     }

     return dummy.next ; 
    
     
    }

    public ListNode count(ListNode start , int k ){
        while(start != null && k > 0){
            start = start.next ; 
            k--;
        }

        return start ; 
    }
}