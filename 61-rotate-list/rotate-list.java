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
    public ListNode rotateRight(ListNode head, int k) {
        // Check for edge cases
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Calculate the length of the linked list
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        // Adjust k to avoid unnecessary rotations
        k = k % length;

        // If k becomes 0 after adjustment, no rotation is needed
        if (k == 0) {
            return head;
        }

        // Find the new tail (the node at position length - k - 1)
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        // Update pointers to perform rotation
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}
