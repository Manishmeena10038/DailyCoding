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
       if(head==null)return 0;
        while(head!=null){
            
            if(search(head.val,nums)){
                cnt++;
                if(head.next!=null)
                if(search(head.next.val,nums)){
                    // head=head.next;
                    cnt--;
                }
            }
            
            head=head.next;
        }
        return cnt;
    }
    static boolean search(int n,int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                return true;
            }
        }
        return false;
    }
}