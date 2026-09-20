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
        if(head==null) return head;
        ListNode temp = head;
        ListNode revhead=new ListNode();
        revhead.val=temp.val;
        temp=temp.next;
        while(temp!=null){
            ListNode rev = new ListNode();
            rev.val=temp.val;
            rev.next=revhead;
            revhead=rev;
            temp=temp.next;
        }
        return revhead;
    }
}
