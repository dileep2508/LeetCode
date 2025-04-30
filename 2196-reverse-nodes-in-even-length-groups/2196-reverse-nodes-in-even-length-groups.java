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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        Stack<Integer> s = new Stack<>();

        int grp = 1;
        ListNode temp = head;
        while (temp != null) {
            ListNode start = temp;
            int count = 0;

            while (count < grp && temp != null) {
                s.push(temp.val);
                temp = temp.next;
                count++;
            }

            if (count % 2 == 0) {
                while (start != temp) {
                    start.val = s.pop();
                    start = start.next;
                }
            }
            grp++;
        }
        return head;
    }
}