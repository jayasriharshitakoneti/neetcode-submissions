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
    public void reorderList(ListNode head) {
        int n = 0;
        ListNode curr = head;
        while (curr != null) {
            n++;
            curr = curr.next;
        }

        curr = head;
        ListNode mid = curr;

        for (int i = 0; i < Math.ceil((float) n / 2); i++) {
            mid = curr;
            curr = curr.next;
        }

        ListNode prev = null;
        ListNode next = null;
        for (int i = 0; i < Math.floor((float) n / 2); i++) {
            ListNode temp = curr;

            next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        mid.next = prev;

        curr=head;

        mid=mid.next;
        ListNode prevMid=null;

        while(mid!=null){
            prev=mid.next;
            next=curr.next;
            curr.next=mid;
            mid.next=next;
            prevMid=mid;
            mid=prev;
            curr=next;
        }
        // System.out.println(mid.val);
        if(n%2!=0)
        curr.next=null;
        else
        prevMid.next=null;
    }
}