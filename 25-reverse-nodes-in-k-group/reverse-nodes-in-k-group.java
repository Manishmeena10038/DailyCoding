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

    int length(ListNode head){
            ListNode temp = head;
            int count = 0;
            while(temp!=null){
                temp = temp.next;
                count++;
            }
            return count ;
    }
        
    public ListNode reverseKGroup(ListNode head, int k) {
        int n = length(head);
        if(head==null||head.next==null||k>n) return head;
        
       ListNode pre = null;
       ListNode cur = head;
       int cnt =0;
       while(cnt<k){
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur= nxt;
            cnt++;
       }
       if(cur!=null){
           head.next = reverseKGroup(cur,k);
       }

        return pre;
    }

}