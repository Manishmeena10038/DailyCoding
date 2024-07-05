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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }
        ArrayList<Integer> cp = new ArrayList<>();
        for(int i=1;i<arr.size()-1;i++){
            int pre  = arr.get(i-1);
            int cur = arr.get(i);
            int next = arr.get(i+1);
            if(pre>cur&&cur<next)cp.add(i+1);
            if(pre<cur&&cur>next)cp.add(i+1);

        }
        if(cp.size()<2){
            return new int[]{-1,-1};
        }
        int fir = cp.get(cp.size()-1)-cp.get(0);
        int last = cp.get(cp.size()-1)-cp.get(0);
        for(int i=1;i<cp.size();i++){
            fir = Math.min((cp.get(i)-cp.get(i-1)),fir);
        }
        return new int[]{fir,last};
    }
}