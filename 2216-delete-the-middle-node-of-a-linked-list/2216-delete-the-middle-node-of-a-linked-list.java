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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)return null ; 
        ListNode slow = head , fast = head , prev = null; 
        while( fast!= null && fast.next != null){
            prev = slow ; 
            slow = slow.next ; 
            fast = fast.next.next ; 
        }
        prev.next = slow.next ; 
        return head ; 
      
    }
    public int listLength(ListNode head){
        ListNode temp = head ; 
        int count = 0 ; 
        while(temp != null){
            count++ ; 
            temp = temp.next ; 
        }
        return count ; 
    }

    public ListNode remove(ListNode head , int n ){
        ListNode temp = head , prev = null;
        int count = 0 ;  
        while(count != n){
            count++ ; 
             prev = temp ; 
            temp = temp.next ; 
        }
        prev.next = temp.next ; 
        return head ; 
    }
}