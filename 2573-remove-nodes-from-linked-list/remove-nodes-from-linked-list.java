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
    }
}