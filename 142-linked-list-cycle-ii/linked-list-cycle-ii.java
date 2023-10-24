/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode slow = head;
         ListNode fast = head;
         boolean b = false;
         
         while(fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
             if(fast==slow){
                 slow = head;
                 b = true;
                 break;
             }
         }
         if(b==true){
             if(fast==slow){
                 return fast;
             }
         while(fast!=slow){
             fast = fast.next;
             slow = slow.next;
         }
         return fast;
         }
         return null;

    }
}