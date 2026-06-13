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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resultNode = null;
        ListNode resultHead = null;
        ListNode curr = null;
        int carry = 0;

        while (l1 != null || l2 != null) {

            if (l1 != null && l2 != null) {
                curr = new ListNode((l1.val + l2.val + carry) % 10);
                if (l1.val + l2.val + carry > 9) {
                    carry = 1;
                } else {
                    carry = 0;
                }
                l1 = l1.next;
                l2 = l2.next;

            } else if (l1 != null) {
                curr = new ListNode((l1.val + carry) % 10);
                if (l1.val + carry > 9) {
                    carry = 1;
                } else {
                    carry = 0;
                }
                l1 = l1.next;

            } else if (l2 != null) {
                curr = new ListNode((l2.val + carry) % 10);
                if (l2.val + carry > 9) {
                    carry = 1;
                } else {
                    carry = 0;
                }
                l2 = l2.next;

            }
            if (resultHead == null) {
                resultHead = curr;
                resultNode = curr;

            } else {
                resultNode.next = curr;
            }

            resultNode = curr;
            curr = curr.next;

        }
        if (carry == 1) {
            resultNode.next = new ListNode(1);
        }
        return resultHead;
    }

}