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
    public void reorderList(ListNode head) {
        ListNode slow = head , fast = slow.next , temp = null ; 
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ; 
        }
        temp = slow.next ; 
        ListNode prev = slow , next = null ; 
        while(temp != null){
            next = temp.next; 
            temp.next = prev ; 
            prev = temp ; 
            temp = next; 
        }
        ListNode p1 = head , p2 = prev , p1next = null , p2next = null; 
        while(p1 != p2){
             p1next = p1.next ; 
             p2next = p2.next ; 
             p1.next = p2 ; 
             p2.next = p1next ; 
             p1 = p1next ; 
             p2 = p2next ; 
        }
        p1.next = null ; 

    }
}