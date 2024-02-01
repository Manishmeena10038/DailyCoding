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
import java.util.PriorityQueue;
import java.util.Iterator;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        // Traverse all lists and add their values to the priority queue
        for (ListNode list : lists) {
            while (list != null) {
                q.add(list.val);
                list = list.next;
            }
        }

        // Create a dummy node to simplify the implementation
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Construct the merged list from the priority queue
        while (!q.isEmpty()) {
            tail.next = new ListNode(q.poll());
            tail = tail.next;
        }

        return dummy.next; // Skip the dummy head node
    }
}
