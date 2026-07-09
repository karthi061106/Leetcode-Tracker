// Last updated: 7/9/2026, 3:06:26 PM
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode slow=head,fast=head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}