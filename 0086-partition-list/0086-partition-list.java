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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0) , large = new ListNode(0) , temp = head ; 
        ListNode smallhead = small , largehead = large ; 
        if(head == null || head.next == null)return head ; 
        while(temp != null){
           if(temp.val < x){
              smallhead.next = temp ; 
              smallhead = smallhead.next ; 
           }else{
            largehead.next = temp ; 
            largehead = largehead.next ; 
           }
           temp = temp.next ; 
        }

            largehead.next = null ; 
            smallhead.next = large.next ; 

        return small.next ;  
    }
}