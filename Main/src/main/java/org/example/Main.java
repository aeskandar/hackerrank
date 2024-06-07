package org.example;

import org.example.datastructures.ListNode;
import org.example.solutions.ArraysApi;
import org.example.solutions.LinkedListsApi;
import org.example.solutions.StringsApi;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers1 = {199, 9, 9, 4, 9, 9, 9, 9, 9, 10, 12};
        Integer[] numbers2= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};

        System.out.println(ArraysApi.findSecondLargest(numbers1));
        System.out.println(ArraysApi.findSecondLargest(numbers2));

        System.out.println(ArraysApi.findSecondLargestRudimentary(numbers1));
        System.out.println(ArraysApi.findSecondLargestRudimentary(numbers2));

        System.out.println(StringsApi.isAnagram("silent", "listen"));

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode newHead = LinkedListsApi.reverseLinkedList(head);
        while (newHead != null) {
            System.out.println(newHead.getValue());
            newHead = newHead.next;
        }

        StringsApi.findFirstNonRepeatingCharacter("akkkl");

    }
}