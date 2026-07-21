// Last updated: 7/21/2026, 9:18:54 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 * int val;
5 * ListNode next;
6 * ListNode() {}
7 * ListNode(int val) { this.val = val; }
8 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode insertionSortList(ListNode head) {
13        // Base case: if the list is empty or has only one element, it's already sorted 🛑
14        if (head == null || head.next == null) {
15            return head;
16        }
17            
18        ListNode dummy = new ListNode(0); // Dummy anchor for the sorted list
19        ListNode prev = dummy;             // Pointer to search for the insertion point
20        ListNode curr = head;              // Runner tracking the unsorted nodes
21        ListNode next = null;              // Temporary holder for the next unsorted node
22
23        // Step 1: Iterate through the unsorted linked list 🔄
24        while (curr != null) {
25            next = curr.next; // Save the future path before altering links
26            
27            // Step 2: Scan the sorted subset from the beginning to find the insert point 🔎
28            while (prev.next != null && prev.next.val < curr.val) {
29                prev = prev.next;
30            }
31            
32            // Step 3: Splice 'curr' into its correct position between 'prev' and 'prev.next' ✂️
33            curr.next = prev.next;
34            prev.next = curr;
35            
36            // Step 4: Reset search pointer back to dummy and move 'curr' forward
37            prev = dummy;
38            curr = next;
39        }
40        
41        return dummy.next; // Return the sorted list starting after our dummy node
42    }
43}