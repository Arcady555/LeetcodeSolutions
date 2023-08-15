package com.parfenov7233.easy;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 */

public class Solution5 {
    public ListNode middleNode(ListNode head) {
        ListNode slow, fast, new_head;
        slow  = fast = head;
        while(fast != null  && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        new_head = slow;
        return new_head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}