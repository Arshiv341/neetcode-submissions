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
        if(head==null || head.next==null) return ;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        ListNode revhead=null;
        while(second!=null){
            ListNode rev =new ListNode();
            rev.val=second.val;
            rev.next=revhead;
            revhead=rev;
            second=second.next;
        }
        ListNode temp=head;
        while(revhead!=null){
            ListNode first=temp.next;
            ListNode rev=revhead.next;
            temp.next=revhead;
            revhead.next=first;
            temp=first;
            revhead=rev;            
        }
    }
}
