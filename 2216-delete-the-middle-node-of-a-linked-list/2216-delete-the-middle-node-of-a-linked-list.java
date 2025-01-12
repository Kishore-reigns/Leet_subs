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
        int n = listLength(head);
        if(n == 1)return null ; 
        return remove(head,n/2) ; 
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