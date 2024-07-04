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
    public ListNode mergeNodes(ListNode head) {
        boolean start = true;
        boolean end = false;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(head!=null){
            if(head.val==0){
                if(head.next!=null){

                temp.next = new ListNode(head.val);
                temp = temp.next;
                }
            }
            else{
                temp.val = temp.val+head.val;
            }
            
            head=head.next;
            
        }
        return dummy.next;
    }
}