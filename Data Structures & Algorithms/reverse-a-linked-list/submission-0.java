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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode after = null;
        ListNode next = head.next;
        while (next != null) {
            head.next = after;
            after = head;
            head = next;
            next = head.next;
        }
        head.next = after;

        return head;
    }
}
