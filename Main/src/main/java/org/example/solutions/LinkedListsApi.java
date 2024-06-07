package org.example.solutions;

import org.example.datastructures.ListNode;

public class LinkedListsApi {

    public static ListNode reverseLinkedList(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
