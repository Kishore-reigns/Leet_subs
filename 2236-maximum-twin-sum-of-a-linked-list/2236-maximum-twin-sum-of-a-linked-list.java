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
    public int pairSum(ListNode head) {
        ListNode mid = findMid(head);
        
        ListNode reversehead = reverse(mid);
       
     
        int maxi = 0 ; 
        ListNode one = head , two = reversehead ; 
        while(one!= null && two != null){
            maxi = Math.max(one.val + two.val , maxi );
            one = one.next ; 
            two = two.next ; 
        }
        return maxi ; 
    }

  


    public ListNode findMid(ListNode head){
        ListNode slow = head , fast = head.next ; 
        while( fast != null && fast.next != null){
            slow = slow.next ; 
            fast = fast.next.next ; 
        }
        ListNode mid = slow.next ; 
        slow.next = null ; 
        return mid ; 
    }

    public ListNode reverse(ListNode mid){
        ListNode temp = mid , nxt = temp.next , prev = null ; 
        while(nxt != null){
            temp.next = prev ; 
            prev = temp ; 
            temp = nxt ; 
            nxt  = nxt.next ; 
        }
         temp.next = prev ;
          prev = temp ; 
        return prev ;
    }
}