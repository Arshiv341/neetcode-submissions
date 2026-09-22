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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode revhead= new ListNode();
        revhead.val=head.val;
        ListNode temp=head;
        temp=temp.next;
        while(temp!=null){
            ListNode rev = new ListNode();
            rev.val=temp.val;
            rev.next=revhead;
            revhead=rev;
            temp=temp.next;
        }
        while(revhead!=null && head!=null){
            if(head.val!=revhead.val) return false;
            revhead=revhead.next;
            head=head.next;
        }
        return true;
    }
}