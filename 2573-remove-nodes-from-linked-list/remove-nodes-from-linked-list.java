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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        ListNode cur = head;
        while(cur!=null){
            stk.push(cur.val);
            cur = cur.next;
        }
        ListNode temp = new ListNode(stk.pop());
        while(!stk.isEmpty()){
            int n = stk.pop();
           if(n>=temp.val){
            ListNode temp1 = new ListNode(n);
            temp1.next = temp;
            temp = temp1;
           }
           
        }
        head= temp;
        return temp;
//         ListNode pre = null;
// ListNode cur = head;
// while (cur != null) {
//     ListNode nxt = cur.next;
//     cur.next = pre;
//     pre = cur;
//     cur = nxt;
// }
// head = pre;

// // Now, traverse the reversed list and remove nodes whose value is less than the value of the next node
// ListNode dummy = new ListNode(0); // Create a dummy node to handle the case where the head needs to be removed
// dummy.next = head;
// ListNode prev = dummy;
// while (head != null && head.next != null) {
//     if (head.val < head.next.val) {
//         head.next = prev.next; 
//     } else {
//         prev = head;
//     }
//     head = head.next;
// }
// return dummy.next;
}
}