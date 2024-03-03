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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode fast = head;
        int l = 0;
        if(fast==null||fast.next==null){
            return null;
        }

        while(l<n){
            fast=fast.next;
            if(fast==null)
            return head.next;
            l++;
        }
        while(fast.next!=null){
            fast=fast.next;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}