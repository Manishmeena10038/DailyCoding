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
    public boolean isPalindrome(ListNode head) {
        if(head==null)return false;
        if(head.next==null) return true;
        StringBuilder sb = new StringBuilder();
        while(head!=null){
            sb.append(head.val);
            head=head.next;
        }
        String s = sb.toString();
        sb.reverse();
        String r = sb.toString();
        return s.equals(r);
    }
}