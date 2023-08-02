package com.parfenov7233.easy;

/**
 * Given the head of a singly linked list, return true if it is a
 * palindrome
 *  or false otherwise.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: head = [1,2,2,1]
 * Output: true
 * Example 2:
 *
 *
 * Input: head = [1,2]
 * Output: false
 */

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(1);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(20, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        System.out.println(isPalindrome(node1));
    }
    public static boolean isPalindrome(ListNode head) {
        boolean rsl = false;
        List<Integer> list = new ArrayList<>();
        while (head.next != null) {
            list.add(head.val);
            head = head.next;
        }
        list.add(head.val);
        if (list.size() < 2) {
            return false;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) == list.get(list.size() - 1 - i)) {
                rsl = true;
            } else {
                return false;
            }
        }
        return rsl;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}