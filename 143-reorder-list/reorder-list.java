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
    public void reorderList(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return;
        }

        //Step 1 Find mid
        ListNode slow=head;
        ListNode fast=head.next;//as we need the mid to b 1st half last  node
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
         ListNode mid=slow;

         //reverse 2nd half

         ListNode prev=null;
         ListNode curr=mid.next;
         ListNode next;
         while(curr!=null)
         {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
       mid.next=null;//disconnect

         //alternate merging
         ListNode temp1;
         ListNode temp2;
         ListNode left=head;
         ListNode right=prev;

         while(left!=null && right!=null)
         {
            temp1=left.next;
            left.next=right;
            temp2=right.next;
            right.next=temp1;

            //updation
            left=temp1;
            right=temp2;
         }
    
    }}