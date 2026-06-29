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
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        Integer index = 0;
        while(head.next != null){
            if (map.containsKey(head)) return true;
            map.put(head, index);
            head = head.next;
            index++;
        }
        return false;
    }
}
