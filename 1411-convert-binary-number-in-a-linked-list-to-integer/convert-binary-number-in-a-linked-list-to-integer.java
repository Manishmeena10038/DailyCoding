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
    public int getDecimalValue(ListNode head) {

      int num =0;
      while(head!=null){
          if(head.val==0){
              num=num<<1;
          }
          else{
              num = (num<<1)+1;
          }
          head = head.next;
      }
      return num;
    }
}