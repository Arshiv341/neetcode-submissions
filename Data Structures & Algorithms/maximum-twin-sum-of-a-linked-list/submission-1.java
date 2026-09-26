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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        ListNode prev=null;
        while(mid!=null){
            ListNode next = mid.next;
            mid.next=prev;
            prev=mid;
            mid=next;
        }
        int max=0;
        while(prev!=null){
            max=Math.max(max,head.val +prev.val);
            head=head.next;
            prev=prev.next;
        }
        return max;
    }
}