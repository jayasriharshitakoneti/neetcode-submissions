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

    void merge(ListNode list1,ListNode list2,ListNode result){
        if(list1==null && list2==null){
            return;
        }
        else if(list1==null && list2!=null){
           
            result.next=list2;
            System.out.println("Result val:"+ result.val);
            return;
        }
        else if(list1!=null && list2==null){
           
            result.next=list1;
            System.out.println("Result val:"+ result.val);
            return;
        }
        else if(list1.val<=list2.val){
            ListNode curr=new ListNode(list1.val);

            result.next=curr;
            System.out.println(result.val);
            merge(list1.next,list2,result.next);
        }
        else if(list1.val>list2.val){
            ListNode curr=new ListNode(list2.val);
            result.next=curr;
            merge(list1,list2.next,result.next);
        }
        return;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        System.out.println("Came here!");
        ListNode result=new ListNode();
        ListNode head=result;
        merge(list1,list2,result);

        return head.next;
    }
}