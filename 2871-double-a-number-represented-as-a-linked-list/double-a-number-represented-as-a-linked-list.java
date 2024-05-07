/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        ListNode cur = head;
        ListNode pre = null;

        int c = 0;
        int l = 0;
        while (cur!= null) {
            int n = cur.val;
            int d = n * 2 + c;
            c = d / 10;
            cur.val = d % 10;
            pre = cur;
            cur = cur.next;

        }
        if(c>0){
            ListNode node = new ListNode(1);
            pre.next= node;
        }
        head = reverse(head);
        return head;
        
    }

    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;

        }
        return pre;

    }
}