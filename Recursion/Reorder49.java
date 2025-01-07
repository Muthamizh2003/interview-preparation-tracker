package Recursion;
/*
143. Reorder List
Solved
Medium
Topics
Companies
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 

Constraints:

The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000
 */
public class Reorder49 {
    
}
class Solution {
    private ListNode i;
    private boolean done = false;

    public void reorderList(ListNode head) {
        i = head;
        solve(head);
    }

    private void solve(ListNode head) {
        if (head == null) {
            return;
        }

        solve(head.next);

        if (done) {
            return;
        }

        if (i.next == head || i == head) {
            head.next = null;
            done = true;
            return;
        }

        ListNode temp = i.next;
        head.next = temp;
        i.next = head;
        i = temp;
    }
}

