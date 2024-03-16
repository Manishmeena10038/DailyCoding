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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head; 
        ListNode temp = head;
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode temp1 =l1;
        ListNode temp2= l2;
        int i=1;
        while(temp!=null){
            if(i%2==0){
                temp2.next = new ListNode(temp.val);
                temp2 = temp2.next;

            }
            else{
                temp1.next = new ListNode(temp.val);
                temp1 = temp1.next;
            }
            temp = temp.next;
            i++;
        }
        l1=l1.next;
        l2 = l2.next;
        temp = l1;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=l2;
        return l1;

    }
}