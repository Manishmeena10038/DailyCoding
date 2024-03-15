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
    public int numComponents(ListNode head, int[] nums) {
       int cnt=0;
       int size = 0;
       ListNode c = head;
       
       if(head==null)return 0;
        while(c!=null){
            
           
            size++;
            c=c.next;
        }
        int[] arr  = new int[size+1];
        ListNode n = head;
        for(int r:nums){
          arr[r]++;
        //   n =n.next;
        }
        while(head!=null){
             if(arr[head.val]==1){
                cnt++;
                if(head.next!=null)
                if(arr[head.next.val]==1){
                    // head=head.next;
                    cnt--;
                }
            }
            head=head.next;
        }
        return cnt;
            //         if(search(head.val,nums)){
            //     cnt++;
            //     if(head.next!=null)
            //     if(search(head.next.val,nums)){
            //         // head=head.next;
            //         cnt--;
            //     }
            // }
            
            // head=head.next;

    }
    
}